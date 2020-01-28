package com.edutecno.personas;

public class Persona {
	
	//atributos    (Generalmente son sustantivos)
	public String nombre;    // al dejarlo publico, puedo accederlo desde el main (generalmente no son publicos)
	public int edad;
	public int peso;
	public int altura;
	public String mail;
		
	//metodos         (Generalmente son verbos porque son acciones)
	public void decirNombre() {  // void no retorna ningún valor
		System.out.println("soy" + nombre);
		
	}
	
	public void saludar() {
		System.out.println("Hola, buenos días amigo");
	}

}
