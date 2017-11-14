package main;

import java.awt.Point;

/**
 *
 * @Autor Jorge A
 *
 */

public class Procesar3p {

    Point puntoA;
    Point puntoB;
    Point puntoC;
    String tipo;
    double semiperim;
    double areaheron;

    public Procesar3p(int ax, int ay, int bx, int by, int cx, int cy) {
        this.puntoA = new Point(ax, ay);
        this.puntoB = new Point(bx, by);
        this.puntoC = new Point(cx, cy);
    }

    public double getCAX() {
        return puntoA.getX();
    }

    public double getCAY() {
        return puntoA.getY();
    }

    public double getCBY() {
        return puntoB.getX();
    }

    public double getCBX() {
        return puntoB.getY();
    }

    public double getCCX() {
        return puntoC.getX();
    }

    public double getCCY() {
        return puntoC.getY();
    }

    public double verticeAB() {
        double calcX = Math.pow((getCAX() - getCBX()), 2);
        double calcY = Math.pow((getCAY() - getCBY()), 2);
        double vcAB;

        return vcAB = Math.sqrt((calcX + calcY));
    }

    public double verticeCD() {
        double calcX = Math.pow((getCBX() - getCCX()), 2);
        double calcY = Math.pow((getCBY() - getCCY()), 2);
        double vcCD;

        return vcCD = Math.sqrt((calcX + calcY));
    }

    public double verticeEF() {
        double calcX = Math.pow((getCAX() - getCCX()), 2);
        double calcY = Math.pow((getCAY() - getCCY()), 2);
        double vcEF;

        return vcEF = Math.sqrt((calcX + calcY));
    }

    public String muestraTipo() {
        if (verticeAB() == verticeCD() && verticeEF() == verticeCD()) {
            this.tipo = "Equilátero.";
        } else if (verticeAB() == verticeCD() || verticeEF() == verticeCD()) {
            this.tipo = "Isosceles.";
        } else if (verticeAB() != verticeCD() && verticeEF() != verticeCD()) {
            this.tipo = "Escaleno.";
        }
        return tipo;
    }
    
    public double calculaPerimetro(){
        this.semiperim = (verticeAB() + verticeCD() + verticeEF() / 2);
        return Math.round(semiperim);
    }
    
    public double calculaArea(){
        this.areaheron = Math.sqrt(semiperim * (semiperim - verticeAB()) * (semiperim - verticeCD()) * (semiperim - verticeEF()));
        return Math.round(areaheron);
    }
    
}
