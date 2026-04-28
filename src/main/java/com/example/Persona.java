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
	
	//Compara el primer apellido con el siguiente de la otra persona
	public int compareTo(Persona persona) {
	 //resultado de la comparacion por el primer apellido, de dos personas de la lista de personas	
		
	int cmpPrimerApellido = this.primerApellido.
			                compareTo(persona.primerApellido());	
	int cmpSegundoApellido = this.segundoApellido.
			                 compareTo(persona.segundoApellido());
	int cmpNombre = this.nombre.
			                compareTo(persona.nombre());

	//iguales es o , !=0 son distintos
	//no son iguales los primeros apellidos, da igual devuelve el apellido, si son iguales paso al siguiente apellido(Segundo Apellido)
	//si ya los dos apellidos no son iguales, se asuma que ya es el nombre
	return cmpPrimerApellido != 0 ? cmpPrimerApellido: 
		    cmpSegundoApellido !=0 ? cmpSegundoApellido: cmpNombre;	
	}
	
	
}
