/**
 * Descripción: Muestra el resumen del pedido, permite confirmar o editar.
 * Autor: Piero
 * Fecha creación: 26/09/2025
 * Última modificación: 26/09/2025
 */
package com.example.practica5

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.setFragmentResult
import androidx.navigation.fragment.findNavController

class ResumenPedidoFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_resumen_pedido, container, false)

        val tvResumen: TextView = view.findViewById(R.id.tvResumen)
        val btnConfirmar: Button = view.findViewById(R.id.btnConfirmar)
        val btnEditar: Button = view.findViewById(R.id.btnEditar)

        val comida = arguments?.getString("comida") ?: "Sin comida"
        val extras = arguments?.getStringArrayList("extras") ?: arrayListOf()

        tvResumen.text = "Comida: $comida\nExtras: ${extras.joinToString(", ")}"

        // BOTON PARA CONFIRMAR, DEVUELVE UN MENSAJE Y NOS REGRESA AL INICIO
        btnConfirmar.setOnClickListener {
            Toast.makeText(requireContext(), "Pedido confirmado", Toast.LENGTH_SHORT).show()
            findNavController().navigate(R.id.inicioFragment)
        }

        // BOTON EDITAR, NOS DEVUELVE A LA SELECCION DE COMIDA
        btnEditar.setOnClickListener {
            val result = Bundle().apply {
                putString("comida", comida)
                putStringArrayList("extras", extras)
            }
            setFragmentResult("pedido_editado", result)
            findNavController().popBackStack(R.id.seleccionComidaFragment, false)
        }

        return view
    }
}
