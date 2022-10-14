
package Laberinto;

/**
 *
 * @author Alejandro
 */
public class ArregloADT_2D <T>{
     public static void main(String[] args) {
        ArregloADT_2D prueba = new ArregloADT_2D(10, 10);

        for (int f = 0; f < prueba.get_Filas(); f++) {
            for (int h = 0; h < prueba.get_Columnas(); h++) {
                prueba.set_Item(f, h, '/');
            }
        }
        
        prueba.set_Item(8, 1, ":D");
        prueba.set_Item(0, 0, ":D");
        prueba.set_Item(1, 0, ":D");
        prueba.set_Item(2, 0, ":D");
        prueba.set_Item(4, 0, "o.O");

        
        System.out.println("Numero de columnas: "+prueba.get_Columnas());
        System.out.println("Numero de filas"+prueba.get_Filas());
        System.out.print("\n");
        for (int f = 0; f < prueba.get_Filas(); f++) {
            for (int h = 0; h < prueba.get_Columnas(); h++) {
                System.out.print(prueba.get_Item(f, h) + " ");
            }
            System.out.print("\n");
        }

    }

    int Filas, Columnas;
    private final ArregloADT<ArregloADT> Fillas;
    ArregloADT<ArregloADT> Item;
    ArregloADT Collumnas;
    ArregloADT Item2;

    public ArregloADT_2D(int Fila, int Colu) { //Constructor
        this.Filas = Fila;
        this.Columnas = Colu;
        Fillas = new ArregloADT(Filas);
        for (int F = 0; F < Filas; F++) {
            Fillas.setElemento(F, new ArregloADT(Colu));
        }
    }

    public int get_Filas() {
        return Filas;
    }

    public int get_Columnas() {
        return Columnas;
    }

    public void set_Item(int IndFil, int IndCol, T Elemento) {
        Fillas.getElemento(IndFil).setElemento(IndCol, Elemento);
    }

    public T get_Item(int IndFil, int IndCol) { //Creo es acá el problema
        if (IndCol >= 0 && IndCol < Columnas) {
            if (IndFil >= 0 && IndFil < Filas) {
                return (T) Fillas.getElemento(IndFil).getElemento(IndCol);
            }
        }
        return null;
    }

    public void Clear(T Elemento) {
        for (int Posi = 0; Posi < Fillas.getLongitud(); Posi++) {
            Item2.setElemento(Posi, Elemento);
            Fillas.setElemento(Posi, Item2);
        }
    }

    public String to_String() {
        String estado = "";
        estado += Fillas + "\n";
        return estado;
    }
}
