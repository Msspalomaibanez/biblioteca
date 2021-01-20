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
public class Genero {
    
    private int id;
    private String nombre;
    
    public Genero() {
    }
    
    public Genero(Genero g) {
        this.id = g.id;
        this.nombre = g.nombre;
    }
    
    public Genero(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public static Genero nuevoGenero() {
        Genero gnr = new Genero();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del nuevo genero:");
        gnr.setNombre(in.nextLine());
        
        return gnr;
    }
    
}
