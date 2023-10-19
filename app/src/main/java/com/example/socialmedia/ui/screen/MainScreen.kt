package com.example.socialmedia.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.socialmedia.ui.components.BottomNavigationView
import com.example.socialmedia.ui.components.TopAppView

@Preview(showBackground = true)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val navController = rememberNavController()
    var fullScreen by remember { mutableStateOf(false) }
    Scaffold(
        topBar = {
            TopAppBar {
                if (!fullScreen)
                    TopAppView()
            }
        },
        bottomBar = {
            if (!fullScreen)
                BottomNavigationView(navController)
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = "Home"
        ) {
            composable("Home") {
                fullScreen = false
                HomeScreen(navController = navController)
            }
            composable("Search") {
                fullScreen = false
                SearchScreen()
            }
            composable("Add") {
                fullScreen = false
                AddScreen()
            }
            composable("Activities") {
                fullScreen = false
                ActivitiesScreen()
            }
            composable("Profile") {
                fullScreen = false
                ProfileScreen()
            }
            composable("ShowStory/{index}", arguments = listOf(navArgument("index") {
                type = NavType.IntType
            })) { backStack ->
                fullScreen = true
                showStoryScreen(backStack.arguments?.get("index") as Int)
            }
        }
    }
}