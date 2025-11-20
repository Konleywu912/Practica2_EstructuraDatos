/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class PilaModificaciones {
    
    private NodoModificacion cima;
    
    public PilaModificaciones() {
        this.cima = null;
    }
    
    public void push(Modificacion m) {
        NodoModificacion nuevo = new NodoModificacion(m);
        nuevo.setSiguiente(cima);
        cima = nuevo;
    }
    
    public Modificacion pop() {
        if (cima == null) {
            System.out.println("Error: Pila vacía");
            return null;
        }
        Modificacion dato = cima.getDato();
        cima = cima.getSiguiente();
        return dato;
    }
    
    public void mostrar() {
        if (cima == null) {
            System.out.println("Error: Pila Vacía");
            return;
        }
        NodoModificacion actual = cima;
        System.out.println("Historial de Modificaciones: ");
        while (actual != null) {
            System.out.println("ID: " + actual.getDato().getIdModificacion() 
                    + " - " + actual.getDato().getDescripcion() 
                    + " (" + actual.getDato().getFecha() + ")");
            actual = actual.getSiguiente();
        }
    }
}