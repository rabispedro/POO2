package com.observer.ConcreteStrategies;

import com.observer.Strategy.Pulo;

//	Implementação do Pulo
public class PuloMedio extends Pulo {
	public void pular() {
		//	Variação Pulo Médio
		System.out.printf("Pulo Médio.\n");
	}

	@Override
	public String toString () {
		return "Pulo Médio";
	}
}
