package com.example.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import com.example.agenda.App
import com.example.agenda.R
import com.example.agenda.data.EventCard
import com.example.agenda.databinding.ActivityAddEventBinding


class AddEventActivity : AppCompatActivity() {

    private val binding by lazy { (ActivityAddEventBinding.inflate(layoutInflater))}

    private val mainViewModel: MainViewModel by viewModels {
        MainViewModelFactory((application as App).repository)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        insertListeners()
    }


    private fun insertListeners() {
        binding.ibClose.setOnClickListener {
            finish()
        }
        binding.btConfirm.setOnClickListener {
            val eventCard = EventCard(
                event = binding.tilEvent.editText?.text.toString(),
                place = binding.tilPlace.editText?.text.toString(),
                date = binding.tilDate.editText?.text.toString(),
                hour = binding.tilHour.editText?.text.toString()
            )
            mainViewModel.insert(eventCard)
            Toast.makeText(this, getString(R.string.sucess_register), Toast.LENGTH_SHORT).show()
            finish()
        }
    }
}