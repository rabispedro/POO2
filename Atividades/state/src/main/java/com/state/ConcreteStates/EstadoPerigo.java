package com.state.ConcreteStates;

import com.state.Context.Energia;

import com.state.State.Estado;

import com.state.ConcreteStates.EstadoNormal;
import com.state.ConcreteStates.EstadoMorto;
import com.state.ConcreteStates.EstadoForte;

public class EstadoPerigo extends Estado {
	public EstadoPerigo(Energia energia) {
		super(energia);
	}

	//	Comportamento particular deste estado
	public void setLimites() {
		this.setLimiteInferior(1);
		this.setLimiteSuperior(30);
	}

	//	Comportamento particular deste estado
	public void aumentar(Integer quantia) {
		this.getEnergia().setLevel(this.getEnergia().getLevel() + quantia);
		this.verificarAlteracaoEstado();
	}

	//	Comportamento particular deste estado
	public void diminuir(Integer quantia) {
		this.getEnergia().setLevel(this.getEnergia().getLevel() - quantia);
		this.verificarAlteracaoEstado();
	}

	//	Depositar herdado da superclasse e mantido

	public void verificarAlteracaoEstado() {
		if(this.getEnergia().getLevel() < this.getLimiteInferior()) {
			this.getEnergia().setEstado(new EstadoMorto(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > 70) {
			this.getEnergia().setEstado(new EstadoForte(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > this.getLimiteSuperior()) {
			this.getEnergia().setEstado(new EstadoNormal(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > 100) {
			this.diminuir(this.getEnergia().getLevel() - 100);
			this.getEnergia().setEstado(new EstadoForte(this.getEnergia()));
		}
	}

	public String toString() {
		return "Estado Perigo";
	}
}
