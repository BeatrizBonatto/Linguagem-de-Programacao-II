package AreaChecker.Formas;

import AreaChecker.Interface.Calculable;

public class Quadrado implements Calculable {
    private Double lado;

    public Quadrado(Double lado){  //construtor
        this.lado = lado;
    }

    public double calcularArea() {
        return this.lado * this.lado;
    }
    
}
