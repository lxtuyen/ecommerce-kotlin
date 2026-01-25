package com.example.learningkotlin.home

import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.learningkotlin.R
import com.example.learningkotlin.home.components.CategoryItem
import com.example.learningkotlin.home.components.ProductItem
import com.example.learningkotlin.models.Category
import com.example.learningkotlin.models.Product

val productArr = listOf(
    Product(R.drawable.image1, "Black Simple Lamp", 12.00),
    Product(R.drawable.image2, "Black Simple Lamp", 12.00),
    Product(R.drawable.image3, "Black Simple Lamp", 12.00),
    Product(R.drawable.image1, "Black Simple Lamp", 12.00),
    Product(R.drawable.image1, "Black Simple Lamp", 12.00),
    Product(R.drawable.image2, "Black Simple Lamp", 12.00),
    Product(R.drawable.image3, "Black Simple Lamp", 12.00),
    Product(R.drawable.image1, "Black Simple Lamp", 12.00),
)

@Composable
fun HomeScreen(navController: NavController) {
    val categoryArr = listOf(
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair"),
        Category(R.drawable.cart, "Chair")
    )
    val scrollState = rememberScrollState()
    Column(
        modifier = Modifier.padding(
            top = 10.dp,
            end = 15.dp,
            start = 15.dp
        )
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .horizontalScroll(scrollState)
        ) {
            categoryArr.forEach { category ->
                CategoryItem(icon = category.icon, name = category.name)
            }
        }
        Spacer(modifier = Modifier.height(10.dp))
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
        ) {
            items(productArr.chunked(2)) { productRow ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    for (product in productRow) {
                        ProductItem(
                            image = product.image,
                            name = product.name,
                            price = product.price,
                            navController = navController
                        )
                    }
                }
            }
        }
    }
}