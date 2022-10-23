package com.example.agenda.ui

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.agenda.data.EventCard
import com.example.agenda.data.EventCardRepository

class MainViewModel(private val eventCardRepository: EventCardRepository): ViewModel() {

    fun insert(businessCard: EventCard) {
        eventCardRepository.insert(businessCard)
    }

    fun getAll(): LiveData<List<EventCard>> {
        return eventCardRepository.getAll()
    }
}

class MainViewModelFactory(private val repository: EventCardRepository) : ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return MainViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}