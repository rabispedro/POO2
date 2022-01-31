package com.state.ConcreteStrategies;

import com.state.Strategy.Corrida;

//	Implementação da Corrida
public class CorridaDevagar extends Corrida {
	public void correr() {
		//	Variação Corrida Devagar
		System.out.printf("Corrida Devagar.\n");
	}

	@Override
	public String toString () {
		return "Corrida Devagar";
	}
}
