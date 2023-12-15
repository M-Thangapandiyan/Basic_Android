package com.example.constraintbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayFormActivity : AppCompatActivity() {

    private lateinit var receiveText : TextView
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_display_form)
       receiveText = findViewById(R.id.display_form_textview_id1)
       val bundle = intent.extras?.getBundle("data")
       val name = bundle?.getString("name")
       val phoneNumber = bundle?.getString("phoneNumber")
       val mail = bundle?.getString("mail")
       val address = bundle?.getString("address")
       val pinCode = bundle?.getString("pinCode")

       val displayText = "Name: $name\n" +
               "Phone Number: $phoneNumber\n" +
               "Mail: $mail\n" +
               "Address: $address\n" +
               "Pin Code: $pinCode"
       receiveText.text = displayText
   }
}