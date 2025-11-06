// Descripción: Main de la aplicación, donde por ahora solo elegimos que pantalla mostrar
// Autor: Piero Poblete
// Fecha creación: 6/11/2025
// Última modificación: 6/11/2025

import 'package:flutter/material.dart';
import 'pantalla_inicio.dart';
import 'pantalla_hobbies.dart';
import 'pantalla_perfil.dart';

void main() {
runApp(const MyApp());
}

class MyApp extends StatelessWidget {
const MyApp({super.key});

@override
 Widget build(BuildContext context) {
	return MaterialApp(
  	title: 'Mi App Personal',
  	home: PantallaHobbies(), // Cambiar por PantallaPerfil() o PantallaHobbies() para probar
	);
  }
}

