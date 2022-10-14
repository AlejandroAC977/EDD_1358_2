
package Laberinto;

import java.util.ArrayList;

/**
 *
 * @author Alejandro
 */
public class ArregloADT <T>{
  int tamaño;
  ArrayList<T> L;
  


    public ArregloADT(int tam) {
        this.tamaño = tam;
        L = new ArrayList(this.tamaño);
        for (int i = 0; i < this.tamaño; i++) {
            this.L.add(null);
        }
    }

    public T getElemento(int indice) {
        if (comprobacion(indice)) {
            return this.L.get(indice);
        } else {
            System.out.println("Fuera del rango");
        }
        return null;
    }

    private boolean comprobacion(int indice) {
        return indice >= 0 && indice < this.tamaño;
    }

    public void setElemento(int indice, T dato) {
        if (comprobacion(indice)) {
            this.L.set(indice, dato);
        } else {
            System.out.println("Fuera del rango");
        }
    }

    public int getLongitud() {
        return this.tamaño;
    }

    public void limpiar(T dat) {
        for (int i = 0; i < this.tamaño; i++) {
            this.L.set(i, dat);
        }
    }
    
    public String toString(){
        String estado = "------------- "+this.tamaño+" -------------\n";
        for (T dat : L) {
            if(dat != null){
                estado += dat.toString()+"\n";
            }
        }
        return estado;
    }  
}
