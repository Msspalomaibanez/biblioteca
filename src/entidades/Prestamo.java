/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author USER
 */
public class Prestamo {
    
    private long id;
    private String fecha_inicio;
    private String fecha_devolucion;
    private String devolucion;
    private Estado estado;
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    public Prestamo() {
    }

    public Prestamo(long id, String fecha_inicio, String fecha_devolucion, String devolucion, Estado estado) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
        this.devolucion = devolucion;
        this.estado = estado;
    }
    
        public Prestamo(Prestamo pres) {
        this.id = pres.id;
        this.fecha_inicio = pres.fecha_inicio;
        this.fecha_devolucion = pres.fecha_devolucion;
        this.devolucion = pres.devolucion;
        this.estado = pres.estado;
    }

    public Prestamo(long id, String fecha_inicio, String fecha_devolucion) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
    }

    public long getId() {
        return id;
    }

    public String getFecha_inicio() {
        return fecha_inicio;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFecha_inicio(String fecha_inicio) {
        this.fecha_inicio = fecha_inicio;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }
    
    

    
        public static Prestamo nuevoPrestamo (){
        Prestamo pres = new Prestamo();
        Scanner in = new Scanner (System.in);
        
        System.out.println("Introduzca la fecha de inicio del préstamo (dd/mm/YYYY): ");
        pres.setFecha_inicio(in.nextLine());
        
        System.out.println("Introduzca la fecha de devolución del prestamo (dd/mm/YYYY): ");
        pres.setFecha_devolucion(in.nextLine());
        
        Estado estado = Estado.nuevoEstado();
        pres.setEstado(estado);
        
        return pres;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fecha_inicio=" + fecha_inicio + ", fecha_devolucion=" + fecha_devolucion + ", devolucion=" + devolucion + ", estado=" + estado + '}';
    }
    
    
    
    
}
