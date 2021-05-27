package com.swahili.registration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
	
	 @GetMapping("/")
		private String welcome() {
			return "Welcome to Swahili Developers";
		}

}
