package com.example.pillsreminder.data.di

import androidx.room.Room
import com.example.pillsreminder.data.db.PillDatabase
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val databaseModule = module {
    single {
        Room.databaseBuilder(
            androidContext(),
            PillDatabase::class.java,
            "pill.database"
        ).fallbackToDestructiveMigration().build()
    }
    single { get<PillDatabase>().pillDao() }
}