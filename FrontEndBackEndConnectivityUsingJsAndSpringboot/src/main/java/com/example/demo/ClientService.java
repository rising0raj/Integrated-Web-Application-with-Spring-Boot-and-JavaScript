package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

	@Autowired
	ClientRepository clientRepository;
	
	public boolean saveClient(Client client) {
		try {
			Client savedClient = clientRepository.save(client);
			
			if(savedClient != null) {
				return true;
			} else {
				return false;
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return false;
	}
	
	public List<Client> getClients() {
		return clientRepository.findAll();
	}
}

/*
 {
 	name : kartik
 	gender: male
 }
 */

