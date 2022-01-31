package com.state.ConcreteStrategies;

import com.state.Strategy.Ataque;

//	Implementação Ataque
public class AtaqueMedio extends Ataque {
	public void atacar() {
		//	Variação Ataque Médio
		System.out.printf("Ataque médio.\n");
	}

	@Override
	public String toString () {
		return "Ataque Médio";
	}
}
