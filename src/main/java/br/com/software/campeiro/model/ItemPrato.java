package br.com.software.campeiro.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class ItemPrato implements Serializable {
	
	private static final long serialVersionUID = 3701137727237919341L;

	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	@ManyToOne
	@JoinColumn(name="produto_estoque_id")
	private ProdutoEstoque produtoEstoque;
	
	private String quantidade;
	
	public ItemPrato() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public ProdutoEstoque getProdutoEstoque() {
		return produtoEstoque;
	}

	public void setProdutoEstoque(ProdutoEstoque produtoEstoque) {
		this.produtoEstoque = produtoEstoque;
	}

	public String getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(String quantidade) {
		this.quantidade = quantidade;
	}
}
