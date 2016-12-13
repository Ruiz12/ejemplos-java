/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author master pc
 */
public class ClaseMisteriosa {
    
     public int misterio(int arreglo2[], int tamanio) {
        if (tamanio == 1) {
            System.out.println(arreglo2[0]);
            return arreglo2[0];/////////////////
            
        } else {
//            System.out.println(arreglo2[tamanio - 1]);
            return arreglo2[tamanio - 1] + misterio(arreglo2, tamanio - 1 ); 
        }
         
    } // fin del método misterio
} // fin de la clase ClaseMisteriosa

 

