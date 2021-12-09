package com.strategy.ConcreteStrategies;

import com.strategy.Strategy.Movimento;

public class MovimentoRapido extends Movimento {
	public void movimentar() {
		//	Implementa movimentação rápida
		System.out.printf("Movimentação rápida.\n");
	}
}
