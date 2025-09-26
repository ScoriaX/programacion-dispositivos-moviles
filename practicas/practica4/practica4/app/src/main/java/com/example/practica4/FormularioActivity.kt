// Descripción: Actividad principal con un formulario para crear el perfil del usuario.
// Autor: Piero Poblete
// Fecha creación: 24/09/2025
// Última modificación: 26/09/2025

package com.example.practica4

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity

class FormularioActivity : AppCompatActivity() {

    private lateinit var etNombre: EditText
    private lateinit var etEdad: EditText
    private lateinit var etCiudad: EditText
    private lateinit var etCorreo: EditText
    private lateinit var btnContinuar: Button

    // Guardar los datos si la pantalla rota
    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putString("nombre", etNombre.text.toString())
        outState.putString("edad", etEdad.text.toString())
        outState.putString("ciudad", etCiudad.text.toString())
        outState.putString("correo", etCorreo.text.toString())
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_formulario)

        etNombre = findViewById(R.id.etNombre)
        etEdad = findViewById(R.id.etEdad)
        etCiudad = findViewById(R.id.etCiudad)
        etCorreo = findViewById(R.id.etCorreo)
        btnContinuar = findViewById(R.id.btnContinuar)

        // Restaurar si la pantalla rota
        savedInstanceState?.let {
            etNombre.setText(it.getString("nombre", ""))
            etEdad.setText(it.getString("edad", ""))
            etCiudad.setText(it.getString("ciudad", ""))
            etCorreo.setText(it.getString("correo", ""))
        }

        // Registrar resultado
        val resumenLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()
        ) { result ->
            if (result.resultCode == Activity.RESULT_OK) {
                val mensaje = result.data?.getStringExtra("mensaje")
                Toast.makeText(this, mensaje, Toast.LENGTH_SHORT).show()
            }
        }

        btnContinuar.setOnClickListener {
            val usuario = Usuario(
                etNombre.text.toString(),
                etEdad.text.toString(),
                etCiudad.text.toString(),
                etCorreo.text.toString()
            )

            val intent = Intent(this, ResumenActivity::class.java)
            intent.putExtra("usuario", usuario)
            resumenLauncher.launch(intent)
        }
    }
}
