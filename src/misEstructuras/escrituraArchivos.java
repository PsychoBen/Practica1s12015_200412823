/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package misEstructuras;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Ben
 */
public class escrituraArchivos {

    File archivoListaUsuarios, archivoCatalogoPlantas,archivoCatalogoZombies,archivoPilaZombies, archivoColaPlantas, archivoMatrizJuego;
    
    public escrituraArchivos() {
    }
    
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

    public void crearArchivoListaUsuariosDot(){
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\listaUsuarios.dot";        
        archivoListaUsuarios = new File(nombreaArchivo);
    }
    
    public void crearArchivoCatalogoPlantasDot(){
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\catalogoPlantas.dot";        
        archivoCatalogoPlantas = new File(nombreaArchivo);
    }
    
    public void crearArchivoCatalogoZombiesDot(){
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\catalogoZombies.dot";        
        archivoCatalogoZombies = new File(nombreaArchivo);
        try {
            if (!archivoPilaZombies.exists())
            {
                archivoPilaZombies.createNewFile();
            }
            else 
            {
                System.out.println("Ya EXISTE");
            }
               // escribirPila(miPila); escribir
        } 
        catch (Exception e) {
        }
    }
    
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
        
    public void crearArchivoColaPlantasDot(ColaPlantas miPlantita){
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
    
    public void crearArchivoMatrizJuegoDot(){
        crearCarpeta();
        String nombreaArchivo="C:\\Proyecto\\EDD\\matrizJuego.dot";        
        archivoMatrizJuego = new File(nombreaArchivo);
    }
    
}
