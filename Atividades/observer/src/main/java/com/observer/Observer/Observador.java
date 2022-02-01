package com.observer.Observer;

import com.observer.Observer.ConcreteContext.PersonagemMutavel;

public abstract class Observador extends PersonagemMutavel {
  public void update(Integer x, Integer y);
}
