package com.example.carparkingapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarParkingAdapter(private val carParkingList : List<CarModel>) : RecyclerView.Adapter<CarParkingAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvCarNo: TextView = itemView.findViewById(R.id.carNo)
        val tvPhoneNumber: TextView = itemView.findViewById(R.id.phoneNumber)
        val tvSlotNumber: TextView = itemView.findViewById(R.id.slotNumber)
        val tvCheckInDate: TextView = itemView.findViewById(R.id.checkInDate)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.displaycardatails, viewGroup, false)
        return ViewHolder(view)
    }

    override fun getItemCount() = carParkingList.size

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        val model: CarModel = carParkingList[position]
        with(viewHolder) {
            tvCarNo.text = model.carNo
            tvPhoneNumber.text = model.phoneNumber
            tvSlotNumber.text = model.slotNo
            tvCheckInDate.text = model.checkInTime
        }
    }
}