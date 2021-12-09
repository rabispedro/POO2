package com.pattern.strategy.ConcreteContexts;

import com.pattern.strategy.Context.Personagem;

import com.pattern.strategy.ConcreteStrategies.AtaqueForte;
import com.pattern.strategy.ConcreteStrategies.CorridaMedia;
import com.pattern.strategy.ConcreteStrategies.PuloMedio;

//	Implementação Context
public class Personagem01 extends Personagem {
	public Personagem01() {
		//	Variação Personagem01: iniciado com pulo médio, corrida média e ataque forte.
		setAtaque(new AtaqueForte());
		setCorrida(new CorridaMedia());
		setPulo(new PuloMedio());
	}
}
