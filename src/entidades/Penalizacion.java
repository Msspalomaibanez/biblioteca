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
public class Penalizacion {
    
    private long id;
    private String motivo;
    private String fecha;
    private int idSocio;

    public Penalizacion() {
    }

    public Penalizacion(long id, String motivo, String fecha, int idSocio) {
        this.id = id;
        this.motivo = motivo;
        this.fecha = fecha;
        this.idSocio = idSocio;
    }
    
        public Penalizacion(Penalizacion p) {
        this.id = p.id;
        this.motivo = p.motivo;
        this.fecha = p.fecha;
        this.idSocio = p.idSocio;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getIdSocio() {
        return idSocio;
    }

    public void setIdSocio(int idSocio) {
        this.idSocio = idSocio;
    }

    
    
    public static Penalizacion nuevaPenalizacion(){
        Penalizacion pen = new Penalizacion();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Indique el motivo de la penalización: ");
        pen.setMotivo(in.nextLine());
        
        System.out.println("Introduzca la fecha de la penalización(dd/mm/YYYY): ");
        pen.setFecha(in.nextLine());
        
        return pen;
        
    }
    
    
    
      /**
     * Se trata de una función que convierte un arra de objetos tipo Penalizacion
     * en un ArrayList de objetos de tipo Penalizacion con los mismos elementos del 
     * array
     * @param array de Penalizaciones
     * @return ArrayList de Penalizaciones
     */
    
        public static final ArrayList<Penalizacion> convertir(Penalizacion[] array) {
        ArrayList<Penalizacion> ret = new ArrayList<Penalizacion>();
        for (Penalizacion p : array) {
            ret.add((Penalizacion) p);
        }
        return ret;
    }
        
    
    @Override
    public String toString() {
        return "Penalizacion{" + "id=" + id + ", motivo=" + motivo + ", fecha=" + fecha + '}';
    }
    
    

    
    
    
    
    
    
    
    
    
    
    
}
