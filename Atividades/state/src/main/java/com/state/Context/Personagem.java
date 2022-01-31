package com.state.Context;

import com.state.Context.Energia;

import com.state.Strategy.Ataque;
import com.state.Strategy.Corrida;
import com.state.Strategy.Pulo;

//	Contexto abstrato
public abstract class Personagem {
	private Ataque ataque;
	private Corrida corrida;
	private Pulo pulo;
	private Energia energia;

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

	public void setEnergia(Energia energia) {
		this.energia = energia;
	}

	public Energia getEnergia() {
		return energia;
	}

	public void setPulo(Pulo pulo) {
		this.pulo = pulo;
	}	

	@Override
	public String toString() {
		return 
			"== Personagem ============" + 
			"\nENERGIA: " + this.energia + 
			"\nPULO: " + this.pulo + 
			"\nATAQUE: " + this.ataque +
			"\nCORRIDA: " + this.corrida + "\n" +
			"==========================\n\n"; 
	}
}
