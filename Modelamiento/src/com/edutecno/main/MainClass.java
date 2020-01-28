package com.edutecno.main;

import com.edutecno.personas.Mascota;
import com.edutecno.personas.Persona;

public class MainClass {
		public static void main (String...args) {
			Persona persona1=new Persona();
			persona1.nombre = "Stefano";
			persona1.edad = 28;
			
			Persona persona2=new Persona();
			persona2.nombre = "pepito";
			persona2.edad = 35;
			
			Mascota mascota1 =new Mascota(); 
			mascota1.nombre="Cali";
			mascota1.tipoMascota="gato";
			
			mascota1.emitirSonido(mascota1.tipoMascota);  // lo del parentesis es lo que voy a enviar
			
			System.out.println(mascota1.emitirSonido("Perro")); //probando return
		}
}
