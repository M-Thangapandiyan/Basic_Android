package com.example.carparkingapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView

class CarParkingAdapter(private val carParkingInterface: CarParkingInterface) : RecyclerView.Adapter<CarParkingAdapter.ViewHolder>() {

    private var carParkingList: MutableList<CarParkingModel> = mutableListOf()
    private var filteredList = mutableListOf<CarParkingModel>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCarNo: AppCompatTextView = itemView.findViewById(R.id.carNo)
        var phoneNumber: AppCompatTextView = itemView.findViewById(R.id.phoneNumber)
        var slotNumber: AppCompatTextView = itemView.findViewById(R.id.slotNumber)
        var checkInTime: AppCompatTextView = itemView.findViewById(R.id.checkInTime)
        var checkOut : AppCompatButton = itemView.findViewById(R.id.checkOut)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.display_car_parking_details, viewGroup, false)
        return ViewHolder(view)
    }
    override fun getItemCount() = carParkingList.size
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: CarParkingModel = carParkingList[position]
        if(model.carNo != Constants.NULL) {
            holder.tvCarNo.text = "${Constants.CAR_NUMBER}${model.carNo}"
            holder.phoneNumber.text = "${Constants.USER_PHONE_NUMBER}${model.phoneNumber}"
            holder.slotNumber.text = "${Constants.CAR_SLOT_NO}${model.slotNumber}"
            holder.checkInTime.text = "${Constants.CHECK_IN_TIME}${model.checkIn}"
            holder.checkOut.setOnClickListener{
                carParkingInterface.onClick(model)
            }
        }
    }
    fun submitData(carParkingModel: CarParkingModel) {
        carParkingList.add(carParkingModel)
        filter(Constants.EMPTY_STRING)
    }

     fun filter(query: String) {
            filteredList.clear()
            if (query.isEmpty()) {
                filteredList.addAll(carParkingList)
            } else {
                val searchQuery = query.lowercase()
                filteredList.addAll(carParkingList.filter { item ->
                    item.carNo.lowercase().contains(searchQuery) || item.phoneNumber.lowercase().contains(searchQuery)
                })
            }
            notifyDataSetChanged()
        }
    }

















