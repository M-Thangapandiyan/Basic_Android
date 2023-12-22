package com.example.constraintbasics

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(private val employeeDetailsList: List<EmployeeModel>) :
    RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName: TextView = itemView.findViewById(R.id.showName)
        val tvPhoneNumber: TextView = itemView.findViewById(R.id.showPhoneNumber)
        val tvMail: TextView = itemView.findViewById(R.id.showMail)
        val tvAddress: TextView = itemView.findViewById(R.id.showAddress)
        val tvPinCode: TextView = itemView.findViewById(R.id.showPinCode)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.text_row_item, viewGroup, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val model: EmployeeModel = employeeDetailsList[position]

        with(viewHolder) {
            tvName.text = model.name
            tvPhoneNumber.text = model.phoneNumber
            tvMail.text = model.mail
            tvAddress.text = model.address
            tvPinCode.text = model.pinCode
        }
//        viewHolder.tvName.text = model.name
//        viewHolder.tvPhoneNumber.text = model.phoneNumber
//        viewHolder.tvMail.text = model.mail
//        viewHolder.tvAddress.text = model.address
//        viewHolder.tvPinCode.text = model.pinCode

    }

    override fun getItemCount() = employeeDetailsList.size
}


//
//
//package com.example.constraintbasics
//
//import android.view.LayoutInflater
//import android.view.View
//import android.view.ViewGroup
//import android.widget.TextView
//import androidx.recyclerview.widget.RecyclerView
//
//class EmployeeAdapter(private val employeeDetailsList: MutableList<EmployeeModel>) :
//    RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {
//    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
//        var tvName : TextView
//        var tvPhoneNumber : TextView
//        var  tvMail : TextView
//        var  tvAddress : TextView
//        var  tvPinCode : TextView
//        var  tvMessage : TextView
//        init {
//            tvName = itemView.findViewById(R.id.showName)
//            tvPhoneNumber = itemView.findViewById(R.id.showPhoneNumber)
//            tvMail = itemView.findViewById(R.id.showMail)
//            tvAddress = itemView.findViewById(R.id.showAddress)
//            tvPinCode  = itemView.findViewById(R.id.showPinCode)
//            tvMessage = itemView.findViewById(R.id.message)
//        }
//    }
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_employee, viewGroup, false)
//        return ViewHolder(view)
//    }
//    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
//        val model: EmployeeModel = employeeDetailsList[position]
//        if(model.name == null) {
//            viewHolder.tvMessage.text = model.message
//        }else {
//            viewHolder.tvName.text = model.name
//            viewHolder.tvPhoneNumber.text = model.phoneNumber
//            viewHolder.tvMail.text = model.mail
//            viewHolder.tvAddress.text = model.address
//            viewHolder.tvPinCode.text = model.pinCode
//        }
//    }
//    override fun getItemCount() = employeeDetailsList.size
//}





