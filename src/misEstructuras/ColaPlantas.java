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
public class ColaPlantas {
    
    NodoPersonaje inicio, fin;
    int cantidad;
    
    public void insertarCola(NodoPersonaje nuevo){
        this.inicio=null;
        this.fin=null;
        this.cantidad=0;
    }

    public NodoPersonaje getInicio() {
        return inicio;
    }

    public void setInicio(NodoPersonaje inicio) {
        this.inicio = inicio;
    }

    public NodoPersonaje getFin() {
        return fin;
    }

    public void setFin(NodoPersonaje fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
