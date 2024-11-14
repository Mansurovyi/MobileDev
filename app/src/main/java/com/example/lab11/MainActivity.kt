package com.example.lab11

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.lab11.ui.theme.Lab11Theme
import java.time.format.TextStyle

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            CounterApp()
        }
    }
}

@Composable
fun CounterApp() {
    // Состояние для счетчика
    var count = remember { mutableStateOf(0) }

    // Структура для размещения текста и кнопки
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        // Отображаем текущий счет
        Text(
            text = "Количество нажатий: ${count.value}",
        )
        Button(
            onClick = { count.value += 1 },  // Увеличиваем счетчик на 1
        ) {
            Text(
                text = "Нажми меня",
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewCounterApp() {
    CounterApp()
}