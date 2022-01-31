package com.state.app;

import com.state.ConcreteContext.PersonagemMutavel;

/**
	*	Programação Orientada à Objetos 2 - Atividade 02 (Padrão State)
	*	Autores: 
	*		Pedro Henrique Rabis Diniz · Matrícula: 11811BCC024
	*		Adiel Pereira Prado				 · Matrícula: 11721BCC008
*/

public class App {
	public static void main( String[] args ) {
		System.out.printf("Programação Orientada à Objetos 2 - Padrão State\n\n");

		System.out.printf("PRÁTICA\n\n");

		PersonagemMutavel personagem = new PersonagemMutavel(80);
		System.out.print(personagem);
	}
}
