package tests;


import miscolecciones.genericos.Lista;
import miscolecciones.genericos.ListaEnlazada;

public class Test02Genericos {
	
	public static void main(String[] args) {
		
		Lista<Integer> listaNum = new ListaEnlazada<Integer>();
		
		listaNum.agregar(1);
		listaNum.agregar(2);
		listaNum.agregar(3);
		listaNum.agregar(4);
		listaNum.agregar(5);
		listaNum.agregar(6);
		listaNum.agregar(7);
		listaNum.agregar(8);
		listaNum.agregar(9);
		listaNum.agregar(10);
		listaNum.agregar(11);
		listaNum.agregar(12);
		
		System.out.println(listaNum.largo());
		System.out.println(listaNum.buscar(5));
		System.out.println(listaNum.buscar(5).getClass());
		
		System.out.println();
		
		
		for(int i = 0; i<listaNum.largo();i++) {
			System.out.println(listaNum.buscar(i));
		}
		
//		for(Integer num: listaNum) {
//			System.out.println(num);
//		}
		
	}

}
