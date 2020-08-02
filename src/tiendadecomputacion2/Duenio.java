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
             mensaje="\n\n----Bienvenidos----\n"
                    +"[1] Dar de alta producto\n"
                    +"[2] Mostrar Stock general de productos\n"
                    +"[3] Mostrar Stock general de productos\n"
                    +"[4] Salir\n"
                    +"Digite una opcion: ";
         opcion = EntradaYSalida.leerDatoEntero(mensaje);
        
         switch (opcion)
         {
            case 1:
    	          menuAltaProductos();
             break;
            case 2:
                   tienda.mostrarStockGeneral();
             break;
            case 3:
                  //
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
                  darDeAltaComputadora();
                break;
         }

    } while(!(opcion == 4));  
        
  }

    private void darDeAltaPeriferico()
    {   
        String tipo;
        String opcion;
        String descripcion="Periferico";
        String mensaje;
        int cantidadStock;
        double precioUnitario;

      do
      {
          EntradaYSalida.mostrarMensaje("\n----Alta Perifericos----\n");
          EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n");      
          cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
          precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: "); 
        
                           mensaje=("\n---Tipo---\n"
                                    + "[1] Teclado\n"
                                    + "[2] Mouse\n"
                                    + "{3} Monitor\n"
                                    + "[4] WebCam\n"
                                    +"Ingrese el tipo: ");
        tipo = EntradaYSalida.leerCadena(mensaje);    

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

          tienda.setPeriferico(tipo, cantidadStock, precioUnitario, descripcion);    
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
        EntradaYSalida.mostrarMensaje("descripcion: "+descripcion+"\n"); 
        cantidadStock=EntradaYSalida.leerDatoEntero("Ingrese la cantidad stock: ");
        precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: ");  
        fabricante=EntradaYSalida.leerCadena("Ingresar el fabricante: ");          
        modelo=EntradaYSalida.leerCadena("Ingresar el modelo: ");
        frecuenciaMaxima=EntradaYSalida.leerCadena("Ingresar la frecuencia maxima: ");
	         
        tienda.setProcesador(descripcion, cantidadStock, precioUnitario,fabricante,modelo,frecuenciaMaxima);
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
        tipo=EntradaYSalida.leerCadena("Ingresar el tipo: ");    

        if(tipo.equals("1"))
            tipo="Magnetico";
        
        else if(tipo.equals("2"))
            tipo="SSD";     
        
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
    
    private void darDeAltaComputadora()
    {
        String marca;
        String tipo;
        double precioUnitario=0;
        String modelo;
        String tamanioPantalla;
        String opcion;
    

      do
      {
        EntradaYSalida.mostrarMensaje("\n----Computadora----\n");
         
        EntradaYSalida.mostrarMensaje("\n---Clasificados---\n"
                                    + "[1] Laptop\n"
                                    + "[2] Desktop\n");
        tipo=EntradaYSalida.leerCadena("Ingresar el tipo: ");    
 
        if(tipo.equals("1"))
        {
          EntradaYSalida.mostrarMensaje("descripcion: Laptop \n");  
          marca = EntradaYSalida.leerCadena("Ingresar a marca: ");
          modelo = EntradaYSalida.leerCadena("Ingresar a modelo: ");
          tamanioPantalla = EntradaYSalida.leerCadena("Ingresar el tamaño de la pantalla: ");
          precioUnitario=EntradaYSalida.leerDatoDouble("Ingrese el precio Unitario: ");
          tienda.setLaptop("Laptop", 1, marca, modelo, tamanioPantalla,
                            precioUnitario);

       }
       else if(tipo.equals("2"))
       {
           // en precioUnitario va el precio despues de hacer el descuento del 15%...          
          tienda.setDesktop("Desktop",1,precioUnitario);
       }

        opcion=EntradaYSalida.leerCadena("\nDesea continuar[s/n]?: ");

        } while( opcion.equals("s") || opcion.equals("S"));
    }
    

    
}
