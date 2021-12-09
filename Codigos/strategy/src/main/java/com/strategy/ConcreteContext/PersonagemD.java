package com.strategy.ConcreteContext;

import com.strategy.Context.Personagem;

import com.strategy.ConcreteStrategies.AtaqueFraco;
import com.strategy.ConcreteStrategies.MovimentoNormal;

public abstract class PersonagemD extends Personagem {
	public PersonagemD() {
		setAtaque(new AtaqueFraco());
		setMovimento(new MovimentoNormal());
	}
}
