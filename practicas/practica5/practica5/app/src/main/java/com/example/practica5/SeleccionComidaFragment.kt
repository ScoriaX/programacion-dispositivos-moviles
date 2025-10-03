// Descripción: Selección de comida principal (sin RadioGroup).
// Autor: Piero Poblete
// Fecha creación: 25/09/2025
// Última modificación: 26/09/2025

package com.example.practica5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.RadioButton
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SeleccionComidaFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seleccion_comida, container, false)

        // REFERENCIA BOTONES DE COMIDA
        val rbPieManzana: RadioButton = view.findViewById(R.id.rbPieManzana)
        val rbAlfajor: RadioButton = view.findViewById(R.id.rbAlfajor)
        val rbEmpanada: RadioButton = view.findViewById(R.id.rbEmpanada)
        val rbPastel: RadioButton = view.findViewById(R.id.rbPastel)
        val btnSiguiente: Button = view.findViewById(R.id.btnSiguiente)

        val radioButtons = listOf(rbPieManzana, rbAlfajor, rbEmpanada, rbPastel)

        // PARA QUE SOLO SE PUEDA SELECCIONAR UNO A LA VEZ
        radioButtons.forEach { rb ->
            rb.setOnClickListener {
                radioButtons.forEach { it.isChecked = false }
                rb.isChecked = true
            }
        }

        // BOTON SIGUIENTE, AL HACER CLIC NAVEGAMOS AL FRAGMENTO DE SELECCION DE EXTRAS
        btnSiguiente.setOnClickListener {
            val seleccionado = radioButtons.find { it.isChecked }

            // COMPRUEBA QUE HAYA AL MENOS UNO SELECCIONADO
            if (seleccionado == null) {
                Toast.makeText(requireContext(), "Seleccione una opción antes de continuar", Toast.LENGTH_SHORT).show()
            } else {

                // EMPAQUETAMOS LA OPCION SELECCIONADA EN UN BUNDLE
                val comida = seleccionado.text.toString()
                val bundle = Bundle().apply {
                    putString("comida", comida)
                }
                findNavController().navigate(R.id.action_comida_to_extras, bundle)
            }
        }

        return view
    }
}
