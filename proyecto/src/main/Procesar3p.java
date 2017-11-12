package main;

import java.awt.Point;

/**
 *
 * @Autor Jorge A
 *
 */
public class Procesar3p {

    // Después ver si lo dejo en public o private...
    
    Point puntoA;
    Point puntoB;
    Point puntoC;

    public Procesar3p(int a, int b, int c, int d, int e, int f) {
        this.puntoA = new Point(a, b);
        this.puntoB = new Point(c, d);
        this.puntoC = new Point(e, f);
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
    
    
    
    
}
