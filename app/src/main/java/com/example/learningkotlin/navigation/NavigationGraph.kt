package com.example.learningkotlin.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.learningkotlin.presentation.AccountScreenControl
import com.example.learningkotlin.presentation.FavoriteScreen
import com.example.learningkotlin.presentation.notification.NotificationScreen
import com.example.learningkotlin.presentation.home.HomeScreen

enum class ROUTE_HOME_SCREEN {
    Home,
    Favorite,
    Notification,
    Profile
}

@Composable
fun NavigationGraph(navHostController : NavController, navController: NavHostController, innerPadding: PaddingValues) {
    NavHost(
        navController,
        startDestination = ROUTE_HOME_SCREEN.Home.name,
        modifier = Modifier.padding(innerPadding)
    ) {
        composable(ROUTE_HOME_SCREEN.Home.name) { HomeScreen(navHostController) }
        composable(ROUTE_HOME_SCREEN.Favorite.name) { FavoriteScreen() }
        composable(ROUTE_HOME_SCREEN.Notification.name) { NotificationScreen() }
        composable(ROUTE_HOME_SCREEN.Profile.name) { AccountScreenControl(navHostController) }
    }
}