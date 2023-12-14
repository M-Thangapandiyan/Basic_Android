package com.example.androidbasics

import android.annotation.SuppressLint
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.SpannableStringBuilder
import android.util.Log
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("===================>","OnCreate")
        val editText = findViewById<EditText>(R.id.firstName)
        val editText3 = findViewById<EditText>(R.id.age)
        val editText4 = findViewById<TextView>(R.id.info)
        val showButton = findViewById<Button>(R.id.button)
        showButton.setOnClickListener{
            val firstName = editText.text.toString()
            val age = editText3.text.toString()
            val result = "Name = $firstName \nAge = $age"
            editText4.text = result
        }
    }

    override fun onStart() {
        super.onStart()
        Log.d("_____________","OnStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("===========================>","OnResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d("===================", "OnPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(".............>","onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("===========","onRestart")
    }
    override fun onDestroy() {
        super.onDestroy()
        Log.d("=================>","onDestroy")
    }
}