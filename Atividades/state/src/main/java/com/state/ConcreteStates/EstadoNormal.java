package com.state.ConcreteStates;

import com.state.Context.Energia;

import com.state.State.Estado;

public class EstadoNormal extends Estado {
	public EstadoNormal(Energia energia) {
		super(energia);
	}

	//	Comportamento particular deste estado
	public void setLimites() {
		this.setLimiteInferior(30);
		this.setLimiteSuperior(70);
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
		if(this.getEnergia().getLevel() < 0) {
			this.getEnergia().setEstado(new EstadoMorto(this.getEnergia()));
		}else if(this.getEnergia().getLevel() < this.getLimiteInferior()) {
			this.getEnergia().setEstado(new EstadoPerigo(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > this.getLimiteSuperior()) {
			this.getEnergia().setEstado(new EstadoForte(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > 100) {
			this.diminuir(this.getEnergia().getLevel() - 100);
			this.getEnergia().setEstado(new EstadoForte(this.getEnergia()));
		}
	}

	public String toString() {
		return "Estado Normal";
	}
}
