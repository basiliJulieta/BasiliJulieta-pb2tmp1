package dominio;

public class Videojuego extends Producto implements Alquilable{
	
	private TipoDeConsola tipoDeConsola;
	private Double precioAlquiler;
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipoDeConsola) {
		super(codigo, descripcion);
		this.tipoDeConsola=tipoDeConsola;
	}

	public TipoDeConsola getTipoDeConsola() {
		return tipoDeConsola;
	}

	public void setTipoDeConsola(TipoDeConsola tipoDeConsola) {
		this.tipoDeConsola = tipoDeConsola;
	}

	public Double getPrecioAlquiler() {
		return this.precioAlquiler;
	}

	public Double setPrecioAlquiler(Double precioAlquiler) {
		return this.precioAlquiler= precioAlquiler;
	}


	
	

}
