package com.example.agenda

import android.app.Application
import com.example.agenda.data.AppDatabase
import com.example.agenda.data.EventCardRepository

class App : Application() {
    val database by lazy { AppDatabase.getDatabase(this) }
    val repository by lazy { EventCardRepository(database.eventDao()) }
}