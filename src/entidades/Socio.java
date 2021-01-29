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
    private ArrayList<Evento> eventos = new ArrayList<Evento>(); // relación socio y evento
    private ArrayList<Prestamo> prestamos = new ArrayList<Prestamo>(); // relación socio con préstamo

    /*constructor por defecto*/
    public Socio() {
    }

    /*constructor con todos los atributos*/
    public Socio(long id, String nombre, String apellidos, String dni, String telefono, String direccion, boolean penalizacion, ArrayList<Prestamo> prestamos, ArrayList<Evento> eventos) {
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
        Scanner in = new Scanner(System.in, "ISO-8859-1");

        //Primero autogeneraremos el id del socio
        long id = Socio.nextIdSocio();
        soc.setId(id);
        
        System.out.println("Introduzca el nombre del nuevo socio: ");
        in = new Scanner (System.in, "ISO-8859-1");
        String nombre = in.nextLine();
        soc.setNombre(nombre);
        
        System.out.println("Introduzca el apellido del nuevo socio: ");
        in = new Scanner (System.in, "ISO-8859-1");
        String apellido = in.nextLine();
        soc.setApellidos(apellido);
        
        System.out.println("Introduzca el dni del nuevo socio: ");
       in = new Scanner (System.in, "ISO-8859-1");
       String dni = in.nextLine();
        soc.setDni(dni);
       
        System.out.println("Introduzca el teléfono del nuevo socio: ");
        in = new Scanner (System.in, "ISO-8859-1");
        String telefono = in.nextLine();
        soc.setTelefono(telefono);
        
        System.out.println("Introduzca la dirección del nuevo socio: ");
       in = new Scanner (System.in, "ISO-8859-1");
       String direccion = in.nextLine();
        soc.setDireccion(direccion);

        return soc;
    }

    
    public static long nextIdSocio() {
        long ret = 0;
        for (Socio s : Utilidades.SOCIOS) {
            if (s.getId() > ret) {
                ret = (long) s.getId();
            }
        }
    
        return ret + 1;
    }
    
    
    

    public static void verSocio(ArrayList<Socio> socios) {
        System.out.println("El programa tiene almacenados los siguientes socios: ");
        for (Socio s : socios) {
            System.out.println(s.getId() + ": " + s.getNombre() + " " + s.getApellidos());
        }
        /**
         * public static void verSocio() { System.out.println("Listado de
         * socios: "); for (int x = 0; x < Utilidades.numSocios;x++) {
         * System.out.println(Utilidades.SOCIOS[x]); } }*
         */
  
        
    public static void buscarSocios(ArrayList<Socio> socios) {
        Socio buscado;
        ArrayList<Socio> buscado1;
        Scanner in;
        int opcion = -1;

        do {
            buscado = null;
            buscado1 = new ArrayList<Socio>();
            in = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Pulse 1 para buscar socio por ID.");
            System.out.println("Pulse 2 para buscar socio por NOMBRE.");
            System.out.println("Pulse 3 para buscar socio por TELEFONO.");
            System.out.println("Pulse 0 para VOLVER.");

            opcion = in.nextInt();

            if (opcion < 0 || opcion > 4) {

                System.out.println("Opción incorrecta");
                continue;

            }
            in = new Scanner(System.in, "ISO-8859-1");
            switch (opcion) {

                case 1:

                    System.out.println("Por favor introduzca el ID del socio que desea buscar: ");
                    int idSoc = in.nextInt();
                    buscado = Socio.buscarSocioPorId(idSoc, socios);

                    if (buscado != null) {

                        System.out.println("Socio encontrado: ");
                        System.out.println(buscado.getId() + ": " + buscado.getNombre() + " " + buscado.getApellidos() + " (" + buscado.getTelefono() + ") ");

                    } else {

                        System.out.println("El socio con el id " + idSoc + "no se encuentra en el sistema.");
                    }
                    break;

                case 2:

                    System.out.println("Por favor introduzca el nombre del socio que desea buscar: ");
                    String nomSoc = in.nextLine();
                    buscado1 = Socio.buscarSocioPorNombre(nomSoc, socios);

                    if (buscado1.size() > 0) {

                        System.out.println("Socio encontrado: ");

                        for (Socio s : buscado1) {
                            System.out.println(s.getId() + ": " + s.getNombre() + " " + s.getApellidos() + "( " + s.getTelefono() + ") ");

                        }
                    } else {

                        System.out.println("El socio con el nombre " + nomSoc + "no se encuentra en el sistema.");

                    }
                    break;

                case 3:

                    System.out.println("Por favor introduzca el teléfono del socio que desea buscar: ");
                    String telSoc = in.nextLine();
                    buscado1 = Socio.buscarSocioPorTelefono(telSoc, socios);

                    if (buscado1.size() > 0) {

                        System.out.println("Socio encontrado: ");

                        for (Socio s : buscado1) {
                            System.out.println(s.getId() + ": " + s.getNombre() + " " + s.getApellidos() + "( " + s.getTelefono() + ") ");

                        }

                    } else {

                        System.out.println("El socio con el teléfono " + telSoc + "no se encuentra en el sistema.");

                    }
                    break;

                default:

                    break;

            }

        } while (opcion != 0);

    }

    public static Socio buscarSocioPorId(int idSocio, ArrayList<Socio> socios) {
        Socio ret = null;
        for (Socio s : socios) {
            if (s.getId() == idSocio) {
                ret = s;
                break;
            }
        }
        return ret;

    }

    public static ArrayList<Socio> buscarSocioPorNombre(String nomSocio, ArrayList<Socio> socios) {
        ArrayList<Socio> ret = new ArrayList<Socio>();
        for (Socio s : socios) {
            if (Utilidades.removeDiacriticalMarks(s.getNombre().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(nomSocio.toLowerCase()))) {
                ret.add(s);
            }
            if (s.getNombre().toLowerCase().contains(nomSocio.toLowerCase())) {
                if (!ret.contains(s)) {
                    ret.add(s);
                }
            }

        }
        return ret;
    }

    public static ArrayList<Socio> buscarSocioPorTelefono(String telSocio, ArrayList<Socio> socios) {
        ArrayList<Socio> ret = new ArrayList<Socio>();
        for (Socio s : socios) {
            if (Utilidades.removeDiacriticalMarks(s.getNombre().toLowerCase()).contains(Utilidades.removeDiacriticalMarks(telSocio.toLowerCase()))) {
                ret.add(s);
            }
            if (s.getNombre().toLowerCase().contains(telSocio.toLowerCase())) {
                if (!ret.contains(s)) {
                    ret.add(s);
                }
            }

        }
        return ret;
    }

    
    /**
     * Se trata de una función que convierte un arra de objetos tipo Socio
     * en un ArrayList de objetos de tipo Socio con los mismos elementos del 
     * array
     * @param array de Socios
     * @return ArrayList de Socios
     */
    
        public static final ArrayList<Socio> convertir(Socio[] array) {
        ArrayList<Socio> ret = new ArrayList<Socio>();
        for (Socio s : array) {
            ret.add((Socio) s);
        }
        return ret;
    }
        
        
        
    @Override
    public String toString() {
        return "Socio{" + "id=" + id + ", nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", telefono=" + telefono + ", direccion=" + direccion + ", penalizacion=" + penalizacion + ", eventos=" + eventos + ", prestamos=" + prestamos + '}';
    }

}
