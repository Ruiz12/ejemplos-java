/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Uno;

/**
 *
 * @author master pc
 */
public class CalculoFactorial {
    
  //declaracion recursiva del metodo factorial 
    public double factorial(double numero) {
        if (numero <= 1) {// calculo del caso base 
            return 1;

        } else {
            return numero * factorial(numero - 1);
        }
    }// fin del metodo factorial 

    public void mostrarFactorial() {
        //calcula los factoriales del 1 al 4
        for (int contador = 0; contador <= 10; contador++) {
            System.out.printf("%d! = %.0f\n", contador, factorial(contador));
        }

    }//fin del metodo mostrar factoriales 
}//fin del metodo main

