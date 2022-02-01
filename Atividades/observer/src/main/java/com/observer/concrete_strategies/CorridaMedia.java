package com.observer.concrete_strategies;

import com.observer.strategy.Corrida;

//	Implementação Corrida
public class CorridaMedia extends Corrida {
	public void correr() {
		//	Variação Corrida Média
		System.out.printf("Corrida Média.\n");
	}

	@Override
	public String toString () {
		return "Corrida Média";
	}
}
