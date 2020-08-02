package tiendadecomputacion;

import java.util.ArrayList;

public class Tienda 
{
    private final Producto producto = new Producto();
    private final ArrayList<Producto> listaProductos = new ArrayList<>();

    
    public void setPeriferico(String descripcion, int cantidadStock, double precioUnitario)
    {  
       this.listaProductos.add(producto.altaPeriferico(descripcion, cantidadStock,precioUnitario));   
    }
    
    public void setRam(String descripcion, int cantidadStock, double precioUnitario,String marca,
                                        String tecnologia,String frecuenciaMaxima, int capacidad)
    { 
       this.listaProductos.add(producto.altaRam(descripcion,cantidadStock,precioUnitario, marca,
                                                        tecnologia,frecuenciaMaxima,capacidad));  
    }
    
     public void setProcesador(String descripcion, int cantidadStock, double precioUnitario,
                                    String fabricante,String modelo,String frecuenciaMaxima)
    { 
       this.listaProductos.add(producto.altaProcesador(descripcion,cantidadStock,precioUnitario,
                                                           fabricante,modelo, frecuenciaMaxima));  
    }
     
    public void setDisco(String descripcion, int cantidadStock,double precioUnitario,String marca,
                                                                        String tipo,int capacidad)
    { 
       this.listaProductos.add(producto.altaDisco(descripcion,cantidadStock,precioUnitario,marca,
                                                                                 tipo,capacidad));  
    }
      
    public void setPlacaVideo(String descripcion, int cantidadStock, double precioUnitario,String fabricante,
                                                                          String modelo,int capacidadMemoria)
    { 
       this.listaProductos.add(producto.altaPlacaVideo(descripcion,cantidadStock,precioUnitario,fabricante,
                                                                                  modelo,capacidadMemoria));  
    }
    
    public void setLaptop(String descripcion, int cantidadStock,String marca, String modelo,
                                                             String tamanioPantalla, double precioUnitario)
    { 
       this.listaProductos.add(producto.altaLaptop(listaProductos,descripcion, cantidadStock, marca,
                                                 modelo, tamanioPantalla, precioUnitario));                               
    }
    
    public void setDesktop(String descripcion,int cantidadStock, double precioUnitario)
    { 
       this.listaProductos.add(producto.altaDesktop(listaProductos,descripcion,cantidadStock,precioUnitario));
                                 
    }
    
    public void mostrarStockGeneral() 
    {
        Ram ram;
        Procesador procesador;
        Disco disco;
        PlacaVideo placaVideo;
        Laptop laptop;
        Desktop desktop;
        
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
                                   +"  ||Fabricante:  "+ placaVideo.getFabricante()
                                   +"  ||Placa de Video: "+ placaVideo.getModelo()
                                   +"  ||Capacidad de Memoria:  "+ placaVideo.getCapacidadMemoria());
                    break;
                case "Mouse":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario());
                    break;
                case "Teclado":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario());
                    break;
                case "Monitor":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario());
                    break;
                case "Webcam":
                    EntradaYSalida.mostrarMensaje("\n"+ (i+1)
                                   +"  ||Stock: "+ listaProductos.get(i).getCantidadStock()
                                   +"  ||Descripcion: "+ listaProductos.get(i).getDescripcion()
                                   +"  ||Precio: $"+ listaProductos.get(i).getPrecioUnitario());
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
                                   +"  ||Elementos: "+desktop.getDisco()
                                   +"  ||"+ desktop.getPlacaVideo().getDescripcion()
                                   +"  ||"+ desktop.getRam().getDescripcion() 
                                   +"  ||"+ desktop.getProcesador().getDescripcion());
                                   //+"  ||"+ );
                    break;
            }
              
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