package com.example.socialmedia.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.AddCircle
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialmedia.data.MockData
import com.example.socialmedia.ui.theme.RedColor
import com.example.socialmedia.ui.theme.ShadowColor
import com.skydoves.landscapist.glide.GlideImage

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun showStoryScreen(index: Int) {

    Card(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .fillMaxSize()
        ) {
            GlideImage(
                modifier = Modifier.fillMaxSize(),
                imageModel = MockData.stories[index].image,
                loading = {
                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .align(Alignment.Center)
                    ) {
                        CircularProgressIndicator(
                            modifier = Modifier.align(Alignment.Center)
                        )
                    }
                },
                contentScale = ContentScale.Crop,
                failure = {
                    Text(text = "Image request failed.")
                })
        }
    }
}