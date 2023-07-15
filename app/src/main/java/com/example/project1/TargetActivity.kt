package com.example.project1

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class TargetActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_target)
        val tvhasil =findViewById<TextView>(R.id.tvhasil)
        val nama = intent.getStringExtra("Extra_Nama")
        val usia = intent.getIntExtra("Extra_Usia",0)
        val asal = intent.getStringExtra("Extra_Asal")

        val hasilData = "Nama Anda Adalah $nama  \n"+
                        "Usia Anda         $usia \n"+
                        "Asal              $asal  "
        tvhasil.text = hasilData
    }
}