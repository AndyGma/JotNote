package com.andygma.jotnote.BottomMenu

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

@Composable
fun NavGraph(
    navHostController: NavHostController
) {
    NavHost(navController = navHostController, startDestination = "home") {
        composable("settings") {
            Screen1()
        }
        composable("calendar") {
            Screen2()
        }
        composable("note") {
            Screen3()
        }
        composable("recipes") {
            Screen4()
        }
        composable("home") {
            Screen5()
        }
    }
}