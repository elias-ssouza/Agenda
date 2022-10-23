package com.example.agenda.data

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.util.*

@Entity
data class EventCard (
    @PrimaryKey(autoGenerate = true) val id: Int =0,
    val event:String,
    val place:String,
    val date: String,
    val hour: String
    )