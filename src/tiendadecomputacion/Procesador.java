package tiendadecomputacion;

import java.io.Serializable;


public class Procesador extends Componente implements Serializable
{
    private String fabricante, modelo, frecuenciaMaxima;
   

    public String getfabricante() 
    {
        return fabricante;
    }

    public void setFabricante(String fabricante)
    {
        this.fabricante = fabricante;
    }

   
    public String getFrecuenciaMaxima() 
    {
        return frecuenciaMaxima;
    }

    public void setFrecuenciaMaxima(String frecuenciaMaxima) 
    {
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

    public String getModelo()
    {
        return modelo;
    }

    public void setModelo(String modelo) 
    {
        this.modelo = modelo;
    }

    
}
