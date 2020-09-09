
package tiendadecomputacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class LeerYGrabarArchivo
{
    private String nombreArchivo;
    private Tienda tienda =new Tienda();

    public LeerYGrabarArchivo(String nombreArchivo)
    {
        this.nombreArchivo = nombreArchivo;
    }
    
    
    public Tienda deSerializar() throws IOException, ClassNotFoundException 
     {
        FileInputStream f = new FileInputStream(this.nombreArchivo);
        ObjectInputStream o = new ObjectInputStream(f);
        Tienda tienda = (Tienda) o.readObject();
        o.close();
        f.close();
        return tienda;
     }

    public void serializar(Tienda tienda) throws IOException 
     {
        FileOutputStream f = new FileOutputStream(this.nombreArchivo);
        ObjectOutputStream o = new ObjectOutputStream(f);
        o.writeObject(tienda);
        o.close();
        f.close();
     }
    
     public void guardarArchivo(Tienda tienda)
    {
        try
        {
           this.serializar(tienda);
        }
        catch(IOException ex)
        {
        ex.getMessage();
        }
    }   
     
      public void leerArchivo()
    {
        try
        {
          tienda=this.deSerializar();
        }
            catch (IOException | ClassNotFoundException e)
         {
              e.getMessage();
         }
    }
     
    public void inicializar()
    {
        try 
        {
            this.leerArchivo();

        } catch (NullPointerException e)
        {
            e.getMessage();
        }

        Duenio duenio = new Duenio(tienda);
        duenio.menuPrincipal();
    }
 
    }  


