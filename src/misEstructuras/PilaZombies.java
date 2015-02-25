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
    
    public void mostrarPila1()
    {        
        NodoPersonaje aux=cima;
        while (aux!=null) {
            System.out.println("Nombre: "+aux.getNombre()+" , imagen "+aux.getImagen());
            aux=aux.getSiguiente();
        }        
    }
    
        private String obtenerNameImagen(String path){
        String immmaggen="";
        path=path.replace('\\', ',');
        if(!path.isEmpty()){
            String [] cadena = path.split(",");
            int  posi = cadena.length;
            immmaggen = cadena[posi-1];
        }
        return immmaggen;
    }
    
    public void RecorrerLista2() {
        
        NodoPersonaje aux;
        int k = -1;
        aux = cima;
        
        System.out.println("digraph G" +" "+ " { ");
                
        while(aux!=null) {
            k++;
            if(aux.getAnterior()!=null){
                

            }
            System.out.println("node"+k+"[shape=box];");
            String imaggenn =""; 
           
            System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
            if(aux.getSiguiente()!=null){                

                System.out.println("node"+k+" -> node"+(k+1)+";");
                System.out.println("node"+(k + 1)+" -> node"+k+";");
            }
           aux = aux.getSiguiente();       
        }        
         
        System.out.println("}");
                      
    }
    
    public void GenerarDot() {
        
        NodoPersonaje aux;
        int k = -1;
        aux = cima;
        
        System.out.println("digraph G" +" "+ " { ");
                
        while(aux!=null) {
            k++;
            if(aux.getAnterior()!=null){
                

            }
            System.out.println("node"+k+"[shape=box];");
            String imaggenn =""; 
           
            System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
            if(aux.getSiguiente()!=null){                

                System.out.println("node"+k+" -> node"+(k+1)+";");
                System.out.println("node"+(k + 1)+" -> node"+k+";");
            }
           aux = aux.getSiguiente();       
        }        
         
        System.out.println("}");
                      
    }
    
        public String generarCadenaPilaDot() {
        
        NodoPersonaje aux;
        int k = -1;
        aux = cima;
        
        String cadena = "";
        
        System.out.println("digraph G" +" "+ " { ");
        cadena ="digraph G" +" "+ " { \\n ";
        System.out.println("rankdir = LR;");
        cadena =cadena+" rankdir = LR;";
        String cadena2="";
        while(aux!=null) {
            k++;
            if(aux.getAnterior()!=null){
                

            }
            System.out.println("node"+k+"[shape=box];");
            cadena2 = "node"+k+"[shape=box];";
            String imaggenn =""; 
           
            System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
            cadena2 = cadena2 + "node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];";
            if(aux.getSiguiente()!=null){                

                System.out.println("node"+k+" -> node"+(k+1)+";");
                cadena2 = cadena2 + "node"+k+" -> node"+(k+1)+";";
                System.out.println("node"+(k + 1)+" -> node"+k+";");
                cadena2 = cadena2 + "node"+(k + 1)+" -> node"+k+";";
            }
           aux = aux.getSiguiente();       
        }        
        cadena = cadena + cadena2 + "}";
        System.out.println("}");
        return cadena;
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
        cantidad--;
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

    public NodoPersonaje getFondo() {
        return fondo;
    }

    public void setFondo(NodoPersonaje fondo) {
        this.fondo = fondo;
    }
        
}
