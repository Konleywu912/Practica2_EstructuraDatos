/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class Hito {
    
    private int idHito;
    private String nombre;
    private String fechaEntrega;
    
    public Hito() {
        this.idHito = 0;
        this.nombre = "";
        this.fechaEntrega = "";
    }
    
    public Hito(int idHito, String nombre, String fechaEntrega) {
        this.idHito = idHito;
        this.nombre = nombre;
        this.fechaEntrega = fechaEntrega;
    }
    
    public int getIdHito() {
        return idHito;
    }
    
    public void setIdHito(int idHito) {
        this.idHito = idHito;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getFechaEntrega() {
        return fechaEntrega;
    }
    
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }
}