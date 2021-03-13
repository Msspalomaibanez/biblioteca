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
public class Curso extends Evento {
    
    /**
     * attributo duracion  
     * tipo de dato: double 
     * los valores validos: >0 
     * los valores invalidos: =<0
     * restricciones: es un valor de tipo double que sea mayor que 0 y menos de 24 
     * valor por defecto: 0
     */
    private double duracion;
    /**
     * attributo: aula 
     * tipo de dato: String 
     * los valores validos: mayor de dos caracteres 
     * los valores invalidos: no puede ser null o Empty =="" o menos de dos caracteres 
     * restricciones:el valor introducido debera ser una cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto:Null
     */
    private String aula;
    
/*constructor por defecto*/
    public Curso() {
        super();
    }
    /*constructor con los atributos de subclase*/
    public Curso(double duracion, String aula) {
        this.duracion = duracion;
        this.aula = aula;
    }
 /*constructor con todos los atributos de subclase y supclase*/
    public Curso(double duracion, String aula, int id, String nombre, Date fechaHora) throws BibliotecaException{
        super(id, nombre, fechaHora);
        this.duracion = duracion;
        this.aula = aula;
    }
/*Un constructor que tenga un objeto del tipo de dato de la superclase, y otros parámetros*/
    public Curso(int duracion, String aula, Evento e) {
        super(e);
        this.duracion = duracion;
        this.aula = aula;
    }
/*getters y setters de los atributos de la subclase*/

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }

    public String getAula() {
        return aula;
    }

    public void setAula(String aula) {
        this.aula = aula;
    }
     
    
    public Curso nuevoCurso() {

        Evento event = super.nuevoEvento();
        Scanner set = new Scanner(System.in);
        double duracionCurso;
        do {
            System.out.println("enter duracion por favor");
            duracionCurso = set.nextDouble();
        } while (!BibliotecaException.isValidDuracionCurso(duracionCurso));
        System.out.println("duracion es " + duracionCurso);
        //el segundo atributo
        set = new Scanner(System.in);
        String aulaEvent;
        do {
            System.out.println("enter el nombre de aula por favor");
            aulaEvent = set.nextLine();
        } while (!BibliotecaException.isValidString(aulaEvent));
        System.out.println("aula es " + aulaEvent);

        Curso ret = new Curso((int) duracionCurso, aulaEvent, event);

        return ret;
    }

    @Override
    public String toString() {
        return super.toString() + " Curso{" + "duracion=" + duracion + ", aula=" + aula + '}';
    }
}
