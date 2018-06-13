/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe_cod;

import java.util.ArrayList;

/**
 *
 * @author Damian
 */
public class producto {
        
        private float precio;
        private String nombre;
        private int azucar;
        private int id;

        static ArrayList productos=new ArrayList();
        
    public producto() {
        
    }


    public producto(float precio, String nombre, int azucar,int id) {
        this.precio = precio;
        this.nombre = nombre;
        this.azucar = azucar;
        this.id = id;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public static ArrayList getProductos() {
        return productos;
    }

    public static void setProductos(ArrayList productos) {
        producto.productos = productos;
    }

    @Override
    public String toString() {
        return nombre + " " + precio+ "€ " + " azucar: " + azucar + '\n';
    }


    
}
