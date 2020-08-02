package tiendadecomputacion2;

public class Laptop extends Computadora
{
    private String marca, modelo,tamanioPantalla;

    public void setMarca(String marca) 
    {
        this.marca = marca;
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
