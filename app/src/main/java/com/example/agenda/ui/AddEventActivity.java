package com.example.agenda.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.agenda.databinding.ActivityAddEventBinding;



public class AddEventActivity extends AppCompatActivity {

    private ActivityAddEventBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityAddEventBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}