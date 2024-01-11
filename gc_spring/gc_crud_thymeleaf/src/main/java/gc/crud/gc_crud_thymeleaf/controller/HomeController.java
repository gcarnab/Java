package gc.crud.gc_crud_thymeleaf.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {

	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("/demo")
	@ResponseBody
	public String demo() {
		
		return "<h1> GCARNAB demo page! </h1>";
	}
}