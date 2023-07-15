package com.example.project1

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnsumbit= findViewById<Button>(R.id.btnsumbit)
        val edNama = findViewById<EditText>(R.id.edNama)
        val edUsia = findViewById<EditText>(R.id.edUsia)
        val edAsal = findViewById<EditText>(R.id.edAsal)

        btnsumbit.setOnClickListener(){
            val nama = edNama.text.toString()
            val usia = edUsia.text.toString().toInt()
            val asal = edAsal.text.toString()

            Intent(this, TargetActivity::class.java).also {
                it.putExtra("Extra_Nama",nama)
                it.putExtra("Extra_Usia",usia)
                it.putExtra("Extra_Asal",asal)
                startActivity(it)
            }
        }
    }
}