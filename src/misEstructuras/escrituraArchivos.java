/**
 * Universidad de San Carlos de Guatemala
 * Facultad de Ingenieria
 * Ingenieria en Ciencias y Sistemas
 * Esdras Benjamin Cotto Revolorio
 * Carnet: 200412823
 */

package misEstructuras;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Ben
 */
public class escrituraArchivos {

    File archivoListaUsuarios, archivoCatalogoPlantas,archivoCatalogoZombies,archivoPilaZombies, archivoColaPlantas, archivoMatrizJuego;
    String nameListaUser ="C:\\Proyecto\\EDD\\listaUsuarios.dot";
    
    public escrituraArchivos() {
    }
    
    /**
     * Este metodo sirve para crear una carpeta donde se guardaran todos los archivos
     * dot y las imagenes de los reportes
     */
    private void crearCarpeta()
    {
        File folder = new File("C:\\Proyecto\\EDD");
        if (!folder.exists())
        {
            folder.mkdir();
            System.out.println("Creado Exitosamente");
        }
        else 
        {
            System.out.println("Ya existe");
        }
    }

    /**
     * Este metodo sirve para crear el archivo dot de los usuarios junto con el listado 
     * de los campos extras de cada uno de ellos
     * @param usuariooo solicita un listado de usuarios
     * @throws IOException  
     */
    public void crearArchivoListaUsuariosDot(ListaUsuario usuariooo) throws IOException {
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\listaUsuarios.dot";        
        archivoListaUsuarios = new File(nombreaArchivo);
        try {
            if (!archivoListaUsuarios.exists())
            {
                archivoListaUsuarios.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
               //escribirListaUsuarios(usuariooo);
               escribirListaUsuarios2(usuariooo);
        } 
        catch (Exception e) {
        }
    }
    
    /**
     * Este metodo sirve para crear un el archivo dot del catalogo de las plantas
     * @param listaUsser solicita un listado de personajes
     * @throws IOException 
     */
    public void crearArchivoCatalogoPlantasDot(ListaPersonajes listaUsser) throws IOException {
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\catalogoPlantas.dot";        
        archivoCatalogoPlantas = new File(nombreaArchivo);
        try {
            if (!archivoCatalogoPlantas.exists())
            {
                archivoCatalogoPlantas.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
               escribirListaCatalogoPlantas(listaUsser);
        } 
        catch (Exception e) {
        }
    }
    
    /**
     * Este metodo sirve para crear un el archivo dot del catalogo de los zombies
     * @param listaUsser
     * @throws IOException 
     */
    public void crearArchivoCatalogoZombiesDot(ListaPersonajes listaUsser) throws IOException{
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\catalogoZombies.dot";        
        archivoCatalogoZombies = new File(nombreaArchivo);
        try {
            if (!archivoCatalogoZombies.exists())
            {
                archivoCatalogoZombies.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
               escribirListaCatalogoZombies(listaUsser);
        } 
        catch (Exception e) {
        }
    }
    
    /**
     * Este metodo sirve para crear el archivo dot de los elementos que estan en la pila de zombies
     * @param miPila solicita una pila de personajes en este caso los zombies
     * @throws IOException 
     */
    public void crearArchivoPilaZombiesDot(PilaZombies miPila) throws IOException{
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\pilaZombies.dot";        
        archivoPilaZombies = new File(nombreaArchivo);
        try {
            if (!archivoPilaZombies.exists())
            {
                archivoPilaZombies.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
                escribirPilaZombies(miPila);
        } 
        catch (Exception e) {
        }
    }
    
    /**
     * Este metodo sirve para crear el archivo dot de los elementos que estan en la cola de plantas
     * @param miPlantita solicita una cola de personajes en este caso de plantas
     * @throws IOException 
     */       
    public void crearArchivoColaPlantasDot(ColaPlantas miPlantita) throws IOException{
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\colaPlantas.dot";        
        archivoColaPlantas = new File(nombreaArchivo);
        try {
            if (!archivoColaPlantas.exists())
            {
                archivoColaPlantas.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
                escribirColaPlantas(miPlantita);
        } 
        catch (Exception e) {
        }
    }    
    
    /**
     * Este metodo sirve para crear el archivo dot de la matriz de juego
     * @param matricita un objeto de tipo matriz
     * @throws IOException 
     */
    public void crearArchivoMatrizJuegoDot(Matriz matricita)throws IOException{
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\matrizJuego.dot";        
        archivoMatrizJuego = new File(nombreaArchivo);
        try {
            if (!archivoMatrizJuego.exists())
            {
                archivoMatrizJuego.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
                escribirArchivoMatriz(matricita);
        } 
        catch (Exception e) {
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
    
    private void escribirPilaZombies(PilaZombies pilita){
        
        NodoPersonaje aux;
        int k = -1;        
        
        try {
            aux = pilita.getCima();
            PrintWriter pw = new PrintWriter(archivoPilaZombies.getAbsolutePath());
            //System.out.println("digraph G" +" "+ " { ");
            pw.println("digraph G" +" "+ " { ");
            //System.out.println("rankdir = LR;");
            pw.println("rankdir = LR;");
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){


                }
                //System.out.println("node"+k+"[shape=box];");
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                //System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                pw.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                  //  System.out.println("node"+k+" -> node"+(k+1)+";");
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    //System.out.println("node"+(k + 1)+" -> node"+k+";");
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }        

            //System.out.println("}"); 
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
   
    private void escribirListaCatalogoZombies(ListaPersonajes miListita){
        
        NodoPersonaje aux;
        int k = -1;        
        
        try {
            aux = miListita.getInicio();
            PrintWriter pw = new PrintWriter(archivoCatalogoZombies.getAbsolutePath());
            //System.out.println("digraph G" +" "+ " { ");
            pw.println("digraph G" +" "+ " { ");
            //System.out.println("rankdir = LR;");
            pw.println("rankdir = LR;");
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                //System.out.println("node"+k+"[shape=box];");
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                //System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                pw.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                  //  System.out.println("node"+k+" -> node"+(k+1)+";");
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    //System.out.println("node"+(k + 1)+" -> node"+k+";");
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }        

            //System.out.println("}"); 
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
        
    private void escribirListaCatalogoPlantas(ListaPersonajes miListita){
        
        NodoPersonaje aux;
        int k = -1;        
        
        try {
            aux = miListita.getInicio();
            PrintWriter pw = new PrintWriter(archivoCatalogoPlantas.getAbsolutePath());
            //System.out.println("digraph G" +" "+ " { ");
            pw.println("digraph G" +" "+ " { ");
            //System.out.println("rankdir = LR;");
            pw.println("rankdir = LR;");
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                //System.out.println("node"+k+"[shape=box];");
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                //System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                pw.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                  //  System.out.println("node"+k+" -> node"+(k+1)+";");
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    //System.out.println("node"+(k + 1)+" -> node"+k+";");
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }        

            //System.out.println("}"); 
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
            
    private void escribirListaUsuarios(ListaUsuario lisUsuarios){
        
        NodoUsuario aux;
        int k = -1;        
        
        try {
            aux = lisUsuarios.getInicio();
            PrintWriter pw = new PrintWriter(archivoListaUsuarios.getAbsolutePath());
            //System.out.println("digraph G" +" "+ " { ");
            pw.println("digraph G" +" "+ " { ");
            //System.out.println("rankdir = LR;");
            pw.println("rankdir = LR;");
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                //System.out.println("node"+k+"[shape=box];");
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                //System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                pw.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Cantidad:"+" "+aux.getCantidad()+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                  //  System.out.println("node"+k+" -> node"+(k+1)+";");
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    //System.out.println("node"+(k + 1)+" -> node"+k+";");
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }       

            //System.out.println("}"); 
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
    
    private void escribirListaCamposExtra(ListaCamposTexto lisCampos){
        
        NodoCampoTexto aux;
        int k = -1;        
        
        try {
            aux = lisCampos.getInicio();
            PrintWriter pw = new PrintWriter(archivoListaUsuarios.getAbsolutePath());
            //System.out.println("digraph G" +" "+ " { ");
            pw.println("subgraph " +" "+ " { ");
            //System.out.println("rankdir = LR;");
            pw.println("rankdir = LR;");
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                //System.out.println("node"+k+"[shape=box];");
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                //System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                pw.println("node"+k+"[label = \"Texto:"+" "+aux.getTexto()+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                  //  System.out.println("node"+k+" -> node"+(k+1)+";");
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    //System.out.println("node"+(k + 1)+" -> node"+k+";");
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }        

            //System.out.println("}"); 
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
            
    private void escribirListaUsuarios2(ListaUsuario lisUsuarios){
        
        NodoUsuario aux;
        int k = -1;       
        
        try {
            aux = lisUsuarios.getInicio();
            PrintWriter pw = new PrintWriter(archivoListaUsuarios.getAbsolutePath());
            System.out.println("digraph G" +" "+ " { ");  ////agregado
            pw.println("digraph G" +" "+ " { ");
            //System.out.println("rankdir = LR;");  ////agregado
            //pw.println("rankdir = LR;");  
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                System.out.println("node"+k+"[shape=box];");  ////agregado
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Cantidad:"+" "+aux.getCantidad()+"\\"+"n"+"\"];"); ///agregado
                pw.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Cantidad:"+" "+aux.getCantidad()+"\\"+"n"+"\"];");
                tipoUsuarioMatch(aux, "node"+k,pw);
                if(aux.getSiguiente()!=null){                

                    System.out.println("node"+k+" -> node"+(k+1)+";");  ////agregado
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    System.out.println("node"+(k + 1)+" -> node"+k+";");   ////agregado
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }       

            System.out.println("}"); ////agregado
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }
    
    private void tipoUsuarioMatch(NodoUsuario nodoPro, String idNodoGraf, PrintWriter pw){
        if(nodoPro.getListaCampos()!=null){
            switch(nodoPro.getTipoPersonaje()){
                case "Zombies":{
                    escribirListaCamposExtraZombie(idNodoGraf, nodoPro.getListaCampos(),pw);
                    break;
                }
                case "Plantas":{
                    escribirListaCamposExtraPlanta(idNodoGraf, nodoPro.getListaCampos(),pw);
                    break;
                }
                default:
                {
                    System.out.println("No se que hago aca");
                }

            }
        }
    }
    
    private void escribirListaCamposExtraPlanta(String nodoProviene, ListaCamposTexto lisCampos,PrintWriter pw){
        
        NodoCampoTexto aux;
        int k = -1;        
        
        try {
            aux = lisCampos.getInicio();
            //PrintWriter pw = new PrintWriter(archivoListaUsuarios.getAbsolutePath());
            System.out.println("subgraph PLANTAS" +" "+ " { ");////
            pw.println("subgraph PLANTAS " +" "+ " { ");
            System.out.println("rankdir = LR;");////
            pw.println("rankdir = LR;");
            pw.println(nodoProviene + "-> planta0");
            System.out.println(nodoProviene + "-> planta0");////
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                System.out.println("planta"+k+"[shape=box];");///
                pw.println("planta"+k+"[shape=box];");
                String imaggenn =""; 

                System.out.println("planta"+k+"[label = \"Texto:"+" "+aux.getTexto()+"\\"+"n"+"\"];"); ////
                pw.println("planta"+k+"[label = \"Texto:"+" "+aux.getTexto()+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                    System.out.println("planta"+k+" -> planta"+(k+1)+";"); ////
                    pw.println("planta"+k+" -> planta"+(k+1)+";");
                    System.out.println("planta"+(k + 1)+" -> planta"+k+";");  ////
                    pw.println("planta"+(k + 1)+" -> planta"+k+";");
                }
               aux = aux.getSiguiente();       
            }        

            System.out.println("}"); ////
            pw.println("}");
           // pw.flush();
           // pw.close();
            
        } catch (Exception e) {
        }
        
    }
        
    private void escribirListaCamposExtraZombie(String nodoProviene, ListaCamposTexto lisCampos,PrintWriter pw){
        
        NodoCampoTexto aux;
        int k = -1;        
        
        try {
            aux = lisCampos.getInicio();
            //PrintWriter pw = new PrintWriter(archivoListaUsuarios.getAbsolutePath());
            System.out.println("subgraph ZOMBIES" +" "+ " { "); ////
            pw.println("subgraph ZOMBIES" +" "+ " { ");
            System.out.println("rankdir = LR;");////
            pw.println("rankdir = LR;");
            pw.println(nodoProviene + "-> zombie0");
            System.out.println(nodoProviene + "-> zombie0");  //////
            
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){

                }
                System.out.println("zombie"+k+"[shape=box];"); /////
                pw.println("zombie"+k+"[shape=box];");
                String imaggenn =""; 

                System.out.println("zombie"+k+"[label = \"Texto:"+" "+aux.getTexto()+"\\"+"n"+"\"];");  ////
                pw.println("zombie"+k+"[label = \"Texto:"+" "+aux.getTexto()+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                    System.out.println("zombie"+k+" -> zombie"+(k+1)+";");  ////
                    pw.println("zombie"+k+" -> zombie"+(k+1)+";");
                    System.out.println("zombie"+(k + 1)+" -> zombie"+k+";");  /////
                    pw.println("zombie"+(k + 1)+" -> zombie"+k+";");
                }
               aux = aux.getSiguiente();       
            }        

            System.out.println("}");  /////
            pw.println("}");
           // pw.flush();
           // pw.close();
            
        } catch (Exception e) {
        }
        
    }
    
    private void escribirColaPlantas(ColaPlantas colita){
        
        NodoPersonaje aux;
        int k = -1;        
        
        try {
            aux = colita.getInicio();
            PrintWriter pw = new PrintWriter(archivoColaPlantas.getAbsolutePath());
            //System.out.println("digraph G" +" "+ " { ");
            pw.println("digraph G" +" "+ " { ");
            //System.out.println("rankdir = LR;");
            pw.println("rankdir = LR;");
        
            while(aux!=null) {
                k++;
                if(aux.getAnterior()!=null){


                }
                //System.out.println("node"+k+"[shape=box];");
                pw.println("node"+k+"[shape=box];");
                String imaggenn =""; 

                //System.out.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                pw.println("node"+k+"[label = \"Tipo personaje:"+" "+aux.getTipoPersonaje()+"\\"+"n"+" "+"Nombre:"+" "+aux.getNombre()+"\\"+"n"+" "+"Puntos Ataque:"+" "+String.valueOf(aux.getPuntosAtaque())+"\\"+"n"+" "+"Puntos Defensa:"+" "+String.valueOf(aux.getPuntosDefensa())+"\\"+"n"+" "+"Tipo Ataque:"+" "+aux.getTipoAtaque()+"\\"+"n"+" "+"Imagen:"+" "+obtenerNameImagen(aux.getImagen())+"\\"+"n"+"\"];");
                if(aux.getSiguiente()!=null){                

                  //  System.out.println("node"+k+" -> node"+(k+1)+";");
                    pw.println("node"+k+" -> node"+(k+1)+";");
                    //System.out.println("node"+(k + 1)+" -> node"+k+";");
                    pw.println("node"+(k + 1)+" -> node"+k+";");
                }
               aux = aux.getSiguiente();       
            }        
            //System.out.println("}"); 
            pw.println("}");
            pw.flush();
            pw.close();
            
        } catch (Exception e) {
        }
        
    }    
    
    private void escribirArchivoMatriz(Matriz matrixx){
    }

    public void generarReportesImagenes(){
        generarArchivosImagenes(archivoListaUsuarios);
        generarArchivosImagenes(archivoCatalogoPlantas);
        generarArchivosImagenes(archivoCatalogoZombies);
        generarArchivosImagenes(archivoColaPlantas);
        generarArchivosImagenes(archivoPilaZombies);
    }
    
    private String nombreIImagen(String pathh){
        String devol="";
        devol = pathh.replace(".dot", ".jpg");
        return devol;
    }
    
    private void generarArchivosImagenes(File archivo){
        
        String cadena = "";
        cadena = nombreIImagen(archivo.getAbsolutePath());
        try {
            String cadenaComando = "dot -Tgif "+ archivo.getAbsolutePath() +" -o  "+cadena;
            Runtime.getRuntime().exec("dot -Tgif "+ archivo.getAbsolutePath() +" -o  "+cadena);
        } catch (IOException ex) {
            Logger.getLogger(escrituraArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }           
           
        try {
            String path = cadena;        
            File file = new File(path);
            Desktop.getDesktop().open(file);
        } catch (IOException ex) {
            Logger.getLogger(escrituraArchivos.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }
    
}
