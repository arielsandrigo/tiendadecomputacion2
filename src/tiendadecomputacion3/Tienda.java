/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiendadecomputacion3;

/**
 *
 * @author ariel
 */
import java.util.ArrayList;

public class Tienda 
{
 private Producto producto = new Producto();
  private ArrayList<Producto> listaProductos = new ArrayList<>();


    
    public void setProducto(String descripcion, int cantidadStock, double precioUnitario)
    {   

       listaProductos.add(producto.getComponentesYperifericos(descripcion, cantidadStock, precioUnitario));   
    }
    
    
    public void mostrarStock() {

        String listadoProductos = "";

        for (int i = 0; i < listaProductos.size(); i++) {

            listadoProductos += " stock: "+listaProductos.get(i).getCantidadStock()+listaProductos.get(i).getDescripcion() 
          + listaProductos.get(i).getPrecioUnitario()+ "\n";
        }

        EntradaYSalida.mostrarMensaje(listadoProductos);
    }

    
}