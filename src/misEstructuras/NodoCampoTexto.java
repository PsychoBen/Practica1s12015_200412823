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
public class NodoCampoTexto {
    
    private String texto;
    NodoCampoTexto siguiente;
    NodoCampoTexto anterior;
    
    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public NodoCampoTexto getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoCampoTexto siguiente) {
        this.siguiente = siguiente;
    }

    public NodoCampoTexto getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoCampoTexto anterior) {
        this.anterior = anterior;
    }

    public NodoCampoTexto(String texto) {
        this.texto = texto;
    }      
    
}
