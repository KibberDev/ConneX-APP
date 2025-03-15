package com.example.connex.model

//filtro de búsqueda

data class Filtro(

    val sector: String? = null,
    val ubicacion: String? = null,
    val salarioMin: Double? = null,
    val salarioMax: Double? = null,
    val tipoContrato: String? = null,
    val experiencia: String? = null,
    val tipoAsistencia: String? = null
)

enum class tipoAsistencia{
    PRESENCIAL, TELETRABAJO, HÍBRIDA
}

enum class tipoContrato{
    INDEFINIDO, TEMPORAL, PRÁCTICAS
}