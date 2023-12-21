package com.example.constraintbasics

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.result.contract.ActivityResultContracts
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.floatingactionbutton.FloatingActionButton

class EmployeeActivity : AppCompatActivity() {
    private val EMPLOYEE_DETAILS_REQUEST_CODE = 100
    private var employeeDetailsList: ArrayList<EmployeeModel> = ArrayList()
    private lateinit var employeeAdapter: EmployeeAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)
        val btnAddEmployee = findViewById<FloatingActionButton>(R.id.floating_action_button)
        btnAddEmployee.setOnClickListener {
            val intent = Intent(this, EmployeeDetailsActivity::class.java)
            employeeDetailsLauncher.launch(intent)
        }
        val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
        employeeAdapter = EmployeeAdapter(employeeDetailsList)
        recyclerView.adapter = employeeAdapter
        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = LinearLayoutManager.VERTICAL
        recyclerView.layoutManager = layoutManager
    }


    private val employeeDetailsLauncher =
        registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val data: Intent? = result.data
                data?.let {
                    val name = it.getStringExtra("name") ?: ""
                    val phoneNumber = it.getStringExtra("phoneNumber") ?: ""
                    val mail = it.getStringExtra("mail") ?: ""
                    val address = it.getStringExtra("address") ?: ""
                    val pinCode = it.getStringExtra("pinCode") ?: ""
                    val employeeModel = EmployeeModel(name, phoneNumber, mail, address, pinCode)
                    employeeDetailsList.add(employeeModel)
                    employeeAdapter.notifyDataSetChanged()
                    val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
            employeeAdapter = EmployeeAdapter(employeeDetailsList)
            recyclerView.adapter = employeeAdapter
            val layoutManager = LinearLayoutManager(this)
            layoutManager.orientation = LinearLayoutManager.VERTICAL
            recyclerView.layoutManager = layoutManager
                }
            }
        }

//    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
//        super.onActivityResult(requestCode, resultCode, data)
//        if (requestCode == EMPLOYEE_DETAILS_REQUEST_CODE && resultCode == Activity.RESULT_OK) {
//            val name = data?.getStringExtra("name") ?: ""
//            val phoneNumber = data?.getStringExtra("phoneNumber") ?: ""
//            val mail = data?.getStringExtra("mail") ?: ""
//            val address = data?.getStringExtra("address") ?: ""
//            val pinCode = data?.getStringExtra("pinCode") ?: ""
//            val employeeModel = EmployeeModel(name, phoneNumber, mail, address, pinCode)
//            employeeDetailsList.add(employeeModel)
//            employeeAdapter.notifyDataSetChanged()
//            val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
//            employeeAdapter = EmployeeAdapter(employeeDetailsList)
//            recyclerView.adapter = employeeAdapter
//            val layoutManager = LinearLayoutManager(this)
//            layoutManager.orientation = LinearLayoutManager.VERTICAL
//            recyclerView.layoutManager = layoutManager
//        }
//    }
}

//    override fun startActivityForResult(intent: Intent, requestCode: Int) {
//        super.startActivityForResult(intent, requestCode)
//        val name = intent?.getStringExtra("name") ?: ""
//            val phoneNumber = intent?.getStringExtra("phoneNumber") ?: ""
//            val mail = intent?.getStringExtra("mail") ?: ""
//            val address = intent?.getStringExtra("address") ?: ""
//            val pinCode = intent?.getStringExtra("pinCode") ?: ""
//            val employeeModel = EmployeeModel(name, phoneNumber, mail, address, pinCode)
//            employeeDetailsList.add(employeeModel)
//            employeeAdapter.notifyDataSetChanged()
//            val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
//            employeeAdapter = EmployeeAdapter(employeeDetailsList)
//            recyclerView.adapter = employeeAdapter
//            val layoutManager = LinearLayoutManager(this)
//            layoutManager.orientation = LinearLayoutManager.VERTICAL
//            recyclerView.layoutManager = layoutManager
//    }
//}
