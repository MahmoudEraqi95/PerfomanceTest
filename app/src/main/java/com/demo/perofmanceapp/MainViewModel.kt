package com.demo.perofmanceapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MainViewModel: ViewModel() {

    private val _data = MutableStateFlow<List<String>>(emptyList())
    val data = _data.asStateFlow()
    fun getData(){
        viewModelScope.launch{
            delay(3000)
            _data.value = listOf("Test1", "Test2", "Test3")
        }
    }

}