package br.com.software.campeiro.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;

import br.com.software.campeiro.confs.CustomerDateAndTimeDeserialize;
import br.com.software.campeiro.enums.TipoQuantitativo;

@Entity
public class ProdutoEstoque implements Serializable {
	
	private static final long serialVersionUID = -688061151628789150L;
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@JsonDeserialize(using=CustomerDateAndTimeDeserialize.class)
	@Temporal(TemporalType.TIMESTAMP)
	private Date dataUltimaCompra;
	
	private String nomeItem;
	
	@Enumerated(EnumType.STRING)
	private TipoQuantitativo tipoQuantitativo;
	
	private double quantidade; 
	
	private boolean produtoPrato;
	
	public ProdutoEstoque() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getDataUltimaCompra() {
		return dataUltimaCompra;
	}

	public void setDataUltimaCompra(Date dataUltimaCompra) {
		this.dataUltimaCompra = dataUltimaCompra;
	}

	public String getNomeItem() {
		return nomeItem;
	}

	public void setNomeItem(String nomeItem) {
		this.nomeItem = nomeItem;
	}

	public TipoQuantitativo getTipoQuantitativo() {
		return tipoQuantitativo;
	}

	public void setTipoQuantitativo(TipoQuantitativo tipoQuantitativo) {
		this.tipoQuantitativo = tipoQuantitativo;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public boolean isProdutoPrato() {
		return produtoPrato;
	}

	public void setProdutoPrato(boolean produtoPrato) {
		this.produtoPrato = produtoPrato;
	}
	
	@Override
	public String toString() {
		return "Data: " + this.dataUltimaCompra + 
				", Nome do Item: " + this.nomeItem +
				", Tipo de quantidade: " + this.tipoQuantitativo.name() + 
				", Quantidade: " + this.quantidade + 
				", Produto é servidor no prato ?:" + this.produtoPrato;
	}
	
}
