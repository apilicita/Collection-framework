package com.example;

import java.util.function.Predicate;

public class Filtro implements Predicate<Persona>{

	public boolean test(Persona persona) {
		return persona.genero().equals(Genero.MUJER);
	}
	
}
