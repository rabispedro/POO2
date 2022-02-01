package com.observer.context;

import com.observer.concrete_states.EstadoForte;
import com.observer.concrete_states.EstadoMorto;
import com.observer.concrete_states.EstadoNormal;
import com.observer.concrete_states.EstadoPerigo;
import com.observer.state.Estado;

//	Context
public class Energia {
	private Estado estado;
	private Integer level;

	//	Construtor
	public Energia() {
		//	A Energia por default tem estado 'normal'
		this.level = 70;
		this.estado = new EstadoNormal(this);
	}

	public Energia(Integer level) {
		//	A Energia por default tem estado 'normal'
		this.level = level;
		if(level == 0) {
			this.estado = new EstadoMorto(this);
		}else if(level > 0 && level < 30) {
			this.estado = new EstadoPerigo(this);
		}else if(level >= 30 && level <= 70) {
			this.estado = new EstadoNormal(this);
		}else {
			this.estado = new EstadoForte(this);
		}
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public Integer getLevel() {
		return level;
	}

	public void setLevel(Integer level) {
		this.level = level;
	}

	public void aumentar(Integer quantia) {
		estado.aumentar(quantia);
		System.out.printf("Adicionado =>" + quantia + "\n");
		System.out.printf("Saldo = " + this.getLevel() + "\n");
		System.out.printf("Estado = " + this.estado + "\n");
	}

	public void diminuir(Integer quantia) {
		estado.diminuir(quantia);
		System.out.printf("Diminuido => " + quantia + "\n");
		System.out.printf("Saldo = " + this.getLevel() + "\n");
		System.out.printf("Estado = " + this.estado + "\n");
	}

	public String toString() {
		return 
			"\n ::: Energia ::::::::::::" +
			"\n  LEVEL: " + this.level +
			"\n  ESTADO: " + this.estado +
			"\n ::::::::::::::::::::::::\n";
	}
}
