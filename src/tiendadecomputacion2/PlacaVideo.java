package tiendadecomputacion2;

public class PlacaVideo extends Componente
{
    private String fabricante, modelo;
    int capacidadMemoria;

    public String getFabricante() 
    {
        return fabricante;
    }

    public void setFabricante(String fabricante) 
    {
        this.fabricante = fabricante;
    }

    public String getModelo() 
    {
        return modelo;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }

    public int getCapacidadMemoria()
    {
        return capacidadMemoria;
    }

    public void setCapacidadMemoria(int capacidadMemoria)
    {
        this.capacidadMemoria = capacidadMemoria;
    }
    
    
}
