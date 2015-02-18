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
public class NodoPersonaje {

    NodoPersonaje siguiente;
    NodoPersonaje anterior;
    private String nombre;
    private String imagen;
    private String tipoAtaque;
    private String tipoPersonaje;
    private int identificadorTipoPersonaje;
    private int tipoIdentificadorAtaque;
    private int puntosAtaque;
    private int puntosDefensa;

    public NodoPersonaje() {
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoPersonaje(String nombre, String imagen, String tipoAtaque, int puntosAtaque, int puntosDefensa) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.tipoIdentificadorAtaque = obtenerTipoAtaque(tipoAtaque);
        this.siguiente = null;
        this.anterior = null;
    }

    public NodoPersonaje(String nombre, String imagen, String tipoAtaque, int puntosAtaque, int puntosDefensa, String tipoPersonaj) {
        this.nombre = nombre;
        this.imagen = imagen;
        this.tipoAtaque = tipoAtaque;
        this.puntosAtaque = puntosAtaque;
        this.puntosDefensa = puntosDefensa;
        this.tipoPersonaje = tipoPersonaj;
        this.identificadorTipoPersonaje = obtenerTipoPersonaje(tipoPersonaj);
        this.tipoIdentificadorAtaque = obtenerTipoAtaque(tipoAtaque);
        this.siguiente = null;
        this.anterior = null;
    }
    
    public NodoPersonaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoPersonaje siguiente) {
        this.siguiente = siguiente;
    }

    public NodoPersonaje getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoPersonaje anterior) {
        this.anterior = anterior;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }

    public String getTipoAtaque() {
        return tipoAtaque;
    }

    public void setTipoAtaque(String tipoAtaque) {
        this.tipoAtaque = tipoAtaque;
    }

    public int getTipoIdentificadorAtaque() {
        return tipoIdentificadorAtaque;
    }

    public void setTipoIdentificadorAtaque(int tipoIdentificadorAtaque) {
        this.tipoIdentificadorAtaque = tipoIdentificadorAtaque;
    }

    public int getPuntosAtaque() {
        return puntosAtaque;
    }

    public void setPuntosAtaque(int puntosAtaque) {
        this.puntosAtaque = puntosAtaque;
    }

    public int getPuntosDefensa() {
        return puntosDefensa;
    }

    public void setPuntosDefensa(int puntosDefensa) {
        this.puntosDefensa = puntosDefensa;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public int getIdentificadorTipoPersonaje() {
        return identificadorTipoPersonaje;
    }

    public void setIdentificadorTipoPersonaje(int identificadorTipoPersonaje) {
        this.identificadorTipoPersonaje = identificadorTipoPersonaje;
    }        
    
    private int obtenerTipoAtaque(String tipo)
    {
        int resultado = -666;
        switch (tipo){
            case "Directo":
            {
                resultado = 1;
                break;
            }
            case "Disparo":
            {
                resultado = 2;
                break;
            }
            default:{
                System.out.println("Que hago aca??");
                break;
            }    
        }
        return resultado;
    } 
       
    private int obtenerTipoPersonaje(String tipo)
    {
        int resultado = -666;
        switch (tipo){
            case "Plantas":
            {
                resultado = 1;
                break;
            }
            case "Zombies":
            {
                resultado = 2;
                break;
            }
            default:{
                System.out.println("Que hago aca??");
                break;
            }    
        }
        return resultado;
    } 
     
}
