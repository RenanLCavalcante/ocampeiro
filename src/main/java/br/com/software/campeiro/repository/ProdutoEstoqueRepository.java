package br.com.software.campeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.software.campeiro.model.ProdutoEstoque;

@Repository
public interface ProdutoEstoqueRepository extends JpaRepository<ProdutoEstoque, Integer> {
	
}
