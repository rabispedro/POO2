package com.state.State;

import com.state.Context.Energia;

//	State
public abstract class Estado {
	private Energia energia;
	private Integer level;
	private Integer limiteInferior;
	private Integer limiteSuperior;

	public Estado(Energia energia) {
		this.energia = energia;
		setLimites();
	}

	protected abstract void setLimites();

	public Energia getEnergia() {
		return energia;
	}

	public void setEnergia(Energia energia) {
		this.energia = energia;
	}

	public Integer getLimiteInferior() {
		return limiteInferior;
	}

	public void setLimiteInferior(Integer limiteInferior) {
		this.limiteInferior = limiteInferior;
	}

	public Integer getLimiteSuperior() {
		return limiteSuperior;
	}

	public void setLimiteSuperior(Integer limiteSuperior) {
		this.limiteSuperior = limiteSuperior;
	}

	public void aumentar(Integer quantia) {
		this.energia.setLevel(this.energia.getLevel() + quantia);
		this.verificarAlteracaoEstado();
	}

	public void diminuir(Integer quantia) {
		this.energia.setLevel(this.energia.getLevel() - quantia);
		this.verificarAlteracaoEstado();
	}

	public abstract void verificarAlteracaoEstado();
}
