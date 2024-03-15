package com.example.counterapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){

    @Composable
    fun Counter(){
        val _count by remember { mutableStateOf(0)}
    }

    @Composable
    fun increment() {

    }

    @Composable
    fun decrement(){

    }

}