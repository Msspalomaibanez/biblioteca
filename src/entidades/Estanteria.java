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
public class Estanteria {

    private int id;
    private char codigo;
    private String ubicacion;
    private boolean completa;
    private Genero genero;
    private ArrayList<Elemento> elementos = new ArrayList<Elemento>();

    public Estanteria() {
    }

    public Estanteria(Estanteria e) {
        this.id = e.id;
        this.codigo = e.codigo;
        this.ubicacion = e.ubicacion;
        this.completa = e.completa;
        this.genero = e.genero;
        this.elementos = e.elementos;
    }

    public Estanteria(int id, char codigo, String ubicacion, boolean completa, Genero genero, ArrayList<Elemento> elementos) {
        this.id = id;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.completa = completa;
        this.genero = genero;
        this.elementos = elementos;
    }

    public Estanteria(int id, char codigo, String ubicacion, boolean completa) {
        this.id = id;
        this.codigo = codigo;
        this.ubicacion = ubicacion;
        this.completa = completa;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public char getCodigo() {
        return codigo;
    }

    public void setCodigo(char codigo) {
        this.codigo = codigo;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public boolean getCompleta() {
        return completa;
    }

    public void setCompleta(boolean completa) {
        this.completa = completa;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public ArrayList<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(ArrayList<Elemento> elementos) {
        this.elementos = elementos;
    }
    
    public static Estanteria nuevaEstanteria() {
        Estanteria est = new Estanteria();
        Scanner in = new Scanner(System.in);
        
        System.out.println("Introduce el código de la nueva estantería:");
        est.setCodigo(in.nextLine().charAt(0));
        
        return est;
    }

}
