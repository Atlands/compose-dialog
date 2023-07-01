package com.atlands.dialog

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
internal actual fun Dialog(
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
){
    Box(
        Modifier
            .fillMaxSize()
            .background(Color.Black.copy(alpha = 0.4f))
            .clickable {
                onCloseRequest()
            }
    ) {
        Box(
            Modifier
                .padding(30.dp)
                .background(Color.White)
                .align(Alignment.TopCenter)
                .clickable(enabled = false){}
        ) {
            content()
        }
    }
}