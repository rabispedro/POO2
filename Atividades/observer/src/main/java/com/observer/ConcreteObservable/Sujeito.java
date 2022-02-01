package com.observer.ConcreteObservable;

import Java.util.List;
import Java.util.ArrayList;
import com.observer.Observable.Observavel;

public class Sujeito extends Observavel {
  private List<Observador> observadores;

  public Sujeito() {
    this.observadores = new ArrayList<Observador>();
  }

  public void subscribe(List<Observador> observadores){
    for (Observador observer : observadores) {
      this.observadores.push(observer);
    }
  }
  
  public void unsubscribe(Observador observador){
    for (Observador observer : this.observadores) {
      if(observer.equals(observador)) {
        this.observadores.remove(observer);
      }
    }
  }
  
  public void notify(){
    for (Observador observer : this.observadores) {
      observer.update(x,y);
    }
  }
}
