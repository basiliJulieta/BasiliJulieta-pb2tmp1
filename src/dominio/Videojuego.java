package dominio;

public class Videojuego extends Producto {
	
	private TipoDeConsola tipoDeConsola;
	
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
	
	

}
