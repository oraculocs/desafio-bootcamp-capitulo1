package com.devsuperior.desafiocapituloum.resources;

import java.time.Instant;
import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devsuperior.desafiocapituloum.entities.Client;

@RestController
@RequestMapping(value = "/clients")
public class ClientResource {
	
	@GetMapping
	public ResponseEntity<List<Client>> findAll(){
		List<Client> list = new ArrayList<>();
		
		list.add(new Client(1L, "João", "12345678901", 1000.00, Instant.now(), 2));
		list.add(new Client(1L, "Ana", "12345678901", 2000.00, Instant.now(), 1));
		list.add(new Client(1L, "Beto", "12345678901", 3000.00, Instant.now(), 4));
		
		return ResponseEntity.ok().body(list);
		
	}

}
