/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import java.util.*;

/**
 *
 * @author leymanwu
 */
public class ColaEspera {

    private Queue<Usuario> cola = new LinkedList<>();

    public void encolar(Usuario u) {
        cola.add(u);
    }

    public Usuario desencolar() {
        return cola.poll();
    }

    public boolean estaVacia() {
        return cola.isEmpty();
    }
}
