package com.pattern.strategy.ConcreteStrategies;

import com.pattern.strategy.Strategy.Pulo;

//	Implementação do Pulo
public class PuloAlto extends Pulo {
	public void pular() {
		//	Variação Pulo Alto
		System.out.printf("Pulo Alto.\n");
	}

	@Override
	public String toString () {
		return "Pulo Alto";
	}
}
