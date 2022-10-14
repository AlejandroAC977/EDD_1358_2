
package Laberinto;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import static java.lang.Integer.parseInt;
/**
 *
 * @author Alejandro
 */
public class Tablero {
    private BufferedReader lector; //lee el archivo
    private String linea; //recibe la linea de cada linea 
    private String partes[] = null; //almacena las lineas
    private int casilla[][];
    private int fil, col =0;
    private int k=0; 
    private BufferedReader lector2;
    
 
public void leerArchivo(String nombreArchivo){
  try{
  lector = new BufferedReader(new FileReader(nombreArchivo));
    
    while((linea = lector.readLine()) != null){
    partes=linea.split(",");
    imprimirLinea();
    System.out.println();
    
//       casilla[i][k] = lector.read();
//       //casilla[i][k] = parseInt(linea);
//       i++;
//       k++;
       
    }
    System.out.println("Salida casilla: 0 , 7");
    lector.close();
    linea=null;
    partes=null;
 
  }catch(Exception e){
   JOptionPane.showMessageDialog(null, e);
   }

  
 
}

public void ingresarArchivo(String nombreArchivo){
 ArregloADT_2D tablero = new ArregloADT_2D(10, 10);
 
 try{
//   lector = new BufferedReader(new FileReader(nombreArchivo));
//   if((k=lector.read()) == 0 && (k=lector.read()) == 1){
//    while(contador > 0){
//      for(int f=10; f<0; f--){
//       for(int c=10; c<0; f--){
//       tablero.set_Item(fil, col, k);
//       fil++;
//       contador--;
//       }
//      tablero.set_Item(fil, col, k);
//      col++;
//      contador--;
//      }
//    }
//   }else if ((k=lector.read()) == 2){
//   
//   }else if ((k=lector.read()) == 3){
//  
//   }else{
//        
//   mala idea 


  while ((k=lector.read()) >= 0){
  for(int f=0; f>=10; f++){
   for(int c=0; c>=10; c++){
    tablero.set_Item(fil, col, k);
    col++;
   }
  tablero.set_Item(fil, col, k);
  fil++;
  }
  
  }
     
 }catch(Exception e){
 
 }
}   

public void imprimirLinea(){
 for(int i=0; i < partes.length; i++){
     System.out.print(partes[i]+ "  /  ");
 }
}
}
