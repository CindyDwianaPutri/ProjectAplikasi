package com.example.project1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.project1.databinding.ActivityLogin03Binding
import com.example.project1.databinding.ActivityNavigasiBinding

class Login03Activity : AppCompatActivity() {

    private lateinit var binding: ActivityLogin03Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLogin03Binding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}