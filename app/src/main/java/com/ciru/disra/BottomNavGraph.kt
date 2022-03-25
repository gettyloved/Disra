package com.ciru.disra

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun BottomNavGraph(navController: NavHostController){
    NavHost(
        navController = navController,
        startDestination = BottomNavMenu.Placement.route
    ){
        composable(route = BottomNavMenu.Placement.route){
            Placement()
        }

        composable(route = BottomNavMenu.Profile.route){

        }

        composable(route = BottomNavMenu.Placement.route){

        }

    }
}