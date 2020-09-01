package com.decimalab.todokotlin.utils

import android.app.Activity
import android.content.Context
import android.view.inputmethod.InputMethodManager

/**
 * Created by Shakil Ahmed Shaj on 31,August,2020.
 * shakilahmedshaj@gmail.com
 */
fun hideKeyboard(activity: Activity) {
    val inputMethodManager =
        activity.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager

    val currentFocusedView = activity.currentFocus
    currentFocusedView?.let {
        inputMethodManager.hideSoftInputFromWindow(
            currentFocusedView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS
        )
    }
}