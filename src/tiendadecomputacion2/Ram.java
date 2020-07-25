package tiendadecomputacion2;

public class Ram extends Componente
{
    private String marca, tecnologia, frecuenciaMaxima;
    private int capacidad;

    
    public String getMarca() 
    {
        return marca;
    }

    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public String getTecnologia() 
    {
        return tecnologia;
    }

    public void setTecnologia(String tecnologia)
    {
        this.tecnologia = tecnologia;
    }

    public String getFrecuenciaMaxima() 
    {
        return frecuenciaMaxima;
    }

    public void setFrecuenciaMaxima(String frecuenciaMaxima) 
    {
        this.frecuenciaMaxima = frecuenciaMaxima;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    
    
    
    
}
