package br.com.software.campeiro.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.software.campeiro.model.Prato;

public interface PratoRepository extends JpaRepository<Prato, Integer> {

}
