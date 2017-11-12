package main;

import java.util.Scanner;

/**
 *
 * @Autor Jorge A
 *
 */
public class Main {

    public static void main(String[] args) {

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
                System.out.println("-------------------------------");
                System.out.print("Ingrese las coordenadas de A: ");
                System.out.println("-------------------------------");

                String crdA = leer.nextLine();
                String[] lugarA = crdA.split(",");

                int crdAx = Integer.parseInt(lugarA[0]);
                int crdAy = Integer.parseInt(lugarA[1]);
                
                System.out.println("--------------------------------");
                System.out.print("Ingrese las coordenadas de B: ");
                System.out.println("--------------------------------");

                String crdB = leer.nextLine();
                String[] lugarB = crdB.split(",");

                int crdBx = Integer.parseInt(lugarB[0]);
                int crdBy = Integer.parseInt(lugarB[1]);
                
                System.out.println("---------------------------------");
                System.out.print("Ingrese las coordenadas de C: ");
                System.out.println("---------------------------------");

                String crdC = leer.nextLine();
                String[] lugarC = crdC.split(",");

                int crdCx = Integer.parseInt(lugarC[0]);
                int crdCy = Integer.parseInt(lugarC[1]);

            } else {

                if (opc.equalsIgnoreCase("B")) {
                      
                    System.out.print("Ingrese las coordenadas de A: ");
                    System.out.println("-------------------------------");

                    String crdA = leer.nextLine();
                    String[] lugarA = crdA.split(",");

                    int crdAx = Integer.parseInt(lugarA[0]);
                    int crdAy = Integer.parseInt(lugarA[1]);
                    
                    System.out.println("-------------------------------");
                    System.out.print("Ingrese las coordenadas de B: ");
                    System.out.println("-------------------------------");

                    String crdB = leer.nextLine();
                    String[] lugarB = crdB.split(",");

                    int crdBx = Integer.parseInt(lugarB[0]);
                    int crdBy = Integer.parseInt(lugarB[1]);
                    
                    System.out.println("------------------------------");
                    System.out.print("Ingrese las coordenadas de C: ");
                    System.out.println("-------------------------------");

                    String crdC = leer.nextLine();
                    String[] lugarC = crdC.split(",");

                    int crdCx = Integer.parseInt(lugarC[0]);
                    int crdCy = Integer.parseInt(lugarC[1]);
                    
                    System.out.println("------------------------------");
                    System.out.print("Ingrese las coordenadas de D: ");
                    System.out.println("------------------------------");

                    String crdD = leer.nextLine();
                    String[] lugarD = crdD.split(",");

                    int crdDx = Integer.parseInt(lugarD[0]);
                    int crdDy = Integer.parseInt(lugarD[1]);

                } else {

                    if (opc.equalsIgnoreCase("C")) {
                        System.out.println("Gracias por usar la aplicación.");
                        System.out.println("-------------------------------------------");
                        System.out.println("Cantidad de figuras ingresadas: ");
                        System.out.println("-------------------------------------------");
                        break;
                    }
                }
            }
        }
    }
}
