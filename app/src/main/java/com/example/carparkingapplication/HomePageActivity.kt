package com.example.carparkingapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.widget.SearchView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomePageActivity : AppCompatActivity(), CarParkingDialogFragment.CarParkingDialogListener {

    private lateinit var carParkingAdapter: CarParkingAdapter
    private lateinit var btnSubmit: FloatingActionButton
    private var carParkingList = mutableListOf<CarParkingModel>()
    private lateinit var carNo: String
    private lateinit var phoneNumber : String
    private var slotNo : Int = 0
    private var checkIn : Long = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        initView()
    }

    private val carParkingInterface : CarParkingInterface = object: CarParkingInterface {
        override fun onClick(view: CarParkingModel) {
            val carParkingDialogFragment = CarParkingDialogFragment()
            val bundle = Bundle()
            bundle.putString(Constants.CAR_NO, view.carNo)
            bundle.putString(Constants.USER_PHONE_NUMBER, view.phoneNumber)
            bundle.putInt(Constants.SLOT_NO, view.slotNumber)
            bundle.putLong(Constants.CHECK_IN,view.checkIn)
            carParkingDialogFragment.arguments =  bundle
            carParkingDialogFragment.show(supportFragmentManager, Constants.CAR_PARKING_DETAILS)
        }
    }

    private fun initView(){
        btnSubmit = findViewById(R.id.floating_action_button)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, CarDetailsActivity::class.java)
            resultLauncher.launch(intent)
        }
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        carParkingAdapter = CarParkingAdapter(carParkingInterface)
        recyclerView.adapter = carParkingAdapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }

    private val resultLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                data?.let { data ->
                    carNo = data.getStringExtra(Constants.CAR_NO) ?: Constants.EMPTY_STRING
                    phoneNumber = data.getStringExtra(Constants.PHONE_NUMBER) ?: Constants.EMPTY_STRING
                    checkIn = System.currentTimeMillis()
                    val carParkingModel = CarParkingModel(carNo, phoneNumber, slotNo, checkIn)
                    add(carParkingModel)
                }
            }
        }

    private fun getNextAvailable() : Int {
        carParkingList.forEachIndexed{ index, carParkingModel ->
            if (carParkingModel.slotNumber != index + 1) {
                return index + 1
            }
        }
        return -1
    }

    private fun add(carParkingModel: CarParkingModel) {

        val availableSlot = getNextAvailable()
        if(availableSlot == -1){
               carParkingModel.slotNumber = carParkingList.size + 1
        }
        else{
            carParkingModel.slotNumber = availableSlot
        }
        val index = carParkingModel.slotNumber - 1
        carParkingList.add(index,carParkingModel)
        carParkingAdapter.setCarList(carParkingList)
    }

    override fun btnClicked(slotNumber: Int) {
        removeCar(slotNumber)
    }

    private fun removeCar(slotNumber: Int) {
        val carToRemove = carParkingList.find { it.slotNumber == slotNumber }
        carToRemove?.let {
            carParkingList.remove(it)
            carParkingAdapter.setCarList(carParkingList)
        }
    }
}

