package com.example.constraintbasics

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class EmployeeActivity : AppCompatActivity() {

    private var employeeDetailsList: MutableList<EmployeeModel> = mutableListOf()
    private lateinit var employeeAdapter: EmployeeAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)

        Log.d("activity","onCreate")

        val btnAddEmployee = findViewById<FloatingActionButton>(R.id.floating_action_button)
        btnAddEmployee.setOnClickListener {
            val intent = Intent(this, EmployeeDetailsActivity::class.java)
            resultLauncher.launch(intent)
        }
        val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
        employeeAdapter = EmployeeAdapter(employeeDetailsList)
        recyclerView.adapter = employeeAdapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }

    private val resultLauncher = registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
        if (result.resultCode == Activity.RESULT_OK) {
            val data: Intent? = result.data
            val name = data?.getStringExtra("name") ?: ""
            val phoneNumber = data?.getStringExtra("phoneNumber") ?: ""
            val mail = data?.getStringExtra("mail") ?: ""
            val address = data?.getStringExtra("address") ?: ""
            val pinCode = data?.getStringExtra("pinCode") ?: ""
            val employeeModel = EmployeeModel(name, phoneNumber, mail, address, pinCode)
            employeeDetailsList.add(employeeModel)
            employeeAdapter.notifyDataSetChanged()
            }
        }



    override fun onStart() {
        super.onStart()
        Log.d("activity","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("activity","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("activity","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("activity","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("activity","onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("activity","onDestroy")
    }

}



