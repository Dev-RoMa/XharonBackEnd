package connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexion {
    private final String url ="jdbc:sqlite:D:/Proyectos/java/xharonBackend/src/DB/xharonDb.db";
    public Connection connect;
 
    public conexion() {
        this.connect = null;
    }
    
    public Connection getConnected(){
        //inicializando la conexion
        try{
            connect = DriverManager.getConnection(url);
        
            if(connect!=null){
                System.out.println("Conectado!");}
            }catch(SQLException connectionFail){
                    System.out.println("No conectado");
        }
    return connect;
    }
}
