package com.strategy.ConcreteStrategies;

import com.strategy.Strategy.Movimento;

public class MovimentoNormal extends Movimento {
	public void movimentar() {
		//	Implementa movimentação normal
		System.out.printf("Movimentação normal.\n");
	}
}
