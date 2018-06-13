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
public class MaquinaCafe_Cod {
    
public static void main(String[] args) {
        producto p1=new producto(2,"chocolate",2,1);
        producto p2=new producto(2,"te",0,2);
        producto p3=new producto(2,"cafe",1,3);
        
            
                producto.productos.add(p1);
                producto.productos.add(p2);
                producto.productos.add(p3);
                
                
            
            
            Display.verOpciones();
            
    }
    
}