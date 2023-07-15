package com.example.project1.ui.keranjang

import android.arch.lifecycle.LiveData
import android.arch.lifecycle.MutableLiveData
import android.arch.lifecycle.ViewModel

class KeranjangViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Ini Isi Keranjang Loo"
    }
    val text: LiveData<String> = _text
}