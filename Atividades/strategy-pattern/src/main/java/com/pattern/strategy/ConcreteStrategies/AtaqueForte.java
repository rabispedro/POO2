package com.pattern.strategy.ConcreteStrategies;

import com.pattern.strategy.Strategy.Ataque;

//	Implementação Ataque
public class AtaqueForte extends Ataque {
	public void atacar() {
		//	Variação Ataque Forte
		System.out.printf("Ataque forte.\n");
	}
}
