package Gestores;

import Entidades.Libro;
import Estructuras.ListaEnlazadaDoble;
import Estructuras.NodoDoble;
import javax.swing.JOptionPane;


public class GestorLibro {

    public ListaEnlazadaDoble<Libro> misLibros;

    public GestorLibro() {
        misLibros = new ListaEnlazadaDoble();
    }

    public Libro buscaPorISBN(String isbn) {
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
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
        
        long endTime = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de buscar por ISBN: " + (endTime-startTime));
        return miLibro;
    }

    public boolean eliminarLibroPorISBN(String isbn) {
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        Libro buscado = buscaPorISBN(isbn);
        if (buscado == null) {
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de eliminar por ISBN: " + (endTime-startTime));
            return false;
        } else {
            misLibros.eliminar(buscado);
            this.guardarCambios();
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de eliminar por ISBN: " + (endTime-startTime));
            return true;
        }
    }

    public boolean insertarLibro(Libro l) {
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        if (misLibros.existe(l)) {
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de insertar libro: " + (endTime-startTime));
            
            return false;
        } else {
            misLibros.insertarFinal(l);
            this.guardarCambios();
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de insertar libro: " + (endTime-startTime));
            
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
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) miJT.getModel();
        this.vaciar(modelo);
        this.actualizar(modelo);
        
        
        long endTime = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de obtener libros: " + (endTime-startTime));
    }
}
