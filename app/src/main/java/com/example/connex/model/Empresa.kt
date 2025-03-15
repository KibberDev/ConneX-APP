package com.example.connex.model

data class Empresa(

    val id: String = "",
    val nombre: String = "",
    val descripcion: String = "",
    val sector: String = "",
    val ubicacion: String = "",
    val rol: Rol = Rol.EMPRESA,
)
