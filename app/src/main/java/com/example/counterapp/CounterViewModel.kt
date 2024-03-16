package com.example.counterapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel(){
    private val _count = mutableStateOf(0)


    //Expose the count as an immutable state. count below acts like a get() method.
    val count: MutableState<Int> = _count


    fun increment() {
        _count.value++
    }


    fun decrement(){
        _count.value--
    }

}