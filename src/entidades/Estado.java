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
public class Estado {

    private String devolucion;

    public Estado() {
    }

    public Estado(String devolucion) {
        this.devolucion = devolucion;
    }

    public String getDevolucion() {
        return devolucion;
    }

    public void setDevolucion(String devolucion) {
        this.devolucion = devolucion;
    }

    public static Estado nuevoEstado() {
        Estado est = new Estado();
        Scanner in = new Scanner(System.in);
        char opcion = '-';

        if (opcion != 'N' && opcion != 'S' && opcion != 'n' && opcion != 's') {
            System.out.println(" Indique el estado del préstamo (pendiente, parcial, devuelto): ");
            String estado = in.nextLine();

            switch (estado) {
                case "pendiente":
                    System.out.println("El préstamo se encuentra pendiente de la devolución");
                    break;

                case "parcial":
                    System.out.println("El préstamo esta devuelto parcialmente");
                    break;

                case "devuelto":
                    System.out.println("El préstamo ya ha sido devuelto");
                    break;

                default:
                    System.out.println("No ha introducido ninguno de los términos exigidos");
            }

        } else {

            System.out.println("No ha introducido ninguno de los términos exigidos");
        }

        return est;
    }

    /**
     * Se trata de una función que convierte un arra de objetos tipo Estado en
     * un ArrayList de objetos de tipo Estado con los mismos elementos del array
     *
     * @param array de Estados
     * @return ArrayList de Estados
     */
    public static final ArrayList<Estado> convertir(Estado[] array) {
        ArrayList<Estado> ret = new ArrayList<Estado>();
        for (Estado e : array) {
            ret.add((Estado) e);
        }
        return ret;
    }

    @Override
    public String toString() {
        return "Estado{" + "devolucion=" + devolucion + '}';
    }

}
