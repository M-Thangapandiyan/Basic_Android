package com.example.constraintbasics

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity","ActivityC")
        val btnActivityC = findViewById<Button>(R.id.btnActivityC)

        btnActivityC.setOnClickListener {
            val intent = Intent(this, LaunchModeActivity::class.java)
            startActivity(intent)
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("activityc","activityc start called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("activityc","activityc resume called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("activityc","activityc pause called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("activityc","activityc stop called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("activityc","activityc restart called")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("activityc","activityc destroy called")
    }


}