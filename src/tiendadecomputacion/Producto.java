package tiendadecomputacion;

import java.io.Serializable;
import java.util.ArrayList;

public class Producto implements Serializable 
{
    private int cantidadStock;
    private String descripcion;
    private double precioUnitario;
    private String fecha;
    
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

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
     
    

    /**
     * Metodo que se encarga de crear productos mediante factoria
     * @param descripcion
     * @param cantidadStock
     * @param precioUnitario
     * @param fechaCarga
     * @return p of type Productos
     */
    public Producto altaPeriferico(String descripcion, int cantidadStock, double precioUnitario,String fecha) 
    {
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {        

             p = factoria.crearProducto(descripcion,cantidadStock,precioUnitario,fecha);
        } catch (ReflectiveOperationException e) 
        {
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();
        }

        return p;
    }
    
    public Producto altaRam(String descripcion,int cantidadStock, double precioUnitario,String marca,String tecnologia,String FrecuenciaMaxima,int capacidad,String fecha)
    {
        Ram ram ;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario,fecha);
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
    
    public Producto altaProcesador(String descripcion,int cantidadStock, double precioUnitario,String fabricante,String modelo,String FrecuenciaMaxima,String fecha)
    {
        Procesador procesador;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario,fecha);
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
      
    public Producto altaDisco(String descripcion,int cantidadStock, double precioUnitario,String marca,String tipo,int capacidad,String fecha)
    {
        Disco disco;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario,fecha);
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
        
    public Producto altaPlacaVideo(String descripcion,int cantidadStock, double precioUnitario,String fabricante,String modelo,int capacidadMemoria,String fecha)
    {
        PlacaVideo placaVideo;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {
             p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario,fecha);
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

    public Producto altaLaptop(ArrayList<Producto> listaProductos, String descripcion,
           int cantidadStock, String marca, String modelo,String tamanioPantalla, double precioUnitario,String fecha)
    {
        Laptop laptop;
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
       try          
       {            
            p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario,fecha);
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

    public Producto altaDesktop(ArrayList<Producto> listaProductos,String descripcion,int cantidadStock, double precioUnitario,String fecha) 
    {
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        
        try 
        {
            p = factoria.crearProducto(descripcion, cantidadStock, precioUnitario,fecha);
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
        int j;
        int opcion;
        //Muestro listado de procesadores
        
        ArrayList<Producto> listadoProcesadores = this.getListadoPorCategoria("Procesador", listaProductos);
        j=-1;
        for( Producto producto: listadoProcesadores )
        {
            j++;
            Procesador procesador = (Procesador) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) +"||Fabricante: " +procesador.getfabricante() + "||Modelo: " + procesador.getModelo() + "||Frecuencia Maxima: " + procesador.getFrecuenciaMaxima() );
        }  
        
         opcion = EntradaYSalida.leerEntero("\n\nSeleccione el Procesador: ");
            
        
        ArrayList<Producto> listadoRams = this.getListadoPorCategoria("Ram", listaProductos);
        j=-1;               
        for(Producto producto:listadoRams  )
        {   
            j++;
            Ram ram = (Ram) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) + "||Marca: "+ram.getMarca() + "||Tecnologia: " + ram.getTecnologia() + "||Frecuencia Maxima: " + ram.getFrecuenciaMaxima() );
        }

        opcion = EntradaYSalida.leerEntero("\n\nSeleccione la memoria Ram: ");
                
        ArrayList<Producto> listadoDisco = this.getListadoPorCategoria("Disco", listaProductos);
        j=-1;
        for( Producto producto: listadoDisco )
        {
            j++;
            Disco disco = (Disco) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) +"||Marca: " + disco.getMarca() + "||Tipo: " + disco.getTipo() );
        }  
  
        opcion = EntradaYSalida.leerEntero("\n\nSeleccione el Disco: ");
         
        ArrayList<Producto> listadoPlacaVideo = this.getListadoPorCategoria("PlacaVideo", listaProductos);
        j=-1;
        for( Producto producto: listadoPlacaVideo )
        {
            j++;
            PlacaVideo  placaVideo = (PlacaVideo) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) +"||Fabricante: " +placaVideo.getFabricante() + "||Modelo: " + placaVideo.getModelo() + "||Capacidad Memoria:  " + placaVideo.getCapacidadMemoria() );
        }  
  
        opcion = EntradaYSalida.leerEntero("\n\nSeleccione la Placa de Video: ");
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
    
    private ArrayList<Producto> getListadoPorCategoria( String categoria, ArrayList<Producto> listaProductos  )
    {
        
        ArrayList<Producto> productosCategoria = new ArrayList<>();
                
        for( Producto producto: listaProductos)
        {
            if ( producto.getDescripcion().equals(categoria))
            {
                productosCategoria.add(producto);
            }
        }
        
        return productosCategoria;
    }
    
     private Producto setArmarDesktop(Producto p, ArrayList<Producto> listaProductos)
    {
        Desktop  desktop = (Desktop) p; 
        int cantidad;
        double precioDesktop = 0.0;
        int j;
        int opcion;
        //Muestro listado de procesadores
        
        ArrayList<Producto> listadoProcesadores = this.getListadoPorCategoria("Procesador", listaProductos);
        j=-1;
        for( Producto producto: listadoProcesadores )
        {
            j++;
            Procesador procesador = (Procesador) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) +"||Fabricante: " +procesador.getfabricante() + "||Modelo: " + procesador.getModelo() + "||Frecuencia Maxima: " + procesador.getFrecuenciaMaxima() );
        }  
        
         opcion = EntradaYSalida.leerEntero("\n\nSeleccione el Procesador: ");
            
        
        ArrayList<Producto> listadoRams = this.getListadoPorCategoria("Ram", listaProductos);
        j=-1;               
        for(Producto producto:listadoRams  )
        {   
            j++;
            Ram ram = (Ram) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) + "||Marca: "+ram.getMarca() + "||Tecnologia: " + ram.getTecnologia() + "||Frecuencia Maxima: " + ram.getFrecuenciaMaxima() );
        }

        opcion = EntradaYSalida.leerEntero("\n\nSeleccione la memoria Ram: ");
                
        ArrayList<Producto> listadoDisco = this.getListadoPorCategoria("Disco", listaProductos);
        j=-1;
        for( Producto producto: listadoDisco )
        {
            j++;
            Disco disco = (Disco) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) +"||Marca: " + disco.getMarca() + "||Tipo: " + disco.getTipo() );
        }  
  
        opcion = EntradaYSalida.leerEntero("\n\nSeleccione el Disco: ");
         
        ArrayList<Producto> listadoPlacaVideo = this.getListadoPorCategoria("PlacaVideo", listaProductos);
        j=-1;
        for( Producto producto: listadoPlacaVideo )
        {
            j++;
            PlacaVideo  placaVideo = (PlacaVideo) producto;
            EntradaYSalida.mostrarMensaje("\n"+ (j+1) +"||Fabricante: " +placaVideo.getFabricante() + "||Modelo: " + placaVideo.getModelo() + "||Capacidad Memoria:  " + placaVideo.getCapacidadMemoria() );
        }  
  
        opcion = EntradaYSalida.leerEntero("\n\nSeleccione la Placa de Video: ");
        
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