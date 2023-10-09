package com.example.socialmedia.ui.screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.socialmedia.R
import com.example.socialmedia.ui.components.BottomNavigationView
import com.example.socialmedia.ui.components.TopAppView

@Preview(showBackground = true)
@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MainScreen() {

    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar {
//                Text(text = stringResource(id = R.string.app_name))
                TopAppView()
            }
        },
        bottomBar = {

            BottomNavigationView(navController)

            BottomAppBar(
                cutoutShape = MaterialTheme.shapes.small.copy(
                    CornerSize(percent = 50)
                )
            ) {}
        }
    ) {
        NavHost(
            navController = navController,
            startDestination = "Home"
        ) {
            composable("Home") {
                HomeScreen()
            }
            composable("Search") {
                SearchScreen()
            }
            composable("Add") {
                AddScreen()
            }
            composable("Activities") {
                ActivitiesScreen()
            }
            composable("Profile") {
                ProfileScreen()
            }
        }
    }
}