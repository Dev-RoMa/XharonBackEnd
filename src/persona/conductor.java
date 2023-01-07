package persona;
import java.util.Scanner;

public class conductor {
    String nombre1,nombre2,apellidoPaterno,apellidoMaterno;
    int rut;

    public String getNombre1() {
        return nombre1;
    }

    public void setNombre1(String nombre1) {
        this.nombre1 = nombre1;
    }

    public String getNombre2() {
        return nombre2;
    }

    public void setNombre2(String nombre2) {
        this.nombre2 = nombre2;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }
    
    Scanner scan = new Scanner(System.in);
    
    public void firstName(){
        nombre1= scan.nextLine();
        }
    
    public void nameInput(){
        System.out.println("Inserte primer nombre:");
        nombre1 = scan.nextLine();
        //String string = scan.nextLine();
        System.out.println("Inserte segundo nombre:");
        nombre2= scan.nextLine();
        //string = scan.nextLine();
        System.out.println("Inserte apellido paterno:");
        apellidoPaterno = scan.nextLine();
        //string = scan.nextLine();
        System.out.println("Inerte apellido materno:");
        apellidoMaterno = scan.nextLine();
        //imprimir el nombre completo
        String nombreC = String.format("El nombre del conductor es %s %s %s %s ",nombre1,nombre2,apellidoPaterno,apellidoMaterno);
        System.out.println(nombreC);
        //string = scan.nextLine();
        //string = null;
          
    }
    
}
