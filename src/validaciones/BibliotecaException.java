/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package validaciones;

/**
 *
 * @author USER
 */
public class BibliotecaException extends Exception {
    
    public BibliotecaException(String msg) {
        super (msg);
    }
    
    /**
     * Función que se le pasa         y comprueba si es válida para 
     * setearla como valor para 
     * 
     * tipo dato
     * 
     * Obligatorio: 
     * 
     * Validación usada para los campos:
     * 
     * Ejemplos válidos: 
     * 
     * @param 
     * @return true de ser un valor válido para      y false si es que no
     */
    
    
    
    /**
     * Función que se le pasa una cadena de caracteres y comprueba si es válida para 
     * setearla como valor para el nombre 
     * 
     * Cadena de caracteres [3-50 caracteres] [a-z, A-Z], tildes, dieresis y espacios 
     * 
     * Obligatorio: sí
     * 
     * Validación usada para los campos:
     * - nombre, apellido (socio, evento, proveedor, genero)
     * - autor, editorial (libro)
     * - tipo (concurso)
     * 
     * Ejemplos válidos: Marcos Gutierrez; Salvat...
     * 
     * @param nombre cadena de caracteres
     * @return true de ser un valor válido para un nombre y false si es que no
     */
    
    public static boolean validarNombre (String nombre) {
        boolean ret = true;
        
        if(nombre.isEmpty()) {
            ret = false;
        }
        if (nombre.length() < 1 || nombre.length() > 150) {
            ret = false;
        }
        for (char c : nombre.toCharArray()) {
            if (Character.isDigit(c) || (!Character.isLetter(c) && c != ' ')) {
                ret = false;
                break;
            }
          
        }
        return ret;
    }
    
        /**
     * Función que se le pasa una cadena de caracteres y comprueba si es válida para 
     * setearla como valor para el teléfono
     * 
     * Cadena de caracteres numérica [0-9] que admite espacios y 
     * de tamaño fijo a 9 caracteres
     * 
     * Obligatorio: sí
     * 
     * Validación usada para los campos:
     * - telefono (socio, proveedor)
     * 
     * Ejemplos válidos: 600436911; 722 13 00 53; 620 345 876
     * 
     * @param tlfn cadena de caracteres
     * @return true de ser un valor válido para el teléfono y false si es que no
     */
    
    public static boolean validarTlfn (String tlfn) {
        boolean ret = true;
        if (tlfn.isEmpty()) {
            ret = false;
        }
        if (tlfn.length() != 11 && tlfn.length() != 12 && tlfn.length() != 9) {
            ret = false;
        }
        for (char c : tlfn.toCharArray()) {
            if ((Character.isLetter(c) && c != ' ') || !Character.isDigit(c)) {
                ret = false;
                break;
            }
        }
        return ret;
    }
    
        /**
     * Función que se le pasa un campo y comprueba si es válida para 
     * setearla como valor para varios campos
     * 
     * Cadena de caracteres [3-150] [a-z, A-Z], tildes, dieresis, signos de
     * puntuacion, exclamacion e interrogacion, digitos [0-9], simbolos
     * alfanumericos y caracteres especiales
     * 
     * Obligatorio: sí
     * 
     * Validación usada para los campos:
     * - titulo (DVD)
     * - libro (lectura)
     * - nombre (libro)
     * - pelicula (visionado)
     * - direccion (socio)
     * - ubicacion (estanteria)
     * - motivo (penalizacion)
     * - concurso (premio)
     * 
     * Ejemplos válidos: 300 la pelicula; El guardian entre el centeno, C/ Siglo XX;
     * seccion A, estanteria f, 2ª balda de "Poesia"...
     * 
     * @param otros cadena de caracteres
     * @return true de ser un valor válido para ciertos campos y false si es que no
     */
    
    public static boolean validarOtrosCampos (String otros) {
        boolean ret = true;
        if (otros.isEmpty()) {
            ret = false;
        }
        
        if (otros.length() < 3 || otros.length() > 150) {
            ret = false;
        }
        return ret;
    }
    
        /**
     * Función que se le pasa una cadena de caracteres y comprueba si es válida para 
     * setearla como valor para el estado de la devolucion
     * 
     * Cadena de caracteres {"pendiente", "parcial", "completo"}
     * 
     * Obligatorio: si
     * 
     * Validación usada para los campos: 
     * - devolucion (estado)
     * 
     * Ejemplos válidos: 
     * 
     * @param devo cadena de caracteres
     * @return true de ser un valor válido para la devolucion y false si es que no
     */
    
    public static boolean validarDevolucion (String devo) {
        boolean ret = true;
        if (devo.isEmpty()) {
            ret = false;
        }
        if (devo != "pendiente" && devo != "parcial" && devo != "completo") {
            ret = false;
        }
        return ret;
    }
    
        /**
     * Función que se le pasa un entero y comprueba si es válida para 
     * setearla como valor para el motivo de una penaliz
     * 
     * Entero [0-9] en horas
     * 
     * Obligatorio: si
     * 
     * Validación usada para los campos:
     * duracion (curso)
     * 
     * Ejemplos válidos: 30, 400
     * 
     * @param dur entero
     * @return true de ser un valor válido para la duracion y false si es que no
     */
    
    public static boolean validarDuracion (int dur) {
        boolean ret = true;
        
        if (dur < 1 || dur > 1000) {
            ret = false;
        } 
        return ret;
    }
    
        /**
     * Función que se le pasa un entero y comprueba si es válida para 
     * setearla como valor para el aula
     * 
     * Entero [0-9]
     * 
     * Obligatorio: si
     * 
     * Validación usada para los campos:
     * - aula (curso, visionado)
     * 
     * Ejemplos válidos: 12, 48
     * 
     * @param aula entero
     * @return true de ser un valor válido para un aula y false si es que no
     */
    
    public static boolean validarAula (int aula) {
        boolean ret = true;
        
        if (aula < 1 || aula > 48) {
            ret = false;
        }
        return ret; 
    }
}
