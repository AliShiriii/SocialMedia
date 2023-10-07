package com.example.socialmedia.ui.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import com.example.socialmedia.ui.theme.AppGray
import com.example.socialmedia.ui.theme.DarkColor
import com.example.socialmedia.ui.theme.RedColor
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

    BottomAppBar(
        backgroundColor = if (isSystemInDarkTheme()) DarkColor else Color.White,
         contentColor = RedColor
    ) {
        items.forEach {
            BottomNavigationItem(
                icon = {
                    Icon(
                        painter = painterResource(id = it.icon),
                        contentDescription = it.title
                    )
                },
                selected = selectedRoute == it.route,
                selectedContentColor = RedColor,
                unselectedContentColor = AppGray,
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