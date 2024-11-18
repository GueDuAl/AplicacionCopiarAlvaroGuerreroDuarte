package com.example.aplicacioncopiaralvaroguerreroduarte

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.SlowMotionVideo
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun CommentsScreen() {
    LazyColumn {
        items(1) {

            CommentItem(username = "GamerPro23", comment = "¡Este gameplay está brutal! Me encanta cómo narras cada paso.")
            CommentItem(username = "CRVerga", comment = "Buen trabajo, sigue así, este canal va a crecer mucho ")
            CommentItem(username = "JuanBarbero04", comment = "En mi pueblo no hay videojuegos, solo campo y piedra")
            CommentItem(username = "Monis29", comment = "Que facil tiene que ser hacer videos en bluetube")
            CommentItem(username = "CraftyKid21", comment = "¡Qué bueno el video! Aprendí un montón para mi propio mundo en Minecraft")
            CommentItem(username = "MegaMina", comment = "¡Me encantan tus videos! La serie de 'el Olimpo' es una locura")
            CommentItem(username = "ChillCritique", comment = "Buen intento, pero nada especial. Se queda corto")
            CommentItem(username = "HaterZilla", comment = "Demasiado amateur… prefiero otros canales")
            CommentItem(username = "OG_Maverick", comment = "La edición es buena, pero necesitas mejorar en el juego")
            CommentItem(username = "UnsubTime", comment = "No es el contenido que esperaba. Mucho clickbait")
            CommentItem(username = "UnsubTime", comment = "No es el contenido que esperaba. Mucho clickbait")
            CommentItem(username = "AnnaPlayz", comment = "¡Eres súper entretenido! El humor que le pones es genial 😂.")
            CommentItem(username = "BlockBuilder2024", comment = "Tus ideas para construir son realmente inspiradoras. ¡Gracias!")
            CommentItem(username = "ProGamer64", comment = "Esto es oro puro, ¡no pares nunca!")
            CommentItem(username = "PixelCrush", comment = "La edición está de otro nivel, ¡felicidades!")
            CommentItem(username = "RinoGamer_yt", comment = "Tienes talento para los gameplays, ¡sigue así!")
            CommentItem(username = "CrafterXtreme", comment = "¡Me suscribo sin dudarlo! Este canal es adictivo.")
            CommentItem(username = "DarkLord47", comment = "Este video no aporta nada nuevo… ya lo he visto mil veces.")
            CommentItem(username = "ShadowCritic", comment = "La calidad del audio podría mejorar. Es difícil entender algunas partes.")
            CommentItem(username = "ZetaGamerX", comment = "Demasiada charla y poca acción… no me convenció.")
            CommentItem(username = "MineMaster_00", comment = "Te falta práctica, muchos errores para un gameplay.")


        }
    }
}

@Composable
fun CommentItem(username: String, comment: String) {

    Row (
        modifier = Modifier
            .fillMaxWidth()
            .padding(8.dp)
    ) {
        Box(
            modifier = Modifier
                .size(50.dp)
                .background(Color.Gray),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                imageVector = Icons.Filled.AccountCircle,
                contentDescription = "Favorite Icon",
                tint = Color.White
            )
        }
        Spacer(modifier = Modifier.width(8.dp))
        Column() {
            Text(text = username, style = MaterialTheme.typography.labelSmall, color = Color.Gray)
            Text(text = comment, style = MaterialTheme.typography.titleMedium)
            Divider()
        }
    }

}
