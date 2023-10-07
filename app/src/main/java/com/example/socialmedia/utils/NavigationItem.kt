package com.example.socialmedia.utils

import com.example.socialmedia.R

open class NavigationItem(var route: String, var icon: Int, var title: String) {

    object Home: NavigationItem("Home", R.drawable.home, "Home")
    object Search: NavigationItem("Search", R.drawable.search, "Search")
    object Add: NavigationItem("Add", R.drawable.add_box, "Add")
    object Activities: NavigationItem("Activities", R.drawable.favorite, "Activities")
    object Profile: NavigationItem("Profile", R.drawable.person, "Profile")
}