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
public class Producto {
    private int cantidadStock;
    private String descripcion;
    private double precioUnitario;

    public Producto() {

    }

    /**
     * 
     * @param cantidad
     * @param descripcion
     * @param precioUnitario
     */
    /*public Producto(int cantidadStock, String descripcion, double precioUnitario) {
        this.cantidadStock = cantidadStock;
        this.descripcion = descripcion;
        this.precioUnitario = precioUnitario;
    }*/

    public void setCantidadStock(int cantidadStock) {
        this.cantidadStock = cantidadStock;
    }

    public int getCantidadStock() {
        return cantidadStock;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }
    /**
     * Metodo que se encarga de crear productos mediante factoria
     * @return p of type Productos
     */
    public Producto getComponentesYperifericos(String descripcion, int cantidadStock, double precioUnitario) {
        
        FactoriaDeProductos factoria = FactoriaDeProductos.getInstancia();
        Producto p = null;
        try 
        {
             p = factoria.crearProductos(descripcion, cantidadStock, precioUnitario);
        } catch (ReflectiveOperationException e) 
        {
            // TODO Auto-generated catch block
            EntradaYSalida.mostrarMensaje(" No se pudo crear el producto");
            e.printStackTrace();
        }

        return p;
    }



    
}