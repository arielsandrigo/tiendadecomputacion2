package tiendadecomputacion;


public class Computadora extends Producto
{
   
    private Procesador procesador;
    private Ram ram;
    private PlacaVideo placaVideo;
    private Disco disco;
    
    
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
}
