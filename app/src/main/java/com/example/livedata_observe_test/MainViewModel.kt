package com.example.livedata_observe_test

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var event: MutableLiveData<String> = MutableLiveData<String>()

    fun makeEvent(){
        event.value = "토스트 띄우기"
    }

    fun endEvent(){
        event = MutableLiveData<String>()
    }
}