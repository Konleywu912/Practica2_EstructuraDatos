/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Sistema {

    private ListaLibros catalogo = new ListaLibros();
    private ListaUsuarios usuarios = new ListaUsuarios();
    private ColaEspera espera = new ColaEspera();

    public void registrarLibro(Libro libro) {
        catalogo.agregarLibro(libro);
    }

    public void registrarUsuario(Usuario u) {
        usuarios.agregarUsuario(u);
    }

    public String mostrarCatalogo() {
        return catalogo.mostrarCatalogo();
    }

    public void prestarLibro(int idUsuario, String titulo) {
        Usuario u = usuarios.buscarUsuario(idUsuario);
        Libro l = catalogo.buscarLibro(titulo);

        if (u == null || l == null) {
            JOptionPane.showMessageDialog(null, "Usuario o libro no encontrado.");
            return;
        }

        if (l.getStock() > 0) {
            l.disminuirStock();
            u.registrarPrestamo(l);
            JOptionPane.showMessageDialog(null, u.getNombre() + " ha solicitado: " + titulo);
        } else {
            JOptionPane.showMessageDialog(null, "No hay stock de " + titulo + ". Agregado a la cola de espera.");
            espera.encolar(u);
        }
    }

    public ListaUsuarios getUsuarios() {
        return usuarios;
    }

}
