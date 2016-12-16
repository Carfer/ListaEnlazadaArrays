/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listasimplearray;

import java.util.Scanner;

/**
 *
 * @author Invitado
 */
public class Listasimplearray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        
        String lista [] = new String [5];
        
        String valor;
        
        System.out.println("Ingrese nombres o cualquier otra cadena de carácteres: ");
        //Este ciclo for es para ingresar en el campo valor o info del registro
        for(int indice = 0;indice<lista.length;indice++){
            
            lista[indice] = entrada.next();
                     
            
            
        }
        
        System.out.println("Ingrese el dato a buscar: ");
        valor = entrada.next();
        /*Ciclo en el cual busco el dato que ingreso, imprimo el campo info o valor 
        *y avanzo al mismo tiempo para ver el indice del siguiente
        */ 
        for(int indice = 0;indice<lista.length;indice++){
            
            
            //Si es la última pocisión apunta a nulo
            if(valor.equals(lista[indice])){
                if(indice==4){
                
                System.out.println("Puntero ["+indice+"]"+" Campo encontrado:---->  "+ lista[indice] + " y apunta al sig.--> es nulo");
               
            }
                //sino entonces al siguiente
                else{
                System.out.println("Campo encontrado:---->  "+ lista[indice] + " y apunta al sig.-->"+(indice+1)+" Campo valor: "+ lista[indice+1]);
                }
            }
            
        }
                
                
         /*Ciclo en el cual imprimo el campo valor y su indice o nodo con el que apunta al siguiente
        */ 
        for(int indice = 0;indice<lista.length;indice++){
            
            System.out.print(indice +".["+ lista[indice]+"]-> ");
            
            
        }
        
        
        
        
        
        
    }
    
}
