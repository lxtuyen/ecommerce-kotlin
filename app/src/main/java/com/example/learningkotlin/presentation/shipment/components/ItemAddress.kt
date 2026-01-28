package com.example.learningkotlin.presentation.shipment.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Checkbox
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.graphics.toColorInt
import com.example.learningkotlin.R

@Composable
fun ItemAddress(){
    Column (modifier = Modifier
        .fillMaxWidth()
        .height(180.dp)
        .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween){
        Row (modifier = Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically){
            Checkbox(checked = false, onCheckedChange = {})
            Text(text = "Use as the shipping address",
                fontSize = 18.sp, fontWeight = FontWeight(400)
            )
        }
        Column (modifier = Modifier
            .fillMaxWidth()
            .height(130.dp)
            .background(Color("#ffffff".toColorInt()))
            .shadow(0.dp, RoundedCornerShape(8.dp), clip = true),
            verticalArrangement = Arrangement.SpaceEvenly){
            Row (modifier = Modifier
                .fillMaxWidth()
                .padding(start = 15.dp, end = 10.dp), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.SpaceBetween){
                Text(text = "Bruno Fernandes", fontSize = 20.sp, fontWeight = FontWeight(700), fontFamily = FontFamily(
                    Font(R.font.nunitosans_7pt_condensed_bold)
                )
                )
                Image(painter = painterResource(id = R.drawable.edit), modifier = Modifier.size(24.dp), contentDescription = null)
            }
            HorizontalDivider(thickness = 1.5.dp, color = Color.Gray)

            Column (modifier = Modifier.padding(start = 15.dp)){
                Text(text = "25 rue Robert Latouche, Nice, 06200, Côte", color = Color.Gray, fontSize = 15.sp, fontFamily = FontFamily(
                    Font(R.font.nunitosans_7pt_condensed_bold)
                ), fontWeight = FontWeight(500)
                )
                Text(text = "D’azur, France"
                    , fontSize = 15.sp,color = Color.Gray, fontFamily = FontFamily(
                        Font(R.font.nunitosans_7pt_condensed_bold)
                    )
                )
            }
        }
    }
}