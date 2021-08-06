package Entidades;

import java.io.Serializable;
import java.util.Objects;

public class Libro implements Serializable{
    //private static final String LIBRE="Libre",OCUPADO="Ocupado";
    private String isbn;
    private String titulo;
    private String autor;
    private String tipo_de_libro;
    private String estado;

    public Libro(String isbn, String titulo, String autor, String tipo_de_libro) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.tipo_de_libro = tipo_de_libro;
        this.estado = "false";
    }
    
      public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTipo_de_libro() {
        return tipo_de_libro;
    }

    public void setTipo_de_libro(String tipo_de_libro) {
        this.tipo_de_libro = tipo_de_libro;
    }
    
    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        return  isbn+","+titulo+","+autor+","+tipo_de_libro+","+","+estado;
    }
    
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.isbn);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Libro other = (Libro) obj;
        if (!Objects.equals(this.isbn, other.isbn)) {
            return false;
        }
        return true;
    }
    
}
