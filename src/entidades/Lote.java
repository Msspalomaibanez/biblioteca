/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USUARIO
 */
public class Lote {
    
    private int id;
    private String fecha;
    
    public Lote() {
    }
    
    public Lote(Lote l) {
        this.id = l.id;
        this.fecha = l.fecha;
    }
    
    public Lote(int id, String fecha) {
        this.id = id;
        this.fecha = fecha;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
}
