package com.state.app;

import com.state.Context.Conta;

/**
 *	Programação Orientada à Objetos 2 - Padrão Strategy
 *	
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
