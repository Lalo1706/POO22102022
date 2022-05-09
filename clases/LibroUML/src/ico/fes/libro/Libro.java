/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.libro;
import ico.fes.elementos.Autor;
import ico.fes.elementos.Editorial;
       
/**
 *
 * @author Eduardo G
 */
public class Libro {
    private String AutorNombre;
    private String Precio;
    private Libro Book;
    private Autor Author;
    
    //Constructor//
    public Libro() {
    }
    
    //Constructor Sobrecargado//

    public Libro(String AutorNombre, String Precio, Libro Book, Autor Author) {
        this.AutorNombre = AutorNombre;
        this.Precio = Precio;
        this.Book = Book;
        this.Author = Author;
    }

    public String getAutorNombre() {
        return AutorNombre;
    }

    public void setAutorNombre(String AutorNombre) {
        this.AutorNombre = AutorNombre;
    }

    public String getPrecio() {
        return Precio;
    }

    public void setPrecio(String Precio) {
        this.Precio = Precio;
    }

    public Libro getBook() {
        return Book;
    }

    public void setBook(Libro Book) {
        this.Book = Book;
    }

    public Autor getAuthor() {
        return Author;
    }

    public void setAuthor(Autor Author) {
        this.Author = Author;
    }

    //ToString//
    @Override
    public String toString() {
        return "Libro{" + "AutorNombre=" + AutorNombre + ", Precio=" + Precio + ", Book=" + Book + ", Author=" + Author + '}';
    }
    
    
    
    
    
            
            
}