package com.observer.concrete_strategies;

import com.observer.strategy.Corrida;

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
