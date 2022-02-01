package com.observer.ConcreteStrategies;

import com.observer.Strategy.Corrida;

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
