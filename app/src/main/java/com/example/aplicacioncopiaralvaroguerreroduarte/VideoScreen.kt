package com.example.aplicacioncopiaralvaroguerreroduarte

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Share
import androidx.compose.material.icons.filled.SlowMotionVideo
import androidx.compose.material.icons.filled.ThumbUp
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment

@Composable
fun VideoScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .background(Color.Black),
            contentAlignment = Alignment.Center
        ){
            Icon(
                imageVector = Icons.Filled.SlowMotionVideo,
                contentDescription = "Favorite Icon",
                tint = Color.White

            )
        }
        Spacer(modifier = Modifier.height(8.dp))
        Text(
            text = "El Video Mas Interesante del Mundo #1",
            style = MaterialTheme.typography.headlineSmall,
            modifier = Modifier.padding(8.dp)
        )
        Row(modifier = Modifier.padding(8.dp)) {
            Icon(Icons.Filled.ThumbUp, contentDescription = "Like", modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text("Me gusta")
            Spacer(modifier = Modifier.width(16.dp))
            Icon(Icons.Filled.Share, contentDescription = "Compartir", modifier = Modifier.size(24.dp))
            Spacer(modifier = Modifier.width(8.dp))
            Text("Compartir")
        }

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
}
