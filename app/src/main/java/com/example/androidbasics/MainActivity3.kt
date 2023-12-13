package com.example.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.d("hello", "world!")

        var typdeValue = ""

        val editValue = findViewById<EditText>(R.id.edit)
        val button = findViewById<Button>(R.id.button1)
        val text = findViewById<TextView>(R.id.close)

        button.setOnClickListener {
            val showValue = editValue.text
            typdeValue = typdeValue + "\n" + showValue
            text.text = typdeValue

        }
    }
}
