// Descripción: Pantalla de hobbies, muestra los nombres de los hobbies y imagenes
// Autor: Piero Poblete
// Fecha creación: 6/11/2025
// Última modificación: 6/11/2025

import 'package:flutter/material.dart';

class PantallaHobbies extends StatelessWidget {
  const PantallaHobbies({super.key});

  @override
  Widget build(BuildContext context) {
    return Scaffold(
      // Titulo
      appBar: AppBar(
        title: const Text('Mis Hobbies'),
        centerTitle: true,
        elevation: 2,
        backgroundColor: Colors.black,
        foregroundColor: Colors.orange,
      ),
      backgroundColor: Colors.white,
      body: Center( 
        child: SingleChildScrollView(
          child: Padding(
            padding: const EdgeInsets.all(20.0),
            child: Column(
              mainAxisAlignment: MainAxisAlignment.center,
              crossAxisAlignment: CrossAxisAlignment.center,
              children: const [
                // Imagen y texto de senderismo
                Image(
                  image: NetworkImage('https://images.ecestaticos.com/37BtC2qV7E7188eeiimvgqmNdrc=/0x139:2710x1667/1600x900/filters:fill(white):format(jpg)/f.elconfidencial.com%2Foriginal%2F251%2Fa33%2Ffa4%2F251a33fa465096ed19fe8ba0d7719a77.jpg'),
                  width: 300,
                  height: 150,
                  fit: BoxFit.cover,
                ),
                SizedBox(height: 10),
                Text(
                  'SENDERISMO',
                  style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Colors.black),
                ),
                
                SizedBox(height: 25),

                // Imagen y texto de videojuegos
                Image(
                  image: NetworkImage('https://universidadeuropea.com/resources/media/images/tipos-videojuegos-800x450.original.jpg'),
                  width: 300,
                  height: 150,
                  fit: BoxFit.cover,
                ),
                SizedBox(height: 10),
                Text(
                  'VIDEOJUEGOS',
                  style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Colors.black),
                ),

                SizedBox(height: 25),

                // Imagen y texto de billar
                Image(
                  image: NetworkImage('https://mesasdebillarperu.com/wp-content/uploads/2024/09/modalidades-de-billar.webp'),
                  width: 300,
                  height: 150,
                  fit: BoxFit.cover,
                ),
                SizedBox(height: 10),
                Text(
                  'BILLAR',
                  style: TextStyle(fontSize: 20, fontWeight: FontWeight.bold, color: Colors.black),
                ),
              ],
            ),
          ),
        ),
      ),
    );
  }
}
