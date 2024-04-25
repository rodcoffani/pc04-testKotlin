package com.example.testekotlin

import android.util.Log
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun Composable1() {
    var counter = 0
    var counter2 by rememberSaveable {
        mutableIntStateOf(0)
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        MyButton(label = "Click Me", false) {
            counter++
            Log.i("Composable1", "Counter: $counter")
            counter2++
        }
        var mark by remember {
            mutableStateOf(false)
        }
        MyButton(label = "Enable / Disable", hasIcon = true, marked = mark) {
            mark = !mark
        }
        Text(text = "You clicked $counter2 times")
    }
}

@Preview(showBackground = true)
@Composable
fun Composable1Preview() {
    Composable1()
}