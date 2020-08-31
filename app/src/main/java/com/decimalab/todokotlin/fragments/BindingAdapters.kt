package com.decimalab.todokotlin.fragments


import android.view.View
import android.widget.Spinner
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import androidx.lifecycle.MutableLiveData
import androidx.navigation.findNavController
import com.decimalab.todokotlin.R
import com.decimalab.todokotlin.data.models.Priority
import com.decimalab.todokotlin.data.models.ToDoData
import com.decimalab.todokotlin.fragments.list.ListFragmentDirections
import com.google.android.material.floatingactionbutton.FloatingActionButton

/**
 * Created by Shakil Ahmed Shaj on 31,August,2020.
 * shakilahmedshaj@gmail.com
 */
class BindingAdapters {
    companion object {
        @BindingAdapter("android:navigateToAddFragment")
        @JvmStatic
        fun navigateToAddFragment(view: FloatingActionButton, navigate: Boolean) {
            view.setOnClickListener {
                if (navigate) {
                    view.findNavController().navigate(R.id.action_listFragment_to_addFragment)
                }
            }
        }

        @BindingAdapter("android:emptyDatabase")
        @JvmStatic
        fun emptyDatabase(view: View, emptyDatabase: MutableLiveData<Boolean>) {
            when (emptyDatabase.value) {
                true -> view.visibility = View.VISIBLE
                false -> view.visibility = View.INVISIBLE
            }
        }

        @BindingAdapter("android:parsePriorityToInt")
        @JvmStatic
        fun parsePriorityToInt(view: Spinner, priority: Priority) {

            when (priority) {
                Priority.HIGH -> { view.setSelection(0) }
                Priority.MEDIUM -> { view.setSelection(1) }
                Priority.LOW -> { view.setSelection(2) }
            }

        }
        @BindingAdapter("android:parsePriorityColor")
        @JvmStatic
        fun parsePriorityColor(cardView: CardView, priority: Priority){
            when(priority){
                Priority.HIGH -> { cardView.setCardBackgroundColor(cardView.context.getColor(R.color.red)) }
                Priority.MEDIUM -> { cardView.setCardBackgroundColor(cardView.context.getColor(R.color.yellow)) }
                Priority.LOW -> { cardView.setCardBackgroundColor(cardView.context.getColor(R.color.green)) }
            }
        }

        @BindingAdapter("android:sendDataToUpdateFragment")
        @JvmStatic
        fun sendDataToUpdateFragment(view: ConstraintLayout, currentItem: ToDoData){
            view.setOnClickListener {
                val action = ListFragmentDirections.actionListFragmentToUpdateFragment(currentItem)
                view.findNavController().navigate(action)
            }
        }
    }
}