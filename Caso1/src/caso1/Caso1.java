/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package caso1;

import java.util.Stack;
import javax.swing.JOptionPane;

/**
 *
 * @author leymanwu
 */
public class Caso1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Sistema sb = new Sistema();

        sb.registrarLibro(new Libro("García Márquez", "Cien Años de Soledad", 1));
        sb.registrarLibro(new Libro("Rowling", "Harry Potter", 2));
        sb.registrarLibro(new Libro("Asimov", "Fundación", 0));

        sb.registrarUsuario(new Usuario("Estudiante", "Laura", 1));
        sb.registrarUsuario(new Usuario("Docente", "Carlos", 2));

        while (true) {
            int op = Integer.parseInt(JOptionPane.showInputDialog("SISTEMA DE BIBLIOTECA \n\n"
                    + "1. Ver libros disponibles\n"
                    + "2. Agregar libro\n"
                    + "3. Registrar usuario\n"
                    + "4. Ver préstamos de usuarios\n"
                    + "5. Prestar libro\n"
                    + "6. Salir\n"));
            switch (op) {
                case 1:
                    JOptionPane.showMessageDialog(null, sb.mostrarCatalogo(), "Libros Disponibles", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 2:
                    String autor = JOptionPane.showInputDialog("Ingrese autor del libro:");
                    String titulo = JOptionPane.showInputDialog("Ingrese título del libro:");
                    int stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese stock disponible:"));
                    sb.registrarLibro(new Libro(autor, titulo, stock));
                    JOptionPane.showMessageDialog(null, "Libro agregado correctamente.");
                    break;

                case 3:
                    String nombre = JOptionPane.showInputDialog("Ingrese nombre del usuario:");
                    String puesto = JOptionPane.showInputDialog("Ingrese puesto (Estudiante / Docente):");
                    int id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del usuario:"));
                    sb.registrarUsuario(new Usuario(puesto, nombre, id));
                    JOptionPane.showMessageDialog(null, "Usuario registrado correctamente.");
                    break;

                case 4:
                    StringBuilder sbHistorial = new StringBuilder();
                    ListaUsuarios lista = sb.getUsuarios();
                    NodoUsuario aux = lista.getCabeza();
                    if (aux == null) {
                        sbHistorial.append("No hay usuarios registrados.");
                    } else {
                        do {
                            sbHistorial.append(aux.dato.getNombre()).append(" - Préstamos: ");
                            Stack<Libro> historial = aux.dato.getHistorial();
                            if (historial.isEmpty()) {
                                sbHistorial.append("No tiene préstamos");
                            } else {
                                for (Libro l : historial) {
                                    sbHistorial.append(l.getTitulo()).append(", ");
                                }
                                sbHistorial.setLength(sbHistorial.length() - 2); // quitar última coma
                            }
                            sbHistorial.append("\n");
                            aux = aux.siguiente;
                        } while (aux != lista.getCabeza());
                    }
                    JOptionPane.showMessageDialog(null, sbHistorial.toString(), "Historial de préstamos", JOptionPane.INFORMATION_MESSAGE);
                    break;

                case 5:
                    int idUsuario = Integer.parseInt(JOptionPane.showInputDialog("Ingrese ID del usuario:"));
                    String tituloLibro = JOptionPane.showInputDialog("Ingrese título del libro a prestar:");
                    sb.prestarLibro(idUsuario, tituloLibro);
                    break;

                case 6:
                    JOptionPane.showMessageDialog(null, "Saliendo del sistema...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción inválida");
                    break;
            }
        }

    }
}
