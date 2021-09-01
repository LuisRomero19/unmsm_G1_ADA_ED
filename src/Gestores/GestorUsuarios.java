package Gestores;

import Entidades.Usuario;
import Estructuras.ListaEnlazadaDoble;
import Estructuras.NodoDoble;

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
        //ordenar usuarios
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
