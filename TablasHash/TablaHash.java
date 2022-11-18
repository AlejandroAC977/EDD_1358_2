
package TablasHash;

import java.util.ArrayList;
import tarea2.ArregloADT;

/**
 *
 * @author Alejandro
 */
public class TablaHash<T> {
    int key;
    int tam;
    T dato;
    ArregloADT<T> Tabla;
    ArrayList<T> array;


    public TablaHash() {
    }

    public TablaHash(int tam) {
        this.tam = tam;
        Tabla = new ArregloADT(tam);
    }
   
    public void add(int key, T dato){
     int colocador = key%tam;
     Tabla.setElemento(colocador, dato);
    }

    public T valueOf(int key){
     int colocador = key%tam;   
     return Tabla.getElemento(colocador) ; 
    }
 
    public void remove(int key){
     int colocador = key%tam; 
     Tabla.limpiar(dato);
    }

    @Override
    public String toString() {
        return "|"+Tabla+"|"; 
    }

    public static void main(String[] args) {
        TablaHash prueba=new TablaHash(13);
        prueba.add(12, 666);
        prueba.add(26, 777);
        System.out.println(prueba);
        System.out.println("------------");
        prueba.remove(26);
        System.out.println(prueba);
       
    }
}
