package com.example.connex.model

data class Usuario(
    val id: String = "",
    val nombre: String = "",
    val email: String = "",
    val rol: Rol = Rol.CANDIDATO, // Enum para definir si es Candidato o Empresa
    val experiencia: String? = null,
    val habilidades: List<String>? = null,
    val empresa: String? = null // Solo se usa si es empresa
)


enum class Rol{
    CANDIDATO, EMPRESA
}
