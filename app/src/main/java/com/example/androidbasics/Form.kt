package com.example.androidbasics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.androidforms.DisplayForm

class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val sendName = findViewById<EditText>(R.id.editName)
        val sendPhoneNumber = findViewById<EditText>(R.id.editPhone)
        val sendMail = findViewById<EditText>(R.id.editMail)
        val sendAddress = findViewById<EditText>(R.id.editAddress)
        val sendPinCode = findViewById<EditText>(R.id.editPinCode)
        val sendButton = findViewById<Button>(R.id.submitButton)
        sendButton.setOnClickListener {
            val name = sendName.text.toString()
            val phoneNumber = sendPhoneNumber.text.toString()
            val mail = sendMail.text.toString()
            val address = sendAddress.text.toString()
            val pinCode = sendPinCode.text.toString()
            val bundle = Bundle()
            bundle.putString("name", name);
            bundle.putString("phoneNumber",phoneNumber)
            bundle.putString("mail", mail);
            bundle.putString("address", address);
            bundle.putString("pinCode", pinCode);
            val intent = Intent(this, DisplayForm::class.java)
            intent.putExtra("data",bundle)
            startActivity(intent);
        }
    }
}