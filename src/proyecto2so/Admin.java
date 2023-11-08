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
       
   Semaphore s;
   Interfaz interfaz;
   int i;
   int u;
    public Admin(Interfaz interfaz){
      
    this.interfaz = interfaz;
    this.s = s;
    this.i =10;
    this.u =10;
    }
    
    public void asignarColasNiveles(Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF){
        int iteracionesZelda=0;
        int iteracionesSF=0;
            while (iteracionesZelda !=10){
                if (interfaz.colaPersonajesZelda.isEmpty()==false){
                Personaje personajeZ = interfaz.colaPersonajesZelda.getPrimero();
                interfaz.colaPersonajesZelda.deletePersonaje();
                switch(personajeZ.nivel){
                    case 1:
                        cola1Z.addPersonaje(personajeZ.id, personajeZ.nombre,personajeZ.sumaTotalHabilidades,personajeZ.counter);
                        iteracionesZelda++;
//                    System.out.println("El personaje de id " + interfaz.personajesZ[i].id + "es de nivel: " + interfaz.personajesZ[i].nivel);
//                    System.out.println("Contenido de la cola 1 zelda: " + cola1Z.imprimirCola());
                    break;
                case 2:
                    cola2Z.addPersonaje(personajeZ.id, personajeZ.nombre,personajeZ.sumaTotalHabilidades,personajeZ.counter);
                    iteracionesZelda++;
                  
                    break;
                case 3:
                    cola3Z.addPersonaje(personajeZ.id, personajeZ.nombre,personajeZ.sumaTotalHabilidades,personajeZ.counter);
                    iteracionesZelda++;
               
                    break;
                default:
                    break;
                }
                }
            }
                while (iteracionesSF !=10){
                    if (interfaz.colaPersonajesSF.isEmpty()==false){
                Personaje personajeSF = interfaz.colaPersonajesSF.getPrimero();
                interfaz.colaPersonajesSF.deletePersonaje();
                switch(personajeSF.nivel){
                    case 1:
                        cola1SF.addPersonaje(personajeSF.id, personajeSF.nombre,personajeSF.sumaTotalHabilidades,personajeSF.counter);
                        iteracionesSF++;
//                    System.out.println("El personaje de id " + interfaz.personajesZ[i].id + "es de nivel: " + interfaz.personajesZ[i].nivel);
//                    System.out.println("Contenido de la cola 1 zelda: " + cola1Z.imprimirCola());
                    break;
                case 2:
                    cola2SF.addPersonaje(personajeSF.id, personajeSF.nombre,personajeSF.sumaTotalHabilidades,personajeSF.counter);
                    iteracionesSF++;
                  
                    break;
                case 3:
                     cola3SF.addPersonaje(personajeSF.id, personajeSF.nombre,personajeSF.sumaTotalHabilidades,personajeSF.counter);
                    iteracionesSF++;
               
                    break;
                default:
                    break;
                }
                
                    }
    }
    }
          //hola1
//         public void asignarColasNiveles (Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF){
//       
//        for (int i=0;i< 10;i++){
//            switch (interfaz.personajesZ[i].nivel) {
//                case 1:
//                    cola1Z.addPersonaje(interfaz.personajesZ[i].id, interfaz.personajesZ[i].nombre,interfaz.personajesZ[i].sumaTotalHabilidades,interfaz.personajesZ[i].counter);
////                    System.out.println("El personaje de id " + interfaz.personajesZ[i].id + "es de nivel: " + interfaz.personajesZ[i].nivel);
////                    System.out.println("Contenido de la cola 1 zelda: " + cola1Z.imprimirCola());
//                    break;
//                case 2:
//                    cola2Z.addPersonaje(interfaz.personajesZ[i].id, interfaz.personajesZ[i].nombre,interfaz.personajesZ[i].sumaTotalHabilidades,interfaz.personajesZ[i].counter);
//                  
//                    break;
//                case 3:
//                    cola3Z.addPersonaje(interfaz.personajesZ[i].id, interfaz.personajesZ[i].nombre,interfaz.personajesZ[i].sumaTotalHabilidades,interfaz.personajesZ[i].counter);
//               
//                    break;
//                default:
//                    break;
//            }
//        }
//            
//          for (int u=0;u< 10;u++){
//            switch (interfaz.personajesST[u].nivel) {
//                case 1:
//                    cola1SF.addPersonaje(interfaz.personajesST[u].id, interfaz.personajesST[u].nombre,interfaz.personajesST[u].sumaTotalHabilidades,interfaz.personajesST[u].counter);
////                    System.out.println("Contenido de la cola 1 sf: " + cola1SF.imprimirCola());
//                    break;
//                case 2:
//                    cola2SF.addPersonaje(interfaz.personajesST[u].id, interfaz.personajesST[u].nombre,interfaz.personajesST[u].sumaTotalHabilidades,interfaz.personajesST[u].counter);
//              
//                    break;
//                case 3:
//                    cola3SF.addPersonaje(interfaz.personajesST[u].id, interfaz.personajesST[u].nombre,interfaz.personajesST[u].sumaTotalHabilidades,interfaz.personajesST[u].counter);
//                   
//                    break;
//                default:
//                    break;
//            }
////       
//          }
    
       
        
//    }
         
         public void asignarColaNuevo(Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF){
         int contadorZ=0;
         int contadorSF=0;
         while(contadorZ!=1){
             if (interfaz.colaPersonajesZelda.isEmpty()==false){
             Personaje personajeZ = interfaz.colaPersonajesZelda.getPrimero();
             interfaz.colaPersonajesZelda.deletePersonaje();
         
               switch (personajeZ.nivel) {
                case 1:
                    cola1Z.addPersonaje(personajeZ.id, personajeZ.nombre,personajeZ.sumaTotalHabilidades,personajeZ.counter);
//                    System.out.println("El personaje de id " + interfaz.personajesZ[i].id + "es de nivel: " + interfaz.personajesZ[i].nivel);
//                    System.out.println("Contenido de la cola 1 zelda: " + cola1Z.imprimirCola());
                    
                    contadorZ+=1;
                   
         
                    break;
                case 2:
                    cola2Z.addPersonaje(personajeZ.id, personajeZ.nombre,personajeZ.sumaTotalHabilidades,personajeZ.counter);
                    
                    contadorZ+=1;
                 
                       System.out.println("Contenido de la cola 2Z: " + cola1Z.imprimirColaZelda());
                    break;
                case 3:
                    cola3Z.addPersonaje(personajeZ.id, personajeZ.nombre,personajeZ.sumaTotalHabilidades,personajeZ.counter);
                    
                    contadorZ+=1;
                  
                    break;
                default:
                    break;
                    
                    
                    
                    }
                   
            }
         }
         while(contadorSF!=1){
             if (interfaz.colaPersonajesSF.isEmpty()==false){
             Personaje personajeSF = interfaz.colaPersonajesSF.getPrimero();
             interfaz.colaPersonajesSF.deletePersonaje();
               switch (personajeSF.nivel) {
                case 1:
                    cola1SF.addPersonaje(personajeSF.id, personajeSF.nombre,personajeSF.sumaTotalHabilidades,personajeSF.counter);
                    System.out.println("valor i antes suma "+u);
//                    System.out.println("Contenido de la cola 1 sf: " + cola1SF.imprimirCola());
                     System.out.println(personajeSF.id+ "Nuevo nivel 1 sf y estoy en la posicion: "+ contadorSF);
                    contadorSF+=1;
      
                    break;
                case 2:
                    cola2SF.addPersonaje(personajeSF.id, personajeSF.nombre,personajeSF.sumaTotalHabilidades,personajeSF.counter);
                    System.out.println("valor i antes suma "+u);
                 System.out.println(personajeSF.id+ "Nuevo nivel 2 sf y estoy en la posicion: "+ contadorSF);
                    contadorSF+=1;
            
                    break;
                case 3:
                    cola3SF.addPersonaje(personajeSF.id, personajeSF.nombre,personajeSF.sumaTotalHabilidades,personajeSF.counter);
                   System.out.println(personajeSF.id+ "Nuevo nivel 3 sf y estoy en la posicion: "+ contadorSF);
                   contadorSF+=1;
         
                    break;
                default:
                    break;
            }
               
         }
         }
         }
         
         
         public void nuevoEntra(Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF,Inteligencia inteligencia){
             interfaz.inicializarPersonaje(1);
             if (inteligencia.contadorRonda == 2){
                 
             
            
                    Random randomNumber= new Random();
                    int n = randomNumber.nextInt(100)+1;
                    System.out.println("numero random 80%" + n);
                if (n <=80){

                this.asignarColaNuevo(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF);
                inteligencia.contadorRonda =0;
                interfaz.visualizarColas();
                }else{
                        inteligencia.contadorRonda =0;
                        }
           
             
             
            }else{
                 
             }
         }

          public Personaje escogerPersonajeZelda(Cola cola1, Cola cola2, Cola cola3){
               Personaje aux1;
    
                
            if (cola1.isEmpty() == false){
                
                aux1=cola1.getPrimero();    
                cola1.deletePersonaje();
                interfaz.visualizarColas();


             
            }else if (cola2.isEmpty() == false){
                aux1=cola2.getPrimero();
                cola2.deletePersonaje();
                   interfaz.visualizarColas();
        
            }else{
                aux1=cola3.getPrimero();
                cola3.deletePersonaje();
                   interfaz.visualizarColas();

        }
     
        return aux1;

    }
            
          public Personaje escogerPersonajeSF(Cola cola1, Cola cola2, Cola cola3){
               Personaje aux2;
            if (cola1.isEmpty() == false){
                aux2=cola1.getPrimero();
                cola1.deletePersonaje();
                interfaz.visualizarColas();
 
            }else if (cola2.isEmpty() == false){
                aux2=cola2.getPrimero();
                cola2.deletePersonaje();
                interfaz.visualizarColas();
       
            }else{
                aux2=cola3.getPrimero();
                cola3.deletePersonaje();
                interfaz.visualizarColas();
        }
              
        return aux2;
  
         }
          
          
          
        public void escogerCombate(Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF, Cola colaRZ, Cola colaRSF, Interfaz interfaz, Inteligencia inteligencia){
           
         
              
              Random randomNumber= new Random();
              int numeroRandom = randomNumber.nextInt(2);
//              System.out.println("el numero random es " + numeroRandom);
              
              
              if (numeroRandom == 0){ 

               Personaje aux1 =escogerPersonajeZelda(cola1Z, cola2Z,cola3Z); //aux1
               Personaje aux2= escogerPersonajeSF(cola1SF, cola2SF,cola3SF); //aux2  
//               inteligencia.combate(aux1,aux2,cola1Z, cola2Z,cola3Z,cola1SF, cola2SF,cola3SF, colaRZ, colaRSF, this);
//               this.moverNivel(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF, interfaz);
               
               
   
              }else{

              Personaje aux2= escogerPersonajeSF(cola1SF, cola2SF,cola3SF); //aux2  
              Personaje aux1 = escogerPersonajeZelda(cola1Z, cola2Z,cola3Z); //aux1
//              inteligencia.combate(aux1,aux2,cola1Z, cola2Z,cola3Z,cola1SF, cola2SF,cola3SF, colaRZ, colaRSF, this);
//              this.moverNivel(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF,interfaz);
              this.actualizarColasResfuerzo(cola1Z,  cola1SF, colaRZ,  colaRSF);
             

              }

          }
        
        public void actualizarColasResfuerzo(Cola cola1Z, Cola cola1SF, Cola colaRZ, Cola colaRSF){
            
            Personaje pZelda = colaRZ.getPrimero();
            Personaje pSF =colaRSF.getPrimero();
            Random randomNumber= new Random();
            int n = randomNumber.nextInt(100)+1;
            if (colaRZ.isEmpty() == false && colaRSF.isEmpty() == false){
                if (n <= 40) {
                
                colaRZ.deletePersonaje();
                colaRSF.deletePersonaje();
                    
                cola1Z.addPersonaje(pZelda.id, pZelda.nombre, pZelda.sumaTotalHabilidades, pZelda.counter);
                System.out.println("id de personaje que salio cola de recuerzo zelda: "+pZelda.id);
                cola1SF.addPersonaje(pSF.id, pSF.nombre, pSF.sumaTotalHabilidades, pSF.counter);
                System.out.println("id de personaje que salio cola de recuerzo zelda: "+pSF.id);
               
                 }else{
                colaRZ.deletePersonaje();
                colaRSF.deletePersonaje();
                colaRZ.addPersonaje(pZelda.id, pZelda.nombre, pZelda.sumaTotalHabilidades, pZelda.counter);
                colaRSF.addPersonaje(pSF.id, pSF.nombre, pSF.sumaTotalHabilidades, pSF.counter);
                }
            }
    }
        //holaaa
        
        public void moverNivel(Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF){
        int tamanocola3z = cola3Z.getTamano();
        int iteraciones3z = 0;
            while (interfaz.cola3Z.isEmpty() == false){
                Personaje personaje = interfaz.cola3Z.getPrimero();
                cola3Z.deletePersonaje();
                personaje.counter++;
                if (personaje.counter >=8){
                    personaje.counter = 0;
                    interfaz.cola2Z.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }else{
                          cola3Z.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter); 
                }
                iteraciones3z++;
                if (iteraciones3z == tamanocola3z){
                    break;
                }
  
            }
            
        int tamanocola3sf = cola3SF.getTamano();
        int iteraciones3SF = 0;
        
            while (interfaz.cola3SF.isEmpty() == false){
                Personaje personaje = interfaz.cola3SF.getPrimero();
                cola3SF.deletePersonaje();
                personaje.counter++;
                if (personaje.counter >=8){
                    personaje.counter = 0;
                    interfaz.cola2SF.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }else{
                cola3SF.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }
                iteraciones3SF++;
                if (iteraciones3SF == tamanocola3sf){
                    break;
                }
            }
        int tamanocola2z = cola2Z.getTamano();
        int iteraciones2z = 0;
            while (interfaz.cola2Z.isEmpty() == false){
                Personaje personaje = interfaz.cola2Z.getPrimero();
                cola2Z.deletePersonaje();
                personaje.counter++;
                if (personaje.counter >=8){
                    personaje.counter = 0;
                    interfaz.cola1Z.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }else{
                cola2Z.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }
                iteraciones2z++;
                if (iteraciones2z == tamanocola2z){
                    break;
                }
            }
            
        int tamanocola2sf = cola2SF.getTamano();
        int iteraciones2sf = 0;
            while (interfaz.cola2SF.isEmpty() == false){
                Personaje personaje = interfaz.cola2SF.getPrimero();
                cola2SF.deletePersonaje();
                personaje.counter++;
                if (personaje.counter >=8){
                    personaje.counter = 0;
                    interfaz.cola1SF.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }else{
                cola2SF.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
                }
                iteraciones2sf++;
                if (iteraciones2sf == tamanocola2sf){
                    break;
                }
            }
//                Personaje personaje = interfaz.cola3Z.getPrimero();
//                for(int i = 0; i <= interfaz.cola3Z.size(); i++){
//                    interfaz.cola3Z.getPrimero().counter ++;
//                    System.out.println("El counter es:"+ personaje.counter);
//                    if (personaje.counter >= 8){
//                        interfaz.cola3Z.deletePersonaje();
//                        personaje.counter = 0;
//                        interfaz.cola2Z.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
//                           interfaz.visualizarColas();
//                           
//                    }else{
//                        }
//               
//            } else if (interfaz.cola3SF.isEmpty() == false){
//                Personaje personaje = interfaz.cola3SF.getPrimero();
//                for(int i = 0; i <= interfaz.cola3SF.size(); i++){
//                    personaje.counter ++;
//                     System.out.println("El counter es:"+ personaje.counter);
//                    if (personaje.counter >= 8){
//                        interfaz.cola3SF.deletePersonaje();
//                        personaje.counter = 0;
//                        interfaz.cola2SF.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
//                           interfaz.visualizarColas();
//                    }else{
//                        
//                    }
//                }
//            }else if (interfaz.cola2Z.isEmpty() == false){
//                Personaje personaje = interfaz.cola2Z.getPrimero();
//                for(int i = 0; i <= interfaz.cola2Z.size(); i++){
//                    personaje.counter ++;
//                     System.out.println("El counter es:"+ personaje.counter);
//                    if (personaje.counter >= 8){
//                        interfaz.cola2Z.deletePersonaje();
//                        personaje.counter = 0;
//                        interfaz.cola1Z.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
//                           interfaz.visualizarColas();
//                    }else{
//                        
//                    }
//                }
//                }else if (interfaz.cola2SF.isEmpty() == false){
//                Personaje personaje = interfaz.cola2SF.getPrimero();
//                for(int i = 0; i <= cola2SF.size(); i++){
//                    personaje.counter ++;
//                     System.out.println("El counter es:"+ personaje.counter);
//                    if (personaje.counter >= 8){
//                        interfaz.cola2SF.deletePersonaje();
//                        personaje.counter = 0;
//                        interfaz.cola1SF.addPersonaje(personaje.id, personaje.nombre, personaje.sumaTotalHabilidades, personaje.counter);
//                           interfaz.visualizarColas();
//                    }else{
//                        
//                    }
//                }
//               }else{
//                    
//                }
            
          
        }
        
}
