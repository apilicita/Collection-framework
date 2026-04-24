package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
    
	/*https://docs.oracle.com/javase/tutorial/collections/index.html
	*/
    //Coleccion de numeros enteros apartir de un array
	
		Integer [] arrayNumerosEnteros= {1,2,3,4,5};
		List<Integer>  numeroEnteros = Arrays.asList(arrayNumerosEnteros);
				
		List<Persona> personas = null;
		
		Persona persona1 = Persona.builder()
				.nombre("Duglas")
				.primerApellido("Taydron")
				.segundoApellido("Gonzalez")
				.fechaNacimiento(LocalDate.of(2001, Month.AUGUST, 15))
				.genero(Genero.HOMBRE)
				.build();
		
		personas.add(persona1);
		
	}
	
}
