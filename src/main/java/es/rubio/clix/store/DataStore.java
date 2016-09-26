package es.rubio.clix.store;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import es.rubio.clix.domainModel.Figura;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.transaction.annotation.Transactional;

@Service
public class DataStore {
	
	public Map<String,Set<Figura>> datos;

	public Map<String, Set<Figura>> getDatos() {
		return datos;
	}

	public void setDatos(Map<String, Set<Figura>> datos) {
		this.datos = datos;
	}

//	public DataStore() {
//		Set<Figura> figurasIsrael = new HashSet<Figura>();
//		figurasIsrael.add(new Figura(1,"SVB","01-Batman","No la tengo","Israel"));
//		figurasIsrael.add(new Figura(2,"SVB","02-Superman","La tengo","Israel"));
//		figurasIsrael.add(new Figura(3,"SVB","06-Lex Luthor","La tengo","Israel"));
//		
//		Set<Figura> figurasDavid = new HashSet<Figura>();
//		figurasDavid.add(new Figura(4,"XAA","03-Angel","No la tengo","David"));
//		figurasDavid.add(new Figura(5,"XAA","04-Beast","La tengo","David"));
//		figurasDavid.add(new Figura(6,"XAA","05-Ice-man","La tengo","David"));
//
//		datos = new HashMap<String,Set<Figura>>();
//		
//		datos.put("Israel", figurasIsrael);
//		datos.put("David", figurasDavid);
//	}
	
	public Set<Figura> getFiguras(String username) {
		
		return datos.get(username);
	}
	
	
//comentar las siguientes líneas para que funcione el mocking DataStore
	@PersistenceContext
	private EntityManager em2;
	  
	@Transactional
	public List<Figura> getAll() {
	    List<Figura> result = em2.createQuery("SELECT f FROM Figura f WHERE username.f=username", Figura.class).getResultList();
	    return result;
	  }

	@Transactional
	public void add(Figura f) {
	    em2.persist(f);
	  }
	
}
