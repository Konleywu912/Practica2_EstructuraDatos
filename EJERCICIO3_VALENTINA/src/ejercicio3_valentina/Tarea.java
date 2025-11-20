/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class Tarea {
    
    private int idTarea;
    private String descripcion;
    private String prioridad;
    
    public Tarea() {
        this.idTarea = 0;
        this.descripcion = "";
        this.prioridad = "";
    }
    
    public Tarea(int idTarea, String descripcion, String prioridad) {
        this.idTarea = idTarea;
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }
    
    public int getIdTarea() {
        return idTarea;
    }
    
    public void setIdTarea(int idTarea) {
        this.idTarea = idTarea;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getPrioridad() {
        return prioridad;
    }
    
    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }
}