package com.example;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.OptionalDouble;
import java.util.function.Predicate;
import java.util.stream.Stream;

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
				.salario(3500.40)
				.build());

		personas.add(Persona.builder()
				.nombre("Alex")
				.primerApellido("Pilicita")
				.segundoApellido("Changoluisa")
				.fechaNacimiento(LocalDate.of(1987, Month.AUGUST, 25))
				.genero(Genero.HOMBRE)
				.salario(3600.45)
				.build());
		
		personas.add( Persona.builder()
				.nombre("Carolina")
				.primerApellido("Garzon")
				.segundoApellido("Becerra")
				.fechaNacimiento(LocalDate.of(1993, Month.AUGUST, 5))
				.genero(Genero.MUJER)
				.salario(3650.30)
				.build());

		personas.add(Persona.builder()
				.nombre("Jeronimo")
				.primerApellido("Perez")
				.segundoApellido("Lopez")
				.fechaNacimiento(LocalDate.of(1993, Month.MAY, 22))
				.genero(Genero.HOMBRE)
				.salario(4300.45)
				.build());
		
		personas.add(Persona.builder()
				.nombre("Maria")
				.primerApellido("Garzon")
				.segundoApellido("Becerra")
				.fechaNacimiento(LocalDate.of(1991, Month.DECEMBER, 12))
				.genero(Genero.MUJER)
				.salario(2500.45)
				.build());
		
		//personas.add(persona1);
		//personas.add(persona2);
		//personas.add(persona3);
		//personas.add(persona4);

		//personas = Arrays.asList(persona1,persona2,persona3,persona4);
	/*
	 System.out.println("-----listado original de personsa---");
	System.out.println(personas);
	Iterator<Persona> it = personas.iterator();
	
	while (it.hasNext()) {
	      if (it.next().genero().equals(Genero.HOMBRE)) {
		     it.remove();
	      }
	}*/
	
	//System.out.println("-----listado resultante despues eliminar genero persona---");
	//System.out.println(personas);
	
	//Ejercicio 1
	//Utilizar un iterarador ,eliminar el listado de personas. Aquellas que sea de genero hombres y el nombre tenga 6 caracteres
	//Hacer un commit , y despues comentar o eliminar el uso del iterador anterior, para tener la lista de personas original
	
	System.out.println("-----listado resultante despues eliminar genero persona y nombre 6 caracteres---");
	
	Iterator<Persona> it2 = personas.iterator();

	while (it2.hasNext()) {
	    var p = it2.next(); 
	    if (p.genero().equals(Genero.HOMBRE) && p.nombre().length() == 6) {
	        it2.remove();
	    }
	}

	System.out.println(personas);

	//for (var p: personas)
	//{
	//    if (p.genero().equals(Genero.MUJER)) {
	 //   	personas.remove(p);
	  //  }		
	//}
	
	/*
	 * OPERACIONES DE AGREGADO PARA RECORRER LAS COLECCIONES
	 * 
	 * https://docs.oracle.com/javase/tutorial/
	 *  

     Calcular el salario promedio de las personas del genero mujer
	 Las operaciones de agregado implican convertir la coleccion en un flujo(stream)
	 de elementos que a circular por una tuberia imaginaria o pipeline. Por tuberia o
	 Pipeline se entiende uan secuenta de metodos de clase Stream es decir una secuencia de operaciones de 
	agreado */
	
	//Stream<Persona> flujoDePersona = personas.stream();
	
	//personas.stream().filter(new Filtro());
	
	personas.stream().filter(new Predicate<Persona>() {
	
	@Override
	public boolean test(Persona p) {
		return p.genero().equals(Genero.MUJER);
	}
	});
	
	//Landa
	
	int x=7;
	OptionalDouble optionalDeSalarioPromedio= personas.stream().filter(
	p -> p.genero().equals(Genero.MUJER))
	.mapToDouble(p -> p.salario())
	.average();
	
	double SalarioMedio= 0.00;
	
	if (optionalDeSalarioPromedio.isPresent()) {
		SalarioMedio = optionalDeSalarioPromedio.getAsDouble();
	}
	
	double salarioPromedio = personas.stream()
			.filter(p -> p.genero().equals(Genero.MUJER))
			.mapToDouble(p -> p.salario())
            .average().orElse(0);	

	/*
	 * crear una coleccion inmutable es decir que no se pueda modificar, ni agregar
	 * ni eliminar, ni modificar
	 * */
	
	//List<String> nombres = List.of("Jeronimo","Duglas","Carolina");
	//Collections.sort(nombres);
    //System.out.println(nombres);
	
    //Mostrar la lista de personas resultante
	Collections.sort(personas);
    personas.stream().forEach(persona -> System.out.println(persona));
    
    
    /*
     * Ejemplo de comparacion
	   Persona p1 = Persona.builder()
               .nombre("Jeronimo")
               .primerApellido("Arenal")
               .segundoApellido("Gomez")
               .fechaNacimiento(LocalDate.of(1990, 5, 15))
               .genero(Genero.HOMBRE)
               .salario(2500.0)
               .build();

       Persona p2 = Persona.builder()
               .nombre("Francisco")
               .primerApellido("Arenal")
               .segundoApellido("Gomez")
               .fechaNacimiento(LocalDate.of(1985, 3, 22))
               .genero(Genero.HOMBRE)
               .salario(3000.0)
               .build();

    
       List<Persona> personas2 = new ArrayList<>(Arrays.asList(p1, p2));
       
       System.out.println("=== Antes de ordenar ===");
       personas2.forEach(p -> System.out.println(p.nombre() + " " + p.primerApellido() + " " + p.segundoApellido()));

       List<Persona> ordenadas = personas2.stream()
               .sorted()
               .toList();

       System.out.println("\n=== Después de ordenar ===");
       ordenadas.forEach(p -> System.out.println(p.nombre() + " " + p.primerApellido() + " " + p.segundoApellido()));

       System.out.println("\n=== Comparación directa ===");
       
    int resultado = p1.compareTo(p2);
    if (resultado < 0) {
        System.out.println(p1.nombre() + " va ANTES que " + p2.nombre());
    } else if (resultado > 0) {
        System.out.println(p1.nombre() + " va DESPUÉS que " + p2.nombre());
    } else {
        System.out.println("Son iguales en el orden");
    }
    
    System.out.println("\n=== Comparación de igualdad ===");
    if (p1.compareTo(p2) == 0) {
        System.out.println(p1.nombre() + " y " + p2.nombre() + " son IGUALES en el orden");
    } else {
        System.out.println(p1.nombre() + " y " + p2.nombre() + " son DISTINTOS en el orden");
    }
	//Collections.sort(personas);
	*/
	
	}

}
