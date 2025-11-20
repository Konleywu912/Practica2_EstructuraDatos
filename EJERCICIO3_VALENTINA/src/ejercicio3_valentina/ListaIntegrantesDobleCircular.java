/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

import javax.swing.JOptionPane;

public class ListaIntegrantesDobleCircular {
    
    private NodoIntegrante inicio;
    private NodoIntegrante fin;
    
    public ListaIntegrantesDobleCircular() {
        this.inicio = null;
        this.fin = null;
    }
    
    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }
    
    public void insertar(Integrante i) {
        NodoIntegrante nuevo = new NodoIntegrante(i);
        if (vacia()) {
            inicio = new NodoIntegrante(i);
            fin = inicio;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (i.getId() < inicio.getDato().getId()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (i.getId() >= fin.getDato().getId()) {
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            NodoIntegrante aux = inicio;
            while (aux.getSiguiente().getDato().getId() < i.getId()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }
    
    public void extraer() {
        if (!vacia()) {
            if (inicio == fin) {
                inicio = null;
                fin = null;
            } else {
                inicio = inicio.getSiguiente();
                fin.setSiguiente(inicio);
                inicio.setAnterior(fin);
            }
            JOptionPane.showMessageDialog(null, "Integrante extraído con éxito");
        } else {
            JOptionPane.showMessageDialog(null, "Error: el integrante no se puede extraer");
        }
    }
    
    public String toString() {
        if (vacia()) {
            return "Lista vacía";
        }
        NodoIntegrante aux = inicio;
        String s = "Integrantes del Equipo\n-----------------\n";
        do {
            s += aux.getDato().getId() + " / "
                    + aux.getDato().getNombre() + " / "
                    + aux.getDato().getRol() + " -> ";
            aux = aux.getSiguiente();
        } while (aux != inicio);
        return s;
    }
}