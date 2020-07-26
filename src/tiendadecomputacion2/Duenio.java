package tiendadecomputacion2;

public class Duenio 
{
    private Tienda tienda = null;    
     
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
             mensaje="\n----Bienvevidos----\n"
                    +"[1] Dar de alta producto\n"
                    +"[2] Mostrar Stock de productos\n"
                    +"[3] Salir\n"
                    +"Digite una opcion: ";
         opcion = EntradaYSalida.leerDatoEntero(mensaje);
        
         switch (opcion)
         {
            case 1:
    	          menuAltaProductos();
             break;
            case 2:
                  menuStockProductos();
             break;
            case 3:
                  EntradaYSalida.mostrarMensaje("salir");
             break;
         }
       
       } while (!(opcion == 3));

    }

    private void menuAltaProductos()
    {
        int opcion;
        String mensaje;

        do
       {
          mensaje="\n----Menu de productos----\n"
                         +"[1] Perifericos\n"
                         +"[2] Componente\n"
                         +"[3] Laptop\n"
                         +"[4] Salir\n"     
                         +"\nDigite una opcion: ";
          opcion = EntradaYSalida.leerDatoEntero(mensaje);
        
          switch (opcion)
          {
              case 1:
                  darDeAltaPeriferico();
                break;
              case 2:
                  darDeAltaComponente();
                break;
              case 3:
                  //darDeAltaLaptop();
                break;
         }

    } while(!(opcion == 4));  
        
  }

    private void darDeAltaPeriferico()
    {   
        String tipo="";
        String opcion;
        String descripcion="Periferico";
        String mensaje;
        int cantidadStock;
        double precioUnitario;

      do
      {

          EntradaYSalida.mostrarMensaje("\n----Perifericos----\n");
           EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n");      
          cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
          precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: "); 
        
                           mensaje=("\n---Tipo---\n"
                                    + "[1] Teclado\n"
                                    + "[2] Mouse\n"
                                    + "{3} Monitor\n"
                                    + "[4] WebCam\n"
                                    +"Ingrese el tipo");
        tipo=EntradaYSalida.leerCadena(mensaje);    

       
	 switch (tipo)
          {
              case "1" : 
                      tipo="Teclado";                        
                break;
                
              case "2":
                        tipo="Mouse";;
                break;
              case "3":
                       tipo="Monitor";
                break;
              case "4":
                       tipo="WebCam";
                break;
         }

                
        tienda.setPeriferico(descripcion, cantidadStock, precioUnitario,tipo);
        
        EntradaYSalida.mostrarMensaje("\nDesea continuar[s/n]?: ");
        EntradaYSalida.limpiarBuffer();
        opcion = EntradaYSalida.leerOpcion();

        } while( opcion.equals("s") || opcion.equals("S"));
            
    }


    private void darDeAltaComponente() 
    {
        int opcion;
        String mensaje;
       do{ 
        mensaje= "\n----Menu de Componentes----\n"
                       +"[1] RAM\n"
                       +"[2] Procesador\n"
                       +"[3] Disco\n"
                       +"[4] Placa de Video\n"       
                       +"[5] Salir\n"
                       +"Digite una opcion: ";
       opcion= EntradaYSalida.leerDatoEntero(mensaje);

        
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

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Ram----\n");
        EntradaYSalida.mostrarMensaje("Descripcion: "+descripcion+"\n");       
        cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
        precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: ");  
        marca=EntradaYSalida.leerCadena("Ingresar la marca: ");          
        tecnologia=EntradaYSalida.leerCadena("Ingresar la tecnologia:  ");
        frecuenciaMaxima=EntradaYSalida.leerCadena("Ingresar la frecuencia maxima: ");
        capacidad=EntradaYSalida.leerDatoEntero("Ingrese la capacidad: ");
	
                
        tienda.setRam(descripcion, cantidadStock, precioUnitario,marca,tecnologia,frecuenciaMaxima,capacidad);
        
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

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Procesador----\n");
        EntradaYSalida.leerCadena("descripcion: "+descripcion+"\n"); 
        cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
        precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: ");  
        fabricante=EntradaYSalida.leerCadena("Ingresar el fabricante: ");          
        modelo=EntradaYSalida.leerCadena("Ingresar el modelo: ");
        frecuenciaMaxima=EntradaYSalida.leerCadena("Ingresar la frecuencia maxima: ");
	
                
        tienda.setProcesador(descripcion, cantidadStock, precioUnitario,fabricante,modelo,frecuenciaMaxima);
        
        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");
        
        } while( opcion.equals("s") || opcion.equals("S"));
            
    }

    private void darDeAltaDisco() {
        String marca;
        String tipo="";
        int capacidad;
        String descripcion="Disco";
        int cantidadStock;
        double precioUnitario;
        String opcion;
    

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Disco----\n");
        EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n"); 
        cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
        precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: "); 
        marca=EntradaYSalida.leerCadena("Ingresar a marca: ");
        
        EntradaYSalida.mostrarMensaje("\n---Tipo---\n"
                                    + "[1] Magnetico\n"
                                    + "[2] SSD\n");
        tipo=EntradaYSalida.leerCadena("Ingresar el tipo");    

        if(tipo.equals("1"))
        {
          tipo="Magnetico";
        }
        if(tipo.equals("2"))
        {
         tipo="SSD";     
        }
          
     
        capacidad=EntradaYSalida.leerDatoEntero("Ingresar la capacidad: ");
	
                
        tienda.setDisco(descripcion, cantidadStock, precioUnitario,marca,tipo,capacidad);
        
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

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Placa De Video----\n");
        EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n");   
        cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
        precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: ");  
        fabricante=EntradaYSalida.leerCadena("Ingresar el fabricante: ");          
        modelo=EntradaYSalida.leerCadena("Ingresar el modelo: ");
        capacidadMemoria=EntradaYSalida.leerDatoEntero("Ingresar la capacidad de memoria: ");
	
                
        tienda.setPlacaVideo(descripcion, cantidadStock, precioUnitario,fabricante,modelo,capacidadMemoria);
        
        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");

        } while( opcion.equals("s") || opcion.equals("S"));
            
    }
    
    
        public void menuStockProductos()
    {
      
       int opcion;
       String mensaje;
       
       do
       { 
             mensaje="\n----menu stock----\n"
                    +"[1] Stock perifericos\n"
                    +"[2] Stock componentes\n"
                    +"[4] Stock Total\n"
                    +"[3] Salir\n"
                    +"Digite una opcion: ";
         opcion = EntradaYSalida.leerDatoEntero(mensaje);
        
         switch (opcion)
         {
            case 1:
                  tienda.mostrarStockPeriferico();
             break;
            case 2:
                  tienda.mostrarStockComponentes();
             break;
            case 3:
                  tienda.mostrarStockGeneral();
             break;
            case 4:
                  EntradaYSalida.mostrarMensaje("salir");
             break;
         }
       
       } while (!(opcion == 4));

    }
    
    //    private void darDeAltaLaptop()
//    {
//        String opcion, marca, modelo;
//        int cantidadStock;
//        double precioUnitario;
//
//      do
//      {
//        EntradaYSalida.mostrarMensaje("\n----Lista de Componentes y Perifericos----\n");
//        tienda.listarComponentesYPerifericos();
//
//        EntradaYSalida.mostrarMensaje("Ingresar cantidad:  ");
//        cantidadStock = Integer.parseInt(EntradaYSalida.leerCantidadStock());
//        EntradaYSalida.mostrarMensaje("Ingresar precio unitario: ");
//        precioUnitario = Double.parseDouble(EntradaYSalida.leerPrecioDelProducto());
//        EntradaYSalida.mostrarMensaje("Ingresar Marca: ");
//        marca = EntradaYSalida.leerPrecioDelProducto();
//        EntradaYSalida.mostrarMensaje("Ingresar Modelo: ");
//        modelo = EntradaYSalida.leerPrecioDelProducto();
//        
//        //tienda.setStockLaptop("Laptop", cantidadsssStock, precioUnitario, marca, modelo);
//        
//        EntradaYSalida.mostrarMensaje("\nDesea continuar[s/n]?: ");
//        EntradaYSalida.limpiarBuffer();
//        opcion = EntradaYSalida.leerOpcion();
//
//        } while( opcion.equals("s") || opcion.equals("S"));
//                
//    }
    
}
