package main;

import java.awt.Point;

/**
 *
 * @Autor Jorge A
 *
 */
public class Procesar4p {

    private Point puntoA;
    private Point puntoB;
    private Point puntoC;
    private Point puntoD;
    private String tipo;

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
        } else if (verticeAB() == verticeCD() && verticeBC() == verticeDA() && verticeDA() != verticeBC()) {
            if (getCBX() == getCDX() && getCBX() == getCDY()) {
                this.tipo = "Rectángulo.";
            }
        } else if (verticeAB() == verticeCD() && verticeBC() != verticeDA()) {
            this.tipo = "Trapecio.";
        } else if (verticeAB() == verticeCD() && verticeBC() == verticeDA() && verticeDA() == verticeBC()) {
            if (getCBX() == getCDX() && getCBX() == getCDY()) {
                this.tipo = "Romboide.";
            }
        } else if (verticeAB() != verticeBC() && verticeBC() != verticeDA()) {
            this.tipo = "Trapezoide.";
        }
        return tipo;
    }

    // Cuadrado
    public double areaCuadrado() {
        double areaCua = verticeAB() * verticeCD();
        return areaCua;
    }

    public double perimetroCuadrado() {
        double perimCua = 4 * verticeAB();
        return perimCua;
    }

    // Rectangulo
    public double areaRectangulo() {
        double areaRec = verticeAB() * verticeBC();
        return areaRec;
    }

    public double perimetroRectangulo() {
        double perimRec = (2 * verticeAB()) + (2 * verticeBC());
        return perimRec;
    }

    // Rombo
    public double areaRombo() {
        double areaRom = verticeAB() * verticeCD();
        return areaRom;
    }

    public double perimetroRombo() {
        double perimRom = 4 * verticeAB();
        return perimRom;
    }

//    // Romboide
//    public int areaRomboide(int base, int altura) {
//        int areaRomide = base * altura;
//        return areaRomide;
//    }
//
//    public int perimetroRomboide(int ladoA, int ladoB) {
//        int perimRomide = (2 * ladoA) + (2 * ladoB);
//        return perimRomide;
//    }
//
//    // Trapecio
//    public int areaTrapecio(int ladoA, int ladoB, int altura) {
//        int areaTrap = altura * (ladoA + ladoB) / 2;
//        return areaTrap;
//    }
//
//    public int perimetroTrapecio(int ladoA, int ladoB, int ladoC, int ladoD) {
//        int perimTrap = ladoA + ladoB + ladoC + ladoD;
//        return perimTrap;
//    }
//    // Trapezoide
//
//    public int perimetroTrapezoide(int ladoA, int ladoB, int ladoC, int ladoD) {
//        int perimTrapzde = ladoA + ladoB + ladoC + ladoD;
//        return perimTrapzde;
//    }
}
