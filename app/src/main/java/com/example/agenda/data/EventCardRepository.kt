package com.example.agenda.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class EventCardRepository(private val dao: EventCardDao) {

    fun insert(eventCard: EventCard) = runBlocking {
        launch(Dispatchers.IO) {
            dao.insert(eventCard)
        }
    }

    fun getAll() = dao.getAll()
}