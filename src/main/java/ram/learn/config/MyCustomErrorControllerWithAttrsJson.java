package ram.learn.config;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.error.ErrorAttributeOptions;
import org.springframework.boot.web.servlet.error.ErrorAttributes;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.ServletWebRequest;

//@Controller
public class MyCustomErrorControllerWithAttrsJson implements ErrorController {

	@Autowired
	private ErrorAttributes errorAttributes;
	
	@RequestMapping("/error")
	public @ResponseBody Map<String, Object> handleProblem(HttpServletRequest req)
	{
		ServletWebRequest webRequest = new ServletWebRequest(req);
		ErrorAttributeOptions option = null;
		@SuppressWarnings("deprecation")
		Map<String, Object> errors = errorAttributes.getErrorAttributes(webRequest, option);
		errors.put("Ram", "Learning");
		return errors;
	}
	
	
	//@Override
	public String getErrorPath() {
		return "/error";
	}
}
 