package com.pattern.strategy.ConcreteStrategies;

import com.pattern.strategy.Strategy.Ataque;

//	Implementação Ataque
public class AtaqueMedio extends Ataque {
	public void atacar() {
		//	Variação Ataque Médio
		System.out.printf("Ataque médio.\n");
	}
}
