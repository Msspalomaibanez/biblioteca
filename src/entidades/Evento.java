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
public class Evento {
    
        /**
     * attributo id  
     * tipo de dato: long 
     * los valores validos: 1 y Long.Max_VALUE
     * los valores invalidos: 0 y Long.MIN_VALUE 
     * restricciones: la id del evento no puede ser Duplicada valor 
     * valor por defecto: 0
     */
    
    protected long id;
    
    /**
     * attributo nombre 
     * tipo de dato: String 
     * los valores validos: mayor de dos caracteres 
     * los valores invalidos: no puede ser null o Empty =="" o menos de dos caracteres 
     * restricciones: el valor introducido debera ser una cadena de caracteres únicamente de como mínimo 2 caracteres 
     * valor por defecto: Null
     */
    
    protected String nombre;
    
    /**
     * attributo: fechaHora 
     * tipo de dato: Date 
     * los valores validos: debe tener este formato yyyy/MM/dd 
     * los valores invalidos: no se admite cualquierotro formato. 
     * restricciones: debe dar formato definido yyyy/MM/dd 
     * valor por defecto: Null
     */
    
    protected Date fechaHora;
    
    /*constructor por defecto*/
    public Evento() {
    }
    /*constructor con todos los atributos*/
    public Evento(long id, String nombre, Date fechaHora) {
        this.id = id;
        this.nombre = nombre;
        this.fechaHora = fechaHora;
    }
    /*constructor de copia que tenga como primer parámetro un objeto del tipo de dato de la superclase*/
    public Evento(Evento e){
        this.id = e.id;
        this.nombre = e.nombre;
        this.fechaHora = e.fechaHora;
    }
    /* los getters y setters */
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Evento nuevoEvento() {
        Evento event = new Evento();
        Scanner set = new Scanner(System.in);
        int idevento;
        do {
            System.out.println("enter id del evento por favor");
            idevento = set.nextInt();
            System.out.println("id es " + idevento);
        } while (!Utilidades.isValidIdEvent(idevento));
        event.setId(idevento);
        System.out.println(event.getId());
        // el segundo atributo
        set = new Scanner(System.in);
        String nombreEvento;
        do {
            System.out.println("enter el nombre de evento por favor");
            nombreEvento = set.nextLine();
            System.out.println("nombre de evento es " + nombreEvento);
        } while (!Utilidades.isValidString(nombreEvento));
        event.setNombre(nombreEvento);
        System.out.println(event.getNombre());
        // el tercer atributo
        set = new Scanner(System.in);
        String fechaEvent;
        do {
            System.out.println("enter el Fecha de evento por favor con el seguiente fomato (" + Utilidades.formatString + ")");
            fechaEvent = set.nextLine();
            System.out.println("Fecha de evento es " + fechaEvent);
        } while (Utilidades.isValidFechaEvent(fechaEvent) == null);
        event.setFechaHora(java.sql.Date.valueOf(fechaEvent));
        System.out.println(event.getFechaHora());

        return event;
    }

    @Override
    public String toString() {
        return "Evento{" + "id=" + id + ", nombre=" + nombre + ", fechaHora=" + fechaHora + '}';
    }
    
}
