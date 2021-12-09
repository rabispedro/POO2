package com.strategy.ConcreteContext;

import com.strategy.Context.Personagem;

import com.strategy.ConcreteStrategies.AtaqueForte;
import com.strategy.ConcreteStrategies.MovimentoRapido;

public class PersonagemA extends Personagem {
	public PersonagemA() {
		setAtaque(new AtaqueForte());
		setMovimento(new MovimentoRapido());
	}
}
