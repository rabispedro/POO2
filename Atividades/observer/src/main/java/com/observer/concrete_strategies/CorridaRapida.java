package com.observer.concrete_strategies;

import com.observer.strategy.Corrida;

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
