/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package misEstructuras;

/**
 *
 * @author Ben
 */
public class PilaZombies {
    
    
    private NodoPersonaje cima, fondo; //este es el ultimo nodo 
    int cantidad;

    public PilaZombies() {
        this.fondo = null;
        this.cima = null;
        this.cantidad = 0;
    }
    
    /**
     * Este metodo es para verificar si la pila esta vacia o no
     * @return true si la pila esta vacia
     */
    public boolean estaVaciaPila()
    {
        return cima == null;
    }
    
    /**
     * Metodo para ir metiendo nodos en la pila
     * @param nuevo de tipo nodoPersonaje es el nuevo nodo a apilar
     */
    public void insertarPila(NodoPersonaje nuevo)
    {
        nuevo.setSiguiente(cima);
        cima = nuevo;
        cantidad++;
    }
    
    /**
     * Este metodo sirve para contar los elementos en la pila
     * @return 
     */
    public int contarApilados()
    {
        int contadorr = 0;
        NodoPersonaje h=cima;
        while (h!=null) {
            contadorr ++;
            h=h.getSiguiente();
        }
        return contadorr;
    }
    
    /**
     * Metodo para ir metiendo nodos en la pila
     * @param nuevo de tipo nodoPersonaje es el nuevo nodo a apilar
     */
    public void meterPila(NodoPersonaje nuevo){
        NodoPersonaje aux = nuevo;
         if (estaVaciaPila())
        {
            fondo = nuevo;
            cima = nuevo;
            cantidad++;
        }
        else
        {
            cima.setSiguiente(nuevo);
            nuevo.setAnterior(cima);
            cima = nuevo;
            cantidad++;
        }
    }

    public void limpiarPila(){}
    
    public NodoPersonaje sacarPila()
    {
        NodoPersonaje encontrado;
        encontrado = cima;
        cima=cima.getSiguiente();
        return encontrado;
    }
    
    public NodoPersonaje getCima() {
        return cima;
    }

    public void setCima(NodoPersonaje cima) {
        this.cima = cima;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }    
    
}
