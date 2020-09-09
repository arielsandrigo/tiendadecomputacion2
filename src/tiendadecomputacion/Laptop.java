package tiendadecomputacion;

import java.io.Serializable;

public class Laptop extends Computadora implements Serializable
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
