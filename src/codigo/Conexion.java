package codigo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Omar David
 */
public class Conexion {
    
    private final String url= "jdbc:postgresql://localhost:5433/BDI";
    private final String usuario= "postgres";
    private final String contrasenia= "basededatos";
    public static Connection conexion= null;
    
    public Connection conectar(){

        try {
            
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url, usuario , contrasenia);
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        
        return conexion;
    }
    
    public void desconectar() throws SQLException{
        conexion.close();
    }
    
    public ResultSet ejecutarInsert(String id, String nombre, String tercero) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "insert into personas (id, nombre, estado) values ('"+id+"','"+nombre+"','"+tercero+"');";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
}
