package com.example;
import java.time.LocalDate;
import lombok.Builder;

@Builder

public record Persona( 
 String nombre,
 String primerApellido,
 String segundoApellido,
 LocalDate fechaNacimiento,
 Genero genero,
 double salario
 ) implements Comparable<Persona> {
	
	public int compareTo(Persona persona) {
		
	int cmpPrimerApellido = this.primerApellido.compareTo(persona.primerApellido());	
	int cmpSegundoApellido = this.segundoApellido.compareTo(persona.segundoApellido());
	int cmpNombre = this.nombre.compareTo(persona.nombre());

	return cmpPrimerApellido != 0 ? cmpPrimerApellido: cmpSegundoApellido;	
	}
	
	
}
