package Clases;

public class Producto {
	private int _codigo;
	private String _nombre;
	private double _precioCosto;
	private double _precioVenta;
	public Producto() {
		super();
	}
	public Producto(int _codigo, String _nombre, double _precioCosto, double _precioVenta) {
		super();
		this._codigo = _codigo;
		this._nombre = _nombre;
		this._precioCosto = _precioCosto;
		this._precioVenta = _precioVenta;
	}
	public int get_codigo() {
		return _codigo;
	}
	public void set_codigo(int _codigo) {
		this._codigo = _codigo;
	}
	public String get_nombre() {
		return _nombre;
	}
	public void set_nombre(String _nombre) {
		this._nombre = _nombre;
	}
	public double get_precioCosto() {
		return _precioCosto;
	}
	public void set_precioCosto(double _precioCosto) {
		this._precioCosto = _precioCosto;
	}
	public double get_precioVenta() {
		return _precioVenta;
	}
	public void set_precioVenta(double _precioVenta) {
		this._precioVenta = _precioVenta;
	}
	@Override
	public String toString() {
		return "Producto [_codigo=" + _codigo + ", _nombre=" + _nombre + ", _precioCosto=" + _precioCosto
				+ ", _precioVenta=" + _precioVenta + "]";
	}
	
	
	
	
}
