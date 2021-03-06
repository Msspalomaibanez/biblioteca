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
 * @author Rim
 */
public class Evento {

    /**
     * attributo id tipo de dato: long los valores validos: 1 y Long.Max_VALUE
     * los valores invalidos: 0 y Long.MIN_VALUE restricciones: la id del evento
     * no puede ser Duplicada valor valor por defecto: 0
     */
    protected int id;
    private ArrayList<Evento> eventos = new ArrayList<Evento>(); // relación socio y evento

    /**
     * attributo nombre tipo de dato: String los valores validos: mayor de dos
     * caracteres los valores invalidos: no puede ser null o Empty =="" o menos
     * de dos caracteres restricciones: el valor introducido debera ser una
     * cadena de caracteres únicamente de como mínimo 2 caracteres valor por
     * defecto: Null
     */
    protected String nombre;

    /**
     * attributo: fechaHora tipo de dato: Date los valores validos: debe tener
     * este formato yyyy/MM/dd los valores invalidos: no se admite cualquier
     * otro formato. restricciones: debe dar formato definido yyyy/MM/dd valor
     * por defecto: Null
     */
    protected Date fechaHora;

    /*constructor por defecto*/
    public Evento() {
    }

    /*constructor con todos los atributos*/
    public Evento(int id, String nombre, Date fechaHora) throws BibliotecaException {
       if (BibliotecaException.isValidIdEvent(id)) {
            this.id = id;
        } else {
            throw new BibliotecaException("El id del evento no tiene un valor válido:" + id);
        }
        if (BibliotecaException.isValidString(nombre)) {
            this.nombre= nombre;
        } else {
            throw new BibliotecaException("El nombre del evento no tiene un valor válido:" + nombre);
        }
         if (BibliotecaException.isValidFechaEvent(fechaHora)) {
             this.fechaHora= fechaHora;
         } else {
             throw new BibliotecaException("El fechaHora del evento no tiene un valor válido:" + fechaHora);
         }
        
        }
        /**
         * constructor de copia que tenga como primer parámetro un objeto del
         * tipo de dato
         */
    public Evento(Evento e) {
        this.id = e.id;
        this.nombre = e.nombre;
        this.fechaHora = e.fechaHora;
    }

