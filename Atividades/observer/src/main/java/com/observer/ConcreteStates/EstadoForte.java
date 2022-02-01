package com.observer.ConcreteStates;

import com.observer.State.Estado;

import com.observer.Context.Energia;

//	Concrete State
public class EstadoForte extends Estado {
	public EstadoForte(Energia energia) {
		super(energia);
	}
	
	public void setLimites() {
		this.setLimiteInferior(71);
		this.setLimiteSuperior(100);
	}
	
	public void aumentar(Integer quantia) {
		this.getEnergia().setLevel(this.getEnergia().getLevel() + quantia);
		this.verificarAlteracaoEstado();
	}
	
	public void diminuir(Integer quantia) {
		this.getEnergia().setLevel(this.getEnergia().getLevel() - quantia);
		this.verificarAlteracaoEstado();
	}

	public void verificarAlteracaoEstado() {
		if(this.getEnergia().getLevel() < 0) {
			this.getEnergia().setEstado(new EstadoMorto(this.getEnergia()));
		} else if(this.getEnergia().getLevel() < 30) {
			this.getEnergia().setEstado(new EstadoPerigo(this.getEnergia()));
		}else if(this.getEnergia().getLevel() < this.getLimiteInferior()) {
			this.getEnergia().setEstado(new EstadoNormal(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > this.getLimiteInferior()) {
			this.getEnergia().setEstado(new EstadoForte(this.getEnergia()));
		}else if(this.getEnergia().getLevel() > 100) {
			this.diminuir(this.getEnergia().getLevel() - 100);
			this.getEnergia().setEstado(new EstadoForte(this.getEnergia()));
		}
	}

	public String toString() {
		return "Estado Forte";
	}
}
