package connection;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import persona.conductor;
import java.util.Scanner;
import java.sql.*;

public class crud extends conexion{
    
    Scanner scan = new Scanner(System.in);
    PreparedStatement st = null;
    ResultSet rs = null;
    //PreparedStatement st;
    
    public boolean connect(){
        getConnected();
        System.out.println("Module connected");
        return false;
    }
    
    public void saveDriver(conductor c){
        System.out.println("Rut del conductor = ");
        int rut = scan.nextInt();
        String str = scan.nextLine();
        System.out.println("Digito verificador del conductor");
        String dv = scan.nextLine();
        System.out.println("Primer Nombre del conductor = ");
        String fName = scan.nextLine();
        System.out.println("Segundo Nombre del conductor = ");
        String sName = scan.nextLine();
        System.out.println("Apellido paterno del conductor = ");
        String lName = scan.nextLine();
        System.out.println("Apellido materno del conductor = ");
        String lName2= scan.nextLine();
        String sql = String.format("insert into chofer(primerNombre,segundoNombre,apellidoPaterno,apellidoMaterno,rutChofer,DV) values('%s','%s','%s','%s','%d','%s')",fName,sName,lName,lName2,rut,dv);
        try{
            st = connect.prepareStatement(sql);
            st.execute();
            System.out.println("Dato guardado!");
        }
        catch (Exception inFail){
            System.out.println("Request Failed");}
    }
    
    public void deleteDriver(conductor c){
        System.out.println("Borrando datos ...");
        System.out.println("Inserte rut del conductor = ");
        int rut = scan.nextInt();
        String sql = String.format("delete from chofer where rutChofer =('%d')", rut);
        try{
            st = connect.prepareStatement(sql);
            st.execute();
            System.out.println("Dato eliminado!");
        }catch (Exception delFail){
            System.out.println("Dato no borrado");
        }
    }
    
    public void printDriver(conductor c) {
        
        System.out.println("Inserte rut del chofer");
        int rut = scan.nextInt();
        String sql = String.format("select * from chofer where rutChofer = %d",rut);
        try{
            //cst = create statement
            Statement cst =connect.createStatement();
            rs = cst.executeQuery(sql);
            System.out.println("Consulta realizada!");
            while(rs.next())
            {
                //calling everything in the query
                int nRut = rs.getInt("rutChofer");
                String firstName = rs.getString("primerNombre");
                String secondName = rs.getString("segundoNombre");
                String lName = rs.getString("apellidoPaterno");
                String lName2 = rs.getString("apellidoMaterno");
                String DV = rs.getString("DV");
                
                //printing the results
                System.out.format("rut = %d - %s\nnombre = %s %s %s %s\n",nRut,DV,firstName,secondName,lName,lName2);
            }
        }catch (Exception e){
            System.out.println("Consulta no realizada");
        }
    }
    
    public void editDriver(){
        System.out.println("Inserte rut del chofer");
        int rut = scan.nextInt();
        String skip = scan.nextLine();
        System.out.println("ingrese nombre nuevo = ");
        String nombre = scan.nextLine();
        String sql = String.format("update chofer set primerNombre = '%s' where rutChofer = %d",nombre,rut);
        try{
            st =connect.prepareStatement(sql);
            st.execute();
            System.out.println("Dato editado!");
        }catch (Exception updateSql){
            System.out.println("Dato sin editar");
        }
    }
}
