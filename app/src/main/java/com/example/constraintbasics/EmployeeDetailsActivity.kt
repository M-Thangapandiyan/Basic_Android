package com.example.constraintbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Button
import android.widget.EditText

class EmployeeDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_employee_details)
Log.d("activitya","onCreate")
        setSupportActionBar(findViewById(R.id.backArrow))
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

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
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                onBackPressed()
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }



























    override fun onStart() {
        super.onStart()
        Log.d("activitya","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("activitya","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("activitya","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("activitya","onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("activitya","onDestroy")
    }
}














//
//package com.example.constraintbasics
//
//import android.content.Intent
//import androidx.appcompat.app.AppCompatActivity
//import android.os.Bundle
//import android.widget.Button
//import android.widget.EditText
//import android.widget.Toast
//
//class EmployeeDetailsActivity : AppCompatActivity() {
//    private var isAllFieldsChecked = false
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_employee_details)
//setSupportActionBar(findViewById(R.id.backArrow))
//supportActionBar?.setDisplayHomeAsUpEnabled(true)
//        val etName = findViewById<EditText>(R.id.editName)
//        val etPhoneNumber = findViewById<EditText>(R.id.editPhone)
//        val etMail = findViewById<EditText>(R.id.editMail)
//        val etAddress = findViewById<EditText>(R.id.editAddress)
//        val etPinCode = findViewById<EditText>(R.id.editPinCode)
//        val btnSubmit = findViewById<Button>(R.id.submitButton)
//        btnSubmit.setOnClickListener {
//            val name = etName.text.toString()
//            val phoneNumber = etPhoneNumber.text.toString()
//            val mail = etMail.text.toString()
//            val address = etAddress.text.toString()
//            val pinCode = etPinCode.text.toString()
//            val intent = Intent()
//            submitForm(name, phoneNumber, mail, address, pinCode)
//        }
//    }
//
//
//    private fun submitForm(
//        name: String,
//        phoneNumber: String,
//        mail: String,
//        address: String,
//        pinCode: String
//    ) {
//        isAllFieldsChecked = checkAllFields(name,phoneNumber,mail,address,pinCode)
//        if (isAllFieldsChecked) {
//            intent.putExtra("name", name)
//            intent.putExtra("phoneNumber", phoneNumber)
//            intent.putExtra("mail", mail)
//            intent.putExtra("address", address)
//            intent.putExtra("pinCode", pinCode)
//            setResult(AppCompatActivity.RESULT_OK, intent)
//            finish()
//        }
//    }
//
//    private fun errorMessage(message: String) {
//        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
//    }
//
//    private fun checkAllFields(
//        name: String,
//        phoneNumber: String,
//        mail: String,
//        address: String,
//        pinCode: String
//    ): Boolean {
//        if (name.isEmpty()) {
//            errorMessage("Please fill name fields")
//            return false
//        } else if (phoneNumber.length < 10) {
//            errorMessage("Please fill the phone number field with 10 numbers")
//            return false
//        } else if (!mail.matches(Regex("^[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Z|a-z]{2,}\$"))) {
//            errorMessage("Please fill mail the fields")
//            return false
//        } else if (address.isEmpty()) {
//            errorMessage("Please fill address the fields")
//            return false
//        } else if (pinCode.length<6) {
//            errorMessage("Please fill pin-code the fields")
//            return false
//        }
//        return true
//    }

//override fun onOptionsItemSelected(item: MenuItem): Boolean {
//    when (item.itemId) {
//        android.R.id.home -> {
//            onBackPressed()
//            return true
//        }
//    }
//    return super.onOptionsItemSelected(item)
//}
//}