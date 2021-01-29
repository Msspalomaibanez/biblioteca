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

        System.out.println("Introduce el nombre del nuevo género:");
        gnr.setNombre(in.nextLine());

        return gnr;
    }

    
      /**
     * Se trata de una función que convierte un arra de objetos tipo Genero
     * en un ArrayList de objetos de tipo Genero con los mismos elementos del 
     * array
     * @param array de Generos
     * @return ArrayList de Generos
     */
    
        public static final ArrayList<Genero> convertir(Genero[] array) {
        ArrayList<Genero> ret = new ArrayList<Genero>();
        for (Genero g : array) {
            ret.add((Genero) g);
        }
        return ret;
    }
        
        
}
