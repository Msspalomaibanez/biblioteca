/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import entidades.*;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Biblioteca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        /**
         * MENÚ
         * 
         * int opcion = 1;
         * Scanner in = new Scanner (System.in);
         * 
         * do {
         * 
         * mostrarMenuPrincipal();
         * opcion = in.nextInt();
         * 
         * if (opcion  < 0 || opcion > 3){
         * System.out.println("Opción incorrecta!");
         * continue;
         * 
         * }
         * 
         * switch (opcion){
         * 
         * case 1: // se ha pulsado la opcion Gestion de Socios
         * break;
         * 
         * case 2: // se ha pulsado la opcion Gestion de Elementos
         * break;
         * 
         * case 3: // se ha pulsado la opcion Gestion de Eventos
         * break;
         * 
         * case 0: // se ha pulsado salir
         * continue;
         * 
         * default: // opcion incorrecta
         * 
         * }
         * 
         * opcion = -1;
         * 
         * } while (opcion < 0 || opcion > 3);
         * 
         * 
         * private static void mostrarMenuPrincipal() {
         * 
         * System.out.println ("Pulse 1 para Gestionar los Socios");
         * System.out.println ("Pulse 2 para Gestionar los Elementos");
         * System.out.println ("Pulse 3 para Gestionar los Eventos");
         * System.out.println ("Pulse 0 para salir");
         * 
         * 
         * }
         * 
         */

        Socio socio1 = Socio.nuevoSocio();
        Scanner in = new Scanner(System.in);
        char opcion = '-';

        do {
            System.out.println("¿El socio tiene alguna penalización? (S/N)");
            opcion = in.nextLine().charAt(0);
            if (opcion == 'N' || opcion == 'n') {
                break;
            } else if (opcion == 'S' || opcion == 's') {
                socio1.setPenalizacion(true);
                Penalizacion penalizacion = Penalizacion.nuevaPenalizacion();
            }
        } while (opcion != 'N' && opcion != 'S' && opcion != 'n' && opcion != 's');

        do {
            System.out.println("¿Va a solicitar un préstamo? (S/N)");
            opcion = in.nextLine().charAt(0);

            if (opcion == 'N' || opcion == 'n') {
                break;
            } else if (opcion == 'S' || opcion == 's') {
                System.out.println("Espere a ser atendido");
                Prestamo prestamo = Prestamo.nuevoPrestamo();
                socio1.getPrestamos().add(prestamo);

            }

        } while (opcion != 'N' && opcion != 'S' && opcion != 'n' && opcion != 's');

    }
}
