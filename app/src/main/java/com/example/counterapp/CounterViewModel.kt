package com.example.counterapp

import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.ViewModel

class CounterViewModel(private val repository: CounterRepository) : ViewModel(){
    private val _count = mutableStateOf(repository.getCounter().count)


    //Expose the count as an immutable state. count below acts like a get() method.
    val count: MutableState<Int> = _count


    fun increment() {
      repository.incrementCounter()
          _count.value = repository.getCounter().count
    }


    fun decrement(){
       repository.decrementCounter()
        _count.value = repository.getCounter().count
    }

}