/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

/**
 *
 * @author victoriadepalma
 */
public class Personaje  {
    
   
    
    int id;
    String nombre;
    int habilidades;
    int puntosdevida;
    int fuerza; 
    int agilidad; 
    int nivel;
    
    public Personaje(int id, String nombre, int habilidades, int puntosdevida, int fuerza, int agilidad, int nivel){
    
    this.id = id;
    this.nombre = nombre;
    this.habilidades = habilidades;
    this.puntosdevida = puntosdevida;
    this.fuerza = fuerza;
    this.agilidad = agilidad;
    this.nivel = nivel;

            }
    
    public void asignarNivel(int habilidaes, int puntosdevida, int fuerza, int agilidad, int nivel){
        
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
        
        
     

    
    }
    
}
