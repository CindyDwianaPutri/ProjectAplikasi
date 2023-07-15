package com.example.project1


import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import android.widget.Toast
import com.example.project1.databinding.ActivityAksesWidgetBinding
import kotlinx.android.synthetic.main.activity_akses_widget.*


class AksesWidgetActivity : AppCompatActivity() {

    lateinit var binding: ActivityAksesWidgetBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAksesWidgetBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBinding.setOnClickListener {
            Toast.makeText(this, "Ini Menggunakan Binding", Toast.LENGTH_SHORT).show()


        }
    }
}

