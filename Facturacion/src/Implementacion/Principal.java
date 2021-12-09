package Implementacion;

import java.util.Scanner;

import Clases.Cliente;
import Clases.DetalleFactura;
import Clases.Factura;
import Clases.Producto;
import Gestiones.*;

public class Principal {

	public static void main(String[] args) {
		boolean centinela=true, centinelaProducto=true;
		Scanner sc=new Scanner(System.in);
		
		/*
		Codigo(int)   autogenerado
		fecha(String)   la fecha del sistema
		cliente(CLIENTE) selecionará
		LinkedList<DETALLE_FACTURA>  seleccionar el producto
		*/
		
		GestionCliente gCliente=new GestionCliente();
		GestionFactura gFactura=new GestionFactura();
		GestionProducto gProducto =new GestionProducto();
		
		
		Cliente cli1=new Cliente(1,"Pedro","Aguilar","Comayagua","pedro@gmail.com");
		Cliente cli2=new Cliente(2,"Luis","Hernandez","TGU","luis@gmail.com");
		
		gCliente.agregar(cli1);
		gCliente.agregar(cli2);

		
		Producto prod1=new Producto(1,"Cemento",200,400);
		Producto prod2=new Producto(2,"Madera",2000,4000);
		
		gProducto.agregar(prod1);
		gProducto.agregar(prod2);
		
		int codigoCliente, codigoProducto, opcion;
		double cantidad;
		while(centinela) {
			System.out.println("Registrando factura");
			System.out.println("Seleccione el cliente (ingrese el código):");
			gCliente.imprimirTodos();
			codigoCliente=sc.nextInt();
			Cliente clienteFactura= gCliente.obtenerCliente(codigoCliente);
			if(clienteFactura==null) { //No lo encontró
				System.out.println("Cliente no encontrado");
				continue;
			}
			
			Factura nuevaFactura=new Factura();
			nuevaFactura.set_cliente(clienteFactura);
			centinelaProducto=true;
			
			while(centinelaProducto) {
				System.out.println("Registrando los productos");
				System.out.println("Seleccione el producto (ingrese el código):");
				gProducto.imprimirTodos();
				codigoProducto=sc.nextInt();
				Producto productoEncontrado=gProducto.obtenerProducto(codigoProducto);
				if(productoEncontrado==null) {
					System.out.println("Producto no encontrado");
					continue;
				}
				System.out.println("Ingrese la cantidad a comprar:");
				cantidad=sc.nextDouble();
				
				DetalleFactura nuevoDetalle=new DetalleFactura();
				nuevoDetalle.set_cantidad(cantidad);
				nuevoDetalle.set_producto(productoEncontrado);
				nuevoDetalle.set_subTotal(cantidad*productoEncontrado.get_precioVenta());
				
				nuevaFactura.agregarDetalle(nuevoDetalle);
				
				System.out.println("Desea agregar mas productos? (1-Si, 0-No)");
				opcion=sc.nextInt();
				if(opcion==0) {
					centinelaProducto=false;
				}
			}
			
			
			gFactura.Agregar(nuevaFactura);
			System.out.println("Desea agregar otra factura? (1-Si, 0-No)");
			opcion=sc.nextInt();
			if(opcion==0) {
				centinela=false;
			}
		}
		
		
		gFactura.imprimirTodos();
		

	}

}
