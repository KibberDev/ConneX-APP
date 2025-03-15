package com.example.connex.model

data class Match(

    val id: String = "",
    val candidatoId: String = "",
    val empresaId: String = "",
    val estado: EstadoMatch = EstadoMatch.PENDIENTE // Enum para definir el tipo de "estado"
)


enum class EstadoMatch{
    PENDIENTE, ACEPTADO, RECHAZADO
}