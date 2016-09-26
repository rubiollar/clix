package es.rubio.clix.serviceLayer;

import java.util.HashSet;
import java.util.Set;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import es.rubio.clix.domainModel.Person;
import es.rubio.clix.store.PersonService;

@RestController
public class PersonController {
	
	@Autowired private PersonService personSvc;
	
	@RequestMapping(value ="/users/{username}", method = RequestMethod.GET)
	public Person getPerson(@PathVariable String username) {
		
		return personSvc.getPerson(username);
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.POST)
	public ResponseEntity<String> addPerson(@RequestBody Person person) {
		
		personSvc.getPersonDatos().put(person.getUsername(),person);
	
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.CREATED);
		
		return response;
	}
	
	@RequestMapping(value = "/users", method = RequestMethod.GET)
	public Set<Person> getPersons() {
		
		return new HashSet<Person>(personSvc.getPersons());
	}
	
}
