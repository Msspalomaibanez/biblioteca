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
public class DVD extends Elemento {

    private String titulo;

    public DVD() {
        super();
    }

    public DVD(Elemento e, String titulo) {
        super(e);
        this.titulo = titulo;
    }

    public DVD(int id, Genero genero, String titulo) {
        super(id, genero);
        this.titulo = titulo;
    }

    public DVD(int id, String titulo) {
        super(id);
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public static DVD nuevoDVD() {
        Elemento e = Elemento.nuevoElemento();
        Scanner in = new Scanner(System.in, "ISO-8859-1");

        System.out.println("Introduce el título del nuevo DVD:");
        in = new Scanner(System.in, "ISO-8859-1");
        String tit = in.nextLine();
        if (tit.isEmpty() || tit.length() < 2 || tit.length() > 150) {
            do {
                System.out.println("Has introducido un título no válido");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO-8859-1");
                tit = in.nextLine();
            } while (tit.isEmpty() || tit.length() < 2 || tit.length() > 150);
        }

        DVD dvd = new DVD(e, tit);
        return dvd;
    }
    
}
