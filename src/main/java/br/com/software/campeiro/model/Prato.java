package br.com.software.campeiro.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import br.com.software.campeiro.confs.CustomerDateAndTimeDeserialize;

@Entity
public class Prato implements Serializable {

	private static final long serialVersionUID = -1250731211435990529L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotBlank
	private String nomePrato;

	@OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
	@JoinColumn(name="prato_id")
	private List<ItemPrato> itensPrato;

	@JsonDeserialize(using = CustomerDateAndTimeDeserialize.class)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimaAtualizacao;

	public Prato() {
		this.itensPrato = new ArrayList<ItemPrato>();
	}

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
	
	public List<ItemPrato> getItensPrato() {
		return itensPrato;
	}

	public void setItensPrato(List<ItemPrato> itensPrato) {
		this.itensPrato = itensPrato;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome do prato: ");
		sb.append(this.nomePrato).append("\r");
		sb.append("Data última atualização: ");
		sb.append(this.dataUltimaAtualizacao).append("\r");		
		
		for (ItemPrato itemPrato : itensPrato) {
			sb.append("id Item: ");
			sb.append(itemPrato.getId()).append("\r");
		}
		
		return sb.toString();
	}

}
