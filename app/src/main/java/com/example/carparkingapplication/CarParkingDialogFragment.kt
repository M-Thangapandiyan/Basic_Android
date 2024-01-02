package com.example.carparkingapplication


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.fragment.app.DialogFragment
import java.text.SimpleDateFormat
import java.util.Date
import java.util.Locale

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
        btnOk = view.findViewById(R.id.ok)
        val carNo = arguments?.getString(Constants.CAR_NO)
        val phoneNumber = arguments?.getString(Constants.USER_PHONE_NUMBER)
        val checkIn =   arguments?.getString(Constants.CHECK_IN)
        val slotNumber =  arguments?.getString(Constants.SLOT_NO)
        tvCarNo.text = "${Constants.CAR_NUMBER}${carNo}"
        tvPhoneNumber.text = "${Constants.USER_PHONE_NUMBER}${phoneNumber}"
        tvSlotNo.text = "${Constants.CAR_SLOT_NO}${slotNumber}"
        tvCheckInTime.text = "${Constants.CHECK_IN_TIME}${checkIn}"
        btnOk.setOnClickListener{
            dismiss()
        }
    }

    override fun onStart() {
        super.onStart()
        dialog?.window?.setLayout(900,900)
    }

//    fun calculate(){
//        val dateFormat = SimpleDateFormat(Constants.DATE_PATTERN, Locale.getDefault())
//        val startDate = dateFormat.parse(tvCheckInTime.toString())
//        val endDate = dateFormat.parse(getCurrentDateTime())
//        val difference = endDate.time - startDate.time
//        val seconds = difference / 1000
//        val minutes = seconds / 60
//        val hours = minutes / 60
//        val days = hours / 24
//    }

//    private fun getCurrentDateTime(): String {
//        val dateTime = SimpleDateFormat(Constants.DATE_PATTERN, Locale.getDefault())
//        return dateTime.format(Date())
//    }

}
