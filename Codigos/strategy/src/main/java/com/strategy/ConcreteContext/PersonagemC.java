package com.strategy.ConcreteContext;

import com.strategy.Context.Personagem;

import com.strategy.ConcreteStrategies.AtaqueFraco;
import com.strategy.ConcreteStrategies.MovimentoRapido;

public abstract class PersonagemC extends Personagem {
	public PersonagemC() {
		setAtaque(new AtaqueFraco());
		setMovimento(new MovimentoRapido());
	}
}
