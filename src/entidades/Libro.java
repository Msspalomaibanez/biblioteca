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
public class Libro extends Elemento {

    private String nombre;
    private String editorial;
    private String autor;
    private String pagina;

    public Libro() {
        super();
    }

    public Libro(Elemento e, String nombre, String editorial, String autor, String pagina) {
        super(e);
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.pagina = pagina;
    }

    public Libro(int id, Genero genero, String nombre, String editorial, String autor, String pagina) {
        super(id, genero);
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.pagina = pagina;
    }

    public Libro(int id, String nombre, String editorial, String autor, String pagina) {
        super(id);
        this.nombre = nombre;
        this.editorial = editorial;
        this.autor = autor;
        this.pagina = pagina;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getPagina() {
        return pagina;
    }

    public void setPagina(String pagina) {
        this.pagina = pagina;
    }

    public static Libro nuevoLibro() {
        Elemento e = new Elemento();
        Scanner in = new Scanner(System.in,"ISO-8859-1");
        
        System.out.println("Introduce el nombre del nuevo libro.");
        String nmb = in.nextLine();
        if (nmb.isEmpty() || nmb.length() < 2 || nmb.length() > 150) {
            do {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO 8859-1");
                nmb = in.nextLine();
            } while (nmb.isEmpty() || nmb.length() < 2 || nmb.length() > 150);
        }
        System.out.println("Introduce la editorial del nuevo libro.");
        String edt = in.nextLine();
        if (edt.isEmpty() || edt.length() < 2 || edt.length() > 150) {
            do {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO 8859-1");
                edt = in.nextLine();
            } while (edt.isEmpty() || edt.length() < 2 || edt.length() > 150);
        }
        System.out.println("Introduce el autor del nuevo libro.");
        String aut = in.nextLine();
        if (aut.isEmpty() || aut.length() < 2 || aut.length() > 150) {
            do {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO 8859-1");
                aut = in.nextLine();
            } while (aut.isEmpty());
        }
        System.out.println("Introduce el número de páginas del nuevo libro");
        String pag = in.nextLine();
        if (pag.isEmpty()) {
            do {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO 8859-1");
                pag = in.nextLine();
            } while (pag.isEmpty());
        }

        Libro lbr = new Libro(e,nmb,edt,aut,pag);
        return lbr;
    }

}
