/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Semaphore;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingWorker;
import javax.swing.Timer;

/**
 *
 * @author victoriadepalma
 */
public class Inteligencia extends Thread {
    int contadorCombates;
    int contadorSF;
    int contadorZ;
    int contadorRonda;
    Interfaz interfaz;
     Cola cola1Z;
   Cola cola2Z;
   Cola cola3Z;
   Cola cola1SF;
   Cola cola2SF;
   Cola cola3SF;
   Cola colaRZ;
   Cola colaRSF;
   Admin admin;
       private Timer delayTimer;
       private SwingWorker<Void, Void> delayWorker;

   
    
    public Inteligencia(Interfaz interfaz, Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF, Cola colaRZ, Cola colaRSF, Admin admin){
        contadorCombates=0;
        contadorSF=0;
        contadorZ=0;
        contadorRonda = 0;
       
    this.interfaz = interfaz;
    this.cola1Z = cola1Z;
    this.cola2Z = cola2Z;
    this.cola3Z = cola3Z;
    this.cola1SF = cola1SF;
    this.cola2SF = cola2SF;
    this.cola3SF = cola3SF;
    this.colaRZ = colaRZ;
    this.colaRSF = colaRSF;
    this.admin = admin;
   

    
}
    public void run(){
       
       while (true){ 
           try{
        System.out.println("Esperando");
        interfaz.txtEstadoIA.setText("Esperando");
        
           
//            Random randomNumber= new Random();
//              int numeroR = randomNumber.nextInt(2);
////              System.out.println("el numero random es " + numeroRandom);
//              
//              
//              if (numeroR == 0){ 

              Personaje aux1 =admin.escogerPersonajeZelda(cola1Z, cola2Z,cola3Z); //aux1
//                 
              Personaje aux2= admin.escogerPersonajeSF(cola1SF, cola2SF,cola3SF);
              
           



        //aqui
        interfaz.txtIdZ.setText(Integer.toString(aux1.id));
        
        interfaz.txtIdSF.setText(Integer.toString(aux2.id));
        
        interfaz.txtNombreZelda.setText((aux1.nombre));
        
        interfaz.txtNombreSF.setText((aux2.nombre));
        interfaz.imagenZelda.setIcon(aux1.imagenIcono);
        interfaz.imagenStreetFighter.setIcon(aux2.imagenIcono);
         Thread.sleep(1000); 

//        contadorRonda ++;
//         admin.moverNivel(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF);
//       admin.actualizarColasResfuerzo(cola1Z, cola1SF, colaRZ, colaRSF);
//       
//               System.out.println("contador ronda: " +contadorRonda);
//        
//        admin.nuevoEntra(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF, this);
//        Thread.sleep(2000);     
               
        interfaz.txtEstadoIA.setText("Decidiendo");
        System.out.println("Decidiendo");
        
        String string = interfaz.txtTiempo.getText();
        
        int x = Integer.parseInt(string); //10
        
        
        
        Thread.sleep(x * 1000); 


    
         System.out.println("terminaron 10 segundos");

        Random randomGenerator= new Random();
        
        int numeroRandom=randomGenerator.nextInt(100)+1;
        System.out.println("numero random: "+numeroRandom);
        if (numeroRandom<=40){ //gana un jugador
            
            
            
            if(aux1.sumaTotalHabilidades<aux2.sumaTotalHabilidades){ //gana SF
//                interfaz.txtGanador.setText("Street Fighter");
                    interfaz.txtEstadoIA.setText("Anunciando");
                    interfaz.txtResultado.setText("Gana SF");
                 
                    
                 
//                   System.out.println("Gana Street Fighter");
                   contadorSF++;
//                   System.out.println("Contador SF: "+contadorSF);
                   interfaz.listaGanadores[contadorCombates]=aux2.id;
                   contadorCombates++;
                   interfaz.txtCombatesGanadosSF.setText(Integer.toString(contadorSF));
                   System.out.println("Contador combate: "+contadorCombates);
                    Thread.sleep(1000);
                interfaz.txtEstadoIA.setText("Esperando");
               interfaz.txtResultado.setText("");
                  
                   
            }else if(aux1.sumaTotalHabilidades==aux2.sumaTotalHabilidades){
                
                if (aux1.randomPuntosDeVida<aux2.randomPuntosDeVida){ //gana SF si ambos tienen suma igual por sus puntos de vida
                     interfaz.txtEstadoIA.setText("Anunciando");
          
                      interfaz.txtResultado.setText("Gana SF");
//                   System.out.println("Gana Street Fighter");
                   contadorSF++;
//             
                   interfaz.listaGanadores[contadorCombates]=aux2.id;
                   contadorCombates++;
                   System.out.println("Contador combate: "+contadorCombates);
                   interfaz.txtCombatesGanadosSF.setText(Integer.toString(contadorSF));
                Thread.sleep(1000);
                  interfaz.txtEstadoIA.setText("Esperando");
               interfaz.txtResultado.setText("");
                 
                   
                }else{  //gana zelda si ambos tienen suma igual por sus puntos de vida
                    
                     interfaz.txtEstadoIA.setText("Anunciando");
                      interfaz.txtResultado.setText("Gana Zelda");
//                System.out.println("gana zelda");
                contadorZ++;
//                System.out.println("Contador Z: "+contadorZ);
                interfaz.listaGanadores[contadorCombates]=aux1.id;
                contadorCombates++;
              System.out.println("Contador combate: "+contadorCombates);
                    interfaz.txtCombatesGanadosZelda.setText(Integer.toString(contadorZ));
                     Thread.sleep(1000);
                       interfaz.txtEstadoIA.setText("Esperando");
               interfaz.txtResultado.setText("");
               
                }
            } 
            
                else{ //gana zelda
                
                 interfaz.txtEstadoIA.setText("Anunciando");
                  interfaz.txtResultado.setText("Gana Zelda");
//                System.out.println("gana zelda");
                contadorZ++;
//                System.out.println("Contador Z: "+contadorZ);
                interfaz.listaGanadores[contadorCombates]=aux1.id;
                contadorCombates++;
               System.out.println("Contador combate: "+contadorCombates);
                interfaz.txtCombatesGanadosZelda.setText(Integer.toString(contadorZ));
                 Thread.sleep(1000);
                   interfaz.txtEstadoIA.setText("Esperando");
               interfaz.txtResultado.setText("");
                 
            }
            
            
     }else if (numeroRandom > 40 && numeroRandom <= 67){ //empate
          interfaz.txtEstadoIA.setText("Anunciando");
           interfaz.txtResultado.setText("Empate");
            System.out.println("Empate");
            interfaz.cola1Z.addPersonaje(aux1.id,aux1.nombre,aux1.sumaTotalHabilidades,aux1.counter);
            interfaz.cola1SF.addPersonaje(aux2.id,aux2.nombre,aux2.sumaTotalHabilidades,aux2.counter);
               interfaz.visualizarColas();
                Thread.sleep(1000);
                  interfaz.txtEstadoIA.setText("Esperando");
               interfaz.txtResultado.setText("");
               
            
            
     }else{ //no sucede combate
         
         
          interfaz.txtEstadoIA.setText("Anunciando");
           interfaz.txtResultado.setText("No sucede combate");
         System.out.println("No hay combate, van a cola resfuerzo");
         interfaz.colaRZ.addPersonaje(aux1.id,aux1.nombre,aux1.sumaTotalHabilidades,0);
         interfaz.colaRSF.addPersonaje(aux2.id,aux2.nombre,aux2.sumaTotalHabilidades,0);
            interfaz.visualizarColas();
             Thread.sleep(1000);
               interfaz.txtEstadoIA.setText("Esperando");
               interfaz.txtResultado.setText("");
                 
     }

         contadorRonda ++;
         admin.moverNivel(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF);
       admin.actualizarColasResfuerzo(cola1Z, cola1SF, colaRZ, colaRSF);
       
               System.out.println("contador ronda: " +contadorRonda);
        
        admin.nuevoEntra(cola1Z, cola2Z, cola3Z, cola1SF, cola2SF, cola3SF, this);
        Thread.sleep(1000);             
       
    } catch (InterruptedException ex) {
             System.out.println("Ocurrió un error!");
                    }



              }
}
   
} 