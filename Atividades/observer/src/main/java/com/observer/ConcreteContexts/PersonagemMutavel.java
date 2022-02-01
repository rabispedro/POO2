package com.observer.ConcreteContext;

import com.observer.Context.Personagem;
import com.observer.Context.Energia;

import com.observer.ConcreteStrategies.AtaqueFraco;
import com.observer.ConcreteStrategies.AtaqueForte;
import com.observer.ConcreteStrategies.AtaqueMedio;
import com.observer.ConcreteStrategies.CorridaDevagar;
import com.observer.ConcreteStrategies.CorridaMedia;
import com.observer.ConcreteStrategies.CorridaRapida;
import com.observer.ConcreteStrategies.PuloAlto;
import com.observer.ConcreteStrategies.PuloBaixo;
import com.observer.ConcreteStrategies.PuloMedio;

public class PersonagemMutavel extends Personagem {
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
