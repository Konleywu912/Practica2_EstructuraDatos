/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class Integrante {
    
    private int id;
    private String nombre;
    private String rol;
    
    public Integrante() {
        this.id = 0;
        this.nombre = "";
        this.rol = "";
    }
    
    public Integrante(int id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol = rol;
    }
    
    public int getId() {
        return id;
    }
    
    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getRol() {
        return rol;
    }
    
    public void setRol(String rol) {
        this.rol = rol;
    }
}