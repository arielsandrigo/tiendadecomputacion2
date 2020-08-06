package tiendadecomputacion;

public class Duenio 
{
    private Tienda tienda = null;    
    private Producto producto= new Producto();
    public Duenio()
    {
           
    }

    /**
     * Metodo que se encarga de las diferentes opciones que tiene
     * el dueño
     */
    public void menuPrincipal()
    {
       tienda = new Tienda();
       int opcion;
       String mensaje;
       
       do
       { 
             mensaje="\n\n----Bienvenidos----\n"
                    +"[1] Dar de alta producto\n"
                    +"[2] Mostrar Stock general de productos\n"
                    +"[3] Venta de productos\n"
                    +"[4] Salir\n"
                    +"Digite una opcion: ";
         opcion = EntradaYSalida.leerEntero(mensaje);
        
         switch (opcion)
         {
            case 1:
    	          menuAltaProductos();
             break;
            case 2:
                   tienda.mostrarStockGeneral();
             break;
            case 3:
                  menuVentaProductos();
             break;
            case 4:
                  EntradaYSalida.mostrarMensaje("salir");
             break;
         }
       
       } while (!(opcion == 4));

    }

    private void menuAltaProductos()
    {
        int opcion;
        String mensaje;

        do
       {
          mensaje="\n----Menu alta productos----\n"
                         +"[1] Periferico\n"
                         +"[2] Componente\n"
                         +"[3] Computadora\n"
                         +"[4] Salir\n"     
                         +"\nDigite una opcion: ";
          opcion = EntradaYSalida.leerEntero(mensaje);
        
          switch (opcion)
          {
              case 1:
                  darDeAltaPeriferico();
                break;
              case 2:
                  darDeAltaComponente();
                break;
              case 3:
                  darDeAltaComputadora();
                break;
         }

    } while(!(opcion == 4));  
        
  }

    private void darDeAltaPeriferico()
    {   
         String tipo;
         String opcion;
         String descripcion;
         String mensaje;
         int  cantidadStock;
         double precioUnitario=0.0;
         String fechaCarga;

      do
      {
          EntradaYSalida.mostrarMensaje("\n----Alta Perifericos----\n");
          EntradaYSalida.mostrarMensaje("descripcion: Periferico\n");
          cantidadStock = EntradaYSalida.leerEntero("Ingrese la cantidad stock: ");
          while(cantidadStock<=0)
          {
          cantidadStock = EntradaYSalida.leerEntero("\nLa cantidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
          }
          precioUnitario = EntradaYSalida.leerDouble("Ingrese el precio Unitario: "); 
          while(precioUnitario<=0)
          {
          precioUnitario = EntradaYSalida.leerDouble("\nEl precio ingresado no es válido\n"
                                                   + "\nIngrese nuevamente: ");
          }
          
          fechaCarga=EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaaa: ");
                  
                          mensaje = ("\n---Tipo---\n"
                                    + "[1] Teclado\n"
                                    + "[2] Mouse\n"
                                    + "{3} Monitor\n"
                                    + "[4] Webcam\n"
                                    +"Ingrese el tipo: ");
         descripcion = EntradaYSalida.leerCadena(mensaje);    

	 switch (descripcion)
         {
              case "1" : 
                      descripcion="Teclado";                        
                break;           
              case "2":
                      descripcion="Mouse";;
                break;
              case "3":
                      descripcion="Monitor";
                break;
              case "4":
                      descripcion="Webcam";
                break;
          }

          tienda.setPeriferico(descripcion, cantidadStock, precioUnitario,fechaCarga);    
          opcion = EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");
        
        } while( opcion.equals("s") || opcion.equals("S"));
            
}

    private void darDeAltaComponente() 
    {
        int opcion;
        String mensaje;
        
       do
       { 
         mensaje= "\n----Menu alta Componentes----\n"
                       +"[1] RAM\n"
                       +"[2] Procesador\n"
                       +"[3] Disco\n"
                       +"[4] Placa de Video\n"       
                       +"[5] Salir\n"
                       +"Digite una opcion: ";
        opcion= EntradaYSalida.leerEntero(mensaje);
    
          switch (opcion)
          {
              case 1:
                  darDeAltaRam();
                break;
              case 2:
                  darDeAltaProcesador();
                break;
              case 3:
                  darDeAltaDisco();
                break;
              case 4:
                  darDeAltaPlacaVideo();
                break;
         }

    } while(!(opcion == 5));  
        
  }

    private void darDeAltaRam()
    { 
        
        String marca;
        String tecnologia;
        String frecuenciaMaxima;
        int capacidad;   
        String descripcion="Ram";
        int cantidadStock;
        double precioUnitario;
        String opcion;
        String fechaCarga;

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Ram----\n");
        EntradaYSalida.mostrarMensaje("Descripcion: "+descripcion+"\n");       
        cantidadStock=EntradaYSalida.leerEntero("Ingrese la cantidad stock: ");
        while(cantidadStock<=0)
        {
          cantidadStock = EntradaYSalida.leerEntero("\nLa cantidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        }
        precioUnitario=EntradaYSalida.leerDouble("Ingrese el precio Unitario: "); 
        while(precioUnitario<=0)
        {
          precioUnitario = EntradaYSalida.leerDouble("\nEl precio ingresado no es válido\n"
                                                   + "\nIngrese nuevamente: ");
        }
        fechaCarga=EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaaa: "); 
        marca=EntradaYSalida.leerCadena("Ingresar la marca: ");          
        tecnologia=EntradaYSalida.leerCadena("Ingresar la tecnologia:  ");
        frecuenciaMaxima=EntradaYSalida.leerCadena("Ingresar la frecuencia maxima: ");
        capacidad=EntradaYSalida.leerEntero("Ingrese la capacidad: ");
         while(capacidad<=0)
        {
          capacidad = EntradaYSalida.leerEntero("\nLa capacidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        }
         
        tienda.setRam(descripcion, cantidadStock, precioUnitario,marca,tecnologia,frecuenciaMaxima,capacidad,fechaCarga);       
        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");
       
        } while( opcion.equals("s") || opcion.equals("S"));
            
    }
   
    private void darDeAltaProcesador()
    {   
        String fabricante;
        String modelo;
        String frecuenciaMaxima;
        String descripcion="Procesador";
        int cantidadStock;
        double precioUnitario;
        String opcion;
        String fechaCarga;

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Procesador----\n");
        EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n"); 
        cantidadStock=EntradaYSalida.leerEntero("Ingrese la cantidad stock: ");
        while(cantidadStock<=0)
        {
          cantidadStock = EntradaYSalida.leerEntero("\nLa cantidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        }
        precioUnitario=EntradaYSalida.leerDouble("Ingrese el precio Unitario: ");
        while(precioUnitario<=0)
        {
          precioUnitario = EntradaYSalida.leerDouble("\nEl precio ingresado no es válido\n"
                                                   + "\nIngrese nuevamente: ");
        }
        fechaCarga = EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaaa: ");
        fabricante=EntradaYSalida.leerCadena("Ingresar el fabricante: ");          
        modelo=EntradaYSalida.leerCadena("Ingresar el modelo: ");
        frecuenciaMaxima=EntradaYSalida.leerCadena("Ingresar la frecuencia maxima: ");
	         
        tienda.setProcesador(descripcion, cantidadStock, precioUnitario,fabricante,modelo,frecuenciaMaxima,fechaCarga);
        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");
        
        } while( opcion.equals("s") || opcion.equals("S"));
            
    }

    private void darDeAltaDisco() 
    {
        String marca,tipo;
        int capacidad;
        String descripcion="Disco";
        int cantidadStock;
        double precioUnitario;
        String opcion;
        String fechaCarga;
    
      do
      {
        EntradaYSalida.mostrarMensaje("\n----Disco----\n");
        EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n"); 
        cantidadStock=EntradaYSalida.leerEntero("Ingrese la cantidad stock: ");
         while(cantidadStock<=0)
        {
          cantidadStock = EntradaYSalida.leerEntero("\nLa cantidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        }
        precioUnitario=EntradaYSalida.leerDouble("Ingrese el precio Unitario: "); 
        while(precioUnitario<=0)
        {
          precioUnitario = EntradaYSalida.leerDouble("\nEl precio ingresado no es válido\n"
                                                   + "\nIngrese nuevamente: ");
        }
        fechaCarga = EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaaa: ");
        marca=EntradaYSalida.leerCadena("Ingresar a marca: ");
        EntradaYSalida.mostrarMensaje("\n---Tipo---\n"
                                    + "[1] Magnetico\n"
                                    + "[2] SSD\n");
        tipo=EntradaYSalida.leerCadena("Ingresar el tipo: ");    

        if(tipo.equals("1"))
            tipo="Magnetico";
        
        else if(tipo.equals("2"))
            tipo="SSD";     
        
        capacidad=EntradaYSalida.leerEntero("Ingresar la capacidad: ");      
        while(capacidad<=0)
        {
          capacidad = EntradaYSalida.leerEntero("\nLa capacidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        } 
        
        tienda.setDisco(descripcion, cantidadStock, precioUnitario,marca,tipo,capacidad,fechaCarga);
        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");

        } while( opcion.equals("s") || opcion.equals("S"));
    }                

    private void darDeAltaPlacaVideo()
    {
        String fabricante;
        String modelo;
        int capacidadMemoria;
        String descripcion="PlacaVideo";
        int cantidadStock;
        double precioUnitario;
        String opcion;
        String fechaCarga;

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Placa De Video----\n");
        EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n");   
        cantidadStock=EntradaYSalida.leerEntero("Ingrese la cantidad stock: ");
        while(cantidadStock<=0)
        {
          cantidadStock = EntradaYSalida.leerEntero("\nLa cantidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        }
        precioUnitario=EntradaYSalida.leerDouble("Ingrese el precio Unitario: "); 
        while(precioUnitario<=0)
        {
          precioUnitario = EntradaYSalida.leerDouble("\nEl precio ingresado no es válido\n"
                                                   + "\nIngrese nuevamente: ");
        }
        fechaCarga = EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaaa: ");
        fabricante=EntradaYSalida.leerCadena("Ingresar el fabricante: ");          
        modelo=EntradaYSalida.leerCadena("Ingresar el modelo: ");
        capacidadMemoria=EntradaYSalida.leerEntero("Ingresar la capacidad de memoria: ");
        while(capacidadMemoria<=0)
        {
          capacidadMemoria = EntradaYSalida.leerEntero("\nLa capacidad ingresada no es válida\n"
                                                   + "\nIngrese nuevamente: ");
        } 
	          
        tienda.setPlacaVideo(descripcion, cantidadStock, precioUnitario,fabricante,modelo,capacidadMemoria,fechaCarga);
        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");

        } while( opcion.equals("s") || opcion.equals("S"));
            
    }
    
    private void darDeAltaComputadora()
    {
        String marca;
        String tipo;
        double precioUnitario=0;
        String modelo;
        String tamanioPantalla;
        String opcion;
        String fechaCarga;
      
      do
      {
        EntradaYSalida.mostrarMensaje("\n----Computadora----\n");
         
        EntradaYSalida.mostrarMensaje("\n---Clasificados---\n"
                                    + "[1] Laptop\n"
                                    + "[2] Desktop\n");
        tipo=EntradaYSalida.leerCadena("Ingresar el tipo: ");  
        if(producto.getCantidadStock()>0){
            
        if(tipo.equals("1"))
        {
        EntradaYSalida.mostrarMensaje("descripcion: Laptop \n");  
        marca = EntradaYSalida.leerCadena("Ingresar a marca: ");
        modelo = EntradaYSalida.leerCadena("Ingresar a modelo: ");
        tamanioPantalla = EntradaYSalida.leerCadena("Ingresar el tamaño de la pantalla: ");
        precioUnitario=EntradaYSalida.leerDouble("Ingrese el precio Unitario: ");
        while(precioUnitario<=0)
        {
          precioUnitario = EntradaYSalida.leerDouble("\nEl precio ingresado no es válido\n"
                                                   + "\nIngrese nuevamente: ");
        }
        fechaCarga = EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaa: ");

        tienda.setLaptop("Laptop", 1, marca, modelo, tamanioPantalla,
                            precioUnitario,fechaCarga);

       }
       if(tipo.equals("2"))
       {
       fechaCarga = EntradaYSalida.leerCadena("Ingrese la fecha dd/mm/aaaa: ");
          tienda.setDesktop("Desktop", 1, precioUnitario,fechaCarga);
       }
       }
       else
      {
        EntradaYSalida.mostrarMensaje("\n¡¡Noy hay stock!!\n");
      } 

       opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");

      } while( opcion.equals("s") || opcion.equals("S"));
    
    }
    
    

    private void menuVentaProductos() 
    {
        String opcion;
        int indiceProducto;
         if (!tienda.getListaProductos().isEmpty())
         {
        do
         {
           EntradaYSalida.mostrarMensaje("\n----Lista de productos----");
           tienda.mostrarStockGeneral();
           indiceProducto =  EntradaYSalida.leerEntero("\n\nIngrese una opción: ");
         while(tienda.getListaProductos().size()!=indiceProducto)
         {
           indiceProducto =  EntradaYSalida.leerEntero("\nOpcion no valida"
                                                   + "\nIngrese nuevamente: ");
         }
       
           tienda.descontarProducto(indiceProducto - 1);
           EntradaYSalida.mostrarMensaje("¡¡Compra Exitosa!!");
           opcion=EntradaYSalida.leerCadena("\n\nDesea continuar[s/n]?: ");
    
        } while( opcion.equals("s") || opcion.equals("S"));
        }
        else
        {        
            EntradaYSalida.mostrarMensaje("\n¡¡No hay stock!!\n");
            EntradaYSalida.leerCadena("\nPresione cualquier tecla para salir ");
         }
    }

}
