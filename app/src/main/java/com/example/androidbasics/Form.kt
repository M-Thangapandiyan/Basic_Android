package com.example.androidbasics

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity


class Form : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        val sendText = findViewById<EditText>(R.id.edit)
        val sendButton = findViewById<Button>(R.id.button1)
        sendButton.setOnClickListener {
            val str = sendText.text.toString()
            val intent = Intent( applicationContext, Second_From::class.java)
            intent.putExtra("message_key", str);
            startActivity(intent);
        }
    }
}