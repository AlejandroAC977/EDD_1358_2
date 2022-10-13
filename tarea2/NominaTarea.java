
package tarea2;
import javax.swing.JOptionPane;
import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Path;
import java.util.ArrayList;
import java.io.IOException;

/**
 *
 * @author Alejandro
 */
public class NominaTarea {
     
      
  
    /**
     * @param args the command line arguments
     */

    int tam=0;
    ArregloADT<Trabajador> NominaDat;
    private BufferedReader lector; //lee el archivo
    private String linea; //recibe la linea de cada linea 
    private String partes[] = null; //almacena las lineas
    String[] L;
    ArrayList<ArrayList<String>> OArray = new ArrayList();    
    Trabajador t;
    Trabajador I;
    Trabajador M, Mi;
    String[] TL;
 
    public static void main(String[] args) {
       NominaTarea archivo=new NominaTarea();
       
       Trabajador t1=new Trabajador(319110412, 500, 2002, 2, "Leonardo", "Duarte", "Dominguez");
       Trabajador t2=new Trabajador(319110412, 200, 2009, 0, "Alex", "Duarte", "Hernandez");
    
       ArregloADT list =new ArregloADT(5);
       list.setElemento(2, t1.to_String());
       list.setElemento(1, t2.to_String());
       System.out.println(list.toString());
       System.out.println("--------------\n"+list.getElemento(1)+"\n--------------\n");


       archivo.leerArchivo("C:\\Users\\Alejandro\\Documents\\trabajos FES\\CSV\\dat\\junio.dat");
  
       archivo.mAntiguedad();
       archivo.Menor_Ant();
       archivo.Sueldo();
       
       
    

       
    
       
    }
    
    public void leerArchivo(String nombreArchivo){
        try{
        lector= new BufferedReader(new FileReader(nombreArchivo));
        while((linea=lector.readLine()) != null){
        partes=linea.split(",");
//        TL=linea.split("\n");
        imprimirLinea();
        System.out.println();
//        tam += TL.length;
   
//        ArrayList<String> EArray = new ArrayList();
//                for (String datos : L) {
//                    EArray.add(datos);
//                }     
//        OArray.add(EArray);
        }

        lector.close();
        linea=null;
        partes=null;
         
        NominaDat = new ArregloADT(tam);
        int col=0;     
         for(int f=0; f<OArray.size(); f++){
          t = new Trabajador(Integer.parseInt(OArray.get(f).get(0)),
                                (OArray.get(f).get(1)), 
                                OArray.get(f).get(2), 
                                OArray.get(f).get(3),  
                                Integer.parseInt(OArray.get(f).get(4)), 
                                Integer.parseInt(OArray.get(f).get(5)), 
                                Integer.parseInt(OArray.get(f).get(6)));
          NominaDat.setElemento(col, t);
          col++;
         }
       
        
  
        }catch(IOException e){
         JOptionPane.showMessageDialog(null, e);
        }
    }   

    public void imprimirLinea(){
     for(int i=0; i < partes.length; i++){
         System.out.print(partes[i]+ "  /  ");
     }
    }
    
    
    
    public void mAntiguedad() {
        int m = 2023;
        String TMA = "";
        for (int i = 0; i < NominaDat.getLongitud(); i++) {
            M = NominaDat.getElemento(i);
            if (M.getAñoDeingreso()< m) {
                m = M.getAñoDeingreso();
                TMA = M.getNombre();
            }
        }
        System.out.println("Persona con mayor antiguedad: " + TMA);
    }
   
    public void Menor_Ant() {
        int m2 = 2016;
        String TMA2 = "";
        for (int i= 0; i< NominaDat.getLongitud(); i++) {
            Mi = NominaDat.getElemento(i);
            if (Mi.getAñoDeingreso()> m2) {
                m2=Mi.getAñoDeingreso();
                TMA2= Mi.getNombre();
            }
        }
          System.out.println("Persona con menor antiguedad: " + TMA2);
    }    
    
    public void Sueldo() {
        for (int ta = 0; ta < NominaDat.getLongitud(); ta++) {
            I=NominaDat.getElemento(ta);
            System.out.println("Id: " + I.getNumeroTrabajador()+ " Sueldo: " + I.CalcularSueldo());
        }
    }



}


