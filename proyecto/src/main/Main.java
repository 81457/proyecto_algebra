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
        byte contErr = 0;
        int crdAx, crdAy, crdBx, crdBy, crdCx, crdCy, crdDx, crdDy, vecTra;

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
            System.out.print("Ingrese su opción: ");
            String opc = leer.nextLine();
            System.out.println("-------------------------------------------");

            if (opc.equalsIgnoreCase("A")) {

                while (true) {
                    try {
                        System.out.print("Ingrese las coordenadas de A [x,y]: ");

                        String crdA = leer.nextLine();
                        String[] lugarA = crdA.split(",");

                        crdAx = Integer.parseInt(lugarA[0]);
                        crdAy = Integer.parseInt(lugarA[1]);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error en el ingreso, reintente.");
                        contErr += 1;
                    }
                }

                while (true) {
                    try {
                        System.out.print("Ingrese las coordenadas de B [x,y]: ");

                        String crdB = leer.nextLine();
                        String[] lugarB = crdB.split(",");

                        crdBx = Integer.parseInt(lugarB[0]);
                        crdBy = Integer.parseInt(lugarB[1]);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error en el ingreso, reintente.");
                        contErr += 1;
                    }
                }

                while (true) {
                    try {
                        System.out.print("Ingrese las coordenadas de C [x,y]: ");

                        String crdC = leer.nextLine();
                        String[] lugarC = crdC.split(",");

                        crdCx = Integer.parseInt(lugarC[0]);
                        crdCy = Integer.parseInt(lugarC[1]);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error en el ingreso, reintente.");
                        contErr += 1;
                    }
                }

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

                System.out.println("-------------------------------------------");
                System.out.println("Traslación de Figura");
                System.out.println("-------------------------------------------");

                while (true) {
                    try {
                        System.out.print("Ingrese el vector de traslación [x,y]: ");

                        String t = leer.nextLine();
                        String[] lugarT = t.split(",");

                        vecTra = Integer.parseInt(lugarT[0]);
                        vecTra = Integer.parseInt(lugarT[1]);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error en el ingreso, reintente.");
                        contErr += 1;
                        continue;
                    }
                }

            } else {

                if (opc.equalsIgnoreCase("B")) {

                    while (true) {
                        try {
                            System.out.print("Ingrese las coordenadas de A [x,y]: ");

                            String crdA = leer.nextLine();
                            String[] lugarA = crdA.split(",");

                            crdAx = Integer.parseInt(lugarA[0]);
                            crdAy = Integer.parseInt(lugarA[1]);

                            break;

                        } catch (Exception e) {
                            System.out.println("Error en el ingreso, reintente.");
                            contErr += 1;
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese las coordenadas de B [x,y]: ");

                            String crdB = leer.nextLine();
                            String[] lugarB = crdB.split(",");

                            crdBx = Integer.parseInt(lugarB[0]);
                            crdBy = Integer.parseInt(lugarB[1]);

                            break;

                        } catch (Exception e) {
                            System.out.println("Error en el ingreso, reintente.");
                            contErr += 1;
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese las coordenadas de C [x,y]: ");

                            String crdC = leer.nextLine();
                            String[] lugarC = crdC.split(",");

                            crdCx = Integer.parseInt(lugarC[0]);
                            crdCy = Integer.parseInt(lugarC[1]);

                            break;

                        } catch (Exception e) {
                            System.out.println("Error en el ingreso, reintente.");
                            contErr += 1;
                        }
                    }

                    while (true) {
                        try {
                            System.out.print("Ingrese las coordenadas de D [x,y]: ");

                            String crdD = leer.nextLine();
                            String[] lugarD = crdD.split(",");

                            crdDx = Integer.parseInt(lugarD[0]);
                            crdDy = Integer.parseInt(lugarD[1]);

                            break;

                        } catch (Exception e) {
                            System.out.println("Error en el ingreso, reintente.");
                            contErr += 1;
                        }
                    }

                    Procesar4p Cuadrilatero = new Procesar4p(crdAx, crdAy, crdBx, crdBy, crdCx, crdCy, crdDx, crdDy);

                    System.out.println("-------------------------------------------");
                    System.out.println("Vértice AB: " + Math.round(Cuadrilatero.verticeAB()));
                    System.out.println("Vértice BC: " + Math.round(Cuadrilatero.verticeBC()));
                    System.out.println("Vértice CD: " + Math.round(Cuadrilatero.verticeCD()));
                    System.out.println("Vértice DA: " + Math.round(Cuadrilatero.verticeDA()));
                    System.out.println("-------------------------------------------");
                    System.out.println("El cuadrilátero es de tipo: " + Cuadrilatero.muestraTipo());

                    contFig += 1;

                    System.out.println("-------------------------------------------");
                    System.out.println("Traslación de Figura");
                    System.out.println("-------------------------------------------");

                    while (true) {
                        try {
                            System.out.print("Ingrese el vector de traslación [x,y]: ");

                            String t = leer.nextLine();
                            String[] lugarT = t.split(",");

                            vecTra = Integer.parseInt(lugarT[0]);
                            vecTra = Integer.parseInt(lugarT[1]);

                            break;

                        } catch (Exception e) {
                            System.out.println("Error en el ingreso, reintente.");
                            contErr += 1;
                        }
                    }

                } else {

                    if (opc.equalsIgnoreCase("C")) {
                        System.out.println("");
                        System.out.println("Gracias por usar la aplicación.");
                        System.out.println("");
                        System.out.println("Cantidad de figuras ingresadas: " + contFig);
                        System.out.println("Cantidad de errores en ingreso: " + contErr);
                        System.out.println("-------------------------------------------");
                        break;
                    }
                }
            }
        }
    }
}
