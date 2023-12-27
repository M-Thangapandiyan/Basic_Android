package com.example.carparkingapplication

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CarParkingAdapter : RecyclerView.Adapter<CarParkingAdapter.ViewHolder>() {

    private val carParkingList = mutableListOf<CarParkingModel>()

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvCarNo: TextView = itemView.findViewById(R.id.carNo)
        var phoneNumber: TextView = itemView.findViewById(R.id.phoneNumber)
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(viewGroup.context).inflate(R.layout.displaycardatails, viewGroup, false)
        return ViewHolder(view)
    }
    fun submitData(carParkingModel : CarParkingModel) {
        carParkingList.add(carParkingModel)
        notifyDataSetChanged()
    }

    override fun getItemCount() = carParkingList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: CarParkingModel = carParkingList[position]
        holder.tvCarNo.text = model.carNo
        holder.phoneNumber.text = model.phoneNumber
    }

}