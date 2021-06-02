package dominio;

public class Cliente {
	
	private Integer codigoDeCliente;
	private String nombre;
	private String apellido;
	private Integer edad;
	public Cliente(Integer codigoDeCliente, String nombre, String apellido,
			Integer edad) {
		super();
		this.codigoDeCliente = codigoDeCliente;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}
	
	
	public Integer getCodigoDeCliente() {
		return codigoDeCliente;
	}
	public void setCodigoDeCliente(Integer codigoDeCliente) {
		this.codigoDeCliente = codigoDeCliente;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Integer getEdad() {
		return edad;
	}
	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	

}
