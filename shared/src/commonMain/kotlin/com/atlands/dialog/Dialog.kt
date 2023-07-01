package com.atlands.dialog

import androidx.compose.runtime.Composable

@Composable
internal expect fun Dialog(
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
)