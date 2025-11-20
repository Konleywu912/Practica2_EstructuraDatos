/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author leymanwu
 */
public class ListaUsuarios {

    private NodoUsuario cabeza;

    public void agregarUsuario(Usuario u) {
        NodoUsuario nuevo = new NodoUsuario(u);
        if (cabeza == null) {
            cabeza = nuevo;
            cabeza.siguiente = cabeza;
            cabeza.anterior = cabeza;
        } else {
            NodoUsuario ultimo = cabeza.anterior;
            nuevo.siguiente = cabeza;
            nuevo.anterior = ultimo;
            ultimo.siguiente = nuevo;
            cabeza.anterior = nuevo;
        }
    }

    public Usuario buscarUsuario(int id) {
        if (cabeza == null) {
            return null;
        }
        NodoUsuario aux = cabeza;
        do {
            if (aux.dato.getId()== id) {
                return aux.dato;
            }
            aux = aux.siguiente;
        } while (aux != cabeza);
        return null;
    }

    public NodoUsuario getCabeza() {
        return cabeza;
    }
}
