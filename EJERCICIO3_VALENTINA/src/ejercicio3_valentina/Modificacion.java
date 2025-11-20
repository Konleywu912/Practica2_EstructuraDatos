/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class Modificacion {
    
    private int idModificacion;
    private String descripcion;
    private String fecha;
    
    public Modificacion(int idModificacion, String descripcion, String fecha) {
        this.idModificacion = idModificacion;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }
    
    public int getIdModificacion() {
        return idModificacion;
    }
    
    public void setIdModificacion(int idModificacion) {
        this.idModificacion = idModificacion;
    }
    
    public String getDescripcion() {
        return descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public String getFecha() {
        return fecha;
    }
    
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    }