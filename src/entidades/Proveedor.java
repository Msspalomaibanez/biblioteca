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
    private ArrayList<Lote> lotes = new ArrayList<Lote>();

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
        String nmb = in.nextLine();
        //validarString()
        if (nmb.isEmpty() || nmb.length() < 2 || nmb.length() > 150) {
            do {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO 8859-1");
                nmb = in.nextLine();
            } while(nmb.isEmpty() || nmb.length() < 2 || nmb.length() > 150);
        }
        System.out.println("Introduce el teléfono del nuevo proveedor:");
        String tel = in.nextLine();
        if (tel.isEmpty() || tel.length() != 9) {
            do {
                System.out.println("Has introducido un valor incorrecto.");
                System.out.println("Introduce un valor válido.");
                in = new Scanner(System.in, "ISO 8859-1");
                tel = in.nextLine();
            } while(tel.isEmpty() || tel.length() != 9);
        }

        return pro;
    }

    
      /**
     * Se trata de una función que convierte un arra de objetos tipo Proveedor
     * en un ArrayList de objetos de tipo Proveedor con los mismos elementos del 
     * array
     * @param array de Proveedores
     * @return ArrayList de Proveedores
     */
    
        public static final ArrayList<Proveedor> convertir(Proveedor[] array) {
        ArrayList<Proveedor> ret = new ArrayList<Proveedor>();
        for (Proveedor p : array) {
            ret.add((Proveedor) p);
        }
        return ret;
    }
        
        
}
