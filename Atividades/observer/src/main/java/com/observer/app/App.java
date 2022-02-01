package com.observer.app;

import java.util.Arrays;

import com.observer.concrete_observable.Sujeito;
import com.observer.concrete_observer.Inimigo;

/**
	*	Programação Orientada à Objetos 2 - Atividade 02 (Padrão Observer)
	*	Autores: 
	*		Pedro Henrique Rabis Diniz · Matrícula: 11811BCC024
	*		Adiel Pereira Prado				 · Matrícula: 11721BCC008
*/

public class App {
	public static void main( String[] args ) {
		System.out.printf("Programação Orientada à Objetos 2 - Padrão Observer\n\n");

		System.out.printf("PRÁTICA\n\n");

		Sujeito sujeito = new Sujeito();
		Inimigo inimigo01 = new Inimigo();
		Inimigo inimigo02 = new Inimigo();
		Inimigo inimigo03 = new Inimigo();

		sujeito.subscribe(Arrays.asList(inimigo01, inimigo02, inimigo03));

		System.out.print(sujeito);

		sujeito.setX(10);
		sujeito.setY(10);

		inimigo01.setX(7);
		inimigo01.setX(14);

		inimigo02.setX(0);
		inimigo02.setX(0);
		
		inimigo03.setX(-7);
		inimigo03.setX(-14);

		while (sujeito.getEnergia().getLevel() > 0) {
			System.out.print("Sujeito: "+ sujeito);
			System.out.print("Inimigo 01: "+ inimigo01);
			System.out.print("Inimigo 02: "+ inimigo02);
			System.out.print("Inimigo 03: "+ inimigo03);
			sujeito.notificate();
		}
	}
}
