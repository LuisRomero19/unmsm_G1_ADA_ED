package Gestores;

import Entidades.Usuario;
import Estructuras.ListaEnlazadaDoble;
import Estructuras.NodoDoble;

public class GestorUsuarios {

    public ListaEnlazadaDoble<Usuario> misUsuarios;

    public GestorUsuarios() {
        //misUsuarios = new ListaEnlazadaDoble();
    }

    public Usuario buscarPorDNI(String dni) {
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
        return miUsuario;
    }

    public boolean eliminarPorDNI(String dni) {
        Usuario buscado = buscarPorDNI(dni);
        if (buscado == null) {
            return false;
        } else {
            misUsuarios.eliminar(buscado);
            this.guardarCambios();
            return true;
        }
    }

    public boolean insertarUsuario(Usuario u) {
        if (misUsuarios.existe(u)) {
            return false;
        } else {
            misUsuarios.existe(u);
            misUsuarios.insertarFinal(u);
            this.guardarCambios();
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
        javax.swing.table.DefaultTableModel modelo = (javax.swing.table.DefaultTableModel) miJT.getModel();
        this.vaciar(modelo);
        this.actualizar(modelo);
    }
}
