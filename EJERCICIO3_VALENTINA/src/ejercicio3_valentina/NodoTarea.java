/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class NodoTarea {
    
    private Tarea elemento;
    private NodoTarea siguiente;
    
    public NodoTarea() {
        this.siguiente = null;
    }
    
    public Tarea getElemento() {
        return elemento;
    }
    
    public void setElemento(Tarea elemento) {
        this.elemento = elemento;
    }
    
    public NodoTarea getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoTarea siguiente) {
        this.siguiente = siguiente;
    }
}