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
    int areaCua;
    int perimCua;
    int areaRec;
    int perimRec;

    public Procesar4p(int ax, int ay, int bx, int by, int cx, int cy, int dx, int dy) {
        this.puntoA = new Point(ax, ay);
        this.puntoB = new Point(bx, by);
        this.puntoC = new Point(cx, cy);
        this.puntoD = new Point(dx, dy);
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
        double calcX = Math.pow((getCBX() - getCAX()), 2);
        double calcY = Math.pow((getCBY() - getCAY()), 2);
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
        double calcX = Math.pow((getCCX() - getCDX()), 2);
        double calcY = Math.pow((getCCY() - getCDY()), 2);
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
        if (verticeAB() == verticeCD() && verticeBC() == verticeDA()) {
            if (getCAX() == getCCX() && getCAY() == getCCY()) {
                this.tipo = "Rombo";
            } else {
                this.tipo = "Cuadrado.";
            }
        } else if (verticeAB() == verticeCD() && verticeBC() == verticeDA()) {
            if (getCBX() == getCDX() && getCBX() == getCDY()) {
                this.tipo = "Rectángulo.";
            }
        } else if (verticeAB() == verticeCD() && verticeBC() != verticeDA()) {
            this.tipo = "Trapecio.";
        } else if (verticeAB() == verticeBC() && verticeCD() == verticeDA()) {
            if (getCDX() == getCBX() && getCDY() == getCBY()) {
                this.tipo = "Romboide.";
            }
        } else if (verticeAB() != verticeBC() && verticeCD() != verticeDA()) {
            this.tipo = "Trapezoide.";
        }
        return tipo;
    }

    public int areaCuadrado(int lado) {
        areaCua = lado * lado;
        return areaCua;
    }

    public int perimetroCuadrado(int lado) {
        perimCua = 4 * lado;
        return perimCua;
    }

    public int areaRectangulo(int ladoA, int ladoB) {
        areaRec = ladoA * ladoB;
        return areaRec;
    }

    public int perimetroRectangulo(int ladoA, int ladoB) {
        perimRec = (2 * ladoA) + (2 * ladoB);
        return perimRec;
    }

}
