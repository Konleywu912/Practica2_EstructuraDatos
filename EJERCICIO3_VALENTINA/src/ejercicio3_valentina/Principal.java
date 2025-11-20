/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio3_valentina;

public class Principal {
    
    public static void main(String[] args) {
        
        System.out.println("=== SISTEMA DE GESTIÓN DE PROYECTOS ===\n");
        
        ListaIntegrantesDobleCircular integrantes = new ListaIntegrantesDobleCircular();
        integrantes.insertar(new Integrante(1, "Ana García", "Desarrolladora"));
        integrantes.insertar(new Integrante(5, "Carlos Ruiz", "Diseñador"));
        integrantes.insertar(new Integrante(3, "Luis Mora", "Tester"));
        System.out.println(integrantes.toString());
        System.out.println();
        
        ColaTareas cola = new ColaTareas();
        cola.encolar(new Tarea(101, "Diseñar interfaz", "Alta"));
        cola.encolar(new Tarea(102, "Implementar login", "Media"));
        cola.encolar(new Tarea(103, "Pruebas unitarias", "Baja"));
        cola.mostrar();
        System.out.println("\nAsignando tarea...");
        cola.desencolar();
        System.out.println();
        
        PilaModificaciones pila = new PilaModificaciones();
        System.out.println("Apilando modificaciones...");
        pila.push(new Modificacion(1, "Actualización de base de datos", "2025-01-15"));
        pila.push(new Modificacion(2, "Corrección de bugs", "2025-01-16"));
        pila.push(new Modificacion(3, "Mejora de interfaz", "2025-01-17"));
        pila.mostrar();
        System.out.println("\nDesapilando última modificación...");
        Modificacion m = pila.pop();
        System.out.println("Extraído: " + m.getDescripcion());
        System.out.println();
        
        ListaHitos hitos = new ListaHitos();
        hitos.insertar(new Hito(1, "Entrega Sprint 1", "2025-02-01"));
        hitos.insertar(new Hito(3, "Entrega Sprint 3", "2025-04-01"));
        hitos.insertar(new Hito(2, "Entrega Sprint 2", "2025-03-01"));
        hitos.mostrar();
    }
}