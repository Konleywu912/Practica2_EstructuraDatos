/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class NodoIntegrante {
    
    private Integrante dato;
    private NodoIntegrante siguiente;
    private NodoIntegrante anterior;
    
    public NodoIntegrante(Integrante dato) {
        this.dato = dato;
    }
    
    public Integrante getDato() {
        return dato;
    }
    
    public void setDato(Integrante dato) {
        this.dato = dato;
    }
    
    public NodoIntegrante getSiguiente() {
        return siguiente;
    }
    
    public void setSiguiente(NodoIntegrante siguiente) {
        this.siguiente = siguiente;
    }
    
    public NodoIntegrante getAnterior() {
        return anterior;
    }
    
    public void setAnterior(NodoIntegrante anterior) {
        this.anterior = anterior;
    }
    }