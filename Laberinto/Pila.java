
package Laberinto;

import java.util.Stack;

/**
 *
 * @author Alejandro
 */
public class Pila {
    public static void main(String[] args) {
        Stack<Integer> pila = new Stack<Integer>();
  
        for(int i=0; i<10; i++){
            pila.push(i);
            System.out.println(pila);
        } 
        System.out.println(pila);
    
        for(int i=0; i<10; i++){
            pila.pop();
            System.out.println(pila);
        } 
        System.out.println(pila);
    }
}
