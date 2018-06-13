/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe_cod;

/**
 *
 * @author Damian
 */
public class botones {
    private int cantidad;
    private int seleccion;

    public botones() {
    }

    public botones(int cantidad, int seleccion) {
        this.cantidad = cantidad;
        this.seleccion = seleccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(int seleccion) {
        this.seleccion = seleccion;
    }
}
    
   