package com.example.viewmodel

import androidx.lifecycle.ViewModel

class SimpleViewModel : ViewModel() {
    var number = 0

    fun addOne() {
        number++
    }



}