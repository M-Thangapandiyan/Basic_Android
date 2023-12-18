package com.example.constraintbasics

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class FormActivity : AppCompatActivity() {

    private var isAllFieldsChecked = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)
        val btnSubmit = findViewById<Button>(R.id.submitButton)

Log.d("form", "ActivityA")

        btnSubmit.setOnClickListener {
            val intent = Intent(this, DisplayFormActivity::class.java)
            startActivity(intent)
        }
        //        val btnActivityC = findViewById<Button>(R.id.btnActivityC)
//        val btnActivityD = findViewById<Button>(R.id.btnActivityD)
//        btnActivityC.setOnClickListener {
//            val intent = Intent(this, MainActivity::class.java)
//            startActivity(intent)
//        }
//        btnActivityD.setOnClickListener {
//            val intent = Intent(this, LaunchModeActivity::class.java)
//            startActivity(intent)
//        }

    }


}
