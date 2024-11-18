package com.example.aplicacioncopiaralvaroguerreroduarte

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Comment
import androidx.compose.material.icons.filled.SlowMotionVideo
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun HomeScreen() {
    LazyColumn {
        items(1) {
            VideoListItem(videoTitle = "Como montar un PC", channelName = "RubenYT")
            VideoListItem(videoTitle = "Como hacer pankakes", channelName = "Anabel07")
            VideoListItem(videoTitle = "MI CASA | EL OLIMPO #12", channelName = "saturno2000")
            VideoListItem(videoTitle = "MI CARA", channelName = "ElRubiusOMG")
            VideoListItem(videoTitle = "La mejor Update desde 2032", channelName = "ElRichMC")
            VideoListItem(videoTitle = "Soy el mas Listo de todos", channelName = "CRVerga")
            VideoListItem(videoTitle = "Probando dulces Japoneses", channelName = "Leskedar")
            VideoListItem(videoTitle = "Mirad mi verruga!!!", channelName = "JuanBarbero04")
            VideoListItem(videoTitle = "La verdad sobre Jugones", channelName = "JesusSS4")
            VideoListItem(videoTitle = "Minecraft realista con mods", channelName = "MiNombre97")
        }
    }
}

@Composable
fun VideoListItem(videoTitle: String, channelName: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(100.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.SlowMotionVideo,
                contentDescription = "Favorite Icon",
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column {
            Text(text = videoTitle, style = MaterialTheme.typography.labelMedium)
            Text(text = channelName, style = MaterialTheme.typography.titleMedium, color = Color.Gray)
        }
    }
}
