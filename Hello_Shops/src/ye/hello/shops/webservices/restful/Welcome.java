package ye.hello.shops.webservices.restful;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@RequestMapping("/")
//@RestController
@Controller
public class Welcome {
	@RequestMapping(method = RequestMethod.GET)
	public String index() {
		String result = "This is home";
		System.out.println("what is that error");
		return "user_register";
	}

}
