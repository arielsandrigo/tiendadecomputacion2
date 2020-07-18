/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadecomputacion3;

/**
 *
 * @author ariel
 */
import java.util.Scanner;

public class EntradaYSalida {
      private static Scanner entrada = new Scanner(System.in); 

   public EntradaYSalida()
   {
       //entrada = new Scanner(System.in);
   }

   /**
    * Muestra un mensaje por consola.
    * @param s is a String type
    */
   public static void mostrarMensaje(final String s)
   {
       //entrada = new Scanner(System.in);    
       System.out.print(s);
   }

   /**
    * Lee el  nombre del producto que ingresa
    * el usuario por teclado.
    * @return: String
    */
   public static String leerNombreProducto()
   {
       return entrada.nextLine();
   }

   /**
    * Lee la cantidad de stock del producto que ingresa
    * el usuario por teclado.
    * @return int
    */
   public static String leerCantidadStock()
   {
       return entrada.next();
   }
   

   public static String leerPrecioDelProducto()
   {
     return entrada.next();
   }

   /**
    * Lee la opcion elegida por el usuario
    * del teclado devolviendo solo la primera
    * posicisión de la cadena.
    * @return char
    */
   public static String leerOpcion()
   {
       return entrada.nextLine();
   }

   public static String limpiarBuffer()
   {
       return entrada.nextLine();
   }
   
 
}
