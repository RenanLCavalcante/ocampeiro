package br.com.software.campeiro.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import br.com.software.campeiro.confs.CustomerDateAndTimeDeserialize;

@Entity
public class Prato implements Serializable {
	
	private static final long serialVersionUID = -1250731211435990529L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@NotBlank
	private String nomePrato;
	
	@ManyToMany
	@JoinTable(name="pratos_itens", 
	joinColumns = @JoinColumn(name="prato_id"), 
	inverseJoinColumns = @JoinColumn(name="item_id"))
	private List<ItemPrato> itensPrato;
	
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimaAtualizacao;
	
	public Prato() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

	public Date getDataUltimaAtualizacao() {
		return dataUltimaAtualizacao;
	}

	public void setDataUltimaAtualizacao(Date dataUltimaAtualizacao) {
		this.dataUltimaAtualizacao = dataUltimaAtualizacao;
	}
	
}
