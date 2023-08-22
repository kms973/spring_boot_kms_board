package edu.global.ex.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
public class HomeController {

	@GetMapping("/")
	public String home() {
		return "home";
	}

	@GetMapping("/user/userHome")
	public void userHome() {
		log.info("userHome()..");
		//return "home";
	}
	
	@GetMapping("/admin/adminHome")
	public void adminHome() {
		log.info("adminHome()..");
		//return "home";
	}
}
