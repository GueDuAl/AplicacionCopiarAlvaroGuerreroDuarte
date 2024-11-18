package com.example.aplicacioncopiaralvaroguerreroduarte

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.navigationBarsPadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.statusBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.*
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.PlayArrow
import androidx.compose.material.icons.filled.Subscriptions
import androidx.compose.material.icons.filled.VideoLibrary
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.aplicacioncopiaralvaroguerreroduarte.CommentsScreen
import com.example.aplicacioncopiaralvaroguerreroduarte.HomeScreen
import com.example.aplicacioncopiaralvaroguerreroduarte.VideoScreen

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    Scaffold(

        topBar = { TopAppBar(title = {
            Row {

                Icon(imageVector = Icons.Filled.Subscriptions, contentDescription = "icono de bluetube", tint = Color.White)
                Spacer(modifier = Modifier.width(8.dp))
                Text("BlueTube")
            }
        },backgroundColor = Color.Gray,
            contentColor = Color.White,
            modifier = Modifier.statusBarsPadding()
            )},


        bottomBar = { BottomNavBar(navController = navController) }
    ) { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = "home",
            Modifier.padding(innerPadding)
        ) {
            composable("home") { HomeScreen() }
            composable("video") { VideoScreen() }
            composable("comments") { CommentsScreen() }
        }
    }
}

@Composable
fun BottomNavBar(navController: NavHostController) {
    BottomNavigation (modifier = Modifier.navigationBarsPadding()) {
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Home, contentDescription = "Inicio") },
            label = { Text("Inicio") },
            selected = navController.currentDestination?.route == "home",
            onClick = { navController.navigate("home") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.VideoLibrary, contentDescription = "Videos") },
            label = { Text("Videos") },
            selected = navController.currentDestination?.route == "video",
            onClick = { navController.navigate("video") }
        )
        BottomNavigationItem(
            icon = { Icon(Icons.Filled.Comment, contentDescription = "Comentarios") },
            label = { Text("Comentario") },
            selected = navController.currentDestination?.route == "comments",
            onClick = { navController.navigate("comments") }
        )
    }
}
