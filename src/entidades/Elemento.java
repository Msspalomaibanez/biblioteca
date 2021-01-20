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
public class Elemento {
    
    protected int id;
    protected Genero genero;
    
    public Elemento() {
    }
    
    public Elemento(Elemento e) {
        this.id = e.id;
        this.genero = e.genero;
    }
    
    public Elemento(int id, Genero genero) {
        this.id = id;
        this.genero = genero;
    }
    
    public Elemento(int id) {
        this.id = id;
    }
    
    public long getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public Genero getGenero() {
        return genero;
    }
    
    public void setGenero(Genero genero) {
        this.genero = genero;
    }
}
