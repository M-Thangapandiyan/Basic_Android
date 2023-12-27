package com.example.carparkingapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class HomePageActivity : AppCompatActivity() {

    private lateinit var carParkingAdapter: CarParkingAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        val btnSubmit = findViewById<FloatingActionButton>(R.id.floating_action_button)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, CarDetailsActivity::class.java)
            resultLauncher.launch(intent)
        }

        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        carParkingAdapter = CarParkingAdapter()
        recyclerView.adapter = carParkingAdapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            data?.let { data ->
                val carNo = data.getStringExtra("carNo") ?: ""
                val phoneNumber = data.getStringExtra("phoneNumber") ?: ""
                val slotNo = data.getStringExtra("slotNo") ?: ""
                val carParkingModel = CarParkingModel(carNo,phoneNumber,slotNo)
                carParkingAdapter.submitData(carParkingModel)
            }
        }
    }
}



