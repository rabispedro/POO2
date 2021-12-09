package com.strategy.app;

import com.strategy.ConcreteContext.PersonagemA;

import com.strategy.ConcreteStrategies.MovimentoNormal;
import com.strategy.ConcreteStrategies.AtaqueFraco;

/**
 * Programação Orientada à Objetos 2 - Padrão Strategy
 *
 */
public class App {
	
	public static void main( String[] args ) {
		System.out.printf("Programação Orientada à Objetos 2 - Padrão Strategy\n\n");

		System.out.printf("TEORIA\n\n");
		
		PersonagemA personagem = new PersonagemA();
		
		System.out.printf("PERSONAGEM A:\n");
		personagem.atacar();
		personagem.movimentar();

		System.out.printf("\nMODIFICAÇÃO: Movimento Normal\n");
		personagem.setMovimento(new MovimentoNormal());
		personagem.movimentar();

		System.out.printf("\nMODIFICAÇÃO: Ataque Fraco\n");
		personagem.setAtaque(new AtaqueFraco());
		personagem.atacar();
	}
}
