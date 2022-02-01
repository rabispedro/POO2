package com.observer.concrete_observable;

import java.util.ArrayList;
import java.util.List;

import com.observer.concrete_observer.Inimigo;
import com.observer.observable.Observavel;

public class Sujeito extends Observavel {
  private List<Inimigo> inimigos;

  public List<Inimigo> getInimigos() {
		return inimigos;
	}

	public void setInimigos(List<Inimigo> inimigos) {
		this.inimigos = inimigos;
	}

	public Sujeito() {
    this.inimigos = new ArrayList<Inimigo>();
  }

  public void subscribe(List<Inimigo> Inimigoes) {
    for (Inimigo observer : Inimigoes) {
      this.inimigos.add(observer);
    }
  }
  
  public void unsubscribe(Inimigo Inimigo) {
    for (Inimigo observer : this.inimigos) {
      if(observer.equals(Inimigo)) {
        this.inimigos.remove(observer);
      }
    }
  }
  
  public void notificate() {
    for (Inimigo observer : this.inimigos) {
      observer.update(this.getX(), this.getY());
    }
  }
}
