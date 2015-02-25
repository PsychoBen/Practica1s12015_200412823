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
public class ColaPlantas {
    
    NodoPersonaje inicio, fin;
    int cantidad;
    
    public void ColaPlantas(){
        this.inicio=null;
        this.fin=null;
        this.cantidad=0;
    }
    
    public void insertarCola(NodoPersonaje nuevo){
        cantidad++;
        if(estaVacia()){
            nuevo.setSiguiente(nuevo);
            nuevo.setAnterior(nuevo);
            inicio=nuevo;           
        }
        else
        {
            nuevo.setAnterior(inicio.getAnterior());
            inicio.setAnterior(nuevo);
            nuevo.getAnterior().setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
        }
        
    }

    public void insertarCola2(NodoPersonaje nuevo){
        cantidad++;
        if(inicio==null){
            inicio = nuevo;
        }
        else{
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
    }
    
   public void mostrarCola()
    {        
        NodoPersonaje aux=inicio;
        while (aux!=null) {
            System.out.println("Nombre: "+aux.getNombre()+" , imagen "+aux.getImagen());
            aux=aux.getSiguiente();
        }        
    }   
   
    public void RecorrerCola2() {
        
        NodoPersonaje aux;
        int k = -1;
        aux = inicio;
        
        System.out.println("digraph G" +" "+ " { ");
        System.out.println("rankdir = LR;");
        
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
        
    public void insertarCola3(NodoPersonaje nuevo){
        cantidad++;
        if(inicio==null&&fin==null){
            inicio=nuevo;
            fin=nuevo;
        }
        fin.setSiguiente(nuevo);
        fin = fin.getSiguiente();
    }
    
    public int contarElementos()
    {
        int contador = 0;
        NodoPersonaje aux;
        aux =inicio;
        while (aux!=null) {            
            contador++;
            aux = aux.getSiguiente();
        }
        System.out.println("La cola tiene "+contador+" personajes");
        return contador;
    }
    
    public NodoPersonaje sacarCola(){
        NodoPersonaje encontrado=null;
        encontrado = inicio;
        inicio = inicio.getSiguiente();
        return encontrado;
    }
    
    public boolean estaVacia()
    {
        if (inicio == null)
            return true;
        else
            return false;
    }
    
    public NodoPersonaje getInicio() {
        return inicio;
    }

    public void setInicio(NodoPersonaje inicio) {
        this.inicio = inicio;
    }

    public NodoPersonaje getFin() {
        return fin;
    }

    public void setFin(NodoPersonaje fin) {
        this.fin = fin;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
}
