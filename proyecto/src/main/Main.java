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
        int crdAx, crdAy, crdBx, crdBy, crdCx, crdCy, crdDx, crdDy, vecTra, vecTrb;
        int contEqui = 0, contIsos = 0, contEsca = 0;
        int contCuad = 0, contRect = 0, contRomb = 0, contRmid = 0;
        int contTrap = 0, contTrpz = 0;

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

                if (Triangulo.muestraTipo().equals("Equilátero.")) {
                    contEqui += 1;
                } else if (Triangulo.muestraTipo().equals("Isosceles.")) {
                    contIsos += 1;
                } else if (Triangulo.muestraTipo().equals("Escaleno.")) {
                    contEsca += 1;
                }

                System.out.println("-------------------------------------------");
                System.out.println("Traslación de Figura");
                System.out.println("-------------------------------------------");

                while (true) {
                    try {
                        System.out.print("Ingrese el vector de traslación [x,y]: ");

                        String t = leer.nextLine();
                        String[] lugarT = t.split(",");

                        vecTra = Integer.parseInt(lugarT[0]);
                        vecTrb = Integer.parseInt(lugarT[1]);

                        break;

                    } catch (Exception e) {
                        System.out.println("Error en el ingreso, reintente.");
                        contErr += 1;
                        continue;
                    }
                }

                int trasAx = (vecTra + crdAx);
                int trasAy = (vecTrb + crdAy);
                int trasBx = (vecTra + crdBx);
                int trasBy = (vecTrb + crdBy);
                int trasCx = (vecTra + crdCx);
                int trasCy = (vecTrb + crdBy);

                Procesar3p TrianguloT = new Procesar3p(trasAx, trasAy, trasBx, trasBy, trasCx, trasCy);

                System.out.println("-------------------------------------------");
                System.out.println("Vértice AB: " + Math.round(TrianguloT.verticeAB()));
                System.out.println("Vértice CD: " + Math.round(TrianguloT.verticeCD()));
                System.out.println("Vértice EF: " + Math.round(TrianguloT.verticeEF()));

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
                    System.out.println("-------------------------------------------");

                    contFig += 1;

                    if (Cuadrilatero.muestraTipo().equals("Rombo.")) {
                        System.out.println("Su área es: " + Cuadrilatero.areaRombo());
                        System.out.println("Su perímetro es: " + Cuadrilatero.perimetroRombo());
                        contEqui += 1;
                    } else if (Cuadrilatero.muestraTipo().equals("Cuadrado.")) {
                        System.out.println("Su área es: " + Cuadrilatero.areaCuadrado());
                        System.out.println("Su perímetro es: " + Cuadrilatero.perimetroCuadrado());
                        contCuad += 1;
                    } else if (Cuadrilatero.muestraTipo().equals("Rectángulo.")) {
                        System.out.println("Su área es: " + Cuadrilatero.areaRectangulo());
                        System.out.println("Su perímetro es: " + Cuadrilatero.perimetroRectangulo());
                        contRect += 1;
                    } else if (Cuadrilatero.muestraTipo().equals("Trapecio.")) {
                        contTrap += 1;
                    } else if (Cuadrilatero.muestraTipo().equals("Romboide.")) {
                        contRmid += 1;
                    } else if (Cuadrilatero.muestraTipo().equals("Trapezoide.")) {
                        contTrpz += 1;
                    }

                    System.out.println("-------------------------------------------");
                    System.out.println("Traslación de Figura");
                    System.out.println("-------------------------------------------");

                    while (true) {
                        try {
                            System.out.print("Ingrese el vector de traslación [x,y]: ");

                            String t = leer.nextLine();
                            String[] lugarT = t.split(",");

                            vecTra = Integer.parseInt(lugarT[0]);
                            vecTrb = Integer.parseInt(lugarT[1]);

                            break;

                        } catch (Exception e) {
                            System.out.println("Error en el ingreso, reintente.");
                            contErr += 1;
                        }
                    }

                    int trasAx = (vecTra + crdAx);
                    int trasAy = (vecTrb + crdAy);
                    int trasBx = (vecTra + crdBx);
                    int trasBy = (vecTrb + crdBy);
                    int trasCx = (vecTra + crdCx);
                    int trasCy = (vecTrb + crdBy);
                    int trasDx = (vecTra + crdDx);
                    int trasDy = (vecTrb + crdDy);

                    Procesar4p CuadrilateroT = new Procesar4p(trasAx, trasAy, trasBx, trasBy, trasCx, trasCy, trasDx, trasDy);

                    System.out.println("-------------------------------------------");
                    System.out.println("Vértice AB: " + Math.round(CuadrilateroT.verticeAB()));
                    System.out.println("Vértice BC: " + Math.round(CuadrilateroT.verticeBC()));
                    System.out.println("Vértice CD: " + Math.round(CuadrilateroT.verticeCD()));
                    System.out.println("Vértice DA: " + Math.round(CuadrilateroT.verticeDA()));

                } else {

                    if (opc.equalsIgnoreCase("C")) {
                        System.out.println("");
                        System.out.println("Gracias por usar la aplicación.");
                        System.out.println("-------------------------------------------");
                        System.out.println("Cantidad total de figuras ingresadas: " + contFig);
                        System.out.println("-------------------------------------------");
                        System.out.println("Cantidad de Triángulos Equiláteros: " + contEqui);
                        System.out.println("Cantidad de Triángulos Isósceles: " + contIsos);
                        System.out.println("Cantidad de Triángulos Escalenos: " + contEsca);
                        System.out.println("-------------------------------------------");
                        System.out.println("Cantidad de Cuadrados: " + contCuad);
                        System.out.println("Cantidad de Rectángulos: " + contRect);
                        System.out.println("Cantidad de Rombos: " + contRomb);
                        System.out.println("Cantidad de Romboides: " + contRmid);
                        System.out.println("-------------------------------------------");
                        System.out.println("Cantidad de Trapecios: " + contTrap);
                        System.out.println("Cantidad de Trapezoides: " + contTrpz);
                        System.out.println("-------------------------------------------");
                        System.out.println("Cantidad de errores en ingreso: " + contErr);
                        System.out.println("-------------------------------------------");
                        break;
                    }
                }
            }
        }
    }
}
