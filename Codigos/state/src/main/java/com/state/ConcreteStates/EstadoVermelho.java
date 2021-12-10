package com.state.ConcreteStates;

import com.state.State.Estado;

import com.state.Context.Conta;

import com.state.ConcreteStates.EstadoPrata;

//	ConcreteState
public class EstadoVermelho extends Estado {
		public EstadoVermelho(Conta conta) {
			super(conta);
		}

		//	Comportamento particular deste estado
		public void setLimites() {
			setLimiteInferior(-100.0);
			setLimiteSuperior(0.0);
		}

		//	Comportamento particular deste estado: não permite saque
		public void sacar(double quantia) { 
			System.out.printf("Não existem fundos disponíveis para saque!\n");
		}
	
		public void verificarAlteracaoEstado() {
			if(this.getConta().getSaldo() > this.getLimiteSuperior()) {
				this.getConta().setEstado(new EstadoPrata(this.getConta()));
				this.getConta().getEstado().verificarAlteracaoEstado();
			}
		}
}
