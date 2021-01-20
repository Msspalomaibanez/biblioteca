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
public class Visionado extends Evento {
        /**
     * attributo pelicula 
     * tipo de dato: String
     * los valores validos: mayor de dos caracteres 
     * los valores invalidos: no puede ser null o Empty =="" o menos de dos caracteres 
     * restricciones: el valor introducido debera ser una cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto: Null
     */
    
    private String pelicula;
    
    /**
     * attributo aula tipo de dato: String los valores validos: mayor de dos
     * caracteres los valores invalidos: no puede ser null o Empty =="" o menos
     * de dos caracteres restricciones: el valor introducido debera ser una
     * cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto: Null
     */
    
    private String aula;
/*constructor por defecto*/
    public Visionado() {
        super();
    }
/*constructor con los atributos de subclase*/
    public Visionado(String pelicula, String aula) {
        this.pelicula = pelicula;
        this.aula = aula;
    }
/*constructor con todos los atributos de subclase y supclase*/
    public Visionado(String pelicula, String aula, long id, String nombre, Date fechaHora) {
        super(id, nombre, fechaHora);
        this.pelicula = pelicula;
        this.aula = aula;
    }
/*Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros*/
    public Visionado(String pelicula, String aula, Evento e) {
        super(e);
        this.pelicula = pelicula;
        this.aula = aula;
    }
/*getters y setters de los atributos de la subclase*/
    public String getPelicula() {
        return pelicula;
    }

    public void setPelicula(String pelicula) {
        this.pelicula = pelicula;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }   
    
    
    public Visionado nuevoVisionado() {
        //un objeto
        Evento event = super.nuevoEvento();
        Scanner scanner = new Scanner(System.in);
        String peliculaVisionado;
        do {
            System.out.println("entre el nombre del pelicula por favor");
            peliculaVisionado = scanner.nextLine();
        } while (!Utilidades.isValidString(peliculaVisionado));
        System.out.println("pelicula es " + peliculaVisionado);

        //el segundo atributo
        scanner = new Scanner(System.in);
        String aulaEvent;
        do {
            System.out.println("enter el nombre de aula por favor");
            aulaEvent = scanner.nextLine();
        } while (!Utilidades.isValidString(aulaEvent));
        System.out.println("aula es " + aulaEvent);
        Visionado ret = new Visionado(peliculaVisionado, aulaEvent, event);
        return ret;
    }

    @Override
    public String toString() {
        return super.toString() + " Visionado{" + "pelicula=" + pelicula + ", aula=" + aula + '}';
    }
}
