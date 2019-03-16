package br.com.vendassabado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@SuppressWarnings("serial")
@Entity
public class Produtos extends GenericDomain {
	
	@Column(length = 50, nullable = false)
	private String nome;
	
	@Column(nullable = false)
	float valor;
	
	@Column(nullable = false)
	int quantidade;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Fornecedores fornecedores;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Fornecedores getFornecedores() {
		return fornecedores;
	}

	public void setFornecedores(Fornecedores fornecedores) {
		this.fornecedores = fornecedores;
	}
	
}
