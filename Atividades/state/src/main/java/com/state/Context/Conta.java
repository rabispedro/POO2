package com.state.Context;

import com.state.State.Estado;

import com.state.ConcreteStates.EstadoPrata;

//	Context
public class Conta {
	private Estado estado;
	private String numero;
	private double saldo;

	//	Construtor
	public Conta(String numero) {
		//	As novas contas são por default 'Prata'
		this.numero = numero;
		this.estado = new EstadoPrata(this);
		this.saldo = 0.0;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double quantia) {
		estado.depositar(quantia);
		System.out.printf("Depósito---" + quantia + "\n");
		System.out.printf("Saldo = " + this.getSaldo() + "\n");
		System.out.printf("Estado = " + this.estado.getClass().getName() + "\n");
	}

	public void sacar(double quantia) {
		estado.sacar(quantia);
		System.out.printf("Saque--- " + quantia + "\n");
		System.out.printf("Saldo = " + this.getSaldo() + "\n");
		System.out.printf("Estado = " + this.estado.getClass().getName() + "\n");
	}
}
