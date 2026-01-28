package com.example.learningkotlin.presentation.payment.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Checkbox
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.learningkotlin.R

@Composable
fun PaymentMethodItem() {
    Column (modifier = Modifier
        .fillMaxWidth()
        .height(265.dp)
        .background(Color.White)) {
        Image(painter = painterResource(id = R.drawable.payment_card), contentDescription = null , modifier = Modifier
            .fillMaxWidth()
            .height(230.dp), contentScale = ContentScale.FillBounds)

        Row (modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
            Checkbox(checked = false, onCheckedChange = {})
            Text(text = "Use as default payment method",
                fontSize = 18.sp, fontWeight = FontWeight(400)
            )
        }
    }
}