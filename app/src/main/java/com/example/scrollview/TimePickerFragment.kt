package com.example.scrollview

import android.app.Dialog
import android.app.TimePickerDialog
import android.os.Bundle
import android.widget.TimePicker
import androidx.fragment.app.DialogFragment
import java.util.Calendar

class TimePickerFragment : DialogFragment(), TimePickerDialog.OnTimeSetListener {
    private var timeSelectedListener: OnTimeSelectedListener? = null

    interface OnTimeSelectedListener {
        fun onTimeSelected(hourOfDay: Int, minute: Int)
    }

    override fun onCreateDialog(savedInstanceState: Bundle?): Dialog {
        val calendar = Calendar.getInstance()
        val hour = calendar.get(Calendar.HOUR_OF_DAY)
        val minute = calendar.get(Calendar.MINUTE)
        return TimePickerDialog(context, this, hour, minute, true)
    }

    override fun onTimeSet(view: TimePicker?, hourOfDay: Int, minute: Int) {
        timeSelectedListener?.onTimeSelected(hourOfDay, minute)
    }

    fun setOnTimeSelectedListener(listener: OnTimeSelectedListener) {
        timeSelectedListener = listener
    }
}

