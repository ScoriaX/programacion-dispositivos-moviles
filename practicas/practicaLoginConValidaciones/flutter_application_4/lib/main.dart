// Descripción: Main
// Autor: Piero Poblete
// Fecha creación: 13/11/2025
// Última modificación: 13/11/2025

import 'package:flutter/material.dart';
import 'package:provider/provider.dart';
import 'viewmodels/user_view_model.dart';
import 'views/login_screen.dart';  // <-- Importar LOGIN

void main() {
  runApp(
    ChangeNotifierProvider(
      create: (_) => UserViewModel(),
      child: const MyApp(),
    ),
  );
}

class MyApp extends StatelessWidget {
  const MyApp({super.key});

  @override
  Widget build(BuildContext context) {
    return MaterialApp(
      title: 'Gestión de Usuarios',
      theme: ThemeData(primarySwatch: Colors.indigo),
      
      // ✔ La app debe iniciar en el LOGIN
      home: const LoginScreen(),
    );
  }
}
