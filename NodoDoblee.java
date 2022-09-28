/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package NodoDoble2;

/**
 *
 * @author Alejandro
 */
public class NodoDoblee <T>{
    private T dato;
    private NodoDoblee<T> siguiente;
    private NodoDoblee<T> Anterior;
    
    //Constructor por defecto
    public NodoDoblee() {
    }
  
    //Constructor sobrecargado lista 1 
    public NodoDoblee(T valor) {
        this.dato = valor;
    }

    //Constructor sobrecargado nodo con lista
    public NodoDoblee(T dato, NodoDoblee<T> siguiente, NodoDoblee<T> Anterior) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    

    //get&set

        public T getDato() {
            return dato;
        }

        public void setDato(T dato) {
            this.dato = dato;
        }

        public NodoDoblee<T> getSiguiente() {
            return siguiente;
        }

        public void setSiguiente(NodoDoblee<T> siguiente) {
            this.siguiente = siguiente;
        }

        public NodoDoblee<T> getAnterior() {
            return Anterior;
        }

        public void setAnterior(NodoDoblee<T> Anterior) {
            this.Anterior = Anterior;
        }
    
    
  
 
    }

