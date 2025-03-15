package com.example.connex.repository

import com.example.connex.model.Usuario
import com.google.firebase.firestore.FirebaseFirestore

class UsuarioRepository {

    private val db = FirebaseFirestore.getInstance()

    fun agregarUsuario(usuario: Usuario, onComplete: (Boolean) -> Unit){
        db.collection("usuarios")
            .document(usuario.id)
            .set(usuario)
            .addOnSuccessListener { onComplete(true) }
            .addOnFailureListener { onComplete(false) }
    }

    fun obtenerUsuario(id: String, onResult: (Usuario?) -> Unit){
        db.collection("usuarios")
            .document(id)
            .get()
            .addOnSuccessListener { doc ->
                val usuario = doc.toObject(Usuario::class.java)
                onResult(usuario)
            }
            .addOnFailureListener { onResult(null)}
    }
}