package com.example.carparkingapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.SearchView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.util.Calendar
import java.util.Date
import java.util.Locale

class HomePageActivity : AppCompatActivity() {

    private lateinit var carParkingAdapter: CarParkingAdapter
    private lateinit var btnSubmit: FloatingActionButton
    private lateinit var search: SearchView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        btnSubmit = findViewById(R.id.floating_action_button)
        search = findViewById(R.id.searchView)
        btnSubmit.setOnClickListener {
            val intent = Intent(this, CarDetailsActivity::class.java)
            resultLauncher.launch(intent)
        }
        search.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
            override fun onQueryTextSubmit(query: String?): Boolean {
                return false
            }
            override fun onQueryTextChange(newText: String?): Boolean {
                newText?.let {
                    carParkingAdapter.filter(it)
                }
                return true
            }
        })
        initView()
    }

    private fun initView(){
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        carParkingAdapter = CarParkingAdapter()
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
                    val carNo = data.getStringExtra("carNo") ?: ""
                    val phoneNumber = data.getStringExtra("phoneNumber") ?: ""
                    val slotNo = data.getStringExtra("slotNo") ?: ""
                    val checkIn = getCurrentDateTime()
                    val carParkingModel = CarParkingModel(carNo, phoneNumber, slotNo, checkIn)
                    carParkingAdapter.submitData(carParkingModel)
                }
            }
        }

        private fun getCurrentDateTime(): String {
        val dateTime = SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault())
        return dateTime.format(Date())
    }
}



