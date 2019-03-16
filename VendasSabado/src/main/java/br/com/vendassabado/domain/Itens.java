package br.com.vendassabado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@SuppressWarnings("serial")
public class Itens extends GenericDomain{
	
	@Column(nullable = false)
	int quantidade;
	
	@Column(nullable = false)
	float valorParcial;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Produtos produtos;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Vendas vendas;

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public float getValorParcial() {
		return valorParcial;
	}

	public void setValorParcial(float valorParcial) {
		this.valorParcial = valorParcial;
	}

	public Produtos getProdutos() {
		return produtos;
	}

	public void setProdutos(Produtos produtos) {
		this.produtos = produtos;
	}

	public Vendas getVendas() {
		return vendas;
	}

	public void setVendas(Vendas vendas) {
		this.vendas = vendas;
	}

}
