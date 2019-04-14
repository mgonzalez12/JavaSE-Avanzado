package com.javamaven.tema2;

import java.util.ArrayList;
import java.util.List;

public class PaisDAOlmpl {

	private List paises = null;
	
	public List getPaises() {
		paises = new ArrayList();
		Pais p1 = new Pais("Paru");
		Pais p2 = new Pais("Mexico");
		Pais p3 = new Pais("Colombia");
		
		paises.add(p1);
		paises.add(p2);
		paises.add(p3);
		
		return paises;
	}
	

	
	
}
