
package tiendadecomputacion;

import java.io.Serializable;

public class Periferico extends Producto implements Serializable
{
    private String tipo;
  
    public String getTipo() 
    {
        return tipo;
    }

    public void setTipo(String tipo) 
    {
        this.tipo = tipo;
    }
    
}