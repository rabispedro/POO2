package com.observer.observable;

import com.observer.concrete_contexts.PersonagemMutavel;
import com.observer.observer.Observador;

public abstract class Observavel extends PersonagemMutavel {
  public void subscribe(Observador[] observadores) {}
  public void unsubscribe(Observador observador) {}
  public void notificate() {}
}
