package com.example.carparkingapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class CarDetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_details)
        val btnSubmit: Button = findViewById(R.id.submitButton)
        val tvCarNo = findViewById<TextInputLayout>(R.id.tvCarNo)
        val tvPhoneNumber = findViewById<TextInputLayout>(R.id.tvPhoneNumber)
        btnSubmit.setOnClickListener {
            val carNo = tvCarNo.editText?.text.toString()
            val phoneNumber = tvPhoneNumber.editText?.text.toString()
            val intent = Intent(this, HomePageActivity::class.java)
            intent.putExtra("carNo", carNo)
            intent.putExtra("phoneNumber", phoneNumber)
            setResult(Activity.RESULT_OK, intent)
            finish()
        }
    }
}