package Gestiones;

import java.util.LinkedList;
import Clases.Cliente;

public class GestionCliente {
	private LinkedList<Cliente> lstCliente=new LinkedList<>();

	public GestionCliente() {
		super();
	}
	
	/**
	 * M�todo para agregar clientes
	 * @param cliente
	 * @return
	 */
	public boolean agregar(Cliente cliente) {
		lstCliente.add(cliente);
		return true;
		
	}
	/**
	 * M�todo que obtiene el OBJETO cliente seg�n el c�digo del cliente
	 * @param codigoCliente
	 * @return
	 */
	
	public Cliente obtenerCliente(int codigoCliente) {
		Cliente clienteEncontrado=null;
		for(int i=0;i<lstCliente.size(); i++) {
			if(lstCliente.get(i).get_codigoCliente()==codigoCliente) {
				clienteEncontrado=lstCliente.get(i);
				break;
			}
			
		}
		return clienteEncontrado;
	}
	
	
	public void imprimirTodos() {
		for(int i=0;i<lstCliente.size(); i++) {
			System.out.println(lstCliente.get(i));
			
		}
	}
	
	
	
}
