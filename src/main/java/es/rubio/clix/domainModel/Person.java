package es.rubio.clix.domainModel;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "person")
public class Person {

  @Id
  @GeneratedValue
  private int id;
  
  private String email;
  
  private String username;	
	
  private String password;

  public int getId() {
    return id;
  }

  public String getEmail() {
		return email;
	}

  public String getUsername() {
		return username;
	}

  public String getPassword() {
		return password;
  	}
  
  public void setId(int id) {
    this.id = id;
  }

	
  public void setEmail(String email) {
		this.email = email;
	}
	
  public void setUsername(String username) {
		this.username = username;
	}
	
  public void setPassword(String password) {
		this.password = password;
	}

  public Person(int id, String email, String username, String password) {
		super();
		this.id = id;
		this.email = email;
		this.username = username;
		this.password = password;
	}
	
	
  public Person() {
	};
  
}
