
package tarea2;

/**
 *
 * @author Alejandro
 */
public class Trabajador {
    double HoraExtra=275.5;
    private int numeroTrabajador;
    private int SueldoBase;
    private int añoDeingreso;
    private int HorExtras;
    private String nombre;
    private String paterno;
    private String materno;
    private double tsueldo;

    //constructor
//    public Trabajador(){
//    HoraExtra=276.5;
//    numeroTrabajador=0;
//    SueldoBase=0;
//    añoDeingreso=0;
//    hExtras=0;
//    nombre="";
//    paterno="";
//    materno="";
//
//    }

    //sobrecargado
    public Trabajador(int numeroTrabajador, int SueldoBase, int añoDeingreso, int HorExtras, String nombre, String paterno, String materno) {
        this.numeroTrabajador = numeroTrabajador;
        this.SueldoBase = SueldoBase;
        this.añoDeingreso = añoDeingreso;
        this.HorExtras = HorExtras;
        this.nombre = nombre;
        this.paterno = paterno;
        this.materno = materno;
    }

    Trabajador() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    Trabajador(int parseInt, String get, String get0, String get1) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    //metodos
    
    public double CalcularSueldo() {
        int antiguedad = 2022 - this.añoDeingreso;
        tsueldo = this.SueldoBase + (this.SueldoBase*(antiguedad*0.03)) + (this.HorExtras*HoraExtra);
        return tsueldo;
    }

    public String to_String() {
        String estado = "";
        estado += numeroTrabajador + "\n";
        estado += nombre + "\n";
        estado += paterno + "\n";
        estado += materno + "\n";
        estado += HorExtras + "\n";
        estado += SueldoBase + "\n";
        estado += añoDeingreso;
        return estado;
    }


    // get&&set
    public double getHoraExtra() {
        return HoraExtra;
    }

    public void setHoraExtra(double HoraExtra) {
        this.HoraExtra = HoraExtra;
    }

    public int getNumeroTrabajador() {
        return numeroTrabajador;
    }

    public void setNumeroTrabajador(int numeroTrabajador) {
        this.numeroTrabajador = numeroTrabajador;
    }

    public int getSueldoBase() {
        return SueldoBase;
    }

    public void setSueldoBase(int SueldoBase) {
        this.SueldoBase = SueldoBase;
    }

    public int getAñoDeingreso() {
        return añoDeingreso;
    }

    public void setAñoDeingreso(int añoDeingreso) {
        this.añoDeingreso = añoDeingreso;
    }

    public int getHorExtras() {
        return HorExtras;
    }

    public void sethEextras(int hEextras) {
        this.HorExtras = hEextras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }
    
    
}
