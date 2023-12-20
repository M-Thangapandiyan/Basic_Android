package com.example.constraintbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class EmployeeDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)
        val btnSubmit = findViewById<Button>(R.id.submitButton)

        btnSubmit.setOnClickListener {
            val etName = findViewById<EditText>(R.id.editName)
            val etPhoneNumber = findViewById<EditText>(R.id.editPhone)
            val etMail = findViewById<EditText>(R.id.editMail)
            val etAddress = findViewById<EditText>(R.id.editAddress)
            val etPinCode = findViewById<EditText>(R.id.editPinCode)
            val btnSubmit = findViewById<Button>(R.id.submitButton)
            btnSubmit.setOnClickListener {
                val name = etName.text.toString()
                val phoneNumber = etPhoneNumber.text.toString()
                val mail = etMail.text.toString()
                val address = etAddress.text.toString()
                val pinCode = etPinCode.text.toString()
                val bundle = Bundle()
                bundle.putString("name", name)
                bundle.putString("phoneNumber", phoneNumber)
                bundle.putString("mail", mail)
                bundle.putString("address", address)
                bundle.putString("pinCode", pinCode)
                val intent = Intent(this, EmployeeActivity::class.java)
                intent.putExtra("data", bundle)
                startActivity(intent)
            }
        }
    }
}