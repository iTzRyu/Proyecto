package modelos;
import javax.persistence.*;

@Entity
public class Rol {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombreRol;
	private String descripcion;
	
	//Esto no me gusta
	public Rol(){
	
	}
	
	public Rol(String nombreRol, String descripcion){
		this.nombreRol = nombreRol;
		this.descripcion = descripcion;
	}
	
	public String getNombreRol(){
		return nombreRol;
	}
	public String getDescripcion(){
		return descripcion;
	}
	
	@Override
	public String toString(){
		return nombreRol + " " + descripcion;
	}
}
