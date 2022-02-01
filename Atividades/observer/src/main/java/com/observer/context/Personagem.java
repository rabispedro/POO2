package com.observer.context;

import com.observer.strategy.Ataque;
import com.observer.strategy.Corrida;
import com.observer.strategy.Pulo;

//	Contexto abstrato
public abstract class Personagem {
	private Ataque ataque;
	private Corrida corrida;
	private Pulo pulo;
	private Energia energia;
	private Integer x;
	private Integer y;

	public Integer getX() {
    return this.x;
  }

  public Integer getY() {
    return this.y;
  }

  public void setX(Integer x) {
    this.x = x;
  }

  public void setY(Integer y) {
    this.y = y;
  }

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

	public Ataque getAtaque() {
		return this.ataque;
	}

	public void setCorrida(Corrida corrida) {
		this.corrida = corrida;
	}

	public Corrida getCorrida() {
		return this.corrida;
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

	public Pulo getPulo() {
		return this.pulo;
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
