package tiendadecomputacion2;


public class Procesador extends Componente
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
