/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Dos;

/**
 *
 * @author master pc
 */
public class Ejecutor {

    /**
     * @param args the command line arguments
     */
        

    public static void main(String args[]) {
        ClaseMisteriosa m = new ClaseMisteriosa();
        int arreglo[] = { 3,4, 6, 10, 5, 7};
        // int arreglo[] = { 2500, 2600, 3200, 4600, 5200, 6600, 7200, 8600, 9200, 10600 };
        int resultado = m.misterio( arreglo, arreglo.length );
        System.out.printf( "El resultado es: %d\n", resultado );
        
    }
}
