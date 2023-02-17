package com.kdm.meconnect

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform