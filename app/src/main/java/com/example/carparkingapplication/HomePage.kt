package com.example.carparkingapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

class HomePage : AppCompatActivity() {

    private var carParkingList: MutableList<CarModel> = mutableListOf()
    private lateinit var carParkingAdapter: CarParkingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)
        val btnAddEmployee = findViewById<FloatingActionButton>(R.id.floating_action_button)

        btnAddEmployee.setOnClickListener {
            val intent = Intent(this, CarDetails::class.java)
            resultLauncher.launch(intent)
        }

        val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
        val carParkingAdapter = CarParkingAdapter(carParkingList)
        recyclerView.adapter = carParkingAdapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            data?.let { data ->
                val carNo = data.getStringExtra("carNo")?:""
                val phoneNumber = data.getStringExtra("phoneNumber") ?: ""
                val slotNo = data.getStringExtra("SlotNo") ?: ""
                val checkInTime = getCurrentDateTimeWithMinutes()
                val carModel = CarModel(carNo, phoneNumber, slotNo, checkInTime)
                carParkingList.add(carModel)
                carParkingAdapter.notifyDataSetChanged()
            }
        }
    }

    private fun getCurrentDateTimeWithMinutes(): String {
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.getDefault())
        val currentDate = Date()
        return dateFormat.format(currentDate)
    }

}