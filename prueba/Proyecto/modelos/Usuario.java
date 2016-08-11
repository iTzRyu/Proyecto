package modelos;
import javax.persistence.*;
@Entity
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private String apePaterno;
	private String apeMaterno;
	private int edad;
	private String correo;
	private Rol rol;
	
	//Para la otra usar set para meter los datos
	public Usuario(){
		
	}
	public Usuario(Rol rol, String nombre, String apePaterno, String apeMaterno, int edad, String correo){
		this.rol = rol;
		this.nombre = nombre;
		this.apePaterno = apePaterno;
		this.apeMaterno = apeMaterno;
		this.edad = edad;
		this.correo = correo;
	}
	public Rol getRol(){
		return rol;
	}
	
	public String getNombre(){
		return nombre;
	}
	public String getApePaterno(){
		return apePaterno;
	}
	public String getApeMaterno(){
		return apeMaterno;
	}
	public int getEdad(){
		return edad;
	}
	public String getCorreo(){
		return correo;
	}
	@Override
	public String toString(){
		return nombre + " " + apePaterno + " " + apeMaterno + " "
				+ rol.getNombreRol() +  " " + edad + " " + correo;
	}
}
