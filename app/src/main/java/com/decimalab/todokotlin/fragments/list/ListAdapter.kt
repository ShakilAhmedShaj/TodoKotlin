package com.decimalab.todokotlin.fragments.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.navigation.findNavController
import androidx.recyclerview.widget.RecyclerView
import com.decimalab.todokotlin.R
import com.decimalab.todokotlin.data.models.Priority
import com.decimalab.todokotlin.data.models.ToDoData
import kotlinx.android.synthetic.main.row_layout.view.*

/**
 * Created by Shakil Ahmed Shaj on 31,August,2020.
 * shakilahmedshaj@gmail.com
 */
class ListAdapter : RecyclerView.Adapter<ListAdapter.MyViewHolder>() {


    var dataList = emptyList<ToDoData>()


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_layout, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.itemView.title_txt.text = dataList[position].title
        holder.itemView.description_txt.text = dataList[position].description

        holder.itemView.row_background.setOnClickListener {

           val action = ListFragmentDirections.actionListFragmentToUpdateFragment(dataList[position])
            holder.itemView.findNavController().navigate(action)
        }

        val priority = dataList[position].priority
        when (priority) {
            Priority.HIGH -> holder.itemView.priority_indicator.setBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context, R.color.red
                )
            )

            Priority.LOW -> holder.itemView.priority_indicator.setBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context, R.color.yellow
                )
            )

            Priority.MEDIUM -> holder.itemView.priority_indicator.setBackgroundColor(
                ContextCompat.getColor(
                    holder.itemView.context, R.color.green
                )
            )
        }
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    fun setData(toDoData: List<ToDoData>) {
        this.dataList = toDoData
        notifyDataSetChanged()
    }


}