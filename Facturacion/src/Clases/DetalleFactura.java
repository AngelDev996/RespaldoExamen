package Clases;

public class DetalleFactura {
	private Producto _producto;
	private double _cantidad;
	private double _subTotal;
	
	
	
	public DetalleFactura() {
		super();
	}

	public DetalleFactura(Producto _producto, double _cantidad, double _subTotal) {
		super();
		this._producto = _producto;
		this._cantidad = _cantidad;
		this._subTotal = _subTotal;
	}

	public Producto get_producto() {
		return _producto;
	}

	public void set_producto(Producto _producto) {
		this._producto = _producto;
	}

	public double get_cantidad() {
		return _cantidad;
	}

	public void set_cantidad(double _cantidad) {
		this._cantidad = _cantidad;
	}

	public double get_subTotal() {
		return _subTotal;
	}

	public void set_subTotal(double _subTotal) {
		this._subTotal = _subTotal;
	}

	@Override
	public String toString() {
		return "DetalleFactura [_producto=" + _producto + ", _cantidad=" + _cantidad + ", _subTotal=" + _subTotal + "]";
	}
	
	
	
	
	
}
