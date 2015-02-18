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
public class ListaCamposTexto {
    
    NodoCampoTexto inicio;
    int longitud;
    NodoCampoTexto fin;

    public ListaCamposTexto() {
        this.longitud = 0;
        this.inicio = null;
        this.fin = null;
    }

    /**
     * Este metodo inserta al final de la lista doble enlazada
     * @param nuevo es el nuevo nodo que se va a insertar
     */
    public void insertarCampoTexto(NodoCampoTexto nuevo)
    {
        NodoCampoTexto ultimo;
        NodoCampoTexto aux; 
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
    public void eliminarCampoTexto(NodoCampoTexto nodoDelete)
    {
        NodoCampoTexto anterior, posterior;
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
     * Este metodo sirve para buscar un campo de texto determinado
     * @param nombre el parametro por el cual se hara la busqueda
     * @return encontrado el nodo de usuario encontrado que corresponde con el buscado
     */
    public NodoCampoTexto buscarCampoDeTexto(String texto){

        NodoCampoTexto encontrado = null; 
        NodoCampoTexto aux;
        
        aux = inicio;

        while(aux!=null){

            if(aux.getTexto().equalsIgnoreCase(texto))
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
        
         NodoCampoTexto temp = inicio;  
         inicio = temp.siguiente;
         if (temp != null) {
            System.out.println ("[" + temp.getTexto() + "] ");
            temp = temp.siguiente;
         }
     }
     
    /**
    * Este metodo sirve para recorrer la lista de contactos
    */
    public void RecorrerLista() {
        
       NodoCampoTexto aux;
       aux = inicio;

       while(aux!=null) {

           if(aux.getAnterior()!=null){
                
               System.out.print("<-");
           }

           System.out.print(aux.getTexto()+" ");

           if(aux.getSiguiente()!=null){
                
               System.out.print("->");
           }
           aux = aux.getSiguiente();
       }
       System.out.println("");
   }
    
    public void RecorrerLista2() {
        
        NodoCampoTexto aux;
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
            System.out.println("node"+k+"[label = \"Texto:"+" "+aux.getTexto()+"\\"+"n"+"\"];");
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
        
        NodoCampoTexto aux;
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
            System.out.print(aux.getTexto()+";"+" "+"&"+" ");
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
    
    public NodoCampoTexto getInicio() {
        return inicio;
    }

    public void setInicio(NodoCampoTexto inicio) {
        this.inicio = inicio;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public NodoCampoTexto getFin() {
        return fin;
    }

    public void setFin(NodoCampoTexto fin) {
        this.fin = fin;
    }    
    
}
