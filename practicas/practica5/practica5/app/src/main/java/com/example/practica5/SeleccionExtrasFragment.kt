// Descripción: Selección de extras para la comida.
// Autor: Piero Poblete
// Fecha creación: 25/09/2025
// Última modificación: 26/09/2025

package com.example.practica5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.CheckBox
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class SeleccionExtrasFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_seleccion_extras, container, false)

        // REFERENCIA BOTONES EXTRA
        val cbFrappe: CheckBox = view.findViewById(R.id.cbFrappe)
        val cbCocoa: CheckBox = view.findViewById(R.id.cbCocoa)
        val cbGalleta: CheckBox = view.findViewById(R.id.cbGalleta)
        val btnSiguiente: Button = view.findViewById(R.id.btnSiguienteExtras)

        // BOTON SIGUIENTE, AL HACER CLIC NAVEGAMOS AL FRAGMENTO DE RESUMEN DE PEDIDO
        btnSiguiente.setOnClickListener {
            val comida = arguments?.getString("comida") ?: "Sin comida"

            // LOGICA PARA AÑADIR PRODUCTOS EN EXTRAS
            val extras = mutableListOf<String>()
            if (cbFrappe.isChecked) extras.add("Frappe")
            if (cbCocoa.isChecked) extras.add("Cocoa")
            if (cbGalleta.isChecked) extras.add("Galleta")

            // CREAMOS EL BUNDLE PARA ENVIAR DATOS AL SIGUIENTE FRAGMENTO
            val bundle = Bundle().apply {
                putString("comida", comida)
                putStringArrayList("extras", ArrayList(extras))
            }

            findNavController().navigate(R.id.action_extras_to_resumen, bundle)
        }

        return view
    }
}
