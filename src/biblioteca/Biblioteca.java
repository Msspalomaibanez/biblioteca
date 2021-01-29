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
                    System.out.println("\n Se ha pulsado la Gestión de Elementos");

                    do {

                        mostrarMenuElementos();
                        in = new Scanner(System.in, "ISO-8859-1");
                        opcion2 = in.nextInt();

                        if (opcion2 < 0 || opcion2 > 4) {
                            System.out.println("Opción incorrecta");
                            continue;
                        }

                        gestionElementos(opcion2, elementos);

                    } while (opcion2 != 0);

                    break;

                case 3: // se ha pulsado la opcion Gestion de Eventos
                    System.out.println("\n Se ha pulsado la Gestión de Eventos");

                    do {

                        mostrarMenuEvento();
                        in = new Scanner(System.in, "ISO-8859-1");
                        opcion2 = in.nextInt();

                        if (opcion2 < 0 || opcion2 > 4) {
                            System.out.println("Opción incorrecta");
                            continue;
                        }

                        gestionEventos(opcion2, eventos);

                    } while (opcion2 != 0);

                    break;

                case 0: // se ha pulsado salir
                    System.out.println("Ha pulsado Salir.");
                    break;

                default: // opcion incorrecta

                    System.out.println("Opción incorrecta");
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

                break;

            case 2:

                System.out.println("Ha pulsado crear un nuevo Socio");

                Socio nuevoSocio = Socio.nuevoSocio();
                socios.add(nuevoSocio);

                System.out.println("Socio con nombre " + nuevoSocio.getNombre() + " " + nuevoSocio.getApellidos() + " insertado correctamente.");

            case 3:
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
        }

    }

    private static void gestionElementos(int opcion1, ArrayList<Elemento> elementos) {

        Scanner in;
        int idElemento;
        Elemento e;

        switch (opcion1) {

            case 1:

                System.out.println("Ha pulsado ver la lista de los Elementos");
                Elemento.verElemento(elementos);

                System.out.println("Por favor introduzca el id del elemento o pulse 0 para volver: ");
                in = new Scanner(System.in, "ISO-8859-1");
                idElemento = in.nextInt();

                if (idElemento != 0) {
                    e = Elemento.buscarElementoPorId(idElemento, elementos);

                    if (e != null) {
                        e.verDatosElementoCompleto();
                    } else {

                        System.out.println("El elemento con el id " + idElemento + "no se encuentra en el sistema");
                    }

                }
                break;

            case 2:

                System.out.println("Ha pulsado crear un nuevo Elemento");

        }

    }

    private static void gestionEventos(int opcion3, ArrayList<Evento> eventos) {

        Scanner in;
        long idEvento;
        Evento ev;

        switch (opcion3) {

            case 1:

                System.out.println("Ha pulsado ver la lista de los Eventos");
                Evento.verEvento(eventos);

                System.out.println("Por favor introduzca el id del evento o pulse 0 para volver: ");
                in = new Scanner(System.in, "ISO-8859-1");
                idEvento = in.nextLong();

                if (idEvento != 0) {
                    ev = Evento.buscarEventoById(idEvento, eventos);
                    if (ev != null) {

                        ev.verDatosEventoCompleto();

                    } else {

                        System.out.println("El evento con el id " + idEvento + "no se encuentra en el sistema");
                    }

                }
                break;

            case 2:

                System.out.println("Ha pulsado crear un nuevo Evento");

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
