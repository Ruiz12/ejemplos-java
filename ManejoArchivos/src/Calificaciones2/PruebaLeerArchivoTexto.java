/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calificaciones2;


/**
 *
 * @author SALAS
 */
public class PruebaLeerArchivoTexto{
  
   public static void main( String args[] )
   {
      LeerArchivoTexto aplicacion = new LeerArchivoTexto();

      aplicacion.abrirArchivo();
      aplicacion.leer_informacion();
      aplicacion.cerrarArchivo();
   } // fin de main
} // fin de la clase PruebaLeerArchivoTexto