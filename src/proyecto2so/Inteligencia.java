/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.util.Random;
import java.util.concurrent.Semaphore;

/**
 *
 * @author victoriadepalma
 */
public class Inteligencia extends Thread {
    int contadorCombates;
    int contadorSF;
    int contadorZ;
    Interfaz interfaz;
   
    
    public Inteligencia(Interfaz interfaz){
        contadorCombates=0;
        contadorSF=0;
        contadorZ=0;
        this.interfaz=interfaz;

    
}
    public void combate(Personaje aux1, Personaje aux2,Cola cola1Z, Cola cola2Z, Cola cola3Z, Cola cola1SF, Cola cola2SF, Cola cola3SF, Cola colaRZ, Cola colaRSF ){
        Admin admin=new Admin();

//        this.interfaz.txtEstadoIA.setText("Decidiendo");

//        this.interfaz.txtIdZ.setText(Integer.toString(aux1.id));
//        String valorTiempo=interfaz.txtTiempo.getText();
//        int tiempoNumero=Integer.parseInt(valorTiempo);
//        System.out.println("TIEMPOOOO: "+ tiempoNumero);
        Random randomGenerator= new Random();
        
        int numeroRandom=randomGenerator.nextInt(100)+1;
        System.out.println("numero random: "+numeroRandom);
        if (numeroRandom<=40){
            if(aux1.sumaTotalHabilidades<aux2.sumaTotalHabilidades){
//                interfaz.txtGanador.setText("Street Fighter");
                   System.out.println("Gana Street Fighter");
                   contadorSF++;
                   System.out.println("Contador SF: "+contadorSF);
                   interfaz.listaGanadores[contadorCombates]=aux2.id;
                   contadorCombates++;
                   System.out.println("Contador aumenta por sf: "+contadorCombates);
            }else if(aux1.sumaTotalHabilidades==aux2.sumaTotalHabilidades){
                if (aux1.randomPuntosDeVida<aux2.randomPuntosDeVida){
                   System.out.println("Gana Street Fighter");
                   contadorSF++;
                   System.out.println("Contador SF: "+contadorSF);
                   interfaz.listaGanadores[contadorCombates]=aux2.id;
                   contadorCombates++;
                   System.out.println("Contador aumenta por sf: "+contadorCombates);
                    
                }else{
                System.out.println("gana zelda");
                contadorZ++;
                System.out.println("Contador Z: "+contadorZ);
                interfaz.listaGanadores[contadorCombates]=aux1.id;
                contadorCombates++;
                System.out.println("Contador aumenta por zelda: "+contadorCombates);
                    
                }
                
            }
                else{
                System.out.println("gana zelda");
                contadorZ++;
                System.out.println("Contador Z: "+contadorZ);
                interfaz.listaGanadores[contadorCombates]=aux1.id;
                contadorCombates++;
                System.out.println("Contador aumenta por zelda: "+contadorCombates);
            }
     }else if (numeroRandom > 40 && numeroRandom <= 67){
            System.out.println("Empate");
            interfaz.cola1Z.addPersonaje(aux1.id,aux1.nombre,aux1.sumaTotalHabilidades,aux1.counter);
            interfaz.cola1SF.addPersonaje(aux2.id,aux2.nombre,aux2.sumaTotalHabilidades,aux2.counter);
     }else{
         System.out.println("No hay combate, van a cola resfuerzo");
         interfaz.colaRZ.addPersonaje(aux1.id,aux1.nombre,aux1.sumaTotalHabilidades,aux1.counter);
         interfaz.colaRSF.addPersonaje(aux2.id,aux2.nombre,aux2.sumaTotalHabilidades,aux2.counter);
     }
    
}
}
    

