// Descripción: Pantalla inicial con un botón para iniciar nuevo pedido.
// Autor: Piero Poblete
// Fecha creación: 25/09/2025
// Última modificación: 26/09/2025

package com.example.practica5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class InicioFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_inicio, container, false)

        // BOTON PRINCIPAL
        val btnNuevoPedido: Button = view.findViewById(R.id.btnNuevoPedido)

        // AL HACER CLIC NAVEGAMOS AL FRAGMENTO DE SELECCION DE COMIDA
        btnNuevoPedido.setOnClickListener {
            findNavController().navigate(R.id.action_inicio_to_comida)
        }

        return view
    }
}
