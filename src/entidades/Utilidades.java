/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.sql.Date;
import java.text.Normalizer;
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
     * public Penalizacion(long id, String motivo, Date fecha, int idSocio)
     */
    public static final Penalizacion PENALIZACIONES[] = {
        new Penalizacion(1, "Retraso en la entrega", "13-12-2020",1),
        new Penalizacion(2, "Devolución del préstamo en mal estado", "30-12-2020",2),
        new Penalizacion(3, "Restraso en la entrega", "3-1-2021",3)

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

    public static final Elemento ELEMENTOS[] = {
        new Libro(1, "La Comunidad de los Anillos", "Ediciones Minotauro", "J. R. R. Tolkien", "568"),
        new Libro(2, "Aquitania", "Editorial Planeta", "Eva García Sáen de Uruti", "416"),
        new Libro(3, "Línea de fuego", "Alfaguara", "Arturo Pérez-Reverte", "688"),
        new DVD(4, "Harry Potter y la Piedra Filosofal"),
        new DVD(5, "Frozen"),
        new DVD(6, "Interstellar")
    };
    public static final int numElementos = ELEMENTOS.length;

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
        new Lote(1, "04-01-2020"),
        new Lote(2, "06-01-2020"),
        new Lote(3, "10-01-2020")
    };
    public static final int numLotes = LOTES.length;

    public static final String formatString = "dd-MM-yyyy";
    public static final DateTimeFormatter iso = DateTimeFormatter.ofPattern(formatString);

    public static final Evento EVENTOS[] = {
        new Curso(9.99, "Aula 1", 1, "Español para extranjeros", Date.valueOf(LocalDate.parse("2020-01-02"))),
        new Curso(2.01, "Aula 2", 2, "windows xp", Date.valueOf(LocalDate.parse("2020-02-03"))),
        new Curso(1.05, "Aula 3", 3, "curso de ofice", Date.valueOf(LocalDate.parse("2020-03-04"))),
        new Curso(2.5, "Aula 4", 4, "Matematica", Date.valueOf(LocalDate.parse("2020-04-05"))),
        new Curso(4.5, "Aula 5", 5, "fisica", Date.valueOf(LocalDate.parse("2020-05-06"))),
        new Curso(1.5, "Aula 6", 6, "natacion", Date.valueOf(LocalDate.parse("2020-06-07"))),
        new Concurso("Tipo A", "ViajeMadrid", 7, "Concurso 1", Date.valueOf(LocalDate.parse("2020-07-08"))),
        new Concurso("Tipo B", "ViajeBarcelona", 8, "Concurso 2", Date.valueOf(LocalDate.parse("2020-08-09"))),
        new Concurso("Tipo C", "ViajeAlmania", 9, "Concurso 3", Date.valueOf(LocalDate.parse("2020-09-10"))),
        new Concurso("Tipo D", "Viajekoria", 10, "Concurso 4", Date.valueOf(LocalDate.parse("2020-10-11"))),
        new Concurso("Tipo E", "ViajeJapon", 11, "Concurso 5", Date.valueOf(LocalDate.parse("2020-11-12"))),
        new Lectura("Libro A", 7, "The Great Gatsby", Date.valueOf(LocalDate.parse("2020-12-13"))),
        new Lectura("Libro B", 8, "War and Peace", Date.valueOf(LocalDate.parse("2020-01-14"))),
        new Lectura("Libro C", 9, "Beautiful Things", Date.valueOf(LocalDate.parse("2020-02-15"))),
        new Lectura("Libro D", 10, "The Catcher in the Rye", Date.valueOf(LocalDate.parse("2020-03-16"))),
        new Lectura("Libro E", 11, "The Iliad", Date.valueOf(LocalDate.parse("2020-04-17"))),
        new Visionado("La casa de papel 1", "Aula A"),
        new Visionado("La casa de papel 2", "Aula B"),
        new Visionado("La casa de papel 3", "Aula C"),
        new Visionado("Vis a Vis", "Aula D"),
        new Visionado("The end", "Aula E"),};

    public static final int numEventos = EVENTOS.length;

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

public static String removeDiacriticalMarks(String string) {
        //Form.NFC acepta ñ y distingue las tildes en español
        return Normalizer.normalize(string, Normalizer.Form.NFC)
                .replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
    }
}
