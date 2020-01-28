package com.edutecno.personas;

public class Mascota {
	//atributos
	public String tipoMascota;
	public String nombre;
	public boolean estaVacunado;
	
	
	//metodos
	
	public String emitirSonido(String tipo) {  //lo que va a recibir
		if (tipo =="Perro") {
			System.out.println("guau");
		}
		else {
			System.out.println("no se que soy");
		}
		return("probando");   // lo que va a mandar de vuelta
	}
	
	public void respirar() {
		
	}

}
