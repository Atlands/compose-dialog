package com.atlands.dialog

import androidx.compose.runtime.Composable

@Composable
internal actual fun Dialog(
    onCloseRequest: () -> Unit,
    content: @Composable () -> Unit
) {
    androidx.compose.ui.window.Dialog(
        onDismissRequest = onCloseRequest,
    ) {
        content()
    }
}