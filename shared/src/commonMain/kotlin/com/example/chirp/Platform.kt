package com.example.chirp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform