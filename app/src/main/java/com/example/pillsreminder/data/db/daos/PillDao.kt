package com.example.pillsreminder.data.db.daos

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.example.pillsreminder.data.models.PillModel

@Dao
interface PillDao {
    @Query("SELECT * FROM pillsModel")
    fun getAll(): LiveData<List<PillModel>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertPill(pillModel: PillModel)

    @Delete
    fun deletePill(pillModel: PillModel)

    @Update
    fun updatePills(pillModel: PillModel)
}