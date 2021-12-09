package Clases;
import java.util.LinkedList;

public class Factura {
	private int _codigo;
	private String _fecha;
	private Cliente _cliente;
	private LinkedList<DetalleFactura> _detalleFactura=new LinkedList<>();
	public Factura() {
		super();
	}
	
	
	public Factura(int _codigo, String _fecha, Cliente _cliente, LinkedList<DetalleFactura> _detalleFactura) {
		super();
		this._codigo = _codigo;
		this._fecha = _fecha;
		this._cliente = _cliente;
		this._detalleFactura = _detalleFactura;
	}
	
	
	/**
	 * Método para agregar detalle a mi factura
	 * @param detalle
	 * @return
	 */
	
	public boolean agregarDetalle(DetalleFactura detalle) {
		_detalleFactura.add(detalle);
		return true;
		
	}
	
	
	
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_fecha() {
		return _fecha;
	}
	public void set_fecha(String _fecha) {
		this._fecha = _fecha;
	}
	public Cliente get_cliente() {
		return _cliente;
	}
	public void set_cliente(Cliente _cliente) {
		this._cliente = _cliente;
	}
	public LinkedList<DetalleFactura> get_detalleFactura() {
		return _detalleFactura;
	}
	public void set_detalleFactura(LinkedList<DetalleFactura> _detalleFactura) {
		this._detalleFactura = _detalleFactura;
	}


	@Override
	public String toString() {
		return "Factura [_codigo=" + _codigo + ", _fecha=" + _fecha + ", _cliente=" + _cliente + ", _detalleFactura="
				+ _detalleFactura + "]";
	}
	
	
	
}
