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
public class Matriz {
    
    NodoMatriz inicio;
    NodoMatriz actual;
    NodoMatriz nodoinsertado;
    NodoMatriz auxcab;
    int tamanio;
        
    public Matriz() {
        this.inicio = null;
        this.actual = null;
        this.nodoinsertado =null;
        this.auxcab = null;
        this.tamanio=0;      
    }

    public void insertar(){
        
    }  
        
    public NodoMatriz getInicio() {
        return inicio;
    }

    public void setInicio(NodoMatriz inicio) {
        this.inicio = inicio;
    }

    public NodoMatriz getActual() {
        return actual;
    }

    public void setActual(NodoMatriz actual) {
        this.actual = actual;
    }

    public NodoMatriz getNodoinsertado() {
        return nodoinsertado;
    }

    public void setNodoinsertado(NodoMatriz nodoinsertado) {
        this.nodoinsertado = nodoinsertado;
    }

    public NodoMatriz getAuxcab() {
        return auxcab;
    }

    public void setAuxcab(NodoMatriz auxcab) {
        this.auxcab = auxcab;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }
    
}
