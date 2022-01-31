package com.state.ConcreteStates;

import com.state.State.Estado;

import com.state.Context.Conta;

//	Concrete State
public class EstadoOuro extends Estado {
	public EstadoOuro(Conta conta) {
		super(conta);
	}
	
	public void setLimites() {
		this.setLimiteInferior(1000.0);
		this.setLimiteSuperior(10000000.0);
	}

	//	Comportamento particular deste estado: ganha rendimento a cada depósito.
	public void depositar(double quantia) {
		this.getConta().setSaldo(this.getConta().getSaldo() + (quantia * 1.01));
	}

	public void verificarAlteracaoEstado() {
		if(this.getConta().getSaldo() < 0.0) {
			this.getConta().setEstado(new EstadoVermelho(this.getConta()));
		}else if(this.getConta().getSaldo() < this.getLimiteInferior()) {
			this.getConta().setEstado(new EstadoPrata(this.getConta()));
		}
	}
}
