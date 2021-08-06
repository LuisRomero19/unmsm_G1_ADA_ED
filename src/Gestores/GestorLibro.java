package Gestores;

import Entidades.Libro;
import Estructuras.ListaEnlazadaDoble;
import Estructuras.NodoDoble;


public class GestorLibro {

    public ListaEnlazadaDoble<Libro> misLibros;

    public GestorLibro() {
        misLibros = new ListaEnlazadaDoble();
    }

    public Libro buscaPorISBN(String isbn) {
        Libro miLibro = null;
        NodoDoble<Libro> nodoAux = misLibros.getCabecera();
        isbn = isbn.trim();
        boolean encontrado = false;
        while (nodoAux != null && !encontrado) {
            if (nodoAux.getValor().getIsbn().equalsIgnoreCase(isbn)) {
                encontrado = true;
                miLibro = nodoAux.getValor();
            }
            nodoAux = nodoAux.getSiguiente();
        }
        return miLibro;
    }

    public boolean eliminarLibroPorISBN(String isbn) {
        Libro buscado = buscaPorISBN(isbn);
        if (buscado == null) {
            return false;
        } else {
            misLibros.eliminar(buscado);
            this.guardarCambios();
            return true;
        }
    }

    public boolean insertarLibro(Libro l) {
        if (misLibros.existe(l)) {
            return false;
        } else {
            misLibros.insertarFinal(l);
            this.guardarCambios();
            return true;
        }
    }

    public void guardarCambios() {
        int tam = misLibros.getTamanio();
        if (tam > 0) {
            Libro arregloL[] = new Libro[tam];
            NodoDoble<Libro> nodoAux = misLibros.getCabecera();
            int pos = 0;
            while (nodoAux != null) {
                arregloL[pos] = nodoAux.getValor();
                nodoAux = nodoAux.getSiguiente();
                pos++;
            }
            Gestores.GestorArchivos.guardarArchivo(Entidades.Rutas.R_LIBROS, arregloL);
        }
    }

    public void obtenerDatos() {
        Libro arregloL[] = (Libro[]) Gestores.GestorArchivos.leerArchivo(Entidades.Rutas.R_LIBROS);
        if (arregloL != null) {
            for (Libro e : arregloL) {
                misLibros.insertarFinal(e);
            }
        }else{
            misLibros = new ListaEnlazadaDoble();  
        }
    }
    private void actualizar(javax.swing.table.DefaultTableModel modelo){
        NodoDoble<Libro> aux = misLibros.getCabecera();
        while (aux != null) {
            Libro u = aux.getValor();

            Object row[] = {u.getIsbn(),u.getTitulo(),u.getAutor(),u.getTipo_de_libro()};
            modelo.addRow(row);
            aux = aux.getSiguiente();
        }
    }
    
    private void vaciar(javax.swing.table.DefaultTableModel modelo){
        int cantFilas = modelo.getRowCount();
        for (int i = cantFilas-1; i>=0; i--) {
            modelo.removeRow(i);
        }
    }
    
    public void mostrarEnJTable(javax.swing.JTable miJT) {
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) miJT.getModel();
        this.vaciar(modelo);
        this.actualizar(modelo);
    }
}
