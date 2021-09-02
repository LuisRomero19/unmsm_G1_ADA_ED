package Gestores;

import Entidades.Usuario;
import Estructuras.ListaEnlazadaDoble;
import Estructuras.NodoDoble;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class GestorUsuarios {

    public ListaEnlazadaDoble<Usuario> misUsuarios;

    public GestorUsuarios() {
        //misUsuarios = new ListaEnlazadaDoble();
    }

    public Usuario buscarPorDNI(String dni) {
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
  
        Usuario miUsuario = null;
        NodoDoble<Usuario> nodoAux = misUsuarios.getCabecera();
        dni = dni.trim();
        boolean encontrado = false;
        while (nodoAux != null && !encontrado) {
            if (nodoAux.getValor().getDni().equalsIgnoreCase(dni)) {
                encontrado = true;
                miUsuario = nodoAux.getValor();
            }
            nodoAux = nodoAux.getSiguiente();
        }
        
        long endTime = System.currentTimeMillis();

        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de buscar DNI: " + (endTime-startTime));
        return miUsuario;
    }

    public boolean eliminarPorDNI(String dni) {
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        Usuario buscado = buscarPorDNI(dni);
        if (buscado == null) {
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de eliminar por DNI: " + (endTime-startTime));
            return false;
        } else {
            misUsuarios.eliminar(buscado);
            this.guardarCambios();
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de eliminar por DNI: " + (endTime-startTime));
            return true;
        }
    }

    public boolean insertarUsuario(Usuario u) {
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        if (misUsuarios.existe(u)) {
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de insertar usuario: " + (endTime-startTime));
            
            return false;
        } else {
            misUsuarios.existe(u);
            misUsuarios.insertarFinal(u);
            this.guardarCambios();
            long endTime = System.currentTimeMillis();
            JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de insertar usuario: " + (endTime-startTime));
            return true;
        }
    }

    public void guardarCambios() {
        int tam = misUsuarios.getTamanio();
        if (tam > 0) {

            Usuario arregloU[] = new Usuario[tam];
            NodoDoble<Usuario> nodoAux = misUsuarios.getCabecera();
            int pos = 0;
            while (nodoAux != null) {
                arregloU[pos] = nodoAux.getValor();
                nodoAux = nodoAux.getSiguiente();
                pos++;
            }
            System.out.println(Gestores.GestorArchivos.guardarArchivo(Entidades.Rutas.R_USUARIOS, arregloU));

        }
        
    }

    public void obtenerDatos() {
        
        Usuario arregloU[] = (Usuario[]) (Gestores.GestorArchivos.leerArchivo(Entidades.Rutas.R_USUARIOS));

        if (arregloU != null) {
            misUsuarios = new ListaEnlazadaDoble();
            for (Usuario u : arregloU) {
                misUsuarios.insertarFinal(u);
            }
        } else {
            misUsuarios = new ListaEnlazadaDoble();
        }
        
    }
    
    public void ordenarDatos(){
        //calcular tiempo de ejecucion
        long startTime = System.currentTimeMillis(); 
        
        Usuario arregloU[] = (Usuario[]) (Gestores.GestorArchivos.leerArchivo(Entidades.Rutas.R_USUARIOS));
        
        String apellidos[] = new String[arregloU.length];
        
        for(int i = 0; i < arregloU.length; i++)
            apellidos[i] = arregloU[i].getAp_paterno();
        
        sort(apellidos);
        String data = "Apellidos ordenados:\n";
        for(String ape: apellidos)
            data += ape + "\n";
        
        long endTime = System.currentTimeMillis();
        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de ordenar datos: " + (endTime-startTime));
        JOptionPane.showMessageDialog(null, data);
    }
    
    public void sort(String arr[])
    {
        int n = arr.length;
 
        // Build heap (rearrange array)
        for (int i = n / 2 - 1; i >= 0; i--)
            heapify(arr, n, i);
 
        // One by one extract an element from heap
        for (int i = n - 1; i > 0; i--) {
            // Move current root to end
            String temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
    }
 
    // To heapify a subtree rooted with node i which is
    // an index in arr[]. n is size of heap
    void heapify(String arr[], int n, int i)
    {
        int largest = i; // Initialize largest as root
        int l = 2 * i + 1; // left = 2*i + 1
        int r = 2 * i + 2; // right = 2*i + 2
 
        // If left child is larger than root
        if (l < n && arr[l].compareTo(arr[largest]) > 0)
            largest = l;
 
        // If right child is larger than largest so far
        if (r < n && arr[r].compareTo(arr[largest]) > 0)
            largest = r;
 
        // If largest is not root
        if (largest != i) {
            String swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, n, largest);
        }
    }

    private void actualizar(javax.swing.table.DefaultTableModel modelo){
        NodoDoble<Usuario> aux = misUsuarios.getCabecera();
        while (aux != null) {
            Usuario u = aux.getValor();
            Object row[] = {u.getNombre(), u.getAp_paterno(), u.getAp_materno(), u.getDni(),
                u.getCodigo(), u.getInstitucion(), u.getCarrera()};
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
        JOptionPane.showMessageDialog(null, "Tiempo de ejecucion de mostrar datos: " + (endTime-startTime));
    }
}
