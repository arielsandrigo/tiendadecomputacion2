package tiendadecomputacion2;

public class Producto 
{
    private int cantidadStock;
    private String descripcion;
    private double precioUnitario;

    public Producto() 
    {

    }

    public void setCantidadStock(int cantidadStock) 
    {
        this.cantidadStock = cantidadStock;
    }

    public int getCantidadStock() 
    {
        return cantidadStock;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setPrecioUnitario(double precioUnitario) 
    {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitario()
    {
        return precioUnitario;
    }
    
    /**
     * Metodo que se encarga de crear productos mediante factoria
     * @param descripcion
     * @param cantidadStock
     * @param precioUnitario
     * @return p of type Productos
     */
    public Producto altaPeriferico(String descripcion, int cantidadStock, double precioUnitario,String tipo) 
    {
        Periferico periferico;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             periferico=(Periferico) p;
             periferico.setTipo(tipo);
        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();
        }

        return p;
    }
    
    public Producto altaRam(String descripcion,int cantidadStock, double precioUnitario,String marca,String tecnologia,String FrecuenciaMaxima,int capacidad)
    {
       Ram ram ;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             ram=(Ram) p;
             ram.setMarca(marca);
             ram.setTecnologia(tecnologia);
             ram.setFrecuenciaMaxima(FrecuenciaMaxima);
             ram.setCapacidad(capacidad);
             
           
        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
    }
        return p;
}
    
    public Producto altaProcesador(String descripcion,int cantidadStock, double precioUnitario,String fabricante,String modelo,String FrecuenciaMaxima)
    {
       Procesador procesador ;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             procesador=(Procesador) p;
             procesador.setFabricante(fabricante);
             procesador.setModelo(modelo);
             procesador.setFrecuenciaMaxima(FrecuenciaMaxima);

        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
    }
        return p;
}
      
    public Producto altaDisco(String descripcion,int cantidadStock, double precioUnitario,String marca,String tipo,int capacidad)
    {
       Disco disco ;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             disco=(Disco) p;
             disco.setMarca(marca);
             disco.setTipo(tipo);
             disco.setCapacidad(capacidad);

        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
    }
        return p;
}
        
    public Producto altaPlacaVideo(String descripcion,int cantidadStock, double precioUnitario,String fabricante,String modelo,int capacidadMemoria)
    {
        PlacaVideo placaVideo;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             placaVideo=(PlacaVideo) p;
             placaVideo.setFabricante(fabricante);
             placaVideo.setModelo(modelo);
             placaVideo.setCapacidadMemoria(capacidadMemoria);

        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
        }
        
        return p;
    }

    //TODO: falta completar el codigo- Alberto
    Producto altaLaptop(String descripcion, int cantidadStock, double precioUnitario, 
                        String marca, String modelo, int tamanioPantalla) 
    {
        Laptop laptop;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {
            p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             
        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
        }
        
        return p;
    }
    
}