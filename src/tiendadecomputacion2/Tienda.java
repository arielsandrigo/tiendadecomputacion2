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
    
    public void setRam(String descripcion, int cantidadStock, double precioUnitario,String marca,String tecnologia,
                                                                            String frecuenciaMaxima, int capacidad)
    { 
       this.listaProductos.add(producto.altaRam(descripcion,cantidadStock,precioUnitario,marca,tecnologia,frecuenciaMaxima,capacidad));  
    }
    
     public void setProcesador(String descripcion, int cantidadStock, double precioUnitario,String fabricante,String modelo,String frecuenciaMaxima)
    { 
       this.listaProductos.add(producto.altaProcesador(descripcion,cantidadStock,precioUnitario,fabricante,modelo, frecuenciaMaxima));  
    }
     
      public void setDisco(String descripcion, int cantidadStock, double precioUnitario,String marca,String tipo,int capacidad)
    { 
       this.listaProductos.add(producto.altaDisco(descripcion,cantidadStock,precioUnitario,marca,tipo,capacidad));  
    }
      
        public void setPlacaVideo(String descripcion, int cantidadStock, double precioUnitario,String fabricante,String modelo,int capacidadMemoria)
    { 
       this.listaProductos.add(producto.altaPlacaVideo(descripcion,cantidadStock,precioUnitario,fabricante,modelo,capacidadMemoria));  
    }
      
    public void mostrarStock() 
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
           if(p.getDescripcion().equals("Procesador"))
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
           
            if(p.getDescripcion().equals("Disco"))
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
            
            if(p.getDescripcion().equals("PlacaVideo"))
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
    
 //   ---------------------
    
    public void menuStockProductos()
    {
      
       int opcion;
       String mensaje;
       
       do
       { 
             mensaje="\n----menu stock----\n"
                    +"[1] Stock componentes\n"
                    +"[2] Stock perifericos\n"
                    +"[3] Salir\n"
                    +"Digite una opcion: ";
         opcion = EntradaYSalida.leerDatoEntero(mensaje);
        
         switch (opcion)
         {
            case 1:
    	          menuStockComponentes();
             break;
            case 2:
                  menuStockPeriferico();
             break;
            case 3:
                  EntradaYSalida.mostrarMensaje("salir");
             break;
         }
       
       } while (!(opcion == 3));

    }
//    public void listarComponentesYPerifericos()
//   {
//       listaProductos.stream().filter((p) -> 
//           (!p.getDescripcion().equals("Mouse"))).forEachOrdered((p) -> {     
//               EntradaYSalida.mostrarMensaje(
//                            " stock: "+ p.getCantidadStock()
//                            +"  ||Descripcion: "+ p.getDescripcion()
//                            +"  ||Precio: $"+ p.getPrecioUnitario() +"\n");
//          });
//    
//   }

    private void menuStockComponentes()
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
           if(p.getDescripcion().equals("Procesador"))
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
           
            if(p.getDescripcion().equals("Disco"))
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
            
            if(p.getDescripcion().equals("PlacaVideo"))
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

    private void menuStockPeriferico()
            
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
    
}