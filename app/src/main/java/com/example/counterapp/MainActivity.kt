package com.example.counterapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.counterapp.ui.theme.CounterAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            /*Declaring the viewModel() object so that we can pass it onto the Counter funt*/
            val viewModel : CounterViewModel = viewModel()
            CounterAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Counter(viewModel)
                }
            }
        }
    }
}

@Composable
fun Counter(viewModel: CounterViewModel, modifier: Modifier = Modifier) {

  Column (
      modifier = modifier.fillMaxSize(),
      verticalArrangement = Arrangement.Center
  ){

      Row(
          modifier = modifier
              .fillMaxWidth()
              .padding(8.dp),
          horizontalArrangement = Arrangement.Center
      ){
          /*We are saying .dot value because we didn't use the by keyword.*/
          Text("Count: ${viewModel.count.value}", fontSize = 24.sp, fontWeight = FontWeight.Bold)
      }

      Row(
          modifier = modifier.fillMaxWidth(),
          horizontalArrangement = Arrangement.Center
      ){

          Button(
              modifier = modifier.padding(8.dp),
              onClick = { viewModel.increment() }) {
              Text("Increment")
          }
          Button(
              modifier = modifier.padding(8.dp),
              onClick = { viewModel.decrement() }) {
              Text("Decrement")
          }
      }
  }
}

