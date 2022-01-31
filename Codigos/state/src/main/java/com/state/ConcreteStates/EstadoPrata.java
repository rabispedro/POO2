package com.state.ConcreteStates;

import com.state.Context.Conta;

import com.state.State.Estado;

import com.state.ConcreteStates.EstadoVermelho;
import com.state.ConcreteStates.EstadoOuro;


public class EstadoPrata extends Estado {
	public EstadoPrata(Conta conta) {
		super(conta);
	}

	//	Comportamento particular deste estado
	public void setLimites() {
		this.setLimiteInferior(0.0);
		this.setLimiteSuperior(1000.0);
	}

	//	Comportamento particular deste estado: cliente paga taxa a cada saque realizado
	public void sacar(double quantia) {
		this.getConta().setSaldo(this.getConta().getSaldo() - quantia - 5.00);
		this.verificarAlteracaoEstado();
	}

	//	Depositar herdado da superclasse e mantido

	public void verificarAlteracaoEstado() {
		if(this.getConta().getSaldo() < this.getLimiteInferior()) {
			this.getConta().setEstado(new EstadoVermelho(this.getConta()));
		}else if(this.getConta().getSaldo() > this.getLimiteSuperior()) {
			this.getConta().setEstado(new EstadoOuro(this.getConta()));
		}
	}
}
