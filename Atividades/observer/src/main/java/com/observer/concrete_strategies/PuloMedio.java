package com.observer.concrete_strategies;

import com.observer.strategy.Pulo;

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
