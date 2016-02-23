package main.com.hudson.controller;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloWorldController {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {

		String message = "Hello from Server: Date " + new Date();
		return new ModelAndView("welcome", "message", message);
	}
}
