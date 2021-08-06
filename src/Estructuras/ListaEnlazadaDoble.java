package Estructuras;

public class ListaEnlazadaDoble<T> {

    private NodoDoble<T> cabecera;
    private NodoDoble<T> ultimo;
    private int tamano;

    public ListaEnlazadaDoble() {
        cabecera = ultimo = null;
        tamano = 0;
    }

    public NodoDoble<T> getCabecera() {
        return cabecera;
    }

    public void insertarFinal(T t) {
        NodoDoble<T> nuevoNodo = new NodoDoble<>(t);
        if (estaVacio()) {
            cabecera = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSiguiente(nuevoNodo);
            nuevoNodo.setAnterior(ultimo);
            ultimo = nuevoNodo;
        }
        tamano++;
    }

    public boolean eliminar(T valor) {
        NodoDoble<T> nodoAux = cabecera;
        while (nodoAux != null) {
            if (nodoAux.getValor().toString().equalsIgnoreCase(valor.toString())) {
                if (nodoAux.getAnterior() == null && nodoAux.getSiguiente() == null) {
                    cabecera = ultimo = null;
                }
                if (nodoAux.getAnterior() == null && nodoAux.getSiguiente() != null) {
                    nodoAux.getSiguiente().setAnterior(null);
                    cabecera = nodoAux.getSiguiente();
                }
                if (nodoAux.getAnterior() != null && nodoAux.getSiguiente() == null) {
                    nodoAux.getAnterior().setSiguiente(null);
                    ultimo = nodoAux.getAnterior();
                }
                if (nodoAux.getAnterior() != null && nodoAux.getSiguiente() != null) {
                    nodoAux.getAnterior().setSiguiente(nodoAux.getSiguiente());
                    nodoAux.getSiguiente().setAnterior(nodoAux.getAnterior());
                }
                tamano--;
                return true;
            }
            nodoAux = nodoAux.getSiguiente();
        }
        return false;
    }

    public boolean existe(T valor){
        if(estaVacio()){
            return false;
        }else{
            NodoDoble<T> aux = cabecera;
            while(aux!=null){
                if(aux.getValor().equals(valor)){
                    return true;
                }
                aux=aux.getSiguiente();
            }
            return false;
        }
    }
    public int getTamanio() {
        return tamano;
    }

    public boolean estaVacio() {
        return cabecera == null;
    }

    public T obtenerUltimo() {
        return ultimo.getValor();
    }
    
    public String listar(){
        String msj="";
        NodoDoble<T> aux = cabecera;
        while(aux!=null){
            msj+=aux.getValor().toString()+"\n";
            aux = aux.getSiguiente();
        }
        return msj;
    }
}
