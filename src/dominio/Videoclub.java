package dominio;

import java.util.ArrayList;

public class Videoclub {
	
	private String nombre;
	private ArrayList<Producto> productos = new ArrayList<Producto>();

	public Videoclub(String nombre) {
		super();
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean agregarProducto(Producto nuevoProducto) {
		return this.productos.add(nuevoProducto);
		
	}

	public Producto buscarProducto(Producto nuevoProducto) {
		for (Producto producto : productos) {
			if(producto.equals(nuevoProducto)){
				return producto;
			}
			
			
		}return null;
	}
	
	

}
