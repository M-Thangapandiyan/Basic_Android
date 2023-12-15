package com.example.constraintbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {

    var isAllFieldsChecked = false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
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
            submitForm(name, phoneNumber, mail, address, pinCode)
        }
    }

    private fun submitForm(
        name: String,
        phoneNumber: String,
        mail: String,
        address: String,
        pinCode: String
    ) {

        isAllFieldsChecked = checkAllFields(name,phoneNumber,mail,address,pinCode)

        if (isAllFieldsChecked) {
            val bundle = Bundle()
            bundle.putString("name", name)
            bundle.putString("phoneNumber", phoneNumber)
            bundle.putString("mail", mail)
            bundle.putString("address", address)
            bundle.putString("pinCode", pinCode)
            val intent = Intent(this, DisplayFormActivity::class.java)
            intent.putExtra("data", bundle)
            startActivity(intent)
        }
    }

    private fun errorMessage(message: String) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show()
    }

    private fun checkAllFields(
        name: String,
        phoneNumber: String,
        mail: String,
        address: String,
        pinCode: String
    ): Boolean {

        if (name.isEmpty()) {
            errorMessage("Please fill name fields")
            return false
        } else if (phoneNumber.isEmpty()) {
            errorMessage("Please fill phone number the fields")
            return false
        } else if (mail.isEmpty()) {
            errorMessage("Please fill pin-code the fields")
            return false
        } else if (address.isEmpty()) {
            errorMessage("Please fill address the fields")
            return false
        } else if (pinCode.isEmpty()) {
            errorMessage("Please fill mail the fields")
            return false
        }
        return true
    }
}
