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
public class ListaCatalogoZombies {
    
    NodoZombie inicio;
    int longitud;
    NodoZombie fin;

    public ListaCatalogoZombies() {
        this.longitud = 0;
        this.inicio = null;
        this.fin = null;
    }

    /**
     * Este metodo inserta al final de la lista doble enlazada
     * @param nuevo es el nuevo nodo que se va a insertar
     */
    public void insertarZombie(NodoZombie nuevo)
    {
        NodoZombie ultimo;
        NodoZombie aux; 
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
    public void eliminarZombie(NodoZombie nodoDelete)
    {
        NodoZombie anterior, posterior;
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
    public NodoZombie buscarZombiesPorNombre(String nombre){

        NodoZombie encontrado = null; 
        NodoZombie aux;
        
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
     * Este metodo sirve para buscar un usuario determinado
     * @param nombre el parametro por el cual se hara la busqueda
     * @return encontrado el nodo de usuario encontrado que corresponde con el buscado
     */
    public NodoZombie buscarZombiePorImagen(String nombre){

        NodoZombie encontrado = null; 
        NodoZombie aux;
        
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
        
         NodoZombie temp = inicio;  
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
        
       NodoZombie aux;
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
        
        NodoZombie aux;
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
        
        NodoZombie aux;
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
    
    public NodoZombie getInicio() {
        return inicio;
    }

    public void setInicio(NodoZombie inicio) {
        this.inicio = inicio;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public NodoZombie getFin() {
        return fin;
    }

    public void setFin(NodoZombie fin) {
        this.fin = fin;
    } 
    
}
