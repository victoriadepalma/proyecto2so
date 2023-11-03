/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2so;

import java.util.Arrays;

/**
 *
 * @author victoriadepalma
 */
public class Cola {
    private int tamano;
    private int prioridadCola;
    private Personaje primero;
    private Personaje ultimo;
    
     public Cola() {
        this.tamano = tamano;
        this.prioridadCola = prioridadCola;
        this.primero = primero;
        this.ultimo = ultimo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public int getPrioridadCola() {
        return prioridadCola;
    }

    public void setPrioridadCola(int prioridadCola) {
        this.prioridadCola = prioridadCola;
    }

    public Personaje getPrimero() {
        return primero;
    }

    public void setPrimero(Personaje primero) {
        this.primero = primero;
    }

    public Personaje getUltimo() {
        return ultimo;
    }

    public void setUltimo(Personaje ultimo) {
        this.ultimo = ultimo;
    }

    public boolean isEmpty() {
        return primero == null;
    }

    public int size() {
        return tamano;
    }
    
       public void addPersonaje(int id, String nombre, int suma,int contador) {
        Personaje aux = new Personaje(id, nombre, null,suma,contador);
        if (isEmpty()) {
            primero = aux;
            ultimo = aux;
            System.out.println("El primer nodo es" + aux.id);
        } else if (size() == 1) {
            primero.setSiguiente(aux);
        } else {
            ultimo.setSiguiente(aux);
            System.out.println("El ultimo nodo es " + ultimo.id);
        }
        ultimo = aux;
        tamano++;
           
    }

    public void deletePersonaje() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
        } else if (size() == 1) {
            primero = null;
            ultimo = null;
            tamano--;
        } else {
            Personaje aux = primero.getSiguiente();
            primero.setSiguiente(null);
            primero = aux;
            tamano--;
        }
    }
    
     public  String imprimirCola() {
        int[] impresion = new int[tamano];
        
        if (isEmpty()) {
            String vacia = "Vacía";
            return vacia;
        } else {
            Personaje aux = primero;
            for (int i = 0; i < tamano; i++) {
                impresion[i] = aux.getId();
                aux = aux.getSiguiente();
            }
            String personajes = Arrays.toString(impresion);
            return personajes;
        }
     }
     
       
}

