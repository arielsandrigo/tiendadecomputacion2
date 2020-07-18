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
public class Controlador 
{
    private Duenio duenio = null;

    /**
     * Metodo que es el corazón del programa
     */
    public void ejecutar()
    {
        duenio = new Duenio();
        duenio.menuPrincipal();
       
    }
}