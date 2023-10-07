package com.example.socialmedia.ui.components

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialmedia.utils.NavigationItem

@Composable
fun BottomNavigationView(navController: NavController) {

    var selectedRoute by remember { mutableStateOf("Home") }

    val items = listOf(
        NavigationItem.Home,
        NavigationItem.Search,
        NavigationItem.Add,
        NavigationItem.Activities,
        NavigationItem.Profile,
    )

    BottomAppBar {
        items.forEach {
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = it.icon),
                        contentDescription = it.title
                    )
                },
                selected = selectedRoute == it.route,
                onClick = {
                    navController.navigate(it.route) {
                        navController.graph.startDestDisplayName.let { route ->
                            selectedRoute = route

                            popUpTo(route) {
                                saveState = true
                            }
                        }
                    }
                }
            )
        }
    }
}