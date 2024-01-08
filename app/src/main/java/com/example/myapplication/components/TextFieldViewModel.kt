package com.example.myapplication.components

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class TextFieldViewModel : ViewModel() {
    private val _isShowError: MutableLiveData<Boolean> = MutableLiveData()
    val isShowError: LiveData<Boolean> = _isShowError
    fun validate(value: String) {
        _isShowError.value = value.isBlank()
    }
}