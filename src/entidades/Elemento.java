/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author USUARIO
 */
public class Elemento {

    protected int id;
    protected Genero genero;

    public Elemento() {
    }

    public Elemento(Elemento e) {
        this.id = e.id;
        this.genero = e.genero;
    }

    public Elemento(int id, Genero genero) {
        this.id = id;
        this.genero = genero;
    }

    public Elemento(int id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public static Elemento nuevoElemento() {
        Elemento elm = new Elemento();
        Scanner in = new Scanner(System.in);
        char opcion = '-';

        Genero genero = Genero.nuevoGenero();

        do {
            System.out.println("Si quiere añadir un libro pulsa 'L' y si quiere añadir un nuevo DVD pulsa 'D'.");
            opcion = in.nextLine().charAt(0);
            if (opcion == 'L' || opcion == 'l') {
                Libro libro = Libro.nuevoLibro();
            } else if (opcion == 'D' || opcion == 'd') {
                DVD dvd = DVD.nuevoDVD();
            }
        } while (opcion != 'L' && opcion != 'l' && opcion != 'D' && opcion != 'd');

        return elm;
    }

    public static long nextIdElemento() {
        long ret = 0;
        for (Elemento e : Utilidades.ELEMENTOS) {
            if (e.getId() > ret) {
                ret = e.getId();
            }
        }
        return ret + 1;
    }

    public static void verElemento(ArrayList<Elemento> elementos) {
        System.out.println("El programa tiene almacenados los siguientes elementos: ");
        for (Elemento e : elementos) {
            System.out.println(e.getId() + ":" + e.getClass().getSimpleName());
        }
    }

    public static void buscarElementos(ArrayList<Elemento> elementos) {
        Elemento buscado;
        ArrayList<Elemento> encontrados;
        Scanner in;
        int opcion = -1;
        do {
            buscado = null;
            encontrados = new ArrayList<Elemento>();
            in = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Pulse 1 para buscar elemento por ID.");
            System.out.println("Pulse 0 para VOLVER.");
            opcion = in.nextInt();
            if (opcion < 0 || opcion > 1) {
                System.out.println("Opción incorrecta.");
                continue;
            }
            in = new Scanner(System.in, "ISO-8859-1");
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduzca el ID del elemento a encontrar:");
                    int idEle = in.nextInt();
                    buscado = Elemento.buscarElementoPorId(idEle, elementos);
                    if (buscado != null) {
                        System.out.println("Empleado encontrado: ");
                        System.out.println(buscado.getId() + ". " + buscado.getClass().getSimpleName());
                    }
                default:
                    break;
            }
        } while (opcion != 0);
    }

    public static Elemento buscarElementoPorId(int idElemento, ArrayList<Elemento> elementos) {
        Elemento ret = null;
        for (Elemento e : elementos) {
            if (e.getId() == idElemento) {
                ret = e;
                break;
            }
        }
        return ret;
    }
    
    /**
     * Se trata de una función que convierte un arra de objetos tipo Elemento
     * en un ArrayList de objetos de tipo Elementos con los mismos elementos del 
     * array
     * @param array de Elementos
     * @return ArrayList de Elementos
     */
    
        public static final ArrayList<Elemento> convertir(Elemento[] array) {
        ArrayList<Elemento> ret = new ArrayList<Elemento>();
        for (Elemento e : array) {
            ret.add((Elemento) e);
        }
        return ret;
    }
          
        
}
