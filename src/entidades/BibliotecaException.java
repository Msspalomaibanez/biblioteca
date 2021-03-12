/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author USER
 */
public class BibliotecaException extends Exception {
    
    public BibliotecaException(String msg) {
        super (msg);
    }
    
    
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
     * - titulo (DVD)
     * 
     * Ejemplos válidos: Marcos Gutierrez; El guardián entre el centeno; 
     * Salvat...
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
     * setearla como valor para el DNI
     * 
     * Cadena de caracteres
     * 
     * Obligatorio: sí
     * 
     * @param dni cadena de caracteres
     * @return true de ser un valor válido para un DNI y false si es que no
     */
    
    public static boolean validarDNI (String dni) {
        boolean ret = true;
        if (dni.isEmpty()) {
            ret = false;
        }
        if (dni.length() != 9 ) {
            ret = false;
        }
        
        return ret;
    }
    
    /**
     * Función que se le pasa una cadena de caracteres y comprueba si es válida para 
     * setearla como valor para el teléfono
     * 
     * Cadena de caracteres
     * 
     * Obligatorio: sí
     * 
     * @param tlfn cadena de caracteres
     * @return true de ser un valor válido para un teléfono y false si es que no
     */
    
    public static boolean validarTlfn (String tlfn) {
        boolean ret = true;
        if (tlfn.isEmpty()) {
            ret = false;
        }
        if (tlfn.length() != 9) {
            ret = false;
        }
        for (char c : tlfn)
    }
}
