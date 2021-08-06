package Estructuras;

public class NodoDoble<T> {

    private NodoDoble<T> siguiente;
    private T valor;
    private NodoDoble<T> anterior;

    NodoDoble(T valor) {
        this.siguiente = null;
        this.anterior = null;
        this.valor = valor;
    }

    @Override
    public String toString() {
        return valor + "";
    }
    
    
    public NodoDoble<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoDoble<T> getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }
    
    public T getValor() {
        return valor;
    }

    public void setValor(T valor){
        this.valor = valor;
    }

}
