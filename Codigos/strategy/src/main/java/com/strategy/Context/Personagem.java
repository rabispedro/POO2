package com.strategy.Context;

import com.strategy.Strategy.Movimento;
import com.strategy.Strategy.Ataque;

public abstract class Personagem {
	private Ataque ataque;
	private Movimento movimento;

	public void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}

	public void setMovimento(Movimento movimento) {
		this.movimento = movimento;
	}

	public void atacar() {
		ataque.atacar();
	}

	public void movimentar() {
		movimento.movimentar();
	}
}
