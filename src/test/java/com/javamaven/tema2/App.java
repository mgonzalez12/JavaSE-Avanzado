package com.javamaven.tema2;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PaisDAOlmpl dao = new PaisDAOlmpl();
		for(Object obj : dao.getPaises()) {
			System.out.println(((Pais)obj).getNombre());
		}
	}

}
