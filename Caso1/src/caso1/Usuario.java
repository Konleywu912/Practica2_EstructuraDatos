/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import java.util.Stack;

/**
 *
 * @author leymanwu
 */
public class Usuario {

    private String puesto;
    private String nombre;
    private int id;
    private Stack<Libro> historial; // pila de préstamos

    public Usuario(String puesto, String nombre, int id) {
        this.puesto = puesto;
        this.nombre = nombre;
        this.id = id;
        this.historial = new Stack<>();
    }

    public String getPuesto() {
        return puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public void registrarPrestamo(Libro libro) {
        historial.push(libro);
    }

    public Stack<Libro> getHistorial() {
        return historial;
    }

    @Override
    public String toString() {
        return nombre + " (" + puesto + ") - ID: " + id;
    }

}
