package com.state.ConcreteStrategies;

import com.state.Strategy.Pulo;

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
