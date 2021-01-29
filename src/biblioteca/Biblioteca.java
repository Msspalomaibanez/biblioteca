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
        // Lo primero que haremos será cargar todos nuestros datos desde los arrays de la clase Utilidades

        ArrayList<Socio> socios = Socio.convertir(Utilidades.SOCIOS);
        ArrayList<Elemento> elementos = Elemento.convertir(Utilidades.ELEMENTOS);
        ArrayList<Evento> eventos = Evento.convertir(Utilidades.EVENTOS);

        /**
         * MENÚ
         *
         */
        int opcion1 = -1;
        int opcion2 = -1;
        Scanner in = new Scanner(System.in);

        do {

            mostrarMenuPrincipal();
            opcion1 = in.nextInt();

            if (opcion1 < 0 || opcion1 > 3) {
                System.out.println("Opción incorrecta!");
                continue;

            }

            switch (opcion1) {

                case 1: // se ha pulsado la opcion Gestion de Socios

                    System.out.println("\n Se ha pulsado la Gestión de Socios");

                    do {

                        mostrarMenuSocios();
                        in = new Scanner(System.in, "ISO-8859-1");
                        opcion2 = in.nextInt();

                        if (opcion2 < 0 || opcion2 > 4) {
                            System.out.println("Opción incorrecta");
                            continue;
                        }

                        gestionSocios(opcion2, socios);

                    } while (opcion2 != 0);

                    break;

                case 2: // se ha pulsado la opcion Gestion de Elementos
                    break;

                case 3: // se ha pulsado la opcion Gestion de Eventos
                    break;

                case 0: // se ha pulsado salir
                    continue;

                default: // opcion incorrecta

            }

            opcion1 = -1;

        } while (opcion1 < 0 || opcion1 > 3);

    }

    private static void mostrarMenuPrincipal() {

        System.out.println(" - - - - - MENÚ PRINCIPAL - - - - - ");
        System.out.println("Pulse 1 para Gestionar los Socios");
        System.out.println("Pulse 2 para Gestionar los Elementos");
        System.out.println("Pulse 3 para Gestionar los Eventos");
        System.out.println("Pulse 0 para salir");
    }

    private static void mostrarMenuSocios() {

        System.out.println(" - - - - - MENÚ SOCIOS - - - - - ");
        System.out.println("Pulse 1 para Ver la lista de Socios");
        System.out.println("Pulse 2 para Crear un nuevo Socio");
        System.out.println("Pulse 3 para Buscar un Socio");
        System.out.println("Pulse 0 para salir");
    }

    private static void mostrarMenuElementos() {

        System.out.println(" - - - - - MENÚ ELEMENTOS - - - - - ");
        System.out.println("Pulse 1 para Ver la lista de Elementos");
        System.out.println("Pulse 2 para Crear un nuevo Elemento");
        System.out.println("Pulse 3 para Buscar un Elemento");
        System.out.println("Pulse 4 para Hacer un Préstamo");
        System.out.println("Pulse 0 para salir");
    }

    private static void mostrarMenuEvento() {

        System.out.println(" - - - - - MENÚ EVENTOS - - - - - ");
        System.out.println("Pulse 1 para Ver la lista de Eventos");
        System.out.println("Pulse 2 para Crear un nuevo Evento");
        System.out.println("Pulse 3 para Buscar un Evento");
        System.out.println("Pulse 4 para Participar en un Evento");
        System.out.println("Pulse 0 para salir");
    }

    private static void gestionSocios(int opcion1, ArrayList<Socio> socios) {

        Scanner in;
        long idSocio;
        Socio s;

        switch (opcion1) {

            case 1:

                System.out.println("Ha pulsado ver la lista de los Socios");
                Socio.verSocio(socios);

                System.out.println("Por favor introduzca el id del socio o pulse 0 para volver: ");
                in = new Scanner(System.in, "ISO-8859-1");
                idSocio = in.nextLong();

                if (idSocio != 0) {
                    s = Socio.buscarSocioPorId(idSocio, socios);

                    if (s != null) {

                        s.verDatosSocioCompleto();

                    } else {

                        System.out.println("El socio con el id " + idSocio + "no se encuentra en el sistema");
                    }

                }
                break;

            case 2:

                System.out.println("Ha pulsado crear un nuevo Socio");

        }

    }

    /**
     * *
     * Socio socio1 = Socio.nuevoSocio(); Scanner in = new Scanner(System.in);
     * char opcion = '-';
     *
     * do { System.out.println("¿El socio tiene alguna penalización? (S/N)");
     * opcion = in.nextLine().charAt(0); if (opcion == 'N' || opcion == 'n') {
     * break; } else if (opcion == 'S' || opcion == 's') {
     * socio1.setPenalizacion(true); Penalizacion penalizacion =
     * Penalizacion.nuevaPenalizacion(); } } while (opcion != 'N' && opcion !=
     * 'S' && opcion != 'n' && opcion != 's');
     *
     * do { System.out.println("¿Va a solicitar un préstamo? (S/N)"); opcion =
     * in.nextLine().charAt(0);
     *
     * if (opcion == 'N' || opcion == 'n') { break; } else if (opcion == 'S' ||
     * opcion == 's') { System.out.println("Espere a ser atendido"); Prestamo
     * prestamo = Prestamo.nuevoPrestamo(); socio1.getPrestamos().add(prestamo);
     *
     * }
     *
     * } while (opcion != 'N' && opcion != 'S' && opcion != 'n' && opcion !=
     * 's');
     */
}
