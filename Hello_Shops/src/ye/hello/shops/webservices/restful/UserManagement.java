package ye.hello.shops.webservices.restful;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import ye.hello.shops.models.User;


@RestController
// @RequestMapping("/{name}")
@CrossOrigin(origins="http://192.168.100.208:8080")
//@Controller
public class UserManagement {

	@RequestMapping(value = "/{name}", method = RequestMethod.GET)
	public String index(@PathVariable String name) {
		String result = "Hello " + name;
		return result;
	}

	@RequestMapping(value = "/delete/{name}", method = RequestMethod.GET)
	public String index1(@PathVariable String name) {
		String result = "Hello " + name;
		return result;
	}

	
	
	@RequestMapping(value = "/user_register", method = RequestMethod.GET)
	public ResponseEntity<User> userRegister(HttpServletResponse response) {
		System.out.println("user Registrations.........");
		
		ArrayList<User> users = new ArrayList<User>();
		
		User user = new User();
		user.setUser_id(1);
		user.setUser_name_first("Ye Win ");
		user.setUser_name_last("Ko ");
		
		User user1 = new User();
		user1.setUser_id(1);
		user1.setUser_name_first("Ye Win ");
		user1.setUser_name_last("Ko ");
		users.add(user);
		users.add(user1);
		
		response.setHeader("adfadfadf", "adfadfadf");
		return new ResponseEntity<User>(user, HttpStatus.OK);
	}
	
	

}
