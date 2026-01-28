package com.example.learningkotlin.presentation.payment

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.learningkotlin.presentation.payment.components.PaymentMethodItem

@Composable
fun PaymentMethodScreen(innerPaddingValues: PaddingValues){
    Column (modifier = Modifier
        .fillMaxSize()
        .padding(start = 0.dp,innerPaddingValues.calculateTopPadding(),
            end = 0.dp)
        .background(Color.White)) {

        LazyColumn{
            items(2) {
                    ite -> PaymentMethodItem()
            }
        }
    }
}