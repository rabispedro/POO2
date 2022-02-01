package com.observer.concrete_states;

import com.observer.context.Energia;
import com.observer.state.Estado;

public class EstadoMorto extends Estado {
	public EstadoMorto(Energia energia) {
		super(energia);
	}

	//	Comportamento particular deste estado
	public void setLimites() {
		this.setLimiteInferior(0);
		this.setLimiteSuperior(0);
	}

	//	Comportamento particular deste estado
	public void aumentar(Integer quantia) {
		System.out.print(":: GAME OVER · ESTADO MORTO ::\n");
	}

	//	Comportamento particular deste estado
	public void diminuir(Integer quantia) {
		System.out.print(":: GAME OVER · ESTADO MORTO ::\n");
	}

	public void verificarAlteracaoEstado() {
		this.getEnergia().setEstado(new EstadoMorto(this.getEnergia()));
	}

	public String toString() {
		return "Estado Morto";
	}
}
