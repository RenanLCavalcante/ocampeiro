package br.com.software.campeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.software.campeiro.model.Prato;
import br.com.software.campeiro.repository.PratoRepository;

@RestController
public class PratoController {
	
	@Autowired private PratoRepository pratoRep;

	@PostMapping("/pratos")
	public ResponseEntity<Prato> create (@RequestBody Prato jsonPrato){
		try {
			pratoRep.save(jsonPrato);			
			return new ResponseEntity<Prato>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Prato>(HttpStatus.BAD_REQUEST);
		}
	}

}
