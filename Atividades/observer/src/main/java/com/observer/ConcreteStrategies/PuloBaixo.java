package com.observer.ConcreteStrategies;

import com.observer.Strategy.Pulo;

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
