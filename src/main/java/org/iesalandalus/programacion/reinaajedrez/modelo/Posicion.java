package org.iesalandalus.programacion.reinaajedrez.modelo;

import java.util.Objects;

public class Posicion {
	
	private int fila;
	
	private char columna;
	
	public Posicion(int fila, char columna) {
		setFila(fila);
		setColumna(columna);
	}
	public Posicion(Posicion posicion) {
		if (posicion == null) {
			throw new NullPointerException("ERROR: No es posible copiar una posición nula.");
		}
		setFila (posicion.getFila());
		setColumna(posicion.getColumna());
		
	}
	
	
	public int getFila() {
		return fila;
	}
	private void setFila(int fila) {
		
		if (fila >=1 && fila <=8) {
			this.fila = fila;
		}else {
			throw new IllegalArgumentException("ERROR: Fila no válida.");
		}
		
		
	}
	public char getColumna() {
		return columna;
	}
	private void setColumna(char columna) {
		if (columna >='a' && columna <='h') {
			this.columna = columna;
		}else {
			throw new IllegalArgumentException("ERROR: Columna no válida.");
		}
		}
	@Override
	public int hashCode() {
		return Objects.hash(columna, fila);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Posicion other = (Posicion) obj;
		return columna == other.columna && fila == other.fila;
	}

	@Override
	public String toString() {
		return String.format("fila=%s, columna=%s", fila, columna);
	}
	
	

}
