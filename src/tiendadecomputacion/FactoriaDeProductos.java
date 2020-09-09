package tiendadecomputacion;

import java.io.Serializable;

public class FactoriaDeProductos implements Serializable
{
    private static FactoriaDeProductos factoria = null;

    private FactoriaDeProductos()
    {}

    /**
     * Método estático que se encarga de instanciar la clase
     * FactoriaDeProductos.
     * @return factoria of type FactoriaDeProductos.
     */
    public static FactoriaDeProductos getInstancia()   
    {   
        if(null == factoria)
            factoria = new FactoriaDeProductos();   

        return factoria;
    }

    /**
     * @param productoID - final String
     * Método que se encarga instanciar una clase requerida.
     * @param cantidadStock
     * @param precioUnitario
     * @return p of type Producto
     * @throws ReflectiveOperationException
     */
    public Producto crearProducto(final String productoID, int cantidadStock,double precioUnitario,String fecha) throws ReflectiveOperationException
    {
	    Producto p = null;
	
	    try
	    {
	        p = (Producto) Class.forName(factoria.getClass().getPackage().getName()
	                + "." + productoID).getDeclaredConstructor().newInstance();  
	    }
	    catch(ClassNotFoundException | InstantiationException | 
	            IllegalAccessException e)
	    {
	        EntradaYSalida.mostrarMensaje("Error: La clase no existe ");
	        System.err.println(e);
	    }
	
	    if(null == p)
            throw new IllegalAccessException(productoID);
        
        else
        {
            p.setCantidadStock(cantidadStock);
            p.setDescripcion(productoID);
            p.setPrecioUnitario(precioUnitario);
            p.setFecha(fecha);
            
        }
          
        return p;
        
    }
  
}