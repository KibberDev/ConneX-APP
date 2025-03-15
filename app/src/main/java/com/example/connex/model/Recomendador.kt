package com.example.connex.model

object Recomendador {

    // Recomendación de empleos para un usuario trabajador
    fun recomendarEmpleos(usuario: Usuario, ofertas: List<OfertaEmpleo>): List<OfertaEmpleo> {
        return ofertas.filter { oferta ->
            val coincideSkill = usuario.habilidades.orEmpty().any { it in oferta.requisitos }
            val coincideUbicacion = usuario.ubicacion.isNullOrEmpty() || usuario.ubicacion == oferta.ubicacion
            val salarioAdecuado = usuario.salarioMin == null || (oferta.salario ?: 0.0) >= usuario.salarioMin

            coincideSkill && coincideUbicacion && salarioAdecuado // Devuelve el filtro correctamente
        }
    }


    fun recomendadorCandidatos(oferta: OfertaEmpleo, candidatos: List<Usuario>): List<Usuario>{
        return candidatos.filter { candidato ->
            val coincideSkill = candidato.habilidades?.any { it in oferta.requisitos } == true
            val coincideUbicacion = candidato.ubicacion.isNullOrEmpty() || candidato.ubicacion == oferta.ubicacion
            val salarioAdecuado = candidato.salarioMin == null || (oferta.salario ?:0.0) >= candidato.salarioMin
            val contratoCompatible = candidato.tipoContrato.isNullOrEmpty() || oferta.tipoContrato in candidato.tipoContrato

            coincideSkill && coincideUbicacion && salarioAdecuado && contratoCompatible
        }
    }
}