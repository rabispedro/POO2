package com.observer.ConcreteOberser;

import java.util.Math;
import com.observer.Observer.Observador;

public class Inimigo extends Observador {
  public Double getDistance(Integer x, Integer y) {
    Double dist = Math.sqrt(
      Math.pow((x - this.x), 2L)
      + Math.pow((y - this.y), 2L)
    );
    return dist;
  }

  public void update(Integer x, Integer y){
    // dist tem q ser maior q 0 para continuar a mover o inimigo
    // primeiro caso y2 > y1 => y1++
    // segundo caso y2 < y1 => y1--
    // primeiro caso x2 > x1 => x1++
    // segundo caso x2 < x1 => x1--
    if(this.getDistance(x,y).toInteger() > 0) {
      final Integer relativeSpeed = 
        Math.sqrt(this.getCorrida().getSpeed()).toInteger();

      if(x > this.x) {
        if(this.x + relativeSpeed > x) {
          this.x = x;
        } else {
          this.x += relativeSpeed;
        }
      } else if (x < this.x){
        if(this.x - relativeSpeed < x) {
          this.x = x;
        } else {
          this.x -= relativeSpeed;
        }
      }
      if(y > this.y) {
        if(this.y + relativeSpeed > y) {
          this.y = y;
        } else {
          this.y += relativeSpeed;
        }
      } else if (y < this.y){
        if(this.y - relativeSpeed < y) {
          this.y = y;
        } else {
          this.y -= relativeSpeed;
        }
      }
    } else {
      this.atacar();
    }
  }
}
