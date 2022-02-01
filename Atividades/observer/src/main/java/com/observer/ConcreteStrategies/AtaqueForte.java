package com.observer.ConcreteStrategies;

import com.observer.Strategy.Ataque;

//	Implementação Ataque
public class AtaqueForte extends Ataque {
	public void atacar() {
		//	Variação Ataque Forte
		System.out.printf("Ataque Forte.\n");
	}

	@Override
	public String toString () {
		return "Ataque Forte";
	}
}
