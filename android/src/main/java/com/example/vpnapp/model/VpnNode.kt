package com.example.vpnapp.model

data class VpnNode(
    val id: String,
    val name: String,
    val ip: String,
    val port: Int,
    val protocol: String,
    val latency: Long = 0L,
    val speed: String = "0 Mbps"
)