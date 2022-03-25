package com.ciru.disra

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.ui.graphics.vector.ImageVector



sealed class BottomNavMenu(
    val route:String,
    val title:String,
    val icon: ImageVector
){
    object Placement:BottomNavMenu(
        "Placement",
        "Placement",
        Icons.Default.Home)

    object Profile:BottomNavMenu(
        "profile",
        "profile",
        Icons.Default.Person)

    object Discover:BottomNavMenu(
        "discover",
        "discover",
        Icons.Default.Search)
}
