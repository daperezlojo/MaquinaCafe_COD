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
     public static void verProductos(){
            producto prod=new producto();
            
        prod=(producto) JOptionPane.showInputDialog(null,"","Los productos disponibles son: ",JOptionPane.PLAIN_MESSAGE,null,producto.productos.toArray(),null);
            
           switch (prod.getId()){
               case 1:
                     System.out.println(monedero.compraProd(1));
                    break;
               case 2:
                    monedero.compraProd(2);
                    break;
               case 3:
                    monedero.compraProd(3);
                    break;
           }

    }
 public static void verOpc(){
        boolean res=false;
            String[] opciones=new String[5];
                opciones[0]="ver productos";
                opciones[1]= "comprar productos";
                opciones[2]="introducir dinero";
                opciones[3]= "devolver dinero"; 
                opciones[4]="salir";
                
       while(res!=true){         
        String r=(String)JOptionPane.showInputDialog(null,"Selecciona opcion:","Botonera",JOptionPane.PLAIN_MESSAGE,null,opciones,opciones.toString());

        switch(r){
                case "ver productos":
                   botones.verProd();
                break;
            case "comprar productos":
                   botones.verProductos();
                break;
            case "devolver dinero":
                System.out.println(monedero.devDin());
                break;
            case "introducir dinero":
                monedero.introDin();
                
                break;
            case "salir":
                res=true;
                break;
        }
       }
       
        }
    public static void verProd(){
       int i;
        for(i=0;i<producto.productos.size();i++){
            System.out.println(producto.productos.get(i));
        }
        
        
    }
    
}
