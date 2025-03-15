package com.example.connex.model

data class OfertaEmpleo(

    val id: String = "",
    val titulo: String = "",
    val descripcion: String = "",
    val requisitos: List<String> = emptyList(),
    val empresaId: String = "",
    val salario: Double? = null,
    val ubicacion: String = "",
    val tipoContrato: String = ""
)


//Prueba de comentario
//Prueba de comentario2
//Prueba de comentario permisos