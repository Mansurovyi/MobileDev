package com.example.lab1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.tooling.preview.Preview

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SimpleInterface()
        }
    }
}

@Composable
fun SimpleInterface() {
    var text = remember { mutableStateOf("Привет, мир!") }


    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = text.value,
            style = TextStyle(fontSize = 30.sp)
        )
        Spacer(modifier = Modifier.height(20.dp))
        Button(
            onClick = { text.value = "Кнопка нажата" },
            modifier = Modifier.padding(16.dp)
        ) {
            Text(
                text = "Нажми меня",
                style = TextStyle(fontSize = 20.sp)
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewSimpleInterface() {
    SimpleInterface()
}
