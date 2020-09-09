package tiendadecomputacion;

import static java.lang.Character.toUpperCase;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
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
   
   public static int leerEntero(String mensaje)
    {
        System.out.print(mensaje);
        return entrada.nextInt();
    }   
   
   public static float leerDouble(String mensaje) 
    {
        System.out.print(mensaje);
        return (float) entrada.nextDouble();
    }
 
   public static String leerFecha()
    {
         String fecha;
         Date fechaValida = null;
       
        do
        {
          fecha = EntradaYSalida.leerCadena("Ingrese la fecha (dd/mm/yyyy): ");
 
         //   Locale espanolLocale = new Locale("es", "ES"); 

            try
            {
               fechaValida = validarFecha(fecha);

              //  System.out.println("Fecha valida");
            }
            catch(ParseException e)
            {
                e.getMessage();
            }
            
       }while( fechaValida == null );

         return fecha;
      }
   
   public static Date validarFecha(String fechaValidar) throws ParseException
   {
        
        Date fecha = null;
        
        try
        {
            SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
            formatoFecha.setLenient(false);

            fecha = formatoFecha.parse( fechaValidar );
        }
        catch(ParseException e)
        {
            throw e;
        }
        
        return fecha;
    }
}
