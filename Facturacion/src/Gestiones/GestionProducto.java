package Gestiones;

import java.util.LinkedList;

import Clases.Cliente;
import Clases.Producto;

public class GestionProducto {
	private LinkedList<Producto> lstProducto=new LinkedList<>();

	public GestionProducto() {
		super();
	}
	
	/**
	 * M�todo para agregar producto
	 * @param producto
	 * @return
	 */
	public boolean agregar(Producto producto) {
		lstProducto.add(producto);
		return true;
	}
	
	
	public Producto obtenerProducto(int codigoProducto) {
		Producto productoEncontrado=null;
		for(int i=0;i<lstProducto.size(); i++) {
			if(lstProducto.get(i).get_codigo()==codigoProducto) {
				productoEncontrado=lstProducto.get(i);
				break;
			}
			
		}
		return productoEncontrado;
	}


	
	
	
	public void imprimirTodos() {
		for(int i=0;i<lstProducto.size(); i++) {
			System.out.println(lstProducto.get(i));
			
		}
	}
}
