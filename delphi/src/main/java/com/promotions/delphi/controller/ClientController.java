package com.promotions.delphi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.promotions.delphi.models.Client;
import com.promotions.delphi.service.ClientService;

@RestController
@RequestMapping("/rest/api/client")
public class ClientController {

	@Autowired
	ClientService clientService;
	
	@GetMapping("/all")
	private List<Client> getAllClients() {
		
		return clientService.getAllClients();
		
	}
	
	
}
