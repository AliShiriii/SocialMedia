package com.example.socialmedia.ui.components

import android.content.ClipData.Item
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.socialmedia.models.Post
import com.example.socialmedia.ui.theme.AppGray
import com.skydoves.landscapist.glide.GlideImage

@Composable
fun PostsView(posts: ArrayList<Post>) {

    LazyColumn {
        items(posts.size) { index ->

            Column(Modifier.padding(10.dp)) {
                Row {
                    Card(Modifier.size(40.dp), shape = RoundedCornerShape(15), elevation = 8.dp) {
                        GlideImage(posts[index].user.image, loading = {
                            Box(modifier = Modifier.fillMaxSize()) {
                                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                            }
                        }, contentScale = ContentScale.Crop, failure = {
                            Text(text = "image request failed")
                        })
                    }
                    Spacer(modifier = Modifier.height(10.dp))
                    Column(Modifier.weight(1f)) {
                        Text(
                            text = posts[index].user.fullName,
                            fontSize = 14.sp,
                            fontWeight = FontWeight.Bold
                        )
                        Spacer(modifier = Modifier.height(2.dp))
                        Text(text = posts[index].location, fontSize = 12.sp, color = AppGray)
                    }
                    Spacer(modifier = Modifier.width(10.dp))
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(
                            Icons.Filled.MoreVert,
                            contentDescription = "",
                            Modifier
                                .size(26.dp)
                                .align(CenterVertically)
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))
                Card(Modifier.fillMaxSize(), shape = RoundedCornerShape(15), elevation = 8.dp) {
                    GlideImage(
                        modifier = Modifier.fillMaxSize(),
                        imageModel = posts[index].image,
                        loading = {
                            Box(modifier = Modifier.fillMaxSize()) {
                                CircularProgressIndicator(modifier = Modifier.align(Alignment.Center))
                            }
                        },
                        contentScale = ContentScale.Crop,
                        failure = {
                            Text(text = "image request failed")
                        })
                }
            }
        }
    }
}