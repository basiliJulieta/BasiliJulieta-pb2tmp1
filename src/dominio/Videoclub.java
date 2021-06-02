package dominio;

import java.util.ArrayList;

public class Videoclub {
	
	private String nombre;
	private ArrayList<Producto> productos = new ArrayList<Producto>();
	private ArrayList<Cliente> clientes= new ArrayList<Cliente>();
	private ArrayList<Vendible> contadorDeVentas= new ArrayList<Vendible>();
	private ArrayList<Alquilable> contadorDeAlquileres= new ArrayList<Alquilable>();

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
	
	public Producto buscarProducto(Vendible nuevoProducto) {
		for (Producto producto : productos) {
			if(producto.equals(nuevoProducto)){
				return producto;
			}
			
			
		}return null;
	}
	public Cliente buscarCliente(Cliente nuevoCliente) {
		for (Cliente cliente : clientes) {
			if(cliente.equals(nuevoCliente)){
				return cliente;
			}
			
			
		}return null;
	}
	public Boolean vender(Vendible nuevoProducto, Cliente nuevoCliente) {
		
		if(buscarProducto(nuevoProducto)!=null && buscarCliente(nuevoCliente)!=null){
			return this.contadorDeVentas.add(nuevoProducto);
		}
		return false;
	}
	

	public Boolean agregarVenta(Vendible nuevaVenta){
		return this.contadorDeVentas.add(nuevaVenta);
	}
	
	public Boolean agregarAlquiler(Alquilable nuevoAlquiler){
		return this.contadorDeAlquileres.add(nuevoAlquiler);
	}

	public Boolean alquilar(Alquilable nuevoProducto, Cliente nuevoCliente) {
		
		if(buscarProducto(nuevoProducto)!=null && buscarCliente(nuevoCliente)!=null){
			
			return this.contadorDeAlquileres.add(nuevoProducto);
			
		}
		return false;
	}

	public Producto buscarProducto(Alquilable nuevoProducto) {
		for (Producto producto : productos) {
			if(producto.equals(nuevoProducto)){
				return producto;
			}
			
			
		}return null;
	}
	
	
	
	

}
