/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;


import javax.swing.JOptionPane;

public class ColaTareas {
    
    private NodoTarea inicio;
    private NodoTarea fin;
    
    public ColaTareas() {
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
    
    public void encolar(Tarea t) {
        NodoTarea nuevo = new NodoTarea();
        nuevo.setElemento(t);
        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
        } else {
            fin.setSiguiente(nuevo);
            fin = nuevo;
        }
    }
    
    public void desencolar() {
        if (!vacia()) {
            System.out.println("Extraído: " + inicio.getElemento().getDescripcion());
            inicio = inicio.getSiguiente();
            JOptionPane.showMessageDialog(null, "Tarea asignada",
                    "Desencolar",
                    JOptionPane.CLOSED_OPTION);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer", "Cola Vacía",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void mostrar() {
        if (!vacia()) {
            String s = "";
            NodoTarea aux = inicio;
            while (aux != null) {
                s += aux.getElemento().getIdTarea() + " / "
                        + aux.getElemento().getDescripcion() + " / "
                        + aux.getElemento().getPrioridad() + " <- ";
                aux = aux.getSiguiente();
            }
            JOptionPane.showMessageDialog(null, "La Cola contiene: \n" + s,
                    "Tareas Pendientes", JOptionPane.PLAIN_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "No se puede mostrar", "Cola Vacía",
                    JOptionPane.ERROR_MESSAGE);
        }
    }
}