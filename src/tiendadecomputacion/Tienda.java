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
              
          }//End for
        
       }
       else
       {
           EntradaYSalida.mostrarMensaje("\n¡¡Noy hay stock!!\n");
           EntradaYSalida.leerCadena("\nPresione cualquier tecla para salir\n ");
       }
       
  }
  
    public void mostrarStockDesktop()
    {
      Desktop desktop;
      
      if (!getListaProductos().isEmpty())
      {
         for (int i = 0; i<listaProductos.size(); i++)
         {
            switch (listaProductos.get(i).getDescripcion()) 
            {
                case "Desktop":
                    desktop = (Desktop) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n" +(i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                   +"  \n"+ "    Elementos: "
                                   +"  \n   1 "+ desktop.getPlacaVideo().getDescripcion()
                                   +"  \n   2 "+ desktop.getRam().getDescripcion() 
                                   +"  \n   3 "+ desktop.getProcesador().getDescripcion()
                                   +"  \n   4 "+ desktop.getDisco().getDescripcion()
                                   +"  \n   5 "+ desktop.getTeclado().getDescripcion()
                                   +"  \n   6 "+ desktop.getMouse().getDescripcion()
                                   +"  \n   7 "+ desktop.getMonitor().getDescripcion()
                                   +"  \n   8 "+ desktop.getWebcam().getDescripcion());
                    break;
            }
         }  
     }
  }
  
    public void mostrarStockLaptop()
    {
      Laptop laptop;
      
      if (!getListaProductos().isEmpty())
      {
         for (int i = 0; i<listaProductos.size(); i++)
         {
            switch (listaProductos.get(i).getDescripcion()) 
            {
                case "Laptop":
                    laptop = (Laptop) listaProductos.get(i);
                    EntradaYSalida.mostrarMensaje("\n" +(i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+listaProductos.get(i).getPrecioUnitario()
                                   +"  ||Fecha de carga: "+ listaProductos.get(i).getFechaCarga()
                                   +"  \n"+ "    Elementos: "
                                   +"  \n     1 "+ laptop.getDisco().getDescripcion()
                                   +"  \n     2 "+ laptop.getPlacaVideo().getDescripcion()
                                   +"  \n     3 "+ laptop.getRam().getDescripcion());
                    break;
            }
         }  
     }
  }

    public void venderProducto(int indiceProducto) 
    {
        int cantidadStock;
        
        Producto p = listaProductos.get(indiceProducto);
        cantidadStock = p.getCantidadStock() - 1;
        p.setCantidadStock(cantidadStock);
          
    }

    public void venderElementoDesktop(int indiceDesktop, int opcionElemento) 
    {
        Desktop desktop = (Desktop) listaProductos.get(indiceDesktop);
        
        switch (opcionElemento) 
        {
            case 1:
                 //placa
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getProcesador().setCantidadStock(desktop.getProcesador().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            case 2:
                //ram
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getProcesador().setCantidadStock(desktop.getProcesador().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            case 3:
                //procesador
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            case 4:
                //disco
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getProcesador().setCantidadStock(desktop.getProcesador().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            case 5:
                //teclado
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            case 6:
                //mouse
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;    
            case 7:
                //monitor
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getWebcam().setCantidadStock(desktop.getWebcam().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            case 8:
                //webcam
                desktop.getRam().setCantidadStock(desktop.getRam().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                desktop.getMouse().setCantidadStock(desktop.getMouse().getCantidadStock() + 1);
                desktop.getMonitor().setCantidadStock(desktop.getMonitor().getCantidadStock() + 1);
                desktop.getTeclado().setCantidadStock(desktop.getTeclado().getCantidadStock() + 1);
                desktop.getPlacaVideo().setCantidadStock(desktop.getPlacaVideo().getCantidadStock() + 1);
                desktop.getDisco().setCantidadStock(desktop.getDisco().getCantidadStock() + 1);
                listaProductos.remove(indiceDesktop);
                break;
            
        }
        
    }
    
    public void venderElementoLaptop(int indiceLaptop, int opcionElemento) 
    {
        Laptop laptop = (Laptop) listaProductos.get(indiceLaptop);
        
        switch (opcionElemento) 
        {
            case 1:
                //disco delete
                 laptop.getPlacaVideo().setCantidadStock(laptop.getPlacaVideo().getCantidadStock() + 1);
                 laptop.getRam().setCantidadStock(laptop.getRam().getCantidadStock() + 1);
                 listaProductos.remove(indiceLaptop);
                
                break;
            case 2:
                //placa
                laptop.getDisco().setCantidadStock(laptop.getDisco().getCantidadStock() + 1);
                laptop.getRam().setCantidadStock(laptop.getRam().getCantidadStock() + 1); 
                listaProductos.remove(indiceLaptop);
                break;
            case 3:
                //ram
                laptop.getDisco().setCantidadStock(laptop.getDisco().getCantidadStock() + 1);
                laptop.getPlacaVideo().setCantidadStock(laptop.getPlacaVideo().getCantidadStock() + 1);
                listaProductos.remove(indiceLaptop);
                break;
            
        }
    }
    
   
}