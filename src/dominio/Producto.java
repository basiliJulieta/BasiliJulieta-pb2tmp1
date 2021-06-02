package dominio;

public class Producto {
	
	private Integer codigo;
	private String descripcion;
	private Estado estado;
	public Producto(Integer codigo, String descripcion) {
		super();
		this.codigo = codigo;
		this.descripcion = descripcion;
	}
	public Integer getCodigo() {
		return codigo;
	}
	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Estado getEstadoActual() {
		return this.estado;
	}
//	public Cliente getQuienPoseeElProducto(Cliente nombreDelCliente) {
//		
//		return this.;
//	}
	
	
	
	

}

