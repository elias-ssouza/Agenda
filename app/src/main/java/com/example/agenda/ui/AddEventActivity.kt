package com.example.agenda.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.agenda.databinding.ActivityAddEventBinding

class AddEventActivity : AppCompatActivity() {

    private val binding by lazy {ActivityAddEventBinding.inflate(layoutInflater)}

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        insertListeners()
    }

    private fun insertListeners(){
        binding.ibClose.setOnClickListener{
            finish()
        }
        /*binding.btConfirm.setOnClickListener {
            val eventCard = EventCard(
                event = binding.tilName.editText?.text.toString(),
                place = binding.tilCompany.editText?.text.toString(),
                date = binding.tilTelephone.editText?.text.toString(),
                hour = binding.tilEmail.editText?.text.toString() */
    }
}