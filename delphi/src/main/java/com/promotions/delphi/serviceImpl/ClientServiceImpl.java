package com.promotions.delphi.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.promotions.delphi.models.Client;
import com.promotions.delphi.repository.ClientRepository;
import com.promotions.delphi.service.ClientService;

public class ClientServiceImpl implements ClientService{
	
	@Autowired
	ClientRepository clientRepository;

	public List<Client> getAllClients() {
		
		return clientRepository.findAll();
	}

}
