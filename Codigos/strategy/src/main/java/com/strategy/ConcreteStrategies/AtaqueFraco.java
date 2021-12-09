package com.strategy.ConcreteStrategies;

import com.strategy.Strategy.Ataque;

public class AtaqueFraco extends Ataque {
	public void atacar() {
		//	Implementa ataque fraco
		System.out.printf("Ataque fraco.\n");
	}
}
