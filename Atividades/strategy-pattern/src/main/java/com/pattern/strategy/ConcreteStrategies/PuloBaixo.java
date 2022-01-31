package com.pattern.strategy.ConcreteStrategies;

import com.pattern.strategy.Strategy.Pulo;

//	Implementação do Pulo
public class PuloBaixo extends Pulo {
	public void pular() {
		//	Variação Pulo Baixo
		System.out.printf("Pulo Baixo.\n");
	}

	@Override
	public String toString () {
		return "Pulo Baixo";
	}
}
