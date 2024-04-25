package com.example.testekotlin

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.material3.Button
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyButton (
    label: String,
    hasIcon: Boolean,
    marked: Boolean = false,
    onClicked: () -> Unit = {}
) {
    Button(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        onClick = onClicked
    ) {
        if (hasIcon) {
            if (marked) {
                Icon(imageVector = Icons.Filled.CheckCircle, contentDescription = "checked")
            } else {
                Icon(imageVector = Icons.Filled.Check, contentDescription = "not checked")
            }
            Spacer(modifier = Modifier.size(20.dp))
        }
        Text(text = label)
    }
}

@Preview(showBackground = true)
@Composable
fun MyButtonPreview() {
    MyButton(label="Really Long Text for Testing", hasIcon = false, marked = false)
}
@Preview(showBackground = true)
@Composable
fun MyButtonPreview2() {
    MyButton(label="Really Long Text for Testing", hasIcon = true, marked = false)
}