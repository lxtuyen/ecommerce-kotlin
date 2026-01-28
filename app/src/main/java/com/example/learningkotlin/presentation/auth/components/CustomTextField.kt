package com.example.learningkotlin.presentation.auth.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt

@Composable
fun CustomTextField() {
    val username by remember { mutableStateOf("") }
    TextField(
        value = username,
        onValueChange = {

        },
        modifier = Modifier
            .fillMaxWidth(),
        colors = TextFieldDefaults.colors(
            focusedContainerColor = Color("#E0E0E0".toColorInt()),
            unfocusedContainerColor = Color.White,
            disabledContainerColor = Color.Gray,
            unfocusedIndicatorColor = Color.Gray,
        ),
    )
}