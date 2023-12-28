package com.example.carparkingapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarParkingAdapter : RecyclerView.Adapter<CarParkingAdapter.ViewHolder>() {
    private var carParkingList = mutableListOf<CarParkingModel>()
    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCarNo: TextView = itemView.findViewById(R.id.car_no)
        var phoneNumber: TextView = itemView.findViewById(R.id.phoneNumber)
        var slotNumber: TextView = itemView.findViewById(R.id.slot_number)
        var checkInTime: TextView = itemView.findViewById(R.id.checkInTime)
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.display_car_parking_details, viewGroup, false)
        return ViewHolder(view)
    }
    fun submitData(carParkingModel: CarParkingModel) {
        carParkingList.add(carParkingModel)
       notifyDataSetChanged()
    }
    override fun getItemCount() = carParkingList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: CarParkingModel = carParkingList[position]
        if(model.carNo != "null") {
            holder.tvCarNo.text = "Car Number:  ${model.carNo}"
            holder.phoneNumber.text = "Phone Number:  ${model.phoneNumber}"
            holder.slotNumber.text = "Car Slot No:  ${model.slotNumber}"
            holder.checkInTime.text = "Car Check In Time:  ${model.checkIn}"
        }
    }
    fun filter(query: String) {
        val filteredList = mutableListOf<CarParkingModel>()
        if (query.isEmpty()) {
            filteredList.addAll(carParkingList)
        } else {
            val searchQuery = query.lowercase()
            for (item in carParkingList) {
                if (item.carNo.lowercase().contains(searchQuery) || item.phoneNumber.lowercase().contains(searchQuery)) {
                    filteredList.add(item)
                }
            }
        }
        carParkingList.clear()
        carParkingList.addAll(filteredList)
        notifyDataSetChanged()
        filteredList.addAll(carParkingList)
    }
}

