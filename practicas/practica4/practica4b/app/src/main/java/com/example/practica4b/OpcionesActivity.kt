// Descripción: Actividad para mostrar la nota y poder compartirla o editarla.
// Autor: Piero Poblete
// Fecha creación: 25/09/2025
// Última modificación: 26/09/2025

package com.example.practica4b

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class OpcionesActivity : AppCompatActivity() {

    private lateinit var textViewNota: TextView
    private lateinit var btnCompartirCorreo: Button
    private lateinit var btnEditar: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_opciones)

        textViewNota = findViewById(R.id.textViewNota)
        btnCompartirCorreo = findViewById(R.id.btnCompartirCorreo)
        btnEditar = findViewById(R.id.btnEditar)

        // Obtener la nota
        val notaRecibida = intent.getStringExtra(EditorActivity.EXTRA_NOTA)
        textViewNota.text = notaRecibida

        // Compartir por correo
        btnCompartirCorreo.setOnClickListener {
            Toast.makeText(this, "Compartido por correo", Toast.LENGTH_SHORT).show()
        }

        // Volver a editar
        btnEditar.setOnClickListener {
            val data = Intent().apply {
                putExtra(EditorActivity.EXTRA_NOTA, notaRecibida)
            }
            setResult(RESULT_OK, data)
            finish()
        }
    }
}
