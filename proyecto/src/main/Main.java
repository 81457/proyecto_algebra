package main;

import java.util.Scanner;

/**
 *
 * @Autor Jorge A
 *
 */
public class Main {

    public static void main(String[] args) {

        byte contFig = 0;
        Scanner leer = new Scanner(System.in);

        while (true) {
            System.out.println("-------------------------------------------");
            System.out.println("Software de Álgebra");
            System.out.println("-------------------------------------------");
            System.out.println("¿Cuántos puntos desea ingresar?");
            System.out.println("A.- 3 Puntos.");
            System.out.println("B.- 4 Puntos.");
            System.out.println("C.- Salir.");
            System.out.println("-------------------------------------------");
            System.out.println("Al ingresar coordenadas no olvide la coma.");
            System.out.println("Ejemplo: [1,5]");
            System.out.println("-------------------------------------------");
            System.out.print("Ingrese su opción: ");
            String opc = leer.nextLine();
            System.out.println("-------------------------------------------");

            if (opc.equalsIgnoreCase("A")) {
                System.out.print("Ingrese las coordenadas de A [x,y]: ");

                String crdA = leer.nextLine();
                String[] lugarA = crdA.split(",");

                int crdAx = Integer.parseInt(lugarA[0]);
                int crdAy = Integer.parseInt(lugarA[1]);

                System.out.print("Ingrese las coordenadas de B [x,y]: ");

                String crdB = leer.nextLine();
                String[] lugarB = crdB.split(",");

                int crdBx = Integer.parseInt(lugarB[0]);
                int crdBy = Integer.parseInt(lugarB[1]);

                System.out.print("Ingrese las coordenadas de C [x,y]: ");

                String crdC = leer.nextLine();
                String[] lugarC = crdC.split(",");

                int crdCx = Integer.parseInt(lugarC[0]);
                int crdCy = Integer.parseInt(lugarC[1]);

                Procesar3p Triangulo = new Procesar3p(crdAx, crdAy, crdBx, crdBy, crdCx, crdCy);

                System.out.println("-------------------------------------------");
                System.out.println("Vértice AB: " + Math.round(Triangulo.verticeAB()));
                System.out.println("Vértice CD: " + Math.round(Triangulo.verticeCD()));
                System.out.println("Vértice EF: " + Math.round(Triangulo.verticeEF()));
                System.out.println("-------------------------------------------");
                System.out.println("El triángulo es de tipo: " + Triangulo.muestraTipo());
                System.out.println("-------------------------------------------");
                System.out.println("Su área es: " + Triangulo.calculaArea());
                System.out.println("Su perímetro es: " + Triangulo.calculaPerimetro());

                contFig += 1;

            } else {

                if (opc.equalsIgnoreCase("B")) {

                    System.out.print("Ingrese las coordenadas de A [x,y]: ");

                    String crdA = leer.nextLine();
                    String[] lugarA = crdA.split(",");

                    int crdAx = Integer.parseInt(lugarA[0]);
                    int crdAy = Integer.parseInt(lugarA[1]);

                    System.out.print("Ingrese las coordenadas de B [x,y]: ");

                    String crdB = leer.nextLine();
                    String[] lugarB = crdB.split(",");

                    int crdBx = Integer.parseInt(lugarB[0]);
                    int crdBy = Integer.parseInt(lugarB[1]);

                    System.out.print("Ingrese las coordenadas de C [x,y]: ");

                    String crdC = leer.nextLine();
                    String[] lugarC = crdC.split(",");

                    int crdCx = Integer.parseInt(lugarC[0]);
                    int crdCy = Integer.parseInt(lugarC[1]);

                    System.out.print("Ingrese las coordenadas de D [x,y]: ");

                    String crdD = leer.nextLine();
                    String[] lugarD = crdD.split(",");

                    int crdDx = Integer.parseInt(lugarD[0]);
                    int crdDy = Integer.parseInt(lugarD[1]);

                    Procesar4p Cuadrilatero = new Procesar4p(crdAx, crdAy, crdBx, crdBy, crdCx, crdCy, crdDx, crdDy);

                    System.out.println("-------------------------------------------");
                    System.out.println("Vértice AB: " + Math.round(Cuadrilatero.verticeAB()));
                    System.out.println("Vértice BC: " + Math.round(Cuadrilatero.verticeBC()));
                    System.out.println("Vértice CD: " + Math.round(Cuadrilatero.verticeCD()));
                    System.out.println("Vértice DA: " + Math.round(Cuadrilatero.verticeDA()));
                    System.out.println("-------------------------------------------");
//                    System.out.println("El cuadrilátero es de tipo: " + Cuadrilatero.muestraTipo());

                    contFig += 1;

                } else {

                    if (opc.equalsIgnoreCase("C")) {
                        System.out.println("Gracias por usar la aplicación.");
                        System.out.println("");
                        System.out.println("Cantidad de figuras ingresadas: " + contFig);
                        System.out.println("-------------------------------------------");
                        break;
                    }
                }
            }
        }
    }
}
