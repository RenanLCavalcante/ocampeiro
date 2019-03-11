package br.com.software.campeiro.controller;

import javax.ws.rs.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.software.campeiro.model.ProdutoEstoque;
import br.com.software.campeiro.repository.ProdutoEstoqueRepository;

@Controller("/produto-estoque")
public class ProdutoEstoqueController {

	@Autowired private ProdutoEstoqueRepository peRep;
	
	@PostMapping
	public ResponseEntity<ProdutoEstoque> salvar(@RequestBody ProdutoEstoque produtoEstoque){
		
		try {
			produtoEstoque = peRep.save(produtoEstoque);
			return new ResponseEntity<ProdutoEstoque>(HttpStatus.CREATED);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
	}
	
}
