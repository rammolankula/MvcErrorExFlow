package ram.learn.empcontroller;

import java.util.Random;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import ram.learn.customexhandler.Unavailableexception;


@Controller
public class Employeecontroller {

	@RequestMapping("/show")
	public String get() {
	    // log.info("Ram");
		if(new Random().nextInt(10)<=5) {
			throw new RuntimeException("Excep");
		}
		return "welcome";
		
	}

	@RequestMapping("/showb")
	public String getB(Model model) {
	    // log.info("Ram");
		if(new Random().nextInt(10)<=5) {
			throw new Unavailableexception("Excep");
		}
		return "welcome";
		
	}
}
