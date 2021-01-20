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
 * @author USER
 */
public class Socio {
    private long id;
    private String nombre;
    private String apellidos;
    private String dni;
    private String telefono;
    private String direccion;
    private boolean penalizacion = false;
    private ArrayList <Evento> eventos = new ArrayList <Evento>(); // relación socio y evento
    private ArrayList <Prestamo> prestamos = new ArrayList <Prestamo>(); // relación socio con préstamo

    /*constructor por defecto*/
    
    public Socio() {
    }
    
    /*constructor con todos los atributos*/
    
    public Socio(long id, String nombre, String apellidos, String dni, String telefono, String direccion, boolean penalizacion, ArrayList <Prestamo> prestamos, ArrayList <Evento> eventos) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
        this.penalizacion = penalizacion;
        this.eventos = eventos;
        this.prestamos = prestamos;
    }
    
        /*constructor de copia*/
    
        public Socio(Socio soc) {
        this.id = soc.id;
        this.nombre = soc.nombre;
        this.apellidos = soc.apellidos;
        this.dni = soc.dni;
        this.telefono = soc.telefono;
        this.direccion = soc.direccion;
        this.penalizacion = soc.penalizacion;
        this.prestamos = soc.prestamos;
        this.eventos = soc.eventos;
    }

    /*constructor con los atributos más importantes*/
        
    public Socio(long id, String nombre, String apellidos, String dni, String telefono, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    /*getters y setters de todos los atributos*/
    
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

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public boolean getPenalizacion() {
        return penalizacion;
    }

    /**
     *
     * @param penalizacion
     */
    public void setPenalizacion(boolean penalizacion) {
        this.penalizacion = penalizacion;
    }

    /**
     *
     * @return
     */
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public ArrayList<Evento> getEventos() {
        return eventos;
    }

    public void setEventos(ArrayList<Evento> eventos) {
        this.eventos = eventos;
    }
    
   public static Socio nuevoSocio() {
       Socio soc = new Socio();
       Scanner in = new Scanner (System.in);

       
       System.out.println("Introduzca el nombre del nuevo socio: ");
       soc.setNombre(in.nextLine());
       System.out.println("Introduzca el apellido del nuevo socio: ");
       soc.setApellidos(in.nextLine());
       System.out.println("Introduzca el dni del nuevo socio: ");
       soc.setDni(in.nextLine());
       System.out.println("Introduzca el teléfonoo del nuevo socio: ");
       soc.setTelefono(in.nextLine());
       System.out.println("Introduzca la dirección del nuevo socio: ");
       soc.setDireccion(in.nextLine());
       
       return soc;
   }

    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", direccion=" + direccion + ", penalizacion=" + penalizacion + ", eventos=" + eventos + ", prestamos=" + prestamos + '}';
    }
  
}

