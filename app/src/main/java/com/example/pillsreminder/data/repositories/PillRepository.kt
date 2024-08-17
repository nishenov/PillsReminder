package com.example.pillsreminder.data.repositories

import androidx.lifecycle.LiveData
import com.example.pillsreminder.data.db.PillDatabase
import com.example.pillsreminder.data.models.PillModel

class PillRepository(private val pillDatabase: PillDatabase) {
    fun getAllPills(): LiveData<List<PillModel>>{
        return pillDatabase.pillDao().getAll()
    }
}