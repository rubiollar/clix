package es.rubio.clix.domainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "figura")
public class Figura {
	
	@Id
	@GeneratedValue
  	private int id;
	private String expansion;
	private String nombre;	
	private String estado;
	private String username;
	
	public int getId() {
		return id;
	}
		
	public String getExpansion() {
		return expansion;
	}
	public String getNombre() {
		return nombre;
	}
	public String getEstado() {
		return estado;
	}
	
	public String getUsername() {
		return username;
	}
	 
	public void setId(int id) {
		this.id = id;
	}
	
	public void setExpansion(String expansion) {
		this.expansion = expansion;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	
	public Figura(int id, String expansion, String nombre, String estado, String username) {
		super();
		this.id = id;
		this.expansion = expansion;
		this.nombre = nombre;
		this.estado = estado;
		this.username = username;
	}
	
	public Figura() {
	};

}