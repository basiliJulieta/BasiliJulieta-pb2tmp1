package dominio;

public class Libro extends Producto implements Vendible{
	private String autor;
	private String editorial;
	private Double precioDeVenta;
	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		super(codigo, descripcion);
		this.autor= autor;
		this.editorial= editorial;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	public Double setPrecioDeVenta(Double precioDeVenta) {
		return this.precioDeVenta = precioDeVenta;
	}
	public Double getPrecioDeVenta() {
		return precioDeVenta;
	}
	
	
	
	
	
	

}
