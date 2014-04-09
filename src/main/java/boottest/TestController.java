package boottest;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value="/api/{id}", method= RequestMethod.GET)
	public String getUser(@PathVariable String id) {
	  return "requested id " + id;
	}

}