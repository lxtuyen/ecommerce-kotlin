package com.example.learningkotlin.presentation.notification

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.learningkotlin.R
import com.example.learningkotlin.presentation.home.productArr
import com.example.learningkotlin.domain.models.Product
import com.example.learningkotlin.presentation.notification.components.NotificationItem

@Composable
fun NotificationScreen() {
    Column(modifier = Modifier.fillMaxSize().background(colorResource(id = R.color.background))) {
        NotificationGrid(productArr = productArr)
    }
}

@Composable
fun NotificationGrid(productArr: List<Product>) {
    LazyColumn(modifier = Modifier.fillMaxSize(),
        contentPadding = PaddingValues()
    ) {
        items(productArr) { row ->
            NotificationItem()
            Spacer(modifier = Modifier.height(10.dp))
        }
    }
}
