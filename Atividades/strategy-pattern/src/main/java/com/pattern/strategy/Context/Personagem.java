package com.pattern.strategy.Context;

import com.pattern.strategy.Strategy.Ataque;
import com.pattern.strategy.Strategy.Corrida;
import com.pattern.strategy.Strategy.Pulo;

//	Contexto abstrato
public abstract class Personagem {
	private Ataque ataque;
	private Corrida corrida;
	private Pulo pulo;

	public void atacar() {
		ataque.atacar();
	}

	public void correr() {
		corrida.correr();
	}

	public void pular() {
		pulo.pular();
	}

	public void setAtaque(Ataque ataque) {
		this.ataque = ataque;
	}

	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}

	public void setPulo(Pulo pulo) {
		this.pulo = pulo;
	}	

	@Override
	public String toString() {
		return 
			"===================\n" + 
			"PULO: " + this.pulo + 
			"\nATAQUE: " + this.ataque +
			"\nCORRIDA: " + this.corrida + "\n" +
			"===================\n\n"; 
	}
}
