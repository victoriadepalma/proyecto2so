/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.util.Random;
import javax.swing.ImageIcon;
import java.nio.file.Paths;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.swing.Icon;

/**
 *
 * @author victoriadepalma
 */
public class Personaje  {
    
   
    
    public int id;
    public String nombre;
    public int habilidades;
    public int puntosdevida;
    public int fuerza; 
    public int agilidad; 
    public int nivel;
    public int counter;
    public Personaje siguiente;
    public int sumaTotalHabilidades;
    public int randomHabilidades;
    public int randomPuntosDeVida;
    public int randomFuerza;
    public int randomAgilidad;
    public String imagen;
    public  ImageIcon imagenIcono;
    

    
    

    
    public Personaje(int id, String nombre, Personaje siguiente, int sumaTotalHabilidades,int counter){
    
    this.id = id;
    this.nombre = nombre;
    this.habilidades = tieneHabilidad(60);
    this.puntosdevida = tieneHabilidad(70);
    this.fuerza = tieneHabilidad(50);
    this.agilidad = tieneHabilidad(40);
    this.randomHabilidades=0;
    this.randomPuntosDeVida=0;
    this.randomFuerza=0;
    this.randomAgilidad=0;
    this.siguiente = siguiente;
    this.counter = counter;
    this.nivel = asignarNivel(this.habilidades, this.puntosdevida, this.fuerza, this.agilidad, this.nivel);
    this.imagen=asignarImagen(this.nombre);
    this.imagenIcono=new ImageIcon(this.imagen);
    this.sumaTotalHabilidades = sumaHabilidades(this.habilidades, this.puntosdevida,this.fuerza, this.agilidad);
//        System.out.println("suma total habilidades:" + sumaTotalHabilidades);
            }
    
    

    
    public int asignarNivel(int habilidades, int puntosdevida, int fuerza, int agilidad, int nivel){
        
        switch (this.habilidades + this.puntosdevida + this.fuerza + this.agilidad) {
            case 4:
                this.nivel = 1;
                break;
            case 3:
                this.nivel = 1;
                break;
            case 2:
                this.nivel = 2;
                break;
            default:
                this.nivel=3;
                break;
        }
        return this.nivel;

    
    }
    public String asignarImagen(String nombre) {
         String rutaImagen="";
         if(nombre=="Link"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/link.png";
    
         }else if(nombre=="Princesa Zelda"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/princesa_zelda.png";
             
         }else if(nombre=="Ganondorf"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/ganondorf.png";
             
         }else if(nombre=="Impa"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/impa.png";
             
         }else if(nombre=="Darunia"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/darunia.png";
             
         }else if(nombre=="Tingle"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/tingle.png";
             
         }else if(nombre=="Navi"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/navi.png";
             
         }else if(nombre=="Sheik"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/sheik.png";
             
         }else if(nombre=="Epona"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/epona.png";
             
         }else if(nombre=="Rauru"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/rauru.png";
             
         }else if(nombre=="Ryu"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/ryu.png";
             
         }else if(nombre=="M.Bison"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/mbison.png";
             
         }else if(nombre=="Zangief"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/zangief.png";
             
         }else if(nombre=="Akuma"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/akuma.png";
             
         }else if(nombre=="Guile"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/guile.png";
             
         }else if(nombre=="Gouken"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/gouken.png";
             
         }else if(nombre=="Chun-Li"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/chun-li.png";
             
         }else if(nombre=="Menat"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/menat.png";
             
         }else if(nombre=="Juni"){
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/juni.png";
             
         }else{
             rutaImagen="/Users/dianasilvadeornelas/Desktop/proyecto2soFINAL/proyecto2so/src/proyecto2so/images/blanka.png";
         }return rutaImagen;
 
        
    }
      
 
    
    public int asignarId(int id){
        return id++;
        //holaaa1
        
    }
    
       public int tieneHabilidad(int max){
        int contHabilidad=0;
        Random randomGenerator= new Random();
        int numeroRandom=randomGenerator.nextInt(100)+1;
        if (numeroRandom<= max){
            contHabilidad=1;
        }else{
            contHabilidad=0;
            
        }
        return contHabilidad;
        
    }
    public int sumaHabilidades(int habilidades, int puntosdevida,int fuerza, int agilidad){
//        int randomHabilidades=0;
//        int randomPuntosDeVida=0;
//        int randomFuerza=0;
//        int randomAgilidad=0;
        int sumaTotal=0;
        if(habilidades==1){
            Random randomGenerator=new Random();
            randomHabilidades=randomGenerator.nextInt(100)+1;
            
//            System.out.println(this.id);
//            System.out.println("numeroHabilidades:"+randomHabilidades);
     sumaTotal += randomHabilidades+randomPuntosDeVida+randomFuerza+randomAgilidad;
            
        }else{
            
        }
        if(puntosdevida==1){
            Random randomGenerator=new Random();
            randomPuntosDeVida=randomGenerator.nextInt(100)+1;
            
               sumaTotal = randomHabilidades+randomPuntosDeVida+randomFuerza+randomAgilidad;
//            System.out.println("numeros Puntos de Vida:"+randomPuntosDeVida);
        }else{
            
        }
        if(fuerza==1){
            Random randomGenerator=new Random();
            randomFuerza=randomGenerator.nextInt(100)+1;
              sumaTotal = randomHabilidades+randomPuntosDeVida+randomFuerza+randomAgilidad;
//            System.out.println("numero Fuerza:"+randomFuerza);
        }else{
            
        }
        if (agilidad==1){
            Random randomGenerator=new Random();
            randomAgilidad=randomGenerator.nextInt(100)+1;
//            System.out.println("numero Agilidad:"+randomAgilidad);
              sumaTotal = randomHabilidades+randomPuntosDeVida+randomFuerza+randomAgilidad;
        }else{
            
        }
 
        return sumaTotal;
        
        
            
        }
        
    
       
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNivelPersonaje() {
        return nivel;
    }

    public void setNivelPersonaje(int nivel) {
        this.nivel = nivel;
    }

    public int getcounter() {
        return counter;
    }

    public void setcounter(int counter) {
        this.counter = counter;
    }

    public Personaje getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Personaje siguiente) {
        this.siguiente = siguiente;
    }
}

