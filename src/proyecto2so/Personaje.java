/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.util.Random;

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

    
    

    
    public Personaje(int id, String nombre){
    
    this.id = id;
    this.nombre = nombre;
    this.habilidades = tieneHabilidad(60);
    this.puntosdevida = tieneHabilidad(70);
    this.fuerza = tieneHabilidad(50);
    this.agilidad = tieneHabilidad(40);
    this.siguiente = null;
    this.counter = 0;
    this.nivel = asignarNivel(this.habilidades, this.puntosdevida, this.fuerza, this.agilidad, this.nivel);
            }

    
    public int asignarNivel(int habilidades, int puntosdevida, int fuerza, int agilidad, int nivel){
        
        switch (this.habilidades + this.puntosdevida + this.fuerza + this.agilidad) {
            case 4:
                this.nivel = 1;
                break;
            case 3:
                this.nivel = 2;
                break;
            default:
                this.nivel = 3;
                break;
        }
        return this.nivel;

    
    }
    
    public int asignarId(int id){
        return id++;
        
    }
    
       public int tieneHabilidad(int max){
        int contHabilidad=0;
        Random randomGenerator= new Random();
        int numeroRandom=randomGenerator.nextInt(60)+1;
        if (numeroRandom<= max){
            contHabilidad=1;
        }else{
            contHabilidad=0;
            
        }
        return contHabilidad;
        
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
