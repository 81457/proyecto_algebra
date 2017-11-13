package main;

import java.awt.Point;

/**
 *
 * @Autor Jorge A
 *
 */

public class Procesar4p {

    Point puntoA;
    Point puntoB;
    Point puntoC;
    Point puntoD;
    String tipo;

    public Procesar4p(int a, int b, int c, int d, int e, int f, int g, int h) {
        this.puntoA = new Point(a, b);
        this.puntoB = new Point(c, d);
        this.puntoC = new Point(e, f);
        this.puntoD = new Point(g, h);
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

    public double getCDX() {
        return puntoD.getX();
    }

    public double getCDY() {
        return puntoD.getY();
    }

    public double verticeAB() {
        double calcX = Math.pow((getCAX() - getCBX()), 2);
        double calcY = Math.pow((getCAY() - getCBY()), 2);
        double vcAB;

        return vcAB = Math.sqrt((calcX + calcY));
    }

    public double verticeBC() {
        double calcX = Math.pow((getCBX() - getCCX()), 2);
        double calcY = Math.pow((getCBY() - getCCY()), 2);
        double vcBC;

        return vcBC = Math.sqrt((calcX + calcY));
    }

    public double verticeCD() {
        double calcX = Math.pow((getCAX() - getCCX()), 2);
        double calcY = Math.pow((getCAY() - getCCY()), 2);
        double vcCD;

        return vcCD = Math.sqrt((calcX + calcY));
    }

    public double verticeDA() {
        double calcX = Math.pow((getCAX() - getCDX()), 2);
        double calcY = Math.pow((getCAY() - getCDY()), 2);
        double vcDA;

        return vcDA = Math.sqrt((calcX + calcY));
    }

    public String muestraTipo() {
            this.tipo = "Cuadrado.";
        return tipo;
    }
}
