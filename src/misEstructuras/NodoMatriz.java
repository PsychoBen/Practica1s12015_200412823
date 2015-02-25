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
public class NodoMatriz {
    
    NodoMatriz arriba;
    NodoMatriz abajo;
    NodoMatriz izquierda;
    NodoMatriz derecha;
    ListaPersonajes listaPersonajesNodo;
    int fila; int col;
    String imagen;
    
    

    public NodoMatriz getArriba() {
        return arriba;
    }

    public void setArriba(NodoMatriz arriba) {
        this.arriba = arriba;
    }

    public NodoMatriz getAbajo() {
        return abajo;
    }

    public void setAbajo(NodoMatriz abajo) {
        this.abajo = abajo;
    }

    public NodoMatriz getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(NodoMatriz izquierda) {
        this.izquierda = izquierda;
    }

    public NodoMatriz getDerecha() {
        return derecha;
    }

    public void setDerecha(NodoMatriz derecha) {
        this.derecha = derecha;
    }

    public ListaPersonajes getListaPersonajesNodo() {
        return listaPersonajesNodo;
    }

    public void setListaPersonajesNodo(ListaPersonajes listaPersonajesNodo) {
        this.listaPersonajesNodo = listaPersonajesNodo;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }    

    public NodoMatriz(int fila, int col, String imagen) {
        this.fila = fila;
        this.col = col;
        this.imagen = imagen;
        this.abajo = null;
        this.arriba  = null;
        this.derecha = null;
        this.izquierda = null;
        this.listaPersonajesNodo = new ListaPersonajes();
    }

    public NodoMatriz(int fila, int col) {
        this.fila = fila;
        this.col = col;
        this.imagen = "";
        this.abajo = null;
        this.arriba  = null;
        this.derecha = null;
        this.izquierda = null;
        this.listaPersonajesNodo = new ListaPersonajes();
    }
    
    
    
}