    /* los getters y setters */
    public long getId() {
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

    public Date getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(Date fechaHora) {
        this.fechaHora = fechaHora;
    }

    public static Evento buscarById(int id) {
        for (Evento e : Utilidades.EVENTOS) {
            if (e.getId() == id) {
                return e;
            }
        }
        return null;
    }

    public static Evento nuevoEvento() {
        Evento event = new Evento();
        Scanner set = new Scanner(System.in);
        int idevento;
        do {
            System.out.println("enter id del evento por favor");
            idevento = set.nextInt();
            System.out.println("id es " + idevento);
        } while (!BibliotecaException.isValidIdEvent(idevento));
        event.setId(idevento);
        System.out.println(event.getId());
        // el segundo atributo
        set = new Scanner(System.in);
        String nombreEvento;
        do {
            System.out.println("enter el nombre de evento por favor");
            nombreEvento = set.nextLine();
            System.out.println("nombre de evento es " + nombreEvento);
        } while (!BibliotecaException.isValidString(nombreEvento));
        event.setNombre(nombreEvento);
        System.out.println(event.getNombre());
        // el tercer atributo
        set = new Scanner(System.in);
        String fechaEvent;
        do {
                System.out.println("enter el Fecha de evento por favor con el seguiente fomato (" + Utilidades.formatString + ")");
            fechaEvent = set.nextLine();
            System.out.println("Fecha de evento es " + fechaEvent);
        } while (BibliotecaException.isValidFechaEvent(fechaEvent) == null);
        event.setFechaHora(java.sql.Date.valueOf(fechaEvent));
        System.out.println(event.getFechaHora());

        return event;
    }

    public static void verEvento(ArrayList<Evento> Eventos) {
        System.out.println("El programa tiene almacenados los siguientes Eventos: ");
        for (Evento e : Eventos) {
            System.out.println(e.getId() + ": " + e.getNombre() + " " + e.getFechaHora());
        }

    }

    public static void buscarEventos(ArrayList<Evento> eventos) {
        Evento buscado;
        ArrayList<Evento> encontrados;
        Scanner in;
        int opcion = -1;

        do {
            buscado = null;
            encontrados = new ArrayList<Evento>();
            in = new Scanner(System.in);
            System.out.println("Pulse 1 para buscar evento por Nombre.");
            System.out.println("Pulse 2 para buscar evento por ID.");
            System.out.println("Pulse 0 para VOLVER.");
            opcion = in.nextInt();
            if (opcion < 0 || opcion > 2) {
                System.out.println("Opción incorrecta.");
                continue;
            }
            in = new Scanner(System.in);
            switch (opcion) {
                case 0:
                    break;
                case 1:
                    System.out.println("Introduzca el NOMBRE del evento a encontrar:");
                    String nomEven = in.nextLine();
                    buscado = Evento.buscarEventoByNombre(nomEven, eventos);

                    if (encontrados.size() > 0) {
                        System.out.println("Hay coincidencias: ");
                        for (Evento e : encontrados) {
                            System.out.println(e.getId() + ". " + e.getNombre());
                        }
                    } else {
                        System.out.println("Evento con nombre=" + nomEven + " NO ENCONTRADO.");
                    }
                    System.out.println("");
                    break;
                case 2:
                    System.out.println("Introduzca el ID del evento a encontrar:");
                    int idEven = in.nextInt();
                    buscado = Evento.buscarEventoById(idEven, eventos);
                    if (buscado != null) {
                        System.out.print("Evento encontrado: ");
                        System.out.println(buscado.getId() + ". " + buscado.getNombre());
                    } else {
                        System.out.println("Eveto con id=" + idEven + " NO ENCONTRADO.");
                    }
                    break;
                default:
                    break;
            }
        } while (opcion != 0);

    }

    public static Evento buscarEventoByNombre(String nombreEvento, ArrayList<Evento> eventos) {
        Evento ret = null;
        for (Evento e : eventos) {
            if (e.getNombre() == nombreEvento) {
                ret = e;
            }
        }
        return null;
    }

    public static Evento buscarEventoById(int idEvento, ArrayList<Evento> eventos) {
        Evento ret = null;
        for (Evento e : eventos) {
            if (e.getId() == idEvento) {
                ret = e;
            }
        }
        return null;
    }

    public static Evento buscarEventoByFechaHora(Date fechaHoraEvento, ArrayList<Evento> eventos) {
        Evento ret = null;
        for (Evento e : eventos) {
            if (e.getFechaHora() == fechaHoraEvento) {
                ret = e;
            }
        }
        return null;
    }

    public static void participarEvento() {
        Scanner in;
        int opcion = -1;
        do {
            in = new Scanner(System.in, "ISO-8859-1");
            System.out.println("Pulse 1 para participar a un Evento.");
            System.out.println("Pulse 0 para VOLVER.");
            opcion = in.nextInt();
            if (opcion == 1) {
                System.out.println("Participar en el Evento.");

            }
            if (opcion == 0) {
                System.out.println("Volver al menu principal.");

            }
        } while (opcion != 0 && opcion != 1);
    }

    /**
     * Se trata de una función que convierte un array de objetos tipo Evento en
     * un ArrayList de objetos de tipo Evento con los mismos elementos del array
     *
     * @param array de Eventos
     * @return ArrayList de Eventos
     */
    public static final ArrayList<Evento> convertir(Evento[] array) {
        ArrayList<Evento> ret = new ArrayList<Evento>();
        for (Evento e : array) {
            ret.add((Evento) e);
        }
        return ret;
    }

    public void verDatosEventoCompleto() {
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
        System.out.println("DATOS DE EVENTO CON ID " + this.getId());
        System.out.println("ID: " + this.getId());
        System.out.println("Nombre: " + this.getNombre());
        System.out.println("FechaHora: " + this.getFechaHora());
        System.out.println("-.-.-.-.-.-.-.-.-.-.-.-.-.-.-.-");
    }

    @Override

    public String toString() {
        return "Evento{" + "id=" + id + ", nombre=" + nombre + ", fechaHora=" + fechaHora + '}';
    }
}
