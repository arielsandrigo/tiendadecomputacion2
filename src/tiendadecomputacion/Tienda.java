package tiendadecomputacion;

import java.util.ArrayList;

public class Tienda 
{
    private final Producto producto = new Producto();
    private final ArrayList<Producto> listaProductos = new ArrayList<>();


    public void setPeriferico(String descripcion, int cantidadStock, double precioUnitario,String fechaCarga)
    {  
       this.listaProductos.add(producto.altaPeriferico(descripcion, cantidadStock,precioUnitario,fechaCarga));   
    }
    
    public void setRam(String descripcion, int cantidadStock, double precioUnitario,String marca,
                                        String tecnologia,String frecuenciaMaxima, int capacidad,String fechaCarga)
    { 
       this.listaProductos.add(producto.altaRam(descripcion,cantidadStock,precioUnitario, marca,
                                                        tecnologia,frecuenciaMaxima,capacidad,fechaCarga));  
    }
    
     public void setProcesador(String descripcion, int cantidadStock, double precioUnitario,
                                    String fabricante,String modelo,String frecuenciaMaxima,String fechaCarga)
    { 
       this.listaProductos.add(producto.altaProcesador(descripcion,cantidadStock,precioUnitario,
                                                           fabricante,modelo, frecuenciaMaxima,fechaCarga));  
    }
     
    public void setDisco(String descripcion, int cantidadStock,double precioUnitario,String marca,
                                                                        String tipo,int capacidad,String fechaCarga)
    { 
       this.listaProductos.add(producto.altaDisco(descripcion,cantidadStock,precioUnitario,marca,
                                                                                 tipo,capacidad,fechaCarga));  
    }
      
    public void setPlacaVideo(String descripcion, int cantidadStock, double precioUnitario,String fabricante,
                                                                          String modelo,int capacidadMemoria,String fechaCarga)
    { 
       this.listaProductos.add(producto.altaPlacaVideo(descripcion,cantidadStock,precioUnitario,fabricante,
                                                                                  modelo,capacidadMemoria,fechaCarga));  
    }
    
    public void setLaptop(String descripcion, int cantidadStock,String marca, String modelo,
                                                             String tamanioPantalla, double precioUnitario,String fechaCarga)
    { 
       this.listaProductos.add(producto.altaLaptop(listaProductos,descripcion, cantidadStock, marca,
                                                 modelo, tamanioPantalla, precioUnitario,fechaCarga));                               
    }
    
    public void setDesktop(String descripcion,int cantidadStock, double precioUnitario,String fechaCarga)
    { 
       this.listaProductos.add(producto.altaDesktop(listaProductos,descripcion,cantidadStock,precioUnitario,fechaCarga));
                                 
    }
    public ArrayList<Producto> getListaProductos()
    {
        return listaProductos;
    }
    
    
    public void mostrarStockGeneral() 
    {
        Ram ram;
        Procesador procesador;
        Disco disco;
        PlacaVideo placaVideo;
        Laptop laptop;
        Desktop desktop;
       if (!getListaProductos().isEmpty())
       {
        for (int i = 0; i<listaProductos.size(); i++)
        {
            switch (listaProductos.get(i).getDescripcion()) 
            {
                case "Ram":
                    ram=(Ram) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                    +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                    +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                    +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                    +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                    +"  ||Marca:  "+  ram.getMarca()
                                    +"  ||Tecnologia: "+ ram.getTecnologia()
                                    +"  ||Frecuencia maxima:  "+ ram.getFrecuenciaMaxima()
                                    +"  ||Capacidad: "+ ram.getCapacidad());

                    break;
                case "Procesador":
                    procesador=(Procesador) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                    +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                    +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                    +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                    +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                    +"  ||Fabricante:  "+ procesador.getfabricante()
                                    +"  ||Modelo: "+ procesador.getModelo()
                                    +"  ||Frecuencia maxima:  "+ procesador.getFrecuenciaMaxima());
                    break;
                case "Disco":
                    disco=(Disco) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                    +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                    +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                    +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                    +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                    +"  ||Marca:  "+ disco.getMarca()
                                    +"  ||Tipo: "+ disco.getTipo()
                                    +"  ||Capacidad:  "+ disco.getCapacidad());
                    break;
                case "PlacaVideo":
                    placaVideo=(PlacaVideo) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                   +"  ||Fabricante:  "+ placaVideo.getFabricante()
                                   +"  ||Modelo: "+ placaVideo.getModelo()
                                   +"  ||Capacidad de Memoria:  "+ placaVideo.getCapacidadMemoria());
                    break;
                case "Mouse":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga());

                    break;
                case "Teclado":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga());

                    break;
                case "Monitor":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga());

                    break;
                case "Webcam":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga());

                    break;
                case "Laptop":
                    laptop=(Laptop) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Marca: "+ laptop.getMarca()
                                   +"  ||Modelo:  "+laptop.getModelo()
                                   +"  ||Tamaño de pantalla :  "+laptop.getTamanioPantalla()
                                   +"  ||Precio: $"+listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                   +"  ||Elementos: "+laptop.getDisco().getDescripcion()
                                   +"  ||"+ laptop.getPlacaVideo().getDescripcion()
                                   +"  ||"+ laptop.getRam().getDescripcion() 
                                   +"  ||"+ laptop.getProcesador().getDescripcion());
                    break;
                case "Desktop":
                    desktop = (Desktop) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                   +"  ||Elementos: "+desktop.getDisco().getDescripcion()
                                   +"  ||"+ desktop.getPlacaVideo().getDescripcion()
                                   +"  ||"+ desktop.getRam().getDescripcion() 
                                   +"  ||"+ desktop.getProcesador().getDescripcion()
                                   +"  ||"+ desktop.getTeclado().getDescripcion()
                                   +"  ||"+ desktop.getMouse().getDescripcion()
                                   +"  ||"+ desktop.getMonitor().getDescripcion()
                                   +"  ||"+ desktop.getWebcam().getDescripcion());
                    break;
            }
              
        }
        
    }
        else
       {
             EntradaYSalida.mostrarMensaje("\n¡¡Noy hay stock!!\n");
             EntradaYSalida.leerCadena("\nPresione cualquier tecla para salir\n ");
       }
       
  }

    void descontarProducto(int indiceProducto) 
    {
        int cantidadStock;
        Producto p = listaProductos.get(indiceProducto);
        cantidadStock = p.getCantidadStock() - 1;
        p.setCantidadStock(cantidadStock);
          
    }

}