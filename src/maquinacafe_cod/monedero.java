/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maquinacafe_cod;

import javax.swing.JOptionPane;

/**
 *
 * @author Damian
 */
public class monedero {
    private static float credito;
    private static float precio;
    private static float cambio;

    public monedero() {
    }

    public monedero(float credito, float precio, float cambio) {
        this.credito = credito;
        this.precio = precio;
        this.cambio = cambio;
    }

    @Override
    public String toString() {
        return "monedero{" + "credito=" + credito + ", precio=" + precio + ", cambio=" + cambio + '}';
    }
    
    public static void introDin(){
        credito=Float.parseFloat(JOptionPane.showInputDialog("Introduce la cantidad de dinero:"));
        System.out.println("Su credito es ahora de: "+credito);
    }
    public static String devDin(){
        cambio=credito;
        
            credito=0;
            
            return"Su cambio es: "+cambio;
    }
    public static String compraProd(int i){
        float az;
        int azucar;
        i=i-1;
        producto prod=new producto();
        prod=(producto) producto.productos.get(i);
        
         String[] opciones=new String[4];
                opciones[0]="0";
                opciones[1]="1"; 
                opciones[2]="2"; 
                opciones[3]="3"; 
        
        az=Float.parseFloat((String) JOptionPane.showInputDialog(null,"Quieres azucar extra(+0.10€)?","Azúcar",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones));
        az=(float) (az*0.1);
        cambio=credito-(prod.getPrecio()+az);
            if(cambio<0){
                return "El saldo es insuficiente, por favor inserte mas dinero";
            }
            else{
            return "El "+prod.getNombre()+" que ha ordenado se esta preparando \n"+"Su cambio es: "+cambio;
            }
    }
}

