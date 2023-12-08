package com.example.sampleprogram_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("========================>","onCreate created")
        val textView = findViewById<TextView>(R.id.sp1)

//        print the text from kotlin
//        textView.text = "example program"

//        print the text from kotlin and xml\

//        val text1 = textView.text
//        val  newText = text1.toString() +"New Text from onCreate"
//        textView.text = newText

//        val button =  findViewById<Button>(R.id.btnClickMe)
//        button.setOnClickListener {
//           Toast.makeText(this@MainActivity,"Thank you Partha",Toast.LENGTH_SHORT).show()
//       }
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