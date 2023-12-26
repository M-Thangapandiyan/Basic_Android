package com.example.carparkingapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.textfield.TextInputLayout

class CarDetails : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_car_details)

        val btnSubmit: Button = findViewById(R.id.submitButton)
        btnSubmit.setOnClickListener {
            val etCarNo = findViewById<TextInputLayout>(R.id.tvCarNo)
            val etPhoneNumber = findViewById<TextInputLayout>(R.id.tvPhoneNumber)
            val etSlotNo = findViewById<TextInputLayout>(R.id.tvslotno)

            val carNo = etCarNo.editText?.text.toString()
            val phoneNumber = etPhoneNumber.editText?.text.toString()
            val slotNo = etSlotNo.editText?.text.toString()

            val intent = Intent(this, HomePage::class.java)
            intent.putExtra("carNo", carNo)
            intent.putExtra("phoneNumber", phoneNumber)
            intent.putExtra("slotNo", slotNo)

            setResult(RESULT_OK, intent)
            finish()
        }
    }
}


