package dominio;

public class Comestible extends Producto implements Vendible {
	
	private Double precioDeVenta;
	
	public Comestible(Integer codigo, String descripcion) {
		super(codigo, descripcion);
		
	}

	

	public Double setPrecioDeVenta(Double precioDeVenta) {
		return this.precioDeVenta= precioDeVenta;
	}

	public Double getPrecioDeVenta() {
		return this.precioDeVenta;
	}

}
