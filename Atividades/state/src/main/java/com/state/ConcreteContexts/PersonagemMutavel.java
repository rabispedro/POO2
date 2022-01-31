package com.state.ConcreteContext;

import com.state.Context.Personagem;
import com.state.Context.Energia;

import com.state.ConcreteStrategies.AtaqueFraco;
import com.state.ConcreteStrategies.AtaqueForte;
import com.state.ConcreteStrategies.AtaqueMedio;
import com.state.ConcreteStrategies.CorridaDevagar;
import com.state.ConcreteStrategies.CorridaMedia;
import com.state.ConcreteStrategies.CorridaRapida;
import com.state.ConcreteStrategies.PuloAlto;
import com.state.ConcreteStrategies.PuloBaixo;
import com.state.ConcreteStrategies.PuloMedio;

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
