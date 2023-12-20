package com.example.kotlinpract1.UI.View

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// Создание пользовательской темы с измененной типографией
private val CustomTypography = Typography().copy(
    titleLarge = TextStyle(
        fontFamily = FontFamily.SansSerif, // Шрифт без засечек
        fontSize = 20.sp, // Размер шрифта 20 в единицах SP
        fontWeight = FontWeight.Bold, // Жирное начертание
        color = Color.Black // Черный цвет текста
    )
)

// Компонент Compose для отображения информации о студенте
@Composable
fun StudentInfo(studentName: String, group: String) {
    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(
            text = "ФИО: $studentName\nГруппа: $group",
            style = MaterialTheme.typography.titleLarge,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(16.dp)
        )
    }
}

// Компонент Compose для основного приложения
@Composable
fun MyApp(studentName: String, group: String) {
    MaterialTheme(
        typography = CustomTypography, // Использование пользовательской типографии
        colorScheme = lightColorScheme(
            background = Color.White,
            onBackground = Color.Black
        )
    ) {
        Surface(
            modifier = Modifier.fillMaxSize()
        ) {
            StudentInfo(studentName, group)
        }
    }
}
