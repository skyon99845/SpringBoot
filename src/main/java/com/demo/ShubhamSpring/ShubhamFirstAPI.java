package com.demo.ShubhamSpring;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShubhamFirstAPI {
	
		@RequestMapping("/description")
		public String display() {
		return ("Welcome Shubham");
		}
		
		@RequestMapping("/")
		public String homeDisplay() {
		return ("Welcome Shubham TO SPRINGBOOT WORLD");
		}
	

}
