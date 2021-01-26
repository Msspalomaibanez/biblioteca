/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

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
}
