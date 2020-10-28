package com.promotions.delphi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DelphiControler {

	@GetMapping("/")
	private String welcome() {

		return "Welcome to Delphi Promotions";
	}
	
}
