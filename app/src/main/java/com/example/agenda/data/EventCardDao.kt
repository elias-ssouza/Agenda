package com.example.agenda.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EventCardDao {

    @Query("SELECT * FROM EventCard")
    fun getAll(): LiveData<List<EventCard>>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(eventCard: EventCard)
}