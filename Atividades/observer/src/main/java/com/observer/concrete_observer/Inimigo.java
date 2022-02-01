package com.observer.concrete_observer;

import com.observer.observer.Observador;

public class Inimigo extends Observador {

  public Double getDistance(Integer x, Integer y) {
    Double dist = Math.sqrt(
			Math.pow((x - this.getX()), 2L)
			+
			Math.pow((y - this.getY()), 2L)
		);
    return dist;
  }

  public void update(Integer x, Integer y){
    /*
		* Distancia entre este objeto e um outro objeto tem que ser maior que 0
		* para continuar a mover este objeto aproximando-os;
		* 
		* De acordo com a distância e a velocidade deste objeto:
    * 	- Primeiro caso: Acrescentar X até chegar ao X do objeto
    * 	- Segundo caso: Decrescentar X até chegar ao X do objeto
    * 	- Terceiro caso: Acrescentar Y até chegar ao Y do objeto
    * 	- Quarto caso: Decrescentar Y até chegao ao Y do objeto
		*/
    if(this.getDistance(x,y) > 0) {
			final Double calculatedSpeed = Math.sqrt(this.getCorrida().getSpeed());
      final int relativeSpeed = calculatedSpeed.intValue();

			//	Verificação das coordenadas no eixo X
      if(x > this.getX()) {
        if(this.getX() + relativeSpeed > x) {
					this.setX(x);
        } else {
					this.setX(this.getX() + relativeSpeed);
        }
      } else if (x < this.getX()){
        if(this.getX() - relativeSpeed < x) {
					this.setX(x);
        } else {
					this.setX(this.getX() - relativeSpeed);
        }
      }
			
			//	Verificação das coordenadas no eixo Y
      if(y > this.getY()) {
        if(this.getY() + relativeSpeed > y) {
					this.setY(y);
        } else {
					this.setY(this.getY() + relativeSpeed);
        }
      } else if (y < this.getY()){
        if(this.getY() - relativeSpeed < y) {
					this.setY(y);
        } else {
					this.setY(this.getY() - relativeSpeed);
        }
      }
    } else {
      this.atacar();
    }
  }
}
