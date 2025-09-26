// Descripción: Actividad para escribir una nota y poder enviarla.
// Autor: Piero Poblete
// Fecha creación: 25/09/2025
// Última modificación: 26/09/2025

package com.example.practica4b

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class EditorActivity : AppCompatActivity() {

    private lateinit var editTextNota: EditText
    private lateinit var btnCompartir: Button

    // Clave para guardar el estado
    companion object {
        const val EXTRA_NOTA = "nota"
        const val STATE_NOTA = "state_nota"
    }

    // Callback para recibir la nota de OpcionesActivity
    private val opcionesLauncher = registerForActivityResult(
        ActivityResultContracts.StartActivityForResult()
    ) { result ->
        if (result.resultCode == RESULT_OK) {
            val notaDevuelta = result.data?.getStringExtra(EXTRA_NOTA)
            if (notaDevuelta != null) {
                editTextNota.setText(notaDevuelta)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_editor)

        editTextNota = findViewById(R.id.editTextNota)
        btnCompartir = findViewById(R.id.btnCompartir)

        // Restaurar nota si hay estado guardado
        if (savedInstanceState != null) {
            val notaGuardada = savedInstanceState.getString(STATE_NOTA)
            editTextNota.setText(notaGuardada)
        }

        btnCompartir.setOnClickListener {
            val nota = editTextNota.text.toString()
            val intent = Intent(this, OpcionesActivity::class.java)
            intent.putExtra(EXTRA_NOTA, nota)
            opcionesLauncher.launch(intent)
        }
    }

    // Guardar el estado al rotar
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString(STATE_NOTA, editTextNota.text.toString())
    }
}
