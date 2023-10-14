package com.example.socialmedia.ui.screen

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.ModifierLocalReadScope
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
//    StoriesView()
    Spacer(modifier = Modifier.height(7.dp))
    Divider(color = Color.LightGray, thickness = 1.dp, modifier = Modifier.padding(15.dp))
    Spacer(modifier = Modifier.height(7.dp))
//    PostsView()
}