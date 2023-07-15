package com.example.project1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.project1.databinding.ActivityAksesWidgetBinding


class MainActivity2 : AppCompatActivity() {
    lateinit var binding: ActivityAksesWidgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAksesWidgetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBinding.setOnClickListener{
            Toast.makeText(this,  "Ini Menggunakan Binding", Toast.LENGTH_SHORT).show()
        }
    }
}