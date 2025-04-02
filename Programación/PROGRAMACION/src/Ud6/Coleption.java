package Ud6;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Coleption {
	private List<Producto> lista = new ArrayList<Producto>();

	public int tamanio() {
		return lista.size();
		// Devuelve el tamaño de la lista
	}

	public void aniadir(Producto e) {
		// Añade un elemento tipo roducto en la lista
		if (!lista.contains(e)) {
			lista.add((e));
		} else {
			System.out.println("Ya esta en la lista");
		}
	}

	public void eliminar(int pos) {
		// Borra un elemento indicando l posición

		if (lista.indexOf(pos) > lista.size() || lista.indexOf(pos) < 0) {
			System.out.println("no existe lo que quiere eliminar");
		} else {

		}
	}

	public Producto obtener(int pos) {
		return lista.get(pos);
	}

	public Producto buscar(int cod){
Iterator<Producto> itP;

	//Recorre la lista y busca si el código del producto
	// si coincide con cod devuelve el producto
	//y si no está el la lista devuelve null
return null;
	 }
	// Más tarde se añadirán los métodos
	// public void mostrarTodo()
	// public void aumentoPrecio(double porcentaje)
}
