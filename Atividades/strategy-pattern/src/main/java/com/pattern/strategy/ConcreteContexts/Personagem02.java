package com.pattern.strategy.ConcreteContexts;

import com.pattern.strategy.Context.Personagem;

import com.pattern.strategy.ConcreteStrategies.AtaqueMedio;
import com.pattern.strategy.ConcreteStrategies.CorridaRapida;
import com.pattern.strategy.ConcreteStrategies.PuloAlto;

//	Implementação Context
public class Personagem02 extends Personagem {
	public Personagem02() {
		//	Variação Personagem02: iniciado com pulo alto, corrida rápida, e ataque médio.
		setAtaque(new AtaqueMedio());
		setCorrida(new CorridaRapida());
		setPulo(new PuloAlto());
	}
}
