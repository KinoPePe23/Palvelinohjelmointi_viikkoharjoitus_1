package fi.syksy2021.FirstApplication.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@ResponseBody
public class HelloController {

	@RequestMapping("/hello")
	public String returnGreetingForLocationAndName(@RequestParam(name = "location") String location,
	@RequestParam(name = "name") String name
	) {
		return "Welcome to the " + location + " " + name + " !";
	}

}
