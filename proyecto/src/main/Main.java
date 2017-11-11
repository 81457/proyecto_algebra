package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import figura.*;

/**
 *
 * @Autor Jorge A
 *
 */

public class Main {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        List<Figura> figuras = new ArrayList<>();

        System.out.println("-------------------------------------------");
        System.out.println("Software de Álgebra");
        System.out.println("-------------------------------------------");
        System.out.println("¿Cuántos puntos desea ingresar?");
        System.out.println("-------------------------------------------");
        System.out.println("Ingrese su opción: ");
        byte opusr = Byte.parseByte(leer.nextLine());

        if (opusr == 3) {
            System.out.println("Ingrese las coordenadas de A: ");

            String crdA = leer.nextLine();
            String[] lugarA = crdA.split(",");

            int crdAx = Integer.parseInt(lugarA[0]);
            int crdAy = Integer.parseInt(lugarA[1]);

            System.out.println("Ingrese las coordenadas de B: ");

            String crdB = leer.nextLine();
            String[] lugarB = crdB.split(",");

            int crdBx = Integer.parseInt(lugarB[0]);
            int crdBy = Integer.parseInt(lugarB[1]);

            System.out.println("Ingrese las coordenadas de C: ");

            String crdC = leer.nextLine();
            String[] lugarC = crdC.split(",");

            int crdCx = Integer.parseInt(lugarC[0]);
            int crdCy = Integer.parseInt(lugarC[1]);

        } else {

            if (opusr == 4) {
                System.out.println("Ingrese las coordenadas de A: ");

                String crdA = leer.nextLine();
                String[] lugarA = crdA.split(",");

                int crdAx = Integer.parseInt(lugarA[0]);
                int crdAy = Integer.parseInt(lugarA[1]);

                System.out.println("Ingrese las coordenadas de B: ");

                String crdB = leer.nextLine();
                String[] lugarB = crdB.split(",");

                int crdBx = Integer.parseInt(lugarB[0]);
                int crdBy = Integer.parseInt(lugarB[1]);

                System.out.println("Ingrese las coordenadas de C: ");

                String crdC = leer.nextLine();
                String[] lugarC = crdC.split(",");

                int crdCx = Integer.parseInt(lugarC[0]);
                int crdCy = Integer.parseInt(lugarC[1]);

                System.out.println("Ingrese las coordenadas de D: ");

                String crdD = leer.nextLine();
                String[] lugarD = crdD.split(",");

                int crdDx = Integer.parseInt(lugarD[0]);
                int crdDy = Integer.parseInt(lugarD[1]);

            }
        }
    }
}
