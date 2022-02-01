package com.observer.ConcreteStrategies;

import com.observer.Strategy.Corrida;

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
