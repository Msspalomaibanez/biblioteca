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
 * @author USUARIO
 */
public class Proveedor {
    
    private int id;
    private String nombre;
    private String telefono;
    private ArrayList<Lote> lotes;
    
    public Proveedor() {
    }
    
    public Proveedor(Proveedor p) {
        this.id = p.id;
        this.nombre = p.nombre;
        this.telefono = p.telefono;
        this.lotes = p.lotes;
    }
    
    public Proveedor(int id, String nombre, String telefono, ArrayList<Lote> lotes) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.lotes = lotes;
    }
    
    public Proveedor(int id, String nombre, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getTelefono() {
        return telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public ArrayList<Lote> getLotes() {
        return lotes;
    }
    
    public void setLotes(ArrayList<Lote> lotes) {
        this.lotes = lotes;
    }
    
    public static Proveedor nuevoProveedor() {
        Proveedor pro = new Proveedor();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce el nombre del nuevo proveedor:");
        pro.setNombre(in.nextLine());
        System.out.println("Introduce el teléfono del nuevo proveedor:");
        pro.setTelefono(in.nextLine());
        
        return pro;
    }
    
}
