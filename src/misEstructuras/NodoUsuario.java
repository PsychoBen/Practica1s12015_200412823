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
public class NodoUsuario {
    
    private String nombre;
    private String tipoPersonaje;
    private int cantidad;
    NodoUsuario siguiente;
    NodoUsuario anterior;
    ListaCamposTexto listaCampos;
    ListaPersonajes catalogoPersonajes;
    ListaCatalogoPlantas catalogoPlantas;
    ListaCatalogoZombies catalogoZombies;
    PilaZombies pilaZombies;
    ColaPlantas colaPlantas;

    public NodoUsuario() {
        this.anterior = null;
        this.siguiente = null;
        this.cantidad = 0;
        this.listaCampos = null;
        this.catalogoPersonajes=null;
        this.pilaZombies = null;
        this.colaPlantas=null;
        this.nombre = "";
        this.tipoPersonaje = "";
        this.catalogoPlantas = null;
        this.catalogoZombies = null;
    }

    public NodoUsuario(String nombre, String tipoPersonaje) {
        this.nombre = nombre;
        this.tipoPersonaje = tipoPersonaje;
        this.cantidad = 0;
        this.listaCampos = null;
        this.catalogoPersonajes=null;
        this.pilaZombies = null;
        this.colaPlantas=null;
    }

    public NodoUsuario(String nombre, int cantidad) {
        this.nombre = nombre;
        this.cantidad = cantidad;              
        this.listaCampos = null;
        this.catalogoPlantas = null;
        this.catalogoZombies = null;
        this.catalogoPersonajes=null;
        this.pilaZombies = null;
        this.colaPlantas=null;
    }

    public NodoUsuario(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
        this.anterior = null;
        this.siguiente = null;
        this.cantidad = 0;
        this.nombre = "";
        this.catalogoPersonajes = null;
        this.pilaZombies = null;
        this.colaPlantas=null;
        this.listaCampos = null;
        this.catalogoPlantas = null;
        this.catalogoZombies = null;
    }    
           
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoPersonaje() {
        return tipoPersonaje;
    }

    public void setTipoPersonaje(String tipoPersonaje) {
        this.tipoPersonaje = tipoPersonaje;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public NodoUsuario getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoUsuario siguiente) {
        this.siguiente = siguiente;
    }

    public NodoUsuario getAnterior() {
        return anterior;
    }

    public void setAnterior(NodoUsuario anterior) {
        this.anterior = anterior;
    }

    public ListaCamposTexto getListaCampos() {
        return listaCampos;
    }

    public void setListaCampos(ListaCamposTexto listaCampos) {
        this.listaCampos = listaCampos;
    }  

    public ListaCatalogoPlantas getCatalogoPlantas() {
        return catalogoPlantas;
    }

    public void setCatalogoPlantas(ListaCatalogoPlantas catalogoPlantas) {
        this.catalogoPlantas = catalogoPlantas;
    }

    public ListaCatalogoZombies getCatalogoZombies() {
        return catalogoZombies;
    }

    public void setCatalogoZombies(ListaCatalogoZombies catalogoZombies) {
        this.catalogoZombies = catalogoZombies;
    }   

    public ListaPersonajes getCatalogoPersonajes() {
        return catalogoPersonajes;
    }

    public void setCatalogoPersonajes(ListaPersonajes catalogoPersonajes) {
        this.catalogoPersonajes = catalogoPersonajes;
    }

    public PilaZombies getPilaZombies() {
        return pilaZombies;
    }

    public void setPilaZombies(PilaZombies pilaZombies) {
        this.pilaZombies = pilaZombies;
    }

    public ColaPlantas getColaPlantas() {
        return colaPlantas;
    }

    public void setColaPlantas(ColaPlantas colaPlantas) {
        this.colaPlantas = colaPlantas;
    }
        
}
