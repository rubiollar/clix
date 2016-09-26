package es.rubio.clix.serviceLayer;

import java.util.Set;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import es.rubio.clix.domainModel.Figura;
import es.rubio.clix.store.DataStore;

@RestController
@RequestMapping(value = "/users/{username}/figures")
public class FigureController {
	
	public DataStore store = new DataStore();
	
	@RequestMapping(method = RequestMethod.GET)
	public Set<Figura> getFiguras(@PathVariable String username) {
		
		return store.getFiguras(username);
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<String> addFigura(@PathVariable String username, @RequestBody Figura figura) {
		
		store.getFiguras(username).add(figura);
		
		ResponseEntity<String> response = new ResponseEntity<String>(HttpStatus.CREATED);
		
		return response;
	}
	
}
