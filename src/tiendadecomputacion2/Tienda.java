package tiendadecomputacion2;

import java.util.ArrayList;

public class Tienda 
{
    private final Producto producto = new Producto();
    private final ArrayList<Producto> listaProductos = new ArrayList<>();

    
    public void setPeriferico(String descripcion, int cantidadStock, double precioUnitario,String tipo)
    {  
       this.listaProductos.add(producto.altaPeriferico(descripcion, cantidadStock,precioUnitario,tipo));   
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
    
    public void setLaptop(String descripcion,String tipo,int cantidadStock,String marca, String modelo,
                                                             String tamanioPantalla, double precioUnitario)
    { 
       this.listaProductos.add(producto.altaLaptop(descripcion,tipo,cantidadStock,marca,modelo,
                                                              tamanioPantalla,precioUnitario));                               
    }
    
    public void setDesktop(String descripcion,String tipo,int cantidadStock, double precioUnitario)
    { 
       this.listaProductos.add(producto.altaDesktop(descripcion,tipo,cantidadStock,precioUnitario));
                                 
    }
    
        
        
      
    public void mostrarStockGeneral() 
    {

        Ram ram;
        Procesador procesador;
        Disco disco;
        PlacaVideo placaVideo;
        Periferico periferico;
       for (Producto p: listaProductos)
         {
 
           if(p.getDescripcion().equals("Ram"))
           {
   
                ram=(Ram) p;
                EntradaYSalida.mostrarMensaje(
                    " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Marca:  "+  ram.getMarca()
                            +"  ||Tecnologia: "+ ram.getTecnologia()
                            +"  ||Frecuencia maximaa:  "+ ram.getFrecuenciaMaxima()
                            +"  ||Capacidad: "+ ram.getCapacidad()); 
           }
          else if(p.getDescripcion().equals("Procesador"))
           {
                procesador=(Procesador) p;
                EntradaYSalida.mostrarMensaje(
                    " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Fabricante:  "+ procesador.getfabricante()
                            +"  ||Modelo: "+ procesador.getModelo()
                            +"  ||Frecuencia maximaa:  "+ procesador.getFrecuenciaMaxima());
           }
           
           else if(p.getDescripcion().equals("Disco"))
           {
                disco=(Disco) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Marca:  "+ disco.getMarca()
                            +"  ||Tipo: "+ disco.getTipo()
                            +"  ||Capacidad:  "+ disco.getCapacidad());
           }
            
          else if(p.getDescripcion().equals("PlacaVideo"))
           {
                placaVideo=(PlacaVideo) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Fabricante:  "+ placaVideo.getFabricante()
                            +"  ||Placa de Video: "+ placaVideo.getModelo()
                            +"  ||Capacidad de Memoria:  "+ placaVideo.getCapacidadMemoria());
           } 
            
          else if(p.getDescripcion().equals("Periferico"))
           {
                periferico=(Periferico) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Tipo:  "+periferico.getTipo());
           } 
          else if(p.getDescripcion().equals("Laptop"))
          {
            mostrarStockLaptop();
          }
          else if(p.getDescripcion().equals("Desktop"))
          {
            mostrarStockDesktop();
          }
       }
    }


    public void mostrarStockComponentes()
    {
        Ram ram;
        Procesador procesador;
        Disco disco;
        PlacaVideo placaVideo;
       for (Producto p: listaProductos)
         {
           if(p.getDescripcion().equals("Ram"))
           {
                ram=(Ram) p;
                EntradaYSalida.mostrarMensaje(
                    " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Marca:  "+  ram.getMarca()
                            +"  ||Tecnologia: "+ ram.getTecnologia()
                            +"  ||Frecuencia maximaa:  "+ ram.getFrecuenciaMaxima()
                            +"  ||Capacidad: "+ ram.getCapacidad());
           }
           else if(p.getDescripcion().equals("Procesador"))
           {
                procesador=(Procesador) p;
                EntradaYSalida.mostrarMensaje(
                    " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Fabricante:  "+ procesador.getfabricante()
                            +"  ||Modelo: "+ procesador.getModelo()
                            +"  ||Frecuencia maxima:  "+ procesador.getFrecuenciaMaxima());
           }
           
          else  if(p.getDescripcion().equals("Disco"))
           {
                disco=(Disco) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Marca:  "+ disco.getMarca()
                            +"  ||Tipo: "+ disco.getTipo()
                            +"  ||Capacidad:  "+ disco.getCapacidad());
           }
            
         else if(p.getDescripcion().equals("PlacaVideo"))
           {
                placaVideo=(PlacaVideo) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Fabricante:  "+ placaVideo.getFabricante()
                            +"  ||Placa de Video: "+ placaVideo.getModelo()
                            +"  ||Capacidad de Memoria:  "+ placaVideo.getCapacidadMemoria());
           } 
            
            
       }
        
    }

    public void mostrarStockPeriferico()
            
    {
        Periferico periferico;
       for (Producto p: listaProductos)
         {
            
             if(p.getDescripcion().equals("Periferico"))
           {
                periferico=(Periferico) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Precio: $"+ p.getPrecioUnitario()
                            +"  ||Tipo:  "+periferico.getTipo());
           } 
       }
    }
    
     public void mostrarStockLaptop()
            
    {
        Laptop laptop;
       for (Producto p: listaProductos)
         {
            
             if(p.getDescripcion().equals("Laptop"))
           {
                laptop=(Laptop) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Tipo:  "+laptop.getTipo()
                            +"  ||Marca: "+ laptop.getMarca()
                            +"  ||Modelo:  "+laptop.getModelo()
                            +"  ||Tamaño de pantalla :  "+laptop.getTamanioPantalla()
                            +"  ||Precio $ :  "+p.getPrecioUnitario());
           } 
       }
    }
    
   public void mostrarStockDesktop()
            
    {
       Desktop desktop;
       for (Producto p: listaProductos)
         {
            
             if(p.getDescripcion().equals("Desktop"))
           {
                desktop=(Desktop) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Tipo:  "+desktop.getTipo()
                            +"  ||Precio $ :  "+p.getPrecioUnitario());
           } 
       }
    }
    
    public void mostrarStockTotalComputadoras()
            
    {
       Desktop desktop;
       Laptop laptop;
  
       for (Producto p: listaProductos)
       {
  
           if(p.getDescripcion().equals("Laptop"))
           {
                laptop=(Laptop) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Tipo:  "+laptop.getTipo()
                            +"  ||Marca: "+ laptop.getMarca()
                            +"  ||Modelo:  "+laptop.getModelo()
                            +"  ||Tamaño de pantalla :  "+laptop.getTamanioPantalla()
                            +"  ||Precio $ :  "+p.getPrecioUnitario());
           } 
       
           else if(p.getDescripcion().equals("Desktop"))
           {
                desktop=(Desktop) p;
                EntradaYSalida.mostrarMensaje(""
                    + " \nstock: "+ p.getCantidadStock()
                            +"  ||Descripcion: "+ p.getDescripcion()
                            +"  ||Tipo:  "+desktop.getTipo()
                            +"  ||Precio $ :  "+p.getPrecioUnitario());
           } 
       }
       
  }
   
}