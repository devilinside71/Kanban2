package com.hmei.kanban

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class InProgressListAdapter(val itemList: ArrayList<ListItemEntity>) : RecyclerView.Adapter<InProgressListAdapter.ViewHolder>(){


    //this method is returning the view for each item in the list
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InProgressListAdapter.ViewHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ViewHolder(v)
    }

    //this method is binding the data on the list
    override fun onBindViewHolder(holder: InProgressListAdapter.ViewHolder, position: Int) {
        holder.bindItems(itemList[position])
    }

    //this method is giving the size of the list
    override fun getItemCount(): Int {
        return itemList.size
    }

    //the class is hodling the list view
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun bindItems(item: ListItemEntity) {
            val textViewItem = itemView.findViewById(R.id.item_text) as TextView
            textViewItem.text = item.description
        }
    }
}