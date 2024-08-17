package com.example.pillsreminder.data.di

import com.example.pillsreminder.data.repositories.PillRepository
import org.koin.dsl.module

val repositoryModule = module {
    factory {
        PillRepository(get())
    }
}