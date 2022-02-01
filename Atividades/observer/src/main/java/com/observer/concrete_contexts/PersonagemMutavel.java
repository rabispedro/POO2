package com.observer.concrete_contexts;

import com.observer.concrete_strategies.AtaqueForte;
import com.observer.concrete_strategies.AtaqueFraco;
import com.observer.concrete_strategies.AtaqueMedio;
import com.observer.concrete_strategies.CorridaDevagar;
import com.observer.concrete_strategies.CorridaMedia;
import com.observer.concrete_strategies.CorridaRapida;
import com.observer.concrete_strategies.PuloAlto;
import com.observer.concrete_strategies.PuloBaixo;
import com.observer.concrete_strategies.PuloMedio;
import com.observer.context.Energia;
import com.observer.context.Personagem;

public class PersonagemMutavel extends Personagem {
	public PersonagemMutavel() {
		this.setAtaque(new AtaqueMedio());
		this.setCorrida(new CorridaMedia());
		this.setEnergia(new Energia());
		this.setPulo(new PuloMedio());
		this.setX(0);
		this.setY(0);
	}

  public PersonagemMutavel(Integer level) {
		
		this.setEnergia(new Energia(level));
		if(level == 0) {
			this.setAtaque(new AtaqueFraco());
			this.setCorrida(new CorridaDevagar());
			this.setPulo(new PuloBaixo());
		}else if(level > 0 && level < 30) {
			this.setAtaque(new AtaqueFraco());
			this.setCorrida(new CorridaDevagar());
			this.setPulo(new PuloBaixo());
		}else if(level >= 30 && level <= 70) {
			this.setAtaque(new AtaqueMedio());
			this.setCorrida(new CorridaMedia());
			this.setPulo(new PuloMedio());
		}else if(level > 70 && level < 100) {
			this.setAtaque(new AtaqueForte());
			this.setCorrida(new CorridaRapida());
			this.setPulo(new PuloAlto());
		}
	}
}
