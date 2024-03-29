package com.sugarmaniac.a5eweightcalculator

import androidx.room.TypeConverter
import com.google.gson.Gson

class Converters {
}

@TypeConverter
fun listToJson(value: IntArray?) = Gson().toJson(value)

@TypeConverter
fun jsonToList(value: String) = Gson().fromJson(value, IntArray::class.java)