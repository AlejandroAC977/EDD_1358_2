
package Laberinto;

import java.util.Stack;

/**
 *
 * @author Alejandro
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


    Tablero archivo=new Tablero();
    
        System.out.println("----------");
        archivo.leerArchivo("C:\\Users\\Alejandro\\Documents\\trabajos FES\\CSV\\dat\\Laberinto2.dat");
        System.out.println("----------");
        archivo.ingresarArchivo("C:\\Users\\Alejandro\\Documents\\trabajos FES\\CSV\\dat\\Laberinto2.dat");
    
    }

    
    
}
