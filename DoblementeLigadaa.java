/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package NodoDoble2;

/**
 *
 * @author Alejandro
 */
public class DoblementeLigadaa <T>{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    }
    
    NodoDoblee<T> head;
    int Tamaño;
    
    public DoblementeLigadaa(){
    this.Tamaño=0;
    this.head=null;
    }
   
    public boolean estaVacia(){
     return this.head == null;
    }
 
    public int getTamaño(){
    return Tamaño;
    }
 
    public void agregarFinal(T valor){
    NodoDoblee n = new NodoDoblee(valor);
    if (this.estaVacia()) {
            this.head = n;
        } else {
            NodoDoblee aux = this.head;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(n);
            n.setAnterior(aux);
        }
 
    }

    public void agregarInicio(T valor){
    NodoDoblee n = new NodoDoblee(valor);
    if (this.estaVacia()) {
            this.head = n;
        } else {
            NodoDoblee aux = this.head;
            n.setSiguiente(this.head);
            this.head=n;
            n.setAnterior(n);
        }
   
    }

    public void agredgarDespues(int lugar, T valor){
    NodoDoblee n = new NodoDoblee(valor);
    NodoDoblee aux =this.head;
         

     for(int i=1; i<=lugar-1; i++){
      aux = aux.getSiguiente();
     }
     
     n.setSiguiente(aux.getSiguiente());
     aux.setSiguiente(n);
     n.setAnterior(aux);
      
     //aqui solo me fallo como darle al nuevo valor que su siguiente este ligado como el previo 
   
    }

    public void Eliminar(int lugar){
     NodoDoblee aux = this.head;
        for (int i=1; i<=lugar-1; i++) {
            aux=aux.getSiguiente();
        }
        NodoDoblee t=aux;
        aux.setSiguiente(aux.getSiguiente().getSiguiente());
        aux.setAnterior(t);
    }

    public void eliminarUltimo(){
     if(this.head.getSiguiente() == null){
      this.head=null;
     }else{
      NodoDoblee aux = this.head;
      while (aux.getSiguiente() != null) {
        aux = aux.getSiguiente();
      }
      aux=aux.getSiguiente();
      aux=null;
     }
    }
   
    public void eliminarPrimero(){
     if(this.head.getSiguiente() == null){
      this.head=null;
     }else{
      NodoDoblee aux=this.head;
      aux.setSiguiente(aux.getSiguiente());
      head=aux;
      head.setAnterior(null);
     }
    }

    public void transversal(){
     NodoDoblee curr_node = this.head;
        while (curr_node != null) {
            System.out.print(curr_node);
            curr_node = curr_node.getSiguiente();
        }
        System.out.println("");
    }
   
 
}
