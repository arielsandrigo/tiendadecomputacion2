package tiendadecomputacion2;

public class Laptop extends Computadora
{
    private String marca, modelo,tamanioPantalla;
    private Procesador procesador;
    private Ram ram;
    private PlacaVideo placaVideo;
    private Disco disco;
    
    public void setMarca(String marca)
    {
        this.marca = marca;
    }

    public Procesador getProcesador() 
    {
        return procesador;
    }

    public void setProcesador(Procesador procesador)
    {
        this.procesador = procesador;
    }

    public Ram getRam() 
    {
        return ram;
    }

    public void setRam(Ram ram) 
    {
        this.ram = ram;
    }

    public PlacaVideo getPlacaVideo() 
    {
        return placaVideo;
    }

    public void setPlacaVideo(PlacaVideo placaVideo) 
    {
        this.placaVideo = placaVideo;
    }

    public Disco getDisco() 
    {
        return disco;
    }

    public void setDisco(Disco disco) 
    {
        this.disco = disco;
    }

    public String getMarca()
    {
        return marca;
    }

    public void setModelo(String modelo)
    {
        this.modelo = modelo;
    }
    
    public String getModelo() 
    {
        return modelo;
    }

    public String getTamanioPantalla() 
    {
        return tamanioPantalla;
    }

    public void setTamanioPantalla(String tamanioPantalla)
    {
        this.tamanioPantalla = tamanioPantalla;
    }
    
     
    
}
