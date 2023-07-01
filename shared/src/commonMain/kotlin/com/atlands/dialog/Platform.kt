package com.atlands.dialog

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform