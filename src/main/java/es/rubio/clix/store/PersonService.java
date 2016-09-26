package es.rubio.clix.store;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.springframework.stereotype.Service;
import es.rubio.clix.domainModel.Person;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;


@Service
public class PersonService {	
	
	public Map<String,Person> personSv;

	public Map<String,Person> getPersonDatos() {
		return personSv;
	}

	public void setDatos(Map<String,Person> personSv) {
		this.personSv = personSv;
	}

//	public PersonService() {
//	
//		personSv = new HashMap<String,Person>();
//		
//		personSv.put("Israel",new Person(1,"israel@clix.com","Israel","Israel"));
//		personSv.put("David",new Person(2,"david@clix.com","David","David"));
//	}

	public Person getPerson(String username) {
		
		return personSv.get(username);
	}
	
	public Collection<Person> getPersons() {
		
		return personSv.values();
		
	}
	
	  @PersistenceContext
	  private EntityManager em;
	  
	  @Transactional
	  public List<Person> getAll() {
	    List<Person> result = em.createQuery("SELECT p FROM Person p", Person.class).getResultList();
	    return result;
	  }
	  
	  @Transactional
	  public void add(Person p) {
	    em.persist(p);
	  }

}
