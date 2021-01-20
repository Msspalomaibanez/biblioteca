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
        DVD dvd = new DVD();
        Scanner in = new Scanner(System.in);
        Genero genero = Genero.nuevoGenero();
        
        System.out.println("Introduce el título del nuevo DVD:");
        dvd.setTitulo(in.nextLine());
        
        return dvd;
    }
    
}
