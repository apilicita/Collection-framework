package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
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

		//personas = Arrays.asList(persona1,persona2,persona3,persona4);
	System.out.println("-----listado original de personsa---");
	System.out.println(personas);
	Iterator<Persona> it = personas.iterator();
	
	while (it.hasNext()) {
	      if (it.next().genero().equals(Genero.HOMBRE)) {
		     it.remove();
	      }
	}
	
	System.out.println("-----listado resultante despues eliminar genero persona---");
	System.out.println(personas);
	
	//Ejercicio 1
	//Utilizar un iterarador ,eliminar el listado de personas. Aquellas que sea de genero hombres y el nombre tenga 6 caracteres
	//Hacer un commit , y despues comentar o eliminar el uso del iterador anterior, para tener la lista de personas original
	
	/*System.out.println("-----listado resultante despues eliminar genero persona y nombre 6 caracteres---");
	
   Iterator<Persona> it2 = personas.iterator();
	
	while (it2.hasNext()) {
	      if (it2.next().genero().equals(Genero.HOMBRE) &&) {
		     it2.remove();
	      }
	}*/
	
	
	
	
	}
	
}
