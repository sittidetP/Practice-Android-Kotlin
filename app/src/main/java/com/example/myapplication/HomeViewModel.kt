package com.example.myapplication

import android.util.Log
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {
    fun print() {
        Log.d(HomeViewModel::class.simpleName, "Hello World")
    }
}