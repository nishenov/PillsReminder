package com.example.pillsreminder.data.models

import androidx.room.Entity

@Entity(tableName = "pillsModel")
data class PillModel(
    var name: String,
    var description: String,
    var amount: Int
)
