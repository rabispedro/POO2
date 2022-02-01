package com.observer.strategy;

//	Estratégia abstrata
public abstract class Corrida {
	private Integer speed;
	public abstract void correr();
	public Integer getSpeed() {
		return this.speed;
	}
	public void setSpeed(Integer speed) {
		this.speed = speed;
	}
}
