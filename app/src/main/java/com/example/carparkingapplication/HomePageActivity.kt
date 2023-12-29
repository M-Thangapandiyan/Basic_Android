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
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class HomePageActivity : AppCompatActivity() {

    private lateinit var carParkingAdapter: CarParkingAdapter
    private lateinit var btnSubmit: FloatingActionButton
    private lateinit var search: SearchView
    private var carParkingList = mutableListOf<CarParkingModel>()
    private lateinit var carNo: String
    private lateinit var phoneNumber : String
    private var slotNo : Int = 0
    private lateinit var checkIn : String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        initView()
        searchListeners()
    }

    private val carParkingInterface : CarParkingInterface = object: CarParkingInterface {
        override fun onClick(view: CarParkingModel) {
            val carParkingDialogFragment = CarParkingDialogFragment()
            val bundle = Bundle()
            bundle.putString("carParkingDetails", view.carNo)
            carParkingDialogFragment.arguments =  bundle
            carParkingDialogFragment.show(supportFragmentManager, "test")

        }
    }
    private fun searchListeners() {
        search = findViewById(R.id.searchView)
        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let {
                    carParkingAdapter.filter(it)
                }
                return false
            }
        })
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
                    slotNo =  carParkingList.size + 1
                    checkIn = getCurrentDateTime()
                    val carParkingModel = CarParkingModel(carNo, phoneNumber, slotNo, checkIn)
                    carParkingAdapter.submitData(carParkingModel)

                }
            }
        }
        private fun getCurrentDateTime(): String {
        val dateTime = SimpleDateFormat(Constants.DATE_PATTERN, Locale.getDefault())
        return dateTime.format(Date())
    }
}

