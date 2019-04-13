package com.javamaven.tema;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
	private List canasta = new ArrayList();
	
	private void varificar(Object objeto) {
		if(objeto instanceof Fruta) {
			canasta.add(objeto);
			System.out.println("Fruta Agregada"+" "+ ((Fruta)objeto).getNombre());
		}else {
			System.out.println("Elemento no permitido,Solo Frutas");
		}
	}
	
    public static void main( String[] args )
    {
    	System.out.println("Canasta Abierta por favor ingresar solo Frutas");
    	
    	
    	Manzana m1 = new Manzana("Manzana");
    	Manzana m2 = new Manzana("Verde");
    	Naranja n1 = new Naranja("Naranja sin pepas");
    	Galleta g1 = new Galleta("Chocolate");
    	
    	App app = new App();
    	app.varificar(m1);
    	app.varificar(m2);
    	app.varificar(n1);
    	app.varificar(g1);
    	
    }
}
