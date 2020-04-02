package com.example.mymvvmtest

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel : ViewModel() {

    fun addStatus() {
        val data = mutableListOf<String>()
        data.add("India")
        data.add("Pak")
        data.add("Aus")
        status.value = data
    }

    fun updateMainStatus() {
        mainStatus.value = false
    }

    fun getstatus() = status

    var mainStatus = MutableLiveData<Boolean>()

    private var status = MutableLiveData<List<String>>()

}