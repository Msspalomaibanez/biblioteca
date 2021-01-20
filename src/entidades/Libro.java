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
    
    public Libro (Elemento e, String nombre, String editorial, String autor, String pagina) {
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
        Libro lbr = new Libro();
        Scanner in = new Scanner(System.in);
        Genero genero = Genero.nuevoGenero();
        
        System.out.println("Introduce el nombre del nuevo libro:");
        lbr.setNombre(in.nextLine());
        System.out.println("Introduce la editorial del nuevo libro:");
        lbr.setEditorial(in.nextLine());
        System.out.println("Introduce el autor del nuevo libro:");
        lbr.setAutor(in.nextLine());
        System.out.println("Introduce el número de páginas del nuevo libro:");
        lbr.setPagina(in.nextLine());
        
        return lbr;
    }
    
}
