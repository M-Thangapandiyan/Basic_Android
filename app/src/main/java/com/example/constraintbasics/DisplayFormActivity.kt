package com.example.constraintbasics

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class DisplayFormActivity : AppCompatActivity() {

    private lateinit var receiveText : TextView
   override fun onCreate(savedInstanceState: Bundle?) {
       super.onCreate(savedInstanceState)
       setContentView(R.layout.activity_display_form)
       Log.d("activityB","activityB on create")
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

       val btnActivityB = findViewById<Button>(R.id.btnActivityB)

       btnActivityB.setOnClickListener {
           val intent = Intent(this, MainActivity::class.java)
           startActivity(intent)
       }

       val btnActivity = findViewById<Button>(R.id.btnActivityB2)

       btnActivity.setOnClickListener {
           val intent = Intent(this, DisplayFormActivity::class.java)
           startActivity(intent)
       }

       val btnButton: Button = findViewById(R.id.recyclerButton)

       btnButton.setOnClickListener {
           val intent = Intent(this, RecyclerViewActivity::class.java)
           startActivity(intent)
       }
   }

    override fun onStart() {
        super.onStart()
        Log.d("activityb","activityb start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("activityb","activityb resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("activityb","activityb pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("activityb","activityb stop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("activityb","activityb restart called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("activityb","activityb destroy called")
    }
}