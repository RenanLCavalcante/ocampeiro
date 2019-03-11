package br.com.software.campeiro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Prato {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

}
