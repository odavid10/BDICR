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
    
    //MODULO DE EMPLEADOS
    public ResultSet ejecutarInsertEmp(int num_expediente, String pri_nombre, String pri_apellido, String seg_apellido, String fecha_nac,
            String tipo_sangre, String genero, String edo_civil, String estudios, String seg_nombre) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO EMPLEADO (NUM_EXPEDIENTE, PRI_NOMBRE, PRI_APELLIDO, SEG_APELLIDO, FECHA_NAC,\n" +
                    "	TIPO_SANGRE, GENERO, EDO_CIVIL, ESTUDIOS, SEG_NOMBRE)\n" +
                    "	VALUES ("+num_expediente+", '"+pri_nombre+"', '"+pri_apellido+"', '"+seg_apellido+"', '"+fecha_nac+"',"
                    + " '"+tipo_sangre+"', '"+genero+"', '"+edo_civil+"',\n" +
                    "	'"+estudios+"', '"+seg_nombre+"');";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarInsertEmpTlf(String codigo, String numero, int num_expediente) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO TELEFONO VALUES ("+codigo+", "+numero+", "+num_expediente+");";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarInsertEmpHisTra(String fechai, double salario, String cargo, String departamento, int num_expediente) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO HISTORICO_TRABAJO VALUES ('"+fechai+"', "+salario+", 'SECRETARIA', (SELECT ID FROM ORGANIGRAMA WHERE NOMBRE = '"+departamento+"'),"+num_expediente+");";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public void ejecutarDeleteEmp(int numEmp) throws SQLException{

        ResultSet result = null;

        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "delete from telefono where id_emp = "+numEmp+";\n" +
                    "delete from Historico_trabajo where id_emp = "+numEmp+";\n" +
                    "delete from empleado where num_expediente = "+numEmp+";";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
}
