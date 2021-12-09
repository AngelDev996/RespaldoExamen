package Clases;

public class Cliente {
	private int _codigoCliente;
	private String _nombres;
	private String _apellidos;
	private String _direccion;
	private String _correoElectronico;
	public Cliente() {
		super();
	}
	public Cliente(int _codigoCliente, String _nombres, String _apellidos, String _direccion,
			String _correoElectronico) {
		super();
		this._codigoCliente = _codigoCliente;
		this._nombres = _nombres;
		this._apellidos = _apellidos;
		this._direccion = _direccion;
		this._correoElectronico = _correoElectronico;
	}
	public int get_codigoCliente() {
		return _codigoCliente;
	}
	public void set_codigoCliente(int _codigoCliente) {
		this._codigoCliente = _codigoCliente;
	}
	public String get_nombres() {
		return _nombres;
	}
	public void set_nombres(String _nombres) {
		this._nombres = _nombres;
	}
	public String get_apellidos() {
		return _apellidos;
	}
	public void set_apellidos(String _apellidos) {
		this._apellidos = _apellidos;
	}
	public String get_direccion() {
		return _direccion;
	}
	public void set_direccion(String _direccion) {
		this._direccion = _direccion;
	}
	public String get_correoElectronico() {
		return _correoElectronico;
	}
	public void set_correoElectronico(String _correoElectronico) {
		this._correoElectronico = _correoElectronico;
	}
	@Override
	public String toString() {
		return "Cliente [_codigoCliente=" + _codigoCliente + ", _nombres=" + _nombres + ", _apellidos=" + _apellidos
				+ ", _direccion=" + _direccion + ", _correoElectronico=" + _correoElectronico + "]";
	}
	
	
	
}
