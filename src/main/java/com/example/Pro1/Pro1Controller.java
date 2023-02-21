package com.example.Pro1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Pro1Controller {
	@RequestMapping("/Welcome")
     public String Welcome()
     {
		return "Welcome String Boot!";
     }
}
