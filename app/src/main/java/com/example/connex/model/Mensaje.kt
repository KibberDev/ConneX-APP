package com.example.connex.model


data class Mensaje(

    val id: String = "",
    val remitenteId: String = "",
    val destinatarioId: String = "",
    val contenido: String = "",
    val timestamp: Long = System.currentTimeMillis()
)
