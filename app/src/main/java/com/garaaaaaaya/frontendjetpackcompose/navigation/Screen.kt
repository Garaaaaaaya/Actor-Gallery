package com.garaaaaaaya.frontendjetpackcompose.navigation

sealed class Screen ( val route: String) {
    data object Home : Screen("home")
    data object Gallery : Screen("gallery")
    data object Profile : Screen("profile")
    data object Detail : Screen("detail")
}