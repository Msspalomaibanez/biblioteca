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
    private int idSocio;

    public Prestamo() {
    }

    public Prestamo(long id, String fecha_inicio, String fecha_devolucion, String devolucion, Estado estado, int idSocio) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
        this.devolucion = devolucion;
        this.estado = estado;
        this.idSocio = idSocio;
    }

    public Prestamo(Prestamo pres) {
        this.id = pres.id;
        this.fecha_inicio = pres.fecha_inicio;
        this.fecha_devolucion = pres.fecha_devolucion;
        this.devolucion = pres.devolucion;
        this.estado = pres.estado;
        this.idSocio = pres.idSocio;
    }

    public Prestamo(long id, String fecha_inicio, String fecha_devolucion) {
        this.id = id;
        this.fecha_inicio = fecha_inicio;
        this.fecha_devolucion = fecha_devolucion;
        this.idSocio = idSocio;
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

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    
    public static Prestamo nuevoPrestamo() {
        Prestamo pres = new Prestamo();
        Scanner in = new Scanner(System.in);

        System.out.println("Introduzca la fecha de inicio del préstamo (dd/mm/YYYY): ");
        pres.setFecha_inicio(in.nextLine());

        System.out.println("Introduzca la fecha de devolución del prestamo (dd/mm/YYYY): ");
        pres.setFecha_devolucion(in.nextLine());

        Estado estado = Estado.nuevoEstado();
        pres.setEstado(estado);

        return pres;
    }

    /**
     * Se trata de una función que convierte un arra de objetos tipo Prestamo en un
     * ArrayList de objetos de tipo Prestamo con los mismos elementos del array
     *
     * @param array de Prestamos
     * @return ArrayList de Prestamos
     */
    public static final ArrayList<Prestamo> convertir(Prestamo[] array) {
        ArrayList<Prestamo> ret = new ArrayList<Prestamo>();
        for (Prestamo p : array) {
            ret.add((Prestamo) p);
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Prestamo{" + "id=" + id + ", fecha_inicio=" + fecha_inicio + ", fecha_devolucion=" + fecha_devolucion + ", devolucion=" + devolucion + ", estado=" + estado + '}';
    }

}
