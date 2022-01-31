package com.state.app;

import com.state.Context.Conta;

/**
	*	Programação Orientada à Objetos 2 - Atividade 01 (Padrão State)
	*	Autores: 
	*		Pedro Henrique Rabis Diniz · Matrícula: 11811BCC024
	*		Adiel Pereira Prado				 · Matrícula: 11721BCC008
*/

public class App {
	public static void main( String[] args ) {
		System.out.printf("Programação Orientada à Objetos 2 - Padrão Strategy\n\n");

		System.out.printf("TEORIA\n\n");

		Conta conta = new Conta("2923903");

		//	Efetuar transações financeiras
		conta.depositar(500.0);
		conta.depositar(300.0);
		conta.depositar(550.0);
		conta.depositar(550.0);
		conta.sacar(2000.00);
		conta.sacar(1100.00);
	}
}
