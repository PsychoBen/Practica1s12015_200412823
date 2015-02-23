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
public class ListaPersonajes {
    
    NodoPersonaje inicio;
    int longitud;
    NodoPersonaje fin;

    public ListaPersonajes() {
        this.longitud = 0;
        this.inicio = null;
        this.fin = null;
    }

    /**
     * Este metodo inserta al final de la lista doble enlazada
     * @param nuevo es el nuevo nodo que se va a insertar
     */
    public void insertarPersonaje(NodoPersonaje nuevo)
    {
        NodoPersonaje ultimo;
        NodoPersonaje aux; 
        if (inicio == null){
            longitud ++;
            inicio = nuevo;
        }
        else {
            
            aux = ultimo = inicio;
            while (aux != null){

                ultimo = aux;
                aux = aux.getSiguiente(); 
            }

            longitud ++; 
            ultimo.setSiguiente(nuevo);
            nuevo.setAnterior(ultimo);            
        }
    }
    
    /**
     * Este metodo sirve para borrar un usuario en especifico
     * @param nodoDelete este es el nodo a borrar
     */
    public void eliminarPersonaje(NodoPersonaje nodoDelete)
    {
        NodoPersonaje anterior, posterior;
        if (nodoDelete != null)
        {
            anterior = nodoDelete.getAnterior();
            posterior = nodoDelete.getSiguiente();
            anterior.setSiguiente(posterior);
            if (posterior != null)
            {
                posterior.setAnterior(anterior);
            }
            longitud--;
        }

        else
        {
            System.out.println("No encontro el contacto buscado");
        }
    }
    
    /**
     * Este metodo sirve para buscar un usuario determinado
     * @param nombre el parametro por el cual se hara la busqueda
     * @return encontrado el nodo de usuario encontrado que corresponde con el buscado
     */
    public NodoPersonaje buscarPersonajePorNombre(String nombre){

        NodoPersonaje encontrado = null; 
        NodoPersonaje aux;
        
        aux = inicio;

        while(aux!=null){

            if(aux.getNombre().equalsIgnoreCase(nombre))
            {
                encontrado = aux; 
                break; 
            }
            else
                aux = aux.getSiguiente();
        }
        return encontrado;
    }
    
    /**
     * Este metodo sirve para buscar un personaje por un identificador de acceso
     * @param accesoRand el numero por el cual se buscara un nodo 
     * @return un nodo personaje para ser insertado en la pila o cola
     */
    public NodoPersonaje buscarPersonajePorAccesoRandom(int accesoRand){

        NodoPersonaje encontrado = null; 
        NodoPersonaje aux;
        
        aux = inicio;

        while(aux!=null){

            if(aux.getAccesoRandom()==accesoRand)
            {
                encontrado = aux; 
                break; 
            }
            else
                aux = aux.getSiguiente();
        }
        return encontrado;
    }
    
    /**
     * Este metodo sirve para buscar un usuario determinado
     * @param nombre el parametro por el cual se hara la busqueda
     * @return encontrado el nodo de usuario encontrado que corresponde con el buscado
     */
    public NodoPersonaje buscarPersonajePorImagen(String nombre){

        NodoPersonaje encontrado = null; 
        NodoPersonaje aux;
        
        aux = inicio;

        while(aux!=null){

            if(aux.getImagen().equalsIgnoreCase(nombre))
            {
                encontrado = aux; 
                break; 
            }
            else
                aux = aux.getSiguiente();
        }
        return encontrado;
    }
    
    
    public void recList(){
        
         NodoPersonaje temp = inicio;  
         inicio = temp.siguiente;
         if (temp != null) {
            System.out.println ("[" + temp.getNombre() + ", " + temp.getImagen() + "] ");
            temp = temp.siguiente;
         }
     }
     
    /**
    * Este metodo sirve para recorrer la lista de contactos
    */
    public void RecorrerLista() {
        
       NodoPersonaje aux;
       aux = inicio;

       while(aux!=null) {

           if(aux.getAnterior()!=null){
                
               System.out.print("<-");
           }

           System.out.print(aux.getNombre()+" "+aux.getTipoPersonaje()+" "+aux.getImagen());

           if(aux.getSiguiente()!=null){
                
               System.out.print("->");
           }
           aux = aux.getSiguiente();
       }
       System.out.println("");
   }
    
    public void RecorrerLista2() {
        
        NodoPersonaje aux;
        int k = -1;
        aux = inicio;
        
        System.out.println("digraph G" +" "+ " { ");
        System.out.println("rankdir = LR;");
        
        while(aux!=null) {
            k++;
            if(aux.getAnterior()!=null){
                
              //  System.out.print("<-");
            }
            System.out.println("node"+k+"[shape=box];");
            System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Imagen:"+" "+aux.getImagen()+"\\"+"n"+"\"];");
            if(aux.getSiguiente()!=null){                
               // System.out.print("->");
            }
            aux = aux.getSiguiente();
        System.out.println("node"+k+" -> node"+(k+1)+";");
        System.out.println("node"+(k + 1)+" -> node"+k+";");
        
        }        
       // System.out.println(k);         
        System.out.println("}");
                      
    }
      
    public void RecorrerLista3() {
        
        NodoPersonaje aux;
        int k = -1;
        aux = inicio;        
//        System.out.println("digraph G" +" "+ " { ");
//        System.out.println("rankdir = LR;");
        
        while(aux!=null) {
            k++;
            if(aux.getAnterior()!=null){
                
              //  System.out.print("<-");
            }
            //System.out.println("node"+k+"[shape=box];");
            System.out.print(aux.getNombre()+";"+" "+aux.getImagen()+";"+" "+aux.getTipoAtaque()+";"+" "+"&"+" ");
            if(aux.getSiguiente()!=null){                
                //System.out.print(";");
            }
            aux = aux.getSiguiente();
//        System.out.println("node"+k+" -> node"+(k+1)+";");
//        System.out.println("node"+(k + 1)+" -> node"+k+";");
        
        }        
       // System.out.println(k);         
       // System.out.println("}");               
    }
    
    public NodoPersonaje getInicio() {
        return inicio;
    }

    public void setInicio(NodoPersonaje inicio) {
        this.inicio = inicio;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public NodoPersonaje getFin() {
        return fin;
    }

    public void setFin(NodoPersonaje fin) {
        this.fin = fin;
    }    
    
}
