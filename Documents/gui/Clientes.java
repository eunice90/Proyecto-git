/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Ejercicio2;

/**
 *
 * @author Linx
 */
public class Clientes {
    private String dni;
    private String apellidos;
    private String nombre;
    private String direccion;
    private int cp;
    private String poblacion;
    private int telefono;

    
    
    public Clientes(){
    
    }
    
    public Clientes(String Midni,String Miapellidos,String Minombre, String Midireccion){
    dni=Midni;apellidos=Miapellidos;nombre=Minombre;direccion=Midireccion;
    
    }
    
    public String getDni() {
        return dni;
    }

   
    public void setDni(String Midni) {
        this.dni = Midni;
    }

    /**
     * @return the apellidos
     */
    public String getApellidos() {
        return apellidos;
    }

    
    public void setApellidos(String Miapellidos) {
        this.apellidos = Miapellidos;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

   
    public void setNombre(String Minombre) {
        this.nombre = Minombre;
    }

    /**
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

   
    public void setDireccion(String Midireccion) {
        this.direccion = Midireccion;
    }

    /**
     * @return the cp
     */
    public int getCp() {
        return cp;
    }

   
    public void setCp(int Micp) {
        this.cp = Micp;
    }

    /**
     * @return the poblacion
     */
    public String getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(String Mipoblacion) {
        this.poblacion = Mipoblacion;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

   
    public void setTelefono(int Mitelefono) {
        this.telefono = Mitelefono;
    }
    
    
}
