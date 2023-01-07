package movil;
import persona.conductor;
import java.util.Scanner;

public class vehiculo {
    //atributos
    int numeroMovil,horaSalida,minutoSalida,horaLLegada,minutoLlegada;
    String patente, marca, modelo;
    conductor conductor;

    public int getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }

    public int getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(int horaSalida) {
        this.horaSalida = horaSalida;
    }

    public int getMinutoSalida() {
        return minutoSalida;
    }

    public void setMinutoSalida(int minutoSalida) {
        this.minutoSalida = minutoSalida;
    }

    public int getHoraLLegada() {
        return horaLLegada;
    }

    public void setHoraLLegada(int horaLLegada) {
        this.horaLLegada = horaLLegada;
    }

    public int getMinutoLlegada() {
        return minutoLlegada;
    }

    public void setMinutoLlegada(int minutoLlegada) {
        this.minutoLlegada = minutoLlegada;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public conductor getConductor() {
        return conductor;
    }

    public void setConductor(conductor conductor) {
        this.conductor = conductor;
    }
    
    Scanner scan = new Scanner(System.in);
    
    public void movilInput(){
        System.out.println("Inserte numero del movil = ");
        numeroMovil = scan.nextInt();
        String movilN = String.format("movil = %d",numeroMovil);
        System.out.println(movilN);
        }
    
    public void patenteInput(){
        System.out.println("Ingrese patente del movil = ");
        String string = scan.nextLine();
        patente = scan.nextLine();
        String patenteN = String.format("Patente = %s",patente);
        System.out.println(patenteN);
    }
    
    public void llegadaInput(){
        System.out.println("Inserte hora de llegada = ");
        horaLLegada = scan.nextInt();
        System.out.println("Inserte minutos de llegada = ");
        minutoLlegada = scan.nextInt();
        String hLlegada = String.format("%d:%d",horaLLegada,minutoLlegada);
        System.out.println("hora de llegada = "+hLlegada);
    }
    
    public void salidaInput(){
        System.out.println("Inserte hora de salida = ");
        horaSalida = scan.nextInt();
        System.out.println("Inserte minutos de salida = ");
        minutoSalida = scan.nextInt();
        String hSalida = String.format("%d:%d",horaSalida,minutoSalida);
        System.out.println("hora de salida = "+hSalida);
    }
}