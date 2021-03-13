/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Rim
 */
public class Lectura extends Evento {

    /**
     * attributo: libro 
     * tipo de dato: String 
     * los valores validos: mayor de dos caracteres 
     * los valores invalidos: no puede ser null o Empty =="" o menos de dos caracteres 
     * restricciones: el valor introducido debera ser cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto: Null
     */
    private String libro;

    /*constructor por defecto*/
    public Lectura() {
        super();
    }

    //constructor con los atributos de subclase
    public Lectura(String libro) {
        this.libro = libro;
    }

    //constructor con todos los atributos de subclase y supclase
    public Lectura(String libro, int id, String nombre, Date fechaHora) throws BibliotecaException{
        super(id, nombre, fechaHora);
        this.libro = libro;
    }

    //Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros
    public Lectura(String libro, Evento e) {
        super(e);
        this.libro = libro;
    }

    //getters y setters de los atributos de la subclase
    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Lectura nuevoLectura() {
        Evento event = super.nuevoEvento();
        Scanner set = new Scanner(System.in);
        String libroLectura;
        do {
            System.out.println("entre el nombre del libro por favor");
            libroLectura = set.nextLine();
        } while (BibliotecaException.isValidString(libroLectura));
        System.out.println("libro es " + libroLectura);
        Lectura ret = new Lectura(libroLectura, event);
        return ret;

    }

    @Override
    public String toString() {
        return super.toString() + " Lectura{" + "libro=" + libro + '}';
    }
}
