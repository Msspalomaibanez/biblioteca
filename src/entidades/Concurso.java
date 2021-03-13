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
public class Concurso extends Evento{
   
    /**
     * attributo tipo
     * tipo de dato: String 
     * los valores validos: mayor de dos caracteres 
     * los valores invalidos: no puede ser null o Empty =="" o menos de dos caracteres 
     * restricciones: el valor introducido debera ser una cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto: Null
     */
    private String tipo;
    
     /**
     * attributo premio 
     * tipo de dato: String 
     * los valores validos: mayor de dos caracteres 
     * los valores invalidos: no puede ser null o Empty =="" o menos dos caracteres 
     * restricciones: el valor introducido debera ser una cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto: Null
     */
    
    private String premio;
    
    
/*constructor por defecto*/
    public Concurso() {
        super();
    }
/*constructor con los atributos de subclase*/
    public Concurso(String tipo, String premio) {
        this.tipo = tipo;
        this.premio = premio;
    }
/*constructor con todos los atributos de subclase y supclase*/
    public Concurso(String tipo, String premio, int id, String nombre, Date fechaHora) throws BibliotecaException {
        super(id, nombre, fechaHora);
        this.tipo = tipo;
        this.premio = premio;
    }

    /*
	 * Un constructor que tenga un objeto del tipo de dato de la superclase, y otros
	 * parámetros
    */
    
     public Concurso(String tipo, String premio, Evento e) {
        super(e);
        this.tipo = tipo;
        this.premio = premio;
    }
/*getters y setters de los atributos de la subclase*/
    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPremio() {
        return premio;
    }

    public void setPremio(String premio) {
        this.premio = premio;
    }
    
    
    public Concurso nuevoConcurso() {
        Evento event = super.nuevoEvento();
        Scanner set = new Scanner(System.in);
        String tipeEvent;
        do {
            System.out.println("enter el tipo por favor");
            tipeEvent = set.nextLine();
        } while (!BibliotecaException.isValidString(tipeEvent));
        System.out.println("tipo es " + tipeEvent);
        // el segundo atributo
        set = new Scanner(System.in);
        String premioConcurso;
        do {
            System.out.println("enter primeio por favor");
            premioConcurso = set.nextLine();
        } while (!BibliotecaException.isValidString(premioConcurso));
        System.out.println("premio es " + premioConcurso);

        Concurso ret = new Concurso(tipeEvent, premioConcurso, event);
        return ret;
    }

    @Override
    public String toString() {
        return super.toString() + "Concurso{" + "tipo=" + tipo + ", premio=" + premio + '}';
    }
    
}
