
package tiendadecomputacion;


public class Desktop extends Computadora
{
    private Mouse mouse;
    private Webcam webcam;
    private Teclado teclado;
    private Monitor monitor;

    public Mouse getMouse() 
    {
        return mouse;
    }

    public void setMouse(Mouse mouse) 
    {
        this.mouse = mouse;
    }

    public Webcam getWebcam() 
    {
        return webcam;
    }

    public void setWebcam(Webcam webcam)
    {
        this.webcam = webcam;
    }

    public Teclado getTeclado() 
    {
        return teclado;
    }

    public void setTeclado(Teclado teclado)
    {
        this.teclado = teclado;
    }

    public Monitor getMonitor() 
    {
        return monitor;
    }

    public void setMonitor(Monitor monitor) 
    {
        this.monitor = monitor;
    }
    
    
    
}
