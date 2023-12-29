package com.example.carparkingapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.DialogFragment

class CarParkingDialogFragment : DialogFragment() {

    private lateinit var tvCarNo : AppCompatTextView
    private lateinit var tvPhoneNumber : AppCompatTextView
    private lateinit var tvSlotNo : AppCompatTextView
    private lateinit var tvCheckInTime : AppCompatTextView
    private lateinit var btnOk : AppCompatButton

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.activity_car_parking_dialog_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        tvCarNo = view.findViewById(R.id.carNo)
        tvPhoneNumber = view.findViewById(R.id.phoneNumber)
        tvSlotNo = view.findViewById(R.id.slotNumber)
        tvCheckInTime = view.findViewById(R.id.checkInTime)
        Bundle()
        val carNo = arguments?.getString(Constants.CAR_PARKING_DETAILS)
        tvCarNo.text = carNo
        btnOk.setOnClickListener{
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(600,600)
    }
}
