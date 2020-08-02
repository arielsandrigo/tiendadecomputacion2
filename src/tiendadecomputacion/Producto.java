package tiendadecomputacion;

import java.util.ArrayList;

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
     * @param tipo
     * @return p of type Productos
     */
    public Producto altaPeriferico(String descripcion, int cantidadStock, double precioUnitario) 
    {
        //Periferico periferico;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {        
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
             //periferico=(Periferico) p;
             //periferico.setTipo(descripcion);
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
        Procesador procesador;
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
        Disco disco;
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

    Producto altaLaptop(ArrayList<Producto> listaProductos, String descripcion,
           int cantidadStock, String marca, String modelo,String tamanioPantalla, double precioUnitario)
    {
        Laptop laptop;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
       try          
       {            
            p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
            p = setArmarLaptop(p, listaProductos);
            laptop = (Laptop) p;
            laptop.setMarca(marca);
            laptop.setModelo(modelo);
            laptop.setTamanioPantalla(tamanioPantalla);
            laptop.setPrecioUnitario(precioUnitario);
             
        } catch (ReflectiveOperationException e) 
         {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
         }
        
        return p;
    }

    Producto altaDesktop(ArrayList<Producto> listaProductos,String descripcion,int cantidadStock, double precioUnitario) 
    {
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {
            p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario);
            p = setArmarDesktop(p,listaProductos);
             
        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();     
        }
        
        return p;   
    }

    private Producto setArmarLaptop(Producto p, ArrayList<Producto> listaProductos)
    {
        Laptop  laptop = (Laptop) p; 
        int cantidad;
        
        for (int i = 0; i < listaProductos.size(); i++)
        {
            String componente = listaProductos.get(i).getDescripcion();
            
            switch(componente)
            {
                case "Procesador": 
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   Procesador procesador = (Procesador)listaProductos.get(i); 
                   laptop.setProcesador(procesador);
                   cantidad = 0;
                 break;       
                case "Ram": 
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   Ram ram = (Ram)listaProductos.get(i);        
                   laptop.setRam(ram);
                   cantidad = 0;
                 break;
                    
                case "Disco": 
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   Disco disco = (Disco)listaProductos.get(i);        
                   laptop.setDisco(disco);
                   cantidad = 0;
                 break;
                case "PlacaVideo":
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   PlacaVideo placaVideo = (PlacaVideo)listaProductos.get(i);        
                   laptop.setPlacaVideo(placaVideo);
                   cantidad = 0;
                    break; 

            }    
        }
        
        return p;
        
    }
    
     private Producto setArmarDesktop(Producto p, ArrayList<Producto> listaProductos)
    {
        Desktop  desktop = (Desktop) p; 
        int cantidad;
        double precioDesktop = 0.0;
        
        for (int i = 0; i < listaProductos.size(); i++)
        {
            String componente = listaProductos.get(i).getDescripcion();
           
            switch(componente)
            {
                case "Procesador": 
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   desktop.setProcesador((Procesador)listaProductos.get(i));
                   cantidad = 0;
                   precioDesktop+= listaProductos.get(i).getPrecioUnitario();

                 break;       
                case "Ram": 
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   desktop.setRam((Ram)listaProductos.get(i));
                   cantidad = 0;
                   precioDesktop+= listaProductos.get(i).getPrecioUnitario();
                   break;
                    
                case "Disco": 
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   desktop.setDisco((Disco)listaProductos.get(i));
                   cantidad = 0;
                   precioDesktop+= listaProductos.get(i).getPrecioUnitario();
                   break;
                   
                case "PlacaVideo":
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   desktop.setPlacaVideo((PlacaVideo)listaProductos.get(i));
                   cantidad = 0;
                   precioDesktop+= listaProductos.get(i).getPrecioUnitario();
                    break; 
                case "Mouse":
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad); 
                   desktop.setMouse((Mouse)listaProductos.get(i));
                   cantidad = 0;
                    break;
                case "Teclado":
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);
                   desktop.setTeclado((Teclado)listaProductos.get(i));
                   cantidad = 0;
                    break;
                case "Monitor":
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);        
                   desktop.setMonitor((Monitor)listaProductos.get(i));
                   cantidad = 0;
                    break;
                case "Webcam":
                   cantidad = listaProductos.get(i).getCantidadStock() - 1;
                   listaProductos.get(i).setCantidadStock(cantidad);        
                   desktop.setWebcam((Webcam)listaProductos.get(i));
                   cantidad = 0;
                    break;

            }   
         
            desktop.setPrecioUnitario(precioDesktop*(100-15)/100);
        }
        
        return p;
  }
}