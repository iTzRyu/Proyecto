package main;
import java.util.*;
import javax.persistence.*;
import modelos.*;
public class Main {
	private static final String PERSISTENCE_UNIT_NAME = "usuarios";
	private static EntityManagerFactory factory;
	private static EntityManager em;
	public static void main(String args[]){
		factory = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		em = factory.createEntityManager();
		em.getTransaction().begin();
		Rol rol = new Rol("Supervisor", "Supervisa las ventas");
		em.persist(rol);
		em.getTransaction().commit();
		Query q = em.createQuery("SELECT t FROM Rol t");
		List<Rol> lista = q.getResultList();
		for(Rol r : lista){
			System.out.println(r);
		}
		agregaUsuario("Juan", "Perez", "Gonzalez", 35, "juansito_perez@hotmail.com", rol);
		agregaUsuario("Maria Guadalupe", "Escobedo", "Dominguez", 23, "lupita_escobedo@hotmail.com", rol);
		q = em.createQuery("SELECT t FROM Usuario t");
		List<Usuario> list = q.getResultList();
		for(Usuario u : list){
			System.out.println(u);
		}
	}
	public static void agregaUsuario(String nombre, String apePat, String apeMat, int edad, String correo, Rol rol){
		em.getTransaction().begin();
		Usuario user = new Usuario(rol, nombre, apePat, apeMat,edad,correo);
		em.persist(user);
		em.getTransaction().commit();
	}
}
