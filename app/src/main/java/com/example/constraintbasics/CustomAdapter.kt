package com.example.constraintbasics

import android.service.autofill.Dataset
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CustomAdapter(private val dataset: Array<String>) :
    RecyclerView.Adapter<CustomAdapter.ViewHolder>() {
        var bindViewHolderCount = 0
        var createViewHolderCount = 0
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val textView: TextView
        init {
            textView = view.findViewById(R.id.textView)
        }
    }
    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(viewGroup.context).inflate(R.layout.text_row_item, viewGroup, false)
        createViewHolderCount++
        Log.d("onCreateViewHolder","onCreateViewHolder $createViewHolderCount")
        return ViewHolder(view)
    }
    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.textView.text = "value of $position"
        bindViewHolderCount++
        Log.d("onBindViewHolder","onBindViewHolder $bindViewHolderCount")
    }
    override fun getItemCount() = 100
}
