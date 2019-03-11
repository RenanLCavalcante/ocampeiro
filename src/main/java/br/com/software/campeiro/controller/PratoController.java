package br.com.software.campeiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.software.campeiro.model.Prato;
import br.com.software.campeiro.repository.PratoRepository;

@Controller("/pratos")
public class PratoController {
	
	@Autowired private PratoRepository pratoRep;
	
	@PostMapping
	public ResponseEntity<Prato> create (@RequestBody Prato prato){
		try {
			pratoRep.save(prato);
			return new ResponseEntity<Prato>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<Prato>(HttpStatus.BAD_REQUEST);
		}
	}

}
