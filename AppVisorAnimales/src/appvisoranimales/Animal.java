/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appvisoranimales;

/**
 *
 * @author Luis
 */
public class Animal {
    
    private String nombre;
    private String rutaIcono;
    private String rutaImagen;
    
    public Animal(String nombre, String rutaIcono, String rutaImagen)
    {
        this.nombre = nombre;
        this.rutaIcono = rutaIcono;
        this.rutaImagen = rutaImagen;
    }
    
    //toString
    public String toString ()
    {
        return nombre;
    }
    
    //Getters y Setters
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setRutaIcono(String rutaIcono)
    {
        this.rutaIcono = rutaIcono;
    }
    
    public void setRutaImagen(String rutaImagen)
    {
        this.rutaImagen = rutaImagen;
    }
    
    public String getNombre ()
    {
        return this.nombre;
    }
    
    public String getRutaIcono()
    {
        return this.rutaIcono;
    }
    
    public String getRutaImagen()
    {
        return this.rutaImagen;
    }
    
}
