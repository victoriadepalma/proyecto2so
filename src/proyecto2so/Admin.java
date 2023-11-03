/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.util.Random;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author victoriadepalma
 */

    public class Admin {
       
    Semaphore sZelda;
    Semaphore sSF;
    
    public Admin(){

      sZelda = new Semaphore(0);
      sSF = new Semaphore(0);
    }
         public void asignarColasNiveles (Interfaz interfaz, Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF){
       
        for (int i=0;i< 30;i++){
            switch (interfaz.personajesZ[i].nivel) {
                case 1:
                    cola1Z.addPersonaje(interfaz.personajesZ[i].id, interfaz.personajesZ[i].nombre,interfaz.personajesZ[i].sumaTotalHabilidades);
//                    System.out.println("El personaje de id " + interfaz.personajesZ[i].id + "es de nivel: " + interfaz.personajesZ[i].nivel);
                    System.out.println("Contenido de la cola 1 zelda: " + cola1Z.imprimirCola());
                    break;
                case 2:
                    cola2Z.addPersonaje(interfaz.personajesZ[i].id, interfaz.personajesZ[i].nombre,interfaz.personajesZ[i].sumaTotalHabilidades);
                  
                    break;
                case 3:
                    cola3Z.addPersonaje(interfaz.personajesZ[i].id, interfaz.personajesZ[i].nombre,interfaz.personajesZ[i].sumaTotalHabilidades);
               
                    break;
                default:
                    break;
            }
        }
            
          for (int u=0;u< 30;u++){
            switch (interfaz.personajesST[u].nivel) {
                case 1:
                    cola1SF.addPersonaje(interfaz.personajesST[u].id, interfaz.personajesST[u].nombre,interfaz.personajesST[u].sumaTotalHabilidades);
                    System.out.println("Contenido de la cola 1 sf: " + cola1SF.imprimirCola());
                    break;
                case 2:
                    cola2SF.addPersonaje(interfaz.personajesST[u].id, interfaz.personajesST[u].nombre,interfaz.personajesST[u].sumaTotalHabilidades);
              
                    break;
                case 3:
                    cola3SF.addPersonaje(interfaz.personajesST[u].id, interfaz.personajesST[u].nombre,interfaz.personajesST[u].sumaTotalHabilidades);
                   
                    break;
                default:
                    break;
            }
//       
          }
    
       
        
    }

         
          public Personaje escogerPersonajeZelda(Cola cola1, Cola cola2, Cola cola3){
               Personaje aux1;
    
                
            if (cola1.isEmpty() == false){
                
                aux1=cola1.getPrimero();
         
            
//                
//                System.out.println("soy yo");
//                
                
                cola1.deletePersonaje();
                


             
            }else if (cola2.isEmpty() == false){
                aux1=cola2.getPrimero();
                
                cola2.deletePersonaje();
        
            }else{
                aux1=cola3.getPrimero();
                cola3.deletePersonaje();

        }
           
       
        return aux1;

                  
          
    }
            
          public Personaje escogerPersonajeSF(Cola cola1, Cola cola2, Cola cola3){
               Personaje aux2;
            if (cola1.isEmpty() == false){
                aux2=cola1.getPrimero();
//                System.out.println("id del personaje a borrar de street fighter:");
//                System.out.println(aux2.id);
                
                
               
                cola1.deletePersonaje();
                

                
            }else if (cola2.isEmpty() == false){
                aux2=cola2.getPrimero();
                cola2.deletePersonaje();
       
            }else {
                aux2=cola3.getPrimero();
                cola3.deletePersonaje();
              
           
        }
              
        return aux2;
        
            
          }
          
          
          
        public void escogerCombate(Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF){
              Random randomNumber= new Random();
              int numeroRandom = randomNumber.nextInt(2);
//              System.out.println("el numero random es " + numeroRandom);
              
              
              if (numeroRandom == 0){ 
//                  System.out.println("Entre al numero random 0");
               Personaje aux1 =escogerPersonajeZelda(cola1Z, cola2Z,cola3Z); //aux1
//               System.out.println(" numero random 0 aggare a zelda");
               
               Personaje aux2= escogerPersonajeSF(cola1SF, cola2SF,cola3SF); //aux2  
//               System.out.println(" numero random 0 aggare a sf");
//               System.out.println("0 El combate va a ser entre zelda " + escogerPersonajeZelda(cola1Z, cola2Z,cola3Z).id + "y entre " + escogerPersonajeSF(cola1SF, cola2SF,cola3SF).id );
//                        System.out.println("El combate va a ser entre zelda " + aux1.id + "y entre " + aux2.id);
              }else{
//                  System.out.println("Entre al numero random 1");
              Personaje aux2= escogerPersonajeSF(cola1SF, cola2SF,cola3SF); //aux2  
//              System.out.println(" numero random 1 aggare a zelda");
         
              Personaje aux1 = escogerPersonajeZelda(cola1Z, cola2Z,cola3Z); //aux1
//              System.out.println(" numero random 1 aggare a sf");
//               System.out.println(" 1 El combate va a ser entre zelda " + escogerPersonajeZelda(cola1Z, cola2Z,cola3Z).id + "y entre " + escogerPersonajeSF(cola1SF, cola2SF,cola3SF).id );
//  System.out.println("El combate va a ser entre zelda " + aux1.id + "y entre " + aux2.id);
              }
//              System.out.println("El combate va a ser entre zelda " + aux1 + "y entre " + escogerPersonajeSF(cola1SF, cola2SF,cola3SF).id );
//              combate(aux1, aux2)
          }
        
}
