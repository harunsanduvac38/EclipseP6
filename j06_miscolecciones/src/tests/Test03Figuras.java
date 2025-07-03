package tests;

import miscolecciones.genericos.Lista;
import miscolecciones.genericos.ListaArray;
import modelo.Circulo;
import modelo.Figures;
import modelo.Rectangulo;

public class Test03Figuras {
	
	public static void main(String[] args) {
		Lista<Figures> listaFiguras = new ListaArray<Figures>();
		
		listaFiguras.agregar(new Circulo(1,2,3));
		listaFiguras.agregar(new Rectangulo(1,2,3,4));
		
		for(int i =0; i<listaFiguras.largo();i++) {
			System.out.println(listaFiguras.buscar(i));
		}
		
	}

}
