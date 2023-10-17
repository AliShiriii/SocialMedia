package com.example.socialmedia.data

import com.example.socialmedia.models.Post
import com.example.socialmedia.models.Story
import com.example.socialmedia.models.User


object MockData {

    val stories = ArrayList<Story>()
    val users = ArrayList<User>()
    val posts = ArrayList<Post>()

    init {
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                true
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                true
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                false
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                false
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                true
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                false
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                true
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                false
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                true
            )
        )
        stories.add(
            Story(
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                false
            )
        )

        ///Users
        users.add(
            User(
                "Ali",
                "Ali Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
            )
        )

        users.add(
            User(
                "AmirHossein",
                "AmirHossein Shiri",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
            )
        )

        users.add(
            User(
                "Mahan",
                "Mahan Barkokrazm",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
            )
        )

        //posts
        posts.add(
            Post(
                users[0],
                "Tehran, Iran",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                "Tehran is one of the iran cities, tehran is a good city, tehran is a big city and beautiful."
            )
        )

        posts.add(
            Post(
                users[1],
                "Vancover, Canada",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                "Vancover is one of the canada cities, Vancover is a good city, Vancover is a big city and beautiful."
            )
        )

        posts.add(
            Post(
                users[2],
                "Torento, Canada",
                "https://www.instagram.com/reel/CyWTDZmKLky/?igshid=MzRlODBiNWFlZA==",
                "Torento is one of the canada cities, Torento is a good city, Torento is a big city and beautiful."
            )
        )
    }
}