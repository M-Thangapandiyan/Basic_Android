package com.example.constraintbasics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class LaunchModeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_mode)
        Log.d("launchModeActivity","ActivityD")
//        val btnActivityD = findViewById<Button>(R.id.btnActivityD)
//        btnActivityD.setOnClickListener {
//            val intent = Intent(this, FormActivity::class.java)
//            startActivity(intent)
//        }

        //single Top

        val btnActivityb = findViewById<Button>(R.id.btnActivityD)
        btnActivityb.setOnClickListener {
            val intent = Intent(this, DisplayFormActivity::class.java)
            startActivity(intent)
        }
    }
}