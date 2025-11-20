/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;


public class NodoModificacion {
    
    private Modificacion dato;
    private NodoModificacion siguiente;
    
    public NodoModificacion(Modificacion dato) {
        this.dato = dato;
        this.siguiente = null;
    }
    
    public Modificacion getDato() {
        return dato;
    }
    
    public void setDato(Modificacion dato) {
        this.dato = dato;
    }
    
    public NodoModificacion getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoModificacion siguiente) {
        this.siguiente = siguiente;
    }
}