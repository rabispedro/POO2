package com.state.ConcreteStrategies;

import com.state.Strategy.Corrida;

//	Implementação Corrida
public class CorridaRapida extends Corrida {
	public void correr() {
		//	Variação Corrida Rápida
		System.out.printf("Corrida Rápida.\n");
	}

	@Override
	public String toString () {
		return "Corrida Rápida";
	}
}
