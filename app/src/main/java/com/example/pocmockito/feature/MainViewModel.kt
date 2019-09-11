package com.example.pocmockito.feature

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.pocmockito.model.MainRepository

class MainViewModel (private val mainRepository: MainRepository): ViewModel() {

    private val messageLiveData = MutableLiveData<String>()

    fun getEmail(){
       var message = mainRepository.getEmail()
        messageLiveData.value = message
    }

    fun getMessageLiveData() : LiveData<String> = messageLiveData
}
