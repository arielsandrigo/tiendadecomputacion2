package tiendadecomputacion2;

import java.util.Scanner;

public class EntradaYSalida 
{
   private static final Scanner entrada = new Scanner(System.in); 

   private EntradaYSalida()
   {
   }

   public static void mostrarMensaje(final String s)
   {
       System.out.print(s);
   }

   public static String leerCadena(String mensaje)
   {
       System.out.print(mensaje);
       String entrada= new Scanner(System.in).nextLine();
       return (entrada == null ? "" : entrada);
   }
   
   public static int leerDatoEntero(String mensaje)
    {
        System.out.print(mensaje);
        return entrada.nextInt();
    }   
   
   public static float leerDatoDouble(String mensaje) 
    {
        System.out.print(mensaje);
        return (float) entrada.nextDouble();
        
    }
     
 
}
