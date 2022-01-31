package com.state.ConcreteStrategies;

import com.state.Strategy.Ataque;

//	Implementação Ataque
public class AtaqueFraco extends Ataque {
	public void atacar() {
		//	Variação Ataque Fraco
		System.out.printf("Ataque Fraco.\n");
	}

	@Override
	public String toString () {
		return "Ataque Fraco";
	}
}
