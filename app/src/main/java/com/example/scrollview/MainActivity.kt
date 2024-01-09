package com.example.scrollview

import android.os.Bundle
import android.view.ViewTreeObserver
import android.widget.ScrollView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView

class MainActivity : AppCompatActivity(), ViewTreeObserver.OnScrollChangedListener,TimePickerFragment.OnTimeSelectedListener {

    private lateinit var scrollView: ScrollView
    private lateinit var tvTime: AppCompatTextView
    private lateinit var btnTimePicker: AppCompatButton
    private var reachedTopOrBottom = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        scrollView = findViewById(R.id.tvScrollView)
        tvTime = findViewById(R.id.tvText)
        btnTimePicker = findViewById(R.id.timePickerButton)
        scrollView.viewTreeObserver.addOnScrollChangedListener(this)
        btnTimePicker.setOnClickListener {
            val timePickerFragment = TimePickerFragment()
            timePickerFragment.show(supportFragmentManager, Constants.TIME_PICKER)
        }
        val timePicker = TimePickerFragment()
        timePicker.setOnTimeSelectedListener(this)
        onScrollChanged()
    }

    override fun onScrollChanged() {
        if (!reachedTopOrBottom) {
            val view = scrollView.getChildAt(scrollView.childCount - 1)
            val topDetector = scrollView.scrollY
            val bottomDetector: Int = view.bottom - (scrollView.height + scrollView.scrollY)
            if (bottomDetector == 0) {
                Toast.makeText(this, Constants.BOTTOM, Toast.LENGTH_LONG).show()
                reachedTopOrBottom = true
            } else if (topDetector <= 0) {
                Toast.makeText(this, Constants.TOP, Toast.LENGTH_LONG).show()
                reachedTopOrBottom = true
            }
        }
    }

    override fun onTimeSelected(hourOfDay: Int, minute: Int) {
        val selectedTime = "$hourOfDay:$minute"
        tvTime.text = selectedTime
    }
}
