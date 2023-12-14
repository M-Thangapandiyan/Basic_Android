package com.example.androidbasics

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.widget.addTextChangedListener

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        Log.d("hello", "world!")

        val editValue = findViewById<EditText>(R.id.edit)
        val button = findViewById<Button>(R.id.button1)
        val text = findViewById<TextView>(R.id.close)

        editValue.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {
                Log.d("Test","beforeTextChanged:$s")
            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                Log.d("Test", "onTextChanged : $s")
            }

            override fun afterTextChanged(s: Editable?) {
                Log.d("Test", "afterTextChanged : $s")
                text.text = s?.toString()
            }

        })
    }
}