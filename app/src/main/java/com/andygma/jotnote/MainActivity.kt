package com.andygma.jotnote

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.andygma.jotnote.BottomMenu.BottomNavigation

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MainAdapter()
        }
    }
}


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainAdapter() {
    val navController = rememberNavController()
    Scaffold(
        bottomBar = {
            BottomNavigation(navController = navController)
        }
    ) {
        NavHost(navController = navController, startDestination = "home") {
            composable("settings") {
                MainSettings()
            }
            composable("calendar") {
                MainCalendar()
            }
            composable("note") {
                MainNote()
            }
            composable("recipes") {
                MainRecipes()
            }
            composable("home") {
                MainHome()
            }
        }
    }
}
