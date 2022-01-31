package com.pattern.strategy.app;

import com.pattern.strategy.ConcreteContexts.Personagem01;
import com.pattern.strategy.ConcreteContexts.Personagem02;
import com.pattern.strategy.ConcreteContexts.Personagem03;
import com.pattern.strategy.ConcreteStrategies.AtaqueMedio;

/**
	*	Programação Orientada à Objetos 2 - Atividade 01 (Padrão Strategy)
	*	Autores: 
	*		Pedro Henrique Rabis Diniz · Matrícula: 11811BCC024
	*		Adiel Pereira Prado				 · Matrícula: 11721BCC008
*/
public class App {
	
	public static void main( String[] args ) {
		System.out.printf("Programação Orientada à Objetos 2 - Atividade 01 (Padrão Strategy)\n\n");

		System.out.printf("Atividade 01\n\n");
		
		Personagem01 personagem01 = new Personagem01();
		Personagem02 personagem02 = new Personagem02();
		Personagem03 personagem03 = new Personagem03();

		System.out.printf("PERSONAGEM 01\n\n");
		System.out.print(personagem01);
		personagem01.setAtaque(new AtaqueMedio());
		personagem01.atacar();
		personagem01.correr();
		personagem01.pular();

		System.out.printf("\n\n");

		System.out.printf("PERSONAGEM 02\n\n");
		// personagem02.toString();
		System.out.print(personagem02);
		personagem02.atacar();
		personagem02.correr();
		personagem02.pular();
		
		System.out.printf("\n\n");
		
		System.out.printf("PERSONAGEM 03\n\n");
		System.out.print(personagem03);
		personagem03.atacar();
		personagem03.correr();
		personagem03.pular();
	}
}
