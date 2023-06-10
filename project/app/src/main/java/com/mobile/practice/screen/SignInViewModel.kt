package com.mobile.practice.screen

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SignInViewModel : ViewModel() {

    private val _id = MutableLiveData("")
    val id: LiveData<String>
        get() = _id

    fun onChangeId(newValue: String) {
        _id.value = newValue
    }

}