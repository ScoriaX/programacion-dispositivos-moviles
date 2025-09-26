// Descripción: Actividad para mostrar un resumen del perfil y confirmar o volver a editar.
// Autor: Piero Poblete
// Fecha creación: 24/09/2025
// Última modificación: 26/09/2025

package com.example.practica4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ResumenActivity : AppCompatActivity() {

    private lateinit var tvResumen: TextView
    private lateinit var btnConfirmar: Button
    private lateinit var btnVolver: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_resumen)

        tvResumen = findViewById(R.id.tvResumen)
        btnConfirmar = findViewById(R.id.btnConfirmar)
        btnVolver = findViewById(R.id.btnVolver)

        val usuario = intent.getSerializableExtra("usuario") as? Usuario

        usuario?.let {
            val resumen = """
                Nombre: ${it.nombre}
                Edad: ${it.edad}
                Ciudad: ${it.ciudad}
                Correo: ${it.correo}
            """.trimIndent()
            tvResumen.text = resumen
        }

        btnConfirmar.setOnClickListener {
            val resultIntent = Intent()
            resultIntent.putExtra("mensaje", "Perfil guardado correctamente")
            setResult(Activity.RESULT_OK, resultIntent)
            finish()
        }

        btnVolver.setOnClickListener {
            // Cerrar para volver a editar
            finish()
        }
    }
}
