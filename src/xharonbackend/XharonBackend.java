package xharonbackend;
//import connection.conexion;
//import movil.vehiculo;
import persona.conductor;
import connection.crud;
import java.util.Scanner;

public class XharonBackend {

    public static void main(String[] args) {
        /*U can use these to test the modules !*/
        //conexion conexion = new conexion();
        //conexion.getConnected();        
        //vehiculo movil = new vehiculo();
        //movil.movilInput();
        //movil.patenteInput();
        //conductor conductor = new conductor();
        //conductor.nameInput();
        //movil.llegadaInput();
        //movil.salidaInput();
        Scanner scan = new Scanner(System.in);
        conductor conductor = new conductor();
        crud conexion = new crud();
        int sw = -1;
        int op;
        
        conexion.connect();
        while (sw == -1){
            
            System.out.println("Welcome!");
            System.out.println("1.-Guardar Conductor\n2.-Borrar Conductor\n3.-Mostrar Conductor\n4.-Actualizar Conductor\n5.-Salir");
        op = scan.nextInt();
        switch(op) {
            case 1:
                System.out.println("Guardar conductor");
                conexion.saveDriver(conductor);
                break;
            case 2:
                System.out.println("Borrando conductor");
                conexion.deleteDriver(conductor);
                break;
            case 3:
                System.out.println("Mostrando conductor");
                conexion.printDriver(conductor);
                break;
            case 4:
                System.out.println("Editando conductor");
                conexion.editDriver();
                break;
            case 5:
                System.out.println("Bye o/");
                sw = 0;
                break;
                default:
                    System.out.println("Pick a valid option!");
                    break;
        }
      }
    }
}