package com.example.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda.databinding.ActivityAddEventBinding

class AddEventActivity : AppCompatActivity() {

    private val binding by lazy {ActivityAddEventBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}