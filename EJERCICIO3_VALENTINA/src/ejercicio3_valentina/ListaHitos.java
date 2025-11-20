/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

import javax.swing.JOptionPane;

public class ListaHitos {
    
    private NodoHito inicio;
    
    public ListaHitos() {
        this.inicio = null;
    }
    
    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(Hito h) {
        NodoHito nuevo = new NodoHito();
        nuevo.setDato(h);
        
        if (vacia()) {
            inicio = nuevo;
        } else if (h.getIdHito() < inicio.getDato().getIdHito()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
        } else if (inicio.getSiguiente() == null) {
            inicio.setSiguiente(nuevo);
        } else {
            NodoHito aux = inicio;
            while (aux.getSiguiente() != null
                    && aux.getSiguiente().getDato().getIdHito() < h.getIdHito()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            aux.setSiguiente(nuevo);
        }
    }
    
    public void extraer() {
        if (!vacia()) {
            JOptionPane.showMessageDialog(null, "Dato extraído: " + inicio.getDato().getNombre());
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "El elemento fue extraído con éxito!");
        } else {
            JOptionPane.showMessageDialog(null, "Error: Imposible de extraer, Lista Vacía");
        }
    }
    
    public void mostrar() {
        if (!vacia()) {
            String s = "";
            NodoHito aux = inicio;
            while (aux != null) {
                s += aux.getDato().getIdHito() + " / "
                        + aux.getDato().getNombre() + " / "
                        + aux.getDato().getFechaEntrega() + " → ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "Contenido de Hitos:\n\n" + s,
                    "Entregables del Proyecto", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Error: Imposible de mostrar, Lista Vacía");
        }
    }
    
    public String toString() {
        String s = "";
        NodoHito aux = inicio;
        if (!vacia()) {
            while (aux != null) {
                s += aux.getDato().getIdHito() + " / "
                        + aux.getDato().getNombre() + " / "
                        + aux.getDato().getFechaEntrega() + " → ";
                aux = aux.getSiguiente();
            }
        } else {
            return "Error: Imposible de mostrar, Lista Vacía";
        }
        return s;
    }
}