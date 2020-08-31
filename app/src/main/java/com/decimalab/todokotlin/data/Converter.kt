package com.decimalab.todokotlin.data

import androidx.room.TypeConverter
import com.decimalab.todokotlin.data.models.Priority

/**
 * Created by Shakil Ahmed Shaj on 30,August,2020.
 * shakilahmedshaj@gmail.com
 */
class Converter {

    @TypeConverter
    fun fromPriority(priority: Priority): String {
        return priority.name
    }

    @TypeConverter
    fun toPriority(priority: String): Priority {
        return Priority.valueOf(priority)
    }

}