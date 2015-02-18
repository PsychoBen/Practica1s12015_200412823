/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package PlantasVrsZombies;

import javax.swing.JTextField;

/**
 *
 * @author Ben
 */
public class Casilla extends JTextField{
    
    int fila;
    int columna;
    int valor;
    String imagen;
    boolean ocupada;

    public Casilla() {
    }

    public Casilla(int fila, int columna, int valor, boolean ocupada) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.ocupada = ocupada;
    }
    
    public Casilla(int fila, int columna, int valor, boolean ocupada, String image) {
        this.fila = fila;
        this.columna = columna;
        this.valor = valor;
        this.imagen = image;
        this.ocupada = ocupada;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public String getImagen() {
        return imagen;
    }

    public void setImagen(String imagen) {
        this.imagen = imagen;
    }
    
}
