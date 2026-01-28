package com.example.learningkotlin.presentation.review.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.learningkotlin.R

@Composable
fun ProductReview() {
    Column ( modifier = Modifier
        .fillMaxWidth()){
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(110.dp)
                .background(Color.White),
            verticalAlignment = Alignment.CenterVertically
        ) {
            Image(
                painter = painterResource(id = R.drawable.image1),
                contentDescription = null,
                modifier = Modifier
                    .width(110.dp)
                    .height(120.dp),
                contentScale = ContentScale.FillBounds
            )
            Column(
                modifier = Modifier
                    .width(200.dp)
                    .padding(start = 20.dp)
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.SpaceBetween
            ) {
                Text(
                    text = "Minimal Stand",
                    fontSize = 15.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = colorResource(id = R.color.gray),
                    fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_light))
                )
                Row(
                    modifier = Modifier.width(200.dp),
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.star),
                        contentDescription = null,
                        modifier = Modifier.size(20.dp)
                    )
                    Text(
                        text = "4.5",
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold,
                        fontFamily = FontFamily(Font(R.font.nunitosans_7pt_condensed_bold)),
                        modifier = Modifier.padding(7.dp)
                    )
                }
                Text(
                    text = "10 reviews",
                    fontSize = 18.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color("#303030".toColorInt())
                )
            }
        }

        Spacer(modifier = Modifier.height(15.dp))
        HorizontalDivider(thickness = 1.dp, color = Color("#F0F0F0".toColorInt()))
        Spacer(modifier = Modifier.height(10.dp))

        LazyColumn {
            items(4) { item ->
                ReViewItem()
                Spacer(modifier = Modifier.height(15.dp))
            }
        }
    }
}