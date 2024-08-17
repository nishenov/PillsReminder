package com.example.pillsreminder.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.pillsreminder.data.models.PillModel
import com.example.pillsreminder.data.repositories.PillRepository

class PillViewModel(private val repository: PillRepository) : ViewModel(){}
