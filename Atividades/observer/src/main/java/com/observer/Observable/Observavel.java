package com.observer.Observable;

import com.observer.Observer.Observador;
import com.observer.Observer.ConcreteContext.PersonagemMutavel;

public abstract class Observavel extends PersonagemMutavel {
  public void subscribe(Observador[] observadores);
  public void unsubscribe(Observador observador);
  public void notify();
}
