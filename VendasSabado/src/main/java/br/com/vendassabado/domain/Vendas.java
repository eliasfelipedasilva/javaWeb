package br.com.vendassabado.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@SuppressWarnings("serial")
public class Vendas extends GenericDomain {

	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	java.util.Date horario;
	
	@Column(nullable = false)
	float valorTotal;
	
	@ManyToOne
	@JoinColumn(nullable = false)
	Funcionarios funcionarios;
	
	public java.util.Date getHorario() {
		return horario;
	}

	public void setHorario(java.util.Date horario) {
		this.horario = horario;
	}

	public float getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(float valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Funcionarios getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Funcionarios funcionarios) {
		this.funcionarios = funcionarios;
	}
	
	
	
}
