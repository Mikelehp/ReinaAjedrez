package org.iesalandalus.programacion.reinaajedrez.modelo;

public enum Color {
	NEGRO("Negro"),
	BLANCO("Blanco");
	
	private final String cadenaAMostrar;
	
	private Color(String cadenaAMostrar) {
		this.cadenaAMostrar = cadenaAMostrar;
	
	}
	
	public String toString() {
		return cadenaAMostrar;
		
	}
	
	
}
