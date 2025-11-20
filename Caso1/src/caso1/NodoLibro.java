/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author leymanwu
 */
public class NodoLibro {

    Libro dato;
    NodoLibro siguiente;

    public NodoLibro(Libro dato) {
        this.dato = dato;
        this.siguiente = null;
    }
}
