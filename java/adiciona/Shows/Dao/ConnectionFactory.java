package adiciona.Shows.Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;
 
 
public class ConnectionFactory {
    public Connection getConnection() {
    System.out.println("Conectando ao banco");
    try {
            
            DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
            return DriverManager.getConnection("jdbc:mysql://localhost/shows", "root", "2304");
            } catch(SQLException e) {
                e.printStackTrace();
                throw new RuntimeException(e);
             
        }
         
    }
}