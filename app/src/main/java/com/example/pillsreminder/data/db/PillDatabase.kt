package com.example.pillsreminder.data.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.pillsreminder.data.db.daos.PillDao
import com.example.pillsreminder.data.models.PillModel

@Database(entities = [PillModel::class], version = 1)
abstract class PillDatabase: RoomDatabase() {
    abstract fun pillDao(): PillDao
}