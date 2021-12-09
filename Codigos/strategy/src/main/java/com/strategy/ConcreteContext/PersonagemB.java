package com.strategy.ConcreteContext;

import com.strategy.Context.Personagem;

import com.strategy.ConcreteStrategies.AtaqueForte;
import com.strategy.ConcreteStrategies.MovimentoNormal;

public abstract class PersonagemB extends Personagem {
	public PersonagemB() {
		setAtaque(new AtaqueForte());
		setMovimento(new MovimentoNormal());
	}
}
