// Descripción: Pantalla de perfil, muestra el perfil y la información de contacto
// Autor: Piero Poblete
// Fecha creación: 6/11/2025
// Última modificación: 6/11/2025

import 'package:flutter/material.dart';

class PantallaPerfil extends StatelessWidget {
  const PantallaPerfil({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      appBar: AppBar(
        title: const Text('Mi Perfil'),
        centerTitle: true,
        elevation: 2,
        backgroundColor: Colors.orange,
        foregroundColor: Colors.black,
      ),
      backgroundColor: Colors.white,
      body: Padding(
        padding: const EdgeInsets.all(20.0),
        child: Column(
          crossAxisAlignment: CrossAxisAlignment.center,
          children: [
            // Imagen
            Center(
              child: CircleAvatar(
                radius: 100,
                backgroundImage: NetworkImage(
                  'https://www.cooperatingvolunteers.com/wp-content/uploads/2024/12/moai-768x1024.jpeg',
                ),
              ),
            ),

            const SizedBox(height: 20),

            // Nombre
            const Text(
              'Piero Poblete Andía',
              style: TextStyle(fontSize: 30, fontWeight: FontWeight.bold),
            ),

            const SizedBox(height: 10),

            // Descripción
            Center(
              child: Container(
                constraints: const BoxConstraints(maxWidth: 300),
                child: const Text(
                  'Soy estudiante de Ingeniería de Software en la Universidad La Salle Arequipa.\n'
                  'Me apasionan el análisis de datos, los videojuegos y el senderismo.',
                  textAlign: TextAlign.left,
                  style: TextStyle(fontSize: 16, color: Colors.black87, height: 1.4),
                ),
              ),
            ),

            const SizedBox(height: 100),

            // Info de contacto
            const Text(
              'Información de contacto',
              style: TextStyle(
                fontSize: 20,
                fontWeight: FontWeight.w600,
              ),
            ),

            // Correo
            const Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.email, color: Colors.black),
                SizedBox(width: 10),
                Text('ppobletea@ulasalle.edu.pe'),
              ],
            ),

            // Telefono
            const Row(
              mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Icon(Icons.phone, color: Colors.black),
                SizedBox(width: 10),
                Text('987654321'),
              ],
            ),
          ],
        ),
      ),
    );
  }
}
