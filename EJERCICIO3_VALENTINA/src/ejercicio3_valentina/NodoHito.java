/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class NodoHito {
    
    private Hito dato;
    private NodoHito siguiente;
    
    public NodoHito() {
        this.siguiente = null;
    }
    
    public Hito getDato() {
        return dato;
    }
    
    public void setDato(Hito dato) {
        this.dato = dato;
    }
    
    public NodoHito getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoHito siguiente) {
        this.siguiente = siguiente;
    }
}