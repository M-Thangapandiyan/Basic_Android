package com.example.androidbasics


import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class Second_From : AppCompatActivity() {

    lateinit var receiveText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_from)
        receiveText = findViewById<TextView>(R.id.second_form_textview_id)
        val intent = intent
        val str = intent.getStringExtra("message_key")
        receiveText.text = str
    }
}