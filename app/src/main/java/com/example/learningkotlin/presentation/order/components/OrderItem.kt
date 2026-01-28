package com.example.learningkotlin.presentation.order.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.learningkotlin.R
import com.example.learningkotlin.components.CustomButton

@Composable
fun OrderItem() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .height(160.dp)
            .background(Color.White, shape = RoundedCornerShape(8.dp)),
        verticalArrangement = Arrangement.SpaceEvenly
    ) {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(
                text = "Order No238562312",
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                color = Color.Black
            )
            Text(
                text = "20/03/2020",
                fontSize = 14.sp,
                fontWeight = FontWeight(500),
                color = Color.Gray
            )
        }
        HorizontalDivider(thickness = 1.dp, color = Color.Black)
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Text(text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Gray,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                    )
                ) {
                    append("Quantity: ")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                    )
                ) {
                    append("03")
                }
            })
            Text(text = buildAnnotatedString {
                withStyle(
                    style = SpanStyle(
                        color = Color.Gray,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(500),
                    )
                ) {
                    append("Total Amount: ")
                }
                withStyle(
                    style = SpanStyle(
                        color = Color.Black,
                        fontSize = 16.sp,
                        fontWeight = FontWeight(700),
                    )
                ) {
                    append("$150")
                }
            })
        }
        Row {

        }
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 20.dp, end = 20.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            CustomButton(
                title = "Detail",
                modifier = Modifier
                    .width(100.dp)
                    .height(36.dp)
                    .clip(RoundedCornerShape(8.dp))
                    .background(Color(0xFF242424))
                    .clickable(onClick = {}),
                textStyle = TextStyle(
                    fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_bold)),
                    fontWeight = FontWeight(500),
                    fontSize = 15.sp,
                    color = Color.White
                ),
            )


            Text(
                text = "Delivered",
                fontSize = 16.sp,
                fontWeight = FontWeight(600),
                color = Color("#27AE60".toColorInt())
            )
        }
    }
}