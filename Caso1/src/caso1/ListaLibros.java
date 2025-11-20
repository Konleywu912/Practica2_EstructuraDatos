/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author leymanwu
 */
public class ListaLibros {

    NodoLibro cabeza;

    public void agregarLibro(Libro libro) {
        NodoLibro nuevo = new NodoLibro(libro);
        if (cabeza == null) {
            cabeza = nuevo;
        } else {
            NodoLibro aux = cabeza;
            while (aux.siguiente != null) {
                aux = aux.siguiente;
            }
            aux.siguiente = nuevo;
        }
    }

    public Libro buscarLibro(String titulo) {
        NodoLibro aux = cabeza;
        while (aux != null) {
            if (aux.dato.getTitulo().equalsIgnoreCase(titulo)) {
                return aux.dato;
            }
            aux = aux.siguiente;
        }
        return null;
    }

    public String mostrarCatalogo() {
        StringBuilder sb = new StringBuilder();
        NodoLibro aux = cabeza;
        while (aux != null) {
            sb.append(aux.dato).append("\n");
            aux = aux.siguiente;
        }
        return sb.toString();
    }

}
