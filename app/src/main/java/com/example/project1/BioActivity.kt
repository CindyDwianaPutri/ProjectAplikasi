package com.example.project1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project1.databinding.ActivityBioBinding

class BioActivity : AppCompatActivity() {
    lateinit var binding: ActivityBioBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityBioBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnbinding.setOnClickListener {
            Toast.makeText(this, "Hai Cindy, Selamat Datang", Toast.LENGTH_SHORT).show()
        }
    }
}

