//package com.example.constraintbasics
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.TextView
//import androidx.recyclerview.widget.LinearLayoutManager
//import androidx.recyclerview.widget.RecyclerView
//
//class EmployeeActivity : AppCompatActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_employee)
//        val btnAddEmployee =  findViewById<Button>(R.id.addEmployee)
//        btnAddEmployee.setOnClickListener {
//            val intent = Intent(this, EmployeeDetailsActivity::class.java)
//            startActivity(intent)
//        }
//
//        val bundle = intent.extras?.getBundle("data")
//        val name = bundle?.getString("name")
//        val phoneNumber = bundle?.getString("phoneNumber")
//        val mail = bundle?.getString("mail")
//        val address = bundle?.getString("address")
//        val pinCode = bundle?.getString("pinCode")
//
//        val  employeeDetailsList = mutableListOf<String>()
////        arrayList.add(name.toString())
////        arrayList.add(phoneNumber.toString())
////        arrayList.add(mail.toString())
////        arrayList.add(address.toString())
////        arrayList.add(pinCode.toString())
//
//
//        employeeDetailsList.apply {
//            add("Name: $name")
//            add("Phone Number: $phoneNumber")
//            add("Mail: $mail")
//            add("Address: $address")
//            add("Pin Code: $pinCode")
//        }
//
//        val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
//        val employeeAdapter = EmployeeAdapter(employeeDetailsList)
//        recyclerView.adapter = employeeAdapter
//        val layoutManager = LinearLayoutManager(this)
//        layoutManager.orientation = LinearLayoutManager.VERTICAL
//        recyclerView.layoutManager = layoutManager
//
////    val tvEmployeeDetails = findViewById<TextView>(R.id.showDetails)
////        val displayText = "Name: $name\n" +
////                "Phone Number: $phoneNumber\n" +
////                "Mail: $mail\n" +
////                "Address: $address\n" +
////                "Pin Code: $pinCode"
////        tvEmployeeDetails.text = displayText
//    }
//}



























package com.example.constraintbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class EmployeeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee)
        val btnAddEmployee =  findViewById<Button>(R.id.addEmployee)
        btnAddEmployee.setOnClickListener {
            val intent = Intent(this, EmployeeDetailsActivity::class.java)
            startActivity(intent)
        }

        val bundle = intent.extras?.getBundle("data")
        val name = bundle?.getString("name")
        val phoneNumber = bundle?.getString("phoneNumber")
        val mail = bundle?.getString("mail")
        val address = bundle?.getString("address")
        val pinCode = bundle?.getString("pinCode")

//        val  employeeDetailsList = mutableListOf<String>()
//         employeeDetailsList.add(name.toString())
//         employeeDetailsList.add(phoneNumber.toString())
//         employeeDetailsList.add(mail.toString())
//         employeeDetailsList.add(address.toString())
//         employeeDetailsList.add(pinCode.toString())
//
//
//        val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
//        val employeeAdapter = EmployeeAdapter(employeeDetailsList)
//        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
//        recyclerView.layoutManager = layoutManager
//        recyclerView.adapter = employeeAdapter

        val  employeeDetailsList = mutableListOf<EmployeeModel>()

        val employeeModel = EmployeeModel(
    name ?: "",
    phoneNumber ?: "",
    mail ?: "",
    address ?: "",
    pinCode ?: ""
                    )
//        employeeDetailsList.add(EmployeeModel("Name : $name", "PhoneNumber : $phoneNumber", "Mail : $mail", "Address : $address", "PinCode : $pinCode"))
        employeeDetailsList.add(employeeModel)
        val recyclerView: RecyclerView = findViewById(R.id.viewOfRecycler)
        val employeeAdapter = EmployeeAdapter(employeeDetailsList)
        val layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = employeeAdapter

//    val tvEmployeeDetails = findViewById<TextView>(R.id.showDetails)
//        val displayText = "Name: $name\n" +
//                "Phone Number: $phoneNumber\n" +
//                "Mail: $mail\n" +
//                "Address: $address\n" +
//                "Pin Code: $pinCode"
//        tvEmployeeDetails.text = displayText

    }
}