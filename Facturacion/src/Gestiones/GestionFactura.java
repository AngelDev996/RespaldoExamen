package Gestiones;

import java.util.LinkedList;

import Clases.Factura;

public class GestionFactura {
	private LinkedList<Factura> lstFactura=new LinkedList<>();

	public GestionFactura() {
		super();
	}

	
	public boolean Agregar(Factura factura) {
		int nuevoCodigo=GenerarCodigoFactura();
		
		factura.set_codigo(nuevoCodigo);
		factura.set_fecha("--");
		
		lstFactura.add(factura);
		return true;
	}
	
	public int GenerarCodigoFactura() {
		return lstFactura.size()+1;
	}
	
	public void imprimirTodos() {
		for(int i=0;i<lstFactura.size(); i++) {
			System.out.println(lstFactura.get(i));
			
		}
	}
	
}
