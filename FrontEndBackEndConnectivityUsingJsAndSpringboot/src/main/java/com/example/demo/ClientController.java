package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {

	
	@Autowired
	ClientService clientService;
	
	//localhost:8080/save
	@PostMapping(path = "/save")
	public ResponseEntity<String> saveClient(@RequestBody Client client) {
		
		if(clientService.saveClient(client)) {
			return new ResponseEntity<>("Client save ho chuka hai", HttpStatus.OK);
		} else {
			return new ResponseEntity<>("Client save ni ho chuka hai", HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
	
	//localhost:8080/getClients
	@GetMapping(path = "/getClients")
	public ResponseEntity<List<Client>> getClients() {
		return new ResponseEntity<>(clientService.getClients(), HttpStatus.OK);
	}
	
//	function fetchClientfsFromApi() { <- asynchronous ->
//	<-await->
//		//springboot api call
//	}
//	
//	fetchClientfsFromApi();
//	console.log("data fetched");
}
