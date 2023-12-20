package com.example.constraintbasics

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmployeeAdapter(private val employeeDetailsList: List<EmployeeModel>) :
    RecyclerView.Adapter<EmployeeAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvName : TextView = itemView.findViewById(R.id.showName)
        val tvPhoneNumber : TextView = itemView.findViewById(R.id.showPhoneNumber)
        val tvMail : TextView = itemView.findViewById(R.id.showMail)
        val tvAddress : TextView = itemView.findViewById(R.id.showAddress)
        val tvPinCode : TextView = itemView.findViewById(R.id.showPinCode)
        val tvMessage : TextView = itemView.findViewById(R.id.message)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.activity_employee, viewGroup, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        if(viewHolder == "" ) {
            Log.d("==========================================================================================" , "$viewHolder")
            val model: EmployeeModel = employeeDetailsList[position]
            viewHolder.tvMessage.text = model.name
        }else {
            val model: EmployeeModel = employeeDetailsList[position]
            viewHolder.tvName.text = model.name
            viewHolder.tvPhoneNumber.text = model.phoneNumber
            viewHolder.tvMail.text = model.mail
            viewHolder.tvAddress.text = model.address
            viewHolder.tvPinCode.text = model.pinCode
        }
    }

    override fun getItemCount() = employeeDetailsList.size
}


