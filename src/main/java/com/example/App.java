package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class App {

	public static void main(String[] args) {
    
	/*https://docs.oracle.com/javase/tutorial/collections/index.html
	*/
    //Coleccion de numeros enteros apartir de un array
	
		Integer [] arrayNumerosEnteros= {1,2,3,4,5};
		List<Integer>  numeroEnteros = Arrays.asList(arrayNumerosEnteros);
				
		//List<Persona> personas = new ArrayList<Persona>();
		var personas = new ArrayList<Persona>();
			
		personas.add(Persona.builder()
				.nombre("Duglas")
				.primerApellido("Taydron")
				.segundoApellido("Gonzalez")
				.fechaNacimiento(LocalDate.of(2001, Month.AUGUST, 15))
				.genero(Genero.HOMBRE)
				.build());

		personas.add(Persona.builder()
				.nombre("Alex")
				.primerApellido("Pilicita")
				.segundoApellido("Changoluisa")
				.fechaNacimiento(LocalDate.of(1987, Month.AUGUST, 25))
				.genero(Genero.HOMBRE)
				.build());
		
		personas.add( Persona.builder()
				.nombre("Carolina")
				.primerApellido("Garzon")
				.segundoApellido("Perez")
				.fechaNacimiento(LocalDate.of(1993, Month.AUGUST, 5))
				.genero(Genero.MUJER)
				.build());

		personas.add(Persona.builder()
				.nombre("Jeronimo")
				.primerApellido("Perez")
				.segundoApellido("Lopez")
				.fechaNacimiento(LocalDate.of(1993, Month.MAY, 22))
				.genero(Genero.HOMBRE)
				.build());
		
		//personas.add(persona1);
		//personas.add(persona2);
		//personas.add(persona3);
		//personas.add(persona4);
	System.out.println(personas);
		//personas = Arrays.asList(persona1,persona2,persona3,persona4);
	}
	
}
