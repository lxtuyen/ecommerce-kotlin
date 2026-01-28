package com.example.learningkotlin.presentation.shipment

import androidx.activity.ComponentActivity
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.learningkotlin.R
import com.example.learningkotlin.presentation.shipment.components.AddShipment

class AddShipmentAddress : ComponentActivity() {
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddShipmentScreen(navController : NavController){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "Add shipping address",
                        textAlign = TextAlign.Center,
                        fontSize = 17.sp,
                        modifier = Modifier.fillMaxWidth(),
                        fontFamily = FontFamily(
                            Font(R.font.merriweather_regular)
                        )
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { navController.navigateUp()}) {
                        Icon(
                            painter = painterResource(id = R.drawable.arrowback),
                            contentDescription = null,
                            modifier = Modifier.size(24.dp)
                        )
                    }
                },
                actions = {
                    IconButton(
                        modifier = Modifier.size(24.dp),
                        onClick = { /* Handle action */ }) {
                        // Action icon (e.g., settings or more options) can be added here
                    }
                },
            )
        },
        content = { innerPadding ->
            AddShipment(innerPadding)
        }
    )
}