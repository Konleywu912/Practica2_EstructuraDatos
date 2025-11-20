/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package caso1;

/**
 *
 * @author leymanwu
 */
public class Libro {

    private String autor;
    private String titulo;
    private int stock;

    public Libro(String autor, String titulo, int stock) {
        this.autor = autor;
        this.titulo = titulo;
        this.stock = stock;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getStock() {
        return stock;
    }

    public void disminuirStock() {
        stock--;
    }

    public void aumentarStock() {
        stock++;
    }

    @Override
    public String toString() {
        return "Título: " + titulo
                + " | Autor: " + autor
                + " | Stock: " + stock;
    }

}
