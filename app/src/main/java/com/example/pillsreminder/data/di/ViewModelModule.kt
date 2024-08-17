package com.example.pillsreminder.data.di

import com.example.pillsreminder.ui.fragments.PillViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val viewModelModule = module {
    viewModel{
        PillViewModel(get())
    }
}