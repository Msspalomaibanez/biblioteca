/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author USER
 */
public class Utilidades {

    private static final DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

    /**
     * public Socio(long id, String nombre, String apellidos, String dni, String
     * telefono, String direccion, boolean penalización, ArrayList <Prestamo>
     * prestamos, ArrayList <Evento> eventos)
     */
    public static final Socio SOCIOS[] = {
        new Socio(1, "JUan José", "Pérez Olivera", "39571003Z", "600459823", "Vigo"),
        new Socio(2, "Jorge", "Herraez Espinar", "48330859J", "760583002", "Cádiz"),
        new Socio(3, "Miriam", "Gómez de los Reyes", "66811694H", "920563788", "Santander"),
        new Socio(4, "Sandra", "Valles Escalera", "70053778Q", "620345789", "Madrid"),};
    public static final int numSocios = SOCIOS.length;

    /**
     * public Prestamo(long id, String fecha_inicio, Date fecha_devolucion)
     */
    public static final Prestamo PRESTAMOS[] = {
        new Prestamo(1, "29-12-2020", "10-1-2021"),
        new Prestamo(2, "15-11-2020", "2-12-2020"),
        new Prestamo(3, "3-1-2021", "18-1-2021")

    };
    public static final int numprestamos = PRESTAMOS.length;

    /**
     * public Estado(String devolucion)
     */
    public static final Estado ESTADOS[] = {
        new Estado("Pendiente"),
        new Estado("Parcial"),
        new Estado("Completo")
    };
    public static final int numEstados = ESTADOS.length;

    /**
     * public Penalizacion(long id, String motivo, Date fecha)
     */
    public static final Penalizacion PENALIZACIONES[] = {
        new Penalizacion(1, "Retraso en la entrega", "13-12-2020"),
        new Penalizacion(2, "Devolución del préstamo en mal estado", "30-12-2020"),
        new Penalizacion(3, "Restraso en la entrega", "3-1-2021")

    };
    public static final int numPenalizaciones = PENALIZACIONES.length;

    public static final Proveedor PROVEEDORES[] = {
        new Proveedor(1, "Juan", "647625430"),
        new Proveedor(2, "Jose", "678654348"),
        new Proveedor(3, "Sergio", "659210475")
    };
    public static final int numProveedores = PROVEEDORES.length;

    /**
     * public Genero(int id, String nombre)
     */
    public static final Genero GENEROS[] = {
        new Genero(1, "Fantasía"),
        new Genero(2, "Ciencia Ficción"),
        new Genero(3, "Policíaca")
    };
    public static final int numGeneros = GENEROS.length;

    /**
     * public Estanteria(int id, char codigo, String ubicacion, boolean
     * completa)
     */
    public static final Estanteria ESTANTERIAS[] = {
        new Estanteria(1, 'A', "Derecha", true),
        new Estanteria(2, 'B', "Izquierda", false),
        new Estanteria(3, 'C', "Derecha", false)
    };
    public static final int numEstanterias = ESTANTERIAS.length;

    /**
     * public Lote(int id, String fecha)
     */
    public static final Lote LOTES[] = {
        new Lote(1, "4-1-2020"),
        new Lote(2, "6-1-2020"),
        new Lote(3, "10-1-2020")
    };
    public static final int numLotes = LOTES.length;

    /**
     * public Libro(int id, String nombre, String editorial, String autor,
     * String pagina)
     */
    public static final Libro LIBROS[] = {
        new Libro(1, "La Comunidad de los Anillos", "Ediciones Minotauro", "J. R. R. Tolkien", "568"),
        new Libro(2, "Aquitania", "Editorial Planeta", "Eva García Sáen de Uruti", "416"),
        new Libro(3, "Línea de fuego", "Alfaguara", "Arturo Pérez-Reverte", "688")
    };
    public static final int numLibros = LIBROS.length;

    /**
     * public DVD(int id, String titulo)
     */
    public static final DVD DVDS[] = {
        new DVD(1, "Harry Potter y la Piedra Filosofal"),
        new DVD(2, "Frozen"),
        new DVD(3, "Interstellar")
    };
    public static final int numDVDs = DVDS.length;

    public static final String formatString = "dd-MM-yyyy";
    public static final DateTimeFormatter iso = DateTimeFormatter.ofPattern(formatString);

    //dtf:dateFormatter
    public static final Curso CURSOS[] = {
        new Curso(1, "Aula 1", 1, "Curso 1", Date.valueOf(LocalDate.parse("02-01-2020"))),
        new Curso(2, "Aula 2", 2, "Curso 2", Date.valueOf(LocalDate.parse("02-02-2020"))),
        new Curso(3, "Aula 3", 3, "Curso 3", Date.valueOf(LocalDate.parse("02-03-2020"))),
        new Curso(4, "Aula 4", 4, "Curso 4", Date.valueOf(LocalDate.parse("02-04-2020"))),
        new Curso(5, "Aula 5", 5, "Curso 5", Date.valueOf(LocalDate.parse("02-05-2020"))),
        new Curso(6, "Aula 6", 6, "Curso 6", Date.valueOf(LocalDate.parse("02-06-2020"))),};

    public static final Concurso CONCURSOS[] = {
        new Concurso("Tipo A", "ViajeMadrid", 1, "Concurso 1", Date.valueOf(LocalDate.parse("02-06-2017"))),
        new Concurso("Tipo B", "ViajeBarcelona", 2, "Concurso 2", Date.valueOf(LocalDate.parse("02-07-2019"))),
        new Concurso("Tipo C", "ViajeAlmania", 3, "Concurso 3", Date.valueOf(LocalDate.parse("02-08-2014"))),
        new Concurso("Tipo D", "Viajekoria", 4, "Concurso 4", Date.valueOf(LocalDate.parse("02-09-2016"))),
        new Concurso("Tipo E", "ViajeJapon", 5, "Concurso 5", Date.valueOf(LocalDate.parse("02-10-2017"))),};

    public static final Lectura[] LECTURA = {
        new Lectura("Libro A", 1, "The Great Gatsby", Date.valueOf(LocalDate.parse("02-11-2020"))),
        new Lectura("Libro B", 2, "War and Peace", Date.valueOf(LocalDate.parse("02-12-2019"))),
        new Lectura("Libro C", 3, "Beautiful Things", Date.valueOf(LocalDate.parse("13-01-2017"))),
        new Lectura("Libro D", 4, "The Catcher in the Rye", Date.valueOf(LocalDate.parse("14-02-2018"))),
        new Lectura("Libro E", 5, "The Iliad", Date.valueOf(LocalDate.parse("15-03-2016"))),};

    public static final Visionado VISIONADO[] = {
        new Visionado("La casa de papel 1", "Aula A"),
        new Visionado("La casa de papel 2", "Aula B"),
        new Visionado("La casa de papel 3", "Aula C"),
        new Visionado("Vis a Vis", "Aula D"),
        new Visionado("The end", "Aula E"),};

    public static final int numCURSOS = CURSOS.length;

    public static final int numCONCURSOS = CONCURSOS.length;

    public static final int numVISIONADO = VISIONADO.length;

    public static final int numLECTURA = LECTURA.length;

    public static Date DameFecha() {
        Date date = null;

        return date;
    }

    public static boolean isValidIdEvent(int idevento) {
        if (idevento > 0) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isValidString(String str) {
        if (str != null && !str.isEmpty() && str.length() > 2) {
            return true;
        }
        return false;
    }

    public static Date isValidFechaEvent(String fechaEvent) {

        return Date.valueOf(fechaEvent);
    }

    public static boolean isValidDuracionCurso(double DuracionEvent) {
        if (DuracionEvent > 0 && DuracionEvent < 24) {
            return true;
        } else {
            return false;
        }
    }
}
