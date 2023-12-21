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
                val intent = Intent()
                intent.putExtra("name", name)
                intent.putExtra("phoneNumber", phoneNumber)
                intent.putExtra("mail", mail)
                intent.putExtra("address", address)
                intent.putExtra("pinCode", pinCode)
                setResult(RESULT_OK, intent)
                finish()
            }
        }
    }
