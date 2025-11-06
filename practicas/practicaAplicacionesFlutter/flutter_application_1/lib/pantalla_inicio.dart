// Descripción: Pantalla de inicio, da la bienvenida al usuario
// Autor: Piero Poblete
// Fecha creación: 6/11/2025
// Última modificación: 6/11/2025

import 'package:flutter/material.dart';

class PantallaInicio extends StatelessWidget {
  const PantallaInicio({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Bienvenido'),
        centerTitle: true,
        elevation: 2,
        backgroundColor: Colors.black,
        foregroundColor: Colors.white,
      ),
      backgroundColor: Colors.orange,
      body: Center(
        child: Padding(
          padding: const EdgeInsets.all(24.0),
          child: Column(
            mainAxisSize: MainAxisSize.min,
            children: [
              // Imagen
              const CircleAvatar(
                radius: 60,
                backgroundImage: AssetImage('assets/perfil.jpg'),
              ),

              const SizedBox(height: 20),

              // Texto principal
              const Text(
                'Hola! soy Piero Poblete',
                style: TextStyle(fontSize: 24, fontWeight: FontWeight.bold),
              ),

              const SizedBox(height: 8),

              // Texto de bienvenida
              const Text(
                'Bienvenido a mi aplicación personal. Aquí podrás ver mi perfil y conocer sobre mis hobbies.',
                textAlign: TextAlign.center,
              ),

              const SizedBox(height: 24),

              // Botón ver perfil
              ElevatedButton(
                onPressed: () {
                  // Vacio, sin logica
                },
                style: ElevatedButton.styleFrom(
                  padding: const EdgeInsets.symmetric(horizontal: 28, vertical: 14),
                  shape: RoundedRectangleBorder(
                    borderRadius: BorderRadius.circular(10),
                  ),
                  backgroundColor: Colors.white,
                  foregroundColor: Colors.black,
                ),
                child: const Text(
                  'Ver mi perfil',
                  style: TextStyle(fontSize: 16),
                ),
              ),
              const SizedBox(height: 18),
            ],
          ),
        ),
      ),
    );
  }
}
