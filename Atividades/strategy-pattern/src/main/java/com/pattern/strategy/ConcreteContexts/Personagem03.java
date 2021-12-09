package com.pattern.strategy.ConcreteContexts;

import com.pattern.strategy.Context.Personagem;

import com.pattern.strategy.ConcreteStrategies.AtaqueForte;
import com.pattern.strategy.ConcreteStrategies.CorridaRapida;
import com.pattern.strategy.ConcreteStrategies.PuloBaixo;

//	Implementação Context
public class Personagem03 extends Personagem {
	public Personagem03() {
		//	Variação Pèrsonagem03: iniciado com pulo baixo, corrida rápida, e ataque forte.
		setAtaque(new AtaqueForte());
		setCorrida(new CorridaRapida());
		setPulo(new PuloBaixo());
	}
}
