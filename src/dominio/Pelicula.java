package dominio;

import java.util.ArrayList;
import java.util.List;

public class Pelicula extends Producto implements Vendible {
	
	private Genero genero; 
	private Integer anioDeEstreno;
	private String director;
	private String actoresPrincipales;
	private List <Actor> actores = new ArrayList<Actor>();


	public Pelicula(Integer codigo, String descripcion, Genero genero,Integer anioDeEstreno, String director) {
		super(codigo, descripcion);
		this.genero=genero;
		this.anioDeEstreno=anioDeEstreno;
		this.director=director;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public Integer getAnioDeEstreno() {
		return anioDeEstreno;
	}


	public void setAnioDeEstreno(Integer anioDeEstreno) {
		this.anioDeEstreno = anioDeEstreno;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public String getActoresPrincipales() {
		return actoresPrincipales;
	}


	public void setActoresPrincipales(String actoresPrincipales) {
		this.actoresPrincipales = actoresPrincipales;
	}


	public Boolean agregarActor(Actor nombreActor) {
		
		return this.actores.add(nombreActor);
		
	}


	public Boolean actua(Actor nombreActor) {
		
//		return this.actores.;
	}


	public Double precioDeVenta() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
	

}
