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
            sql = "INSERT INTO HISTORICO_TRABAJO VALUES ('"+fechai+"', "+salario+", '"+cargo+"', (SELECT ID FROM ORGANIGRAMA WHERE NOMBRE = '"+departamento+"'),"+num_expediente+");";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarInsertEmpHisTur(String fechai, String turno, int num_expediente) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO HISTORICO_TURNOS VALUES ('"+fechai+"', '"+turno+"', '"+fechai+"', "+num_expediente+", (SELECT ID FROM ORGANIGRAMA WHERE NOMBRE = 'MANTENIMIENTO'));";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarSelectEmp(int numEmp) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "SELECT E.NUM_EXPEDIENTE, E.PRI_NOMBRE, E.PRI_APELLIDO, E.SEG_APELLIDO, E.FECHA_NAC,\n" +
                    "   E.TIPO_SANGRE, E.GENERO, E.EDO_CIVIL, E.ESTUDIOS, E.SEG_NOMBRE, T.CODIGO, T.NUMERO,\n" +
                    "   O.NOMBRE, H.FECHAI, H.SALARIO, H.CARGO\n" +
                    "FROM EMPLEADO E, TELEFONO T, ORGANIGRAMA O, HISTORICO_TRABAJO H\n" +
                    "WHERE E.NUM_EXPEDIENTE = "+numEmp+" AND E.NUM_EXPEDIENTE = H.ID_EMP AND E.NUM_EXPEDIENTE = T.ID_EMP\n" +
                    "	AND H.ID_ORG = O.ID;";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarSelectEmpleados() throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "SELECT E.PRI_NOMBRE, E.PRI_APELLIDO, E.SEG_APELLIDO, H.FECHAI, O.NOMBRE, H.CARGO\n" +
                    "FROM EMPLEADO E, HISTORICO_TRABAJO H, ORGANIGRAMA O\n" +
                    "WHERE E.NUM_EXPEDIENTE = H.ID_EMP AND H.ID_ORG = O.ID;";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarUpdateEmp(int num_expediente, String pri_nombre, String pri_apellido, String seg_apellido, String fecha_nac,
            String tipo_sangre, String genero, String edo_civil, String estudios, String seg_nombre) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "UPDATE EMPLEADO SET PRI_NOMBRE = '"+pri_nombre+"', PRI_APELLIDO= '"+pri_apellido+"', SEG_APELLIDO= '"+seg_apellido+"', FECHA_NAC= '"+fecha_nac+"',\n" +
                    "	TIPO_SANGRE= '"+tipo_sangre+"', GENERO= '"+genero+"', EDO_CIVIL= '"+edo_civil+"', ESTUDIOS= '"+estudios+"', SEG_NOMBRE= '"+seg_nombre+"'\n" +
                    "WHERE NUM_EXPEDIENTE = "+num_expediente+";";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;        
    }
    
    public ResultSet ejecutarUpdateEmpTlf(String codigo, String numero, int num_expediente) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "UPDATE TELEFONO SET CODIGO= '"+codigo+"', NUMERO= '"+numero+"'\n" +
                    "WHERE ID_EMP = "+num_expediente+";";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;        
    }
    
    public ResultSet ejecutarUpdateEmpHisTra(String fechai, double salario, String cargo, String departamento, int num_expediente) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "UPDATE HISTORICO_TRABAJO SET FECHAI= '"+fechai+"', SALARIO= '"+salario+"', CARGO= '"+cargo+"'\n" +
                    "WHERE ID_EMP = "+num_expediente+";";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result;        
    }
    
    public ResultSet ejecutarUpdateEmpHisTur(String fechai, String turno, int num_expediente) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "UPDATE HISTORICO_TURNOS SET FECHAI= '"+fechai+"', TURNO= '"+turno+"'\n" +
                    "WHERE ID_EMP = "+num_expediente+";";
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
    
    public ResultSet ejecutarInsertCondMed(String nombre, String tipo, String descrip) throws SQLException{
        
        ResultSet result = null;
        
        try {
            Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO CONDICION_MED (NOMBRE, TIPO, DESCRIPCION) VALUES ('"+nombre+"', '"+tipo+"', '"+descrip+"');";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public ResultSet ejecutarInsertEmp_Cond(int detEmp, String nomDet) throws SQLException{
        
        ResultSet result = null;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO EMP_COND_MED VALUES ("+detEmp+", (SELECT ID FROM CONDICION_MED WHERE NOMBRE= '"+nomDet+"'));";
            result = st.executeQuery(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public int ejecutarInsertDetalleBonoM(String fechaDet, int numEmpDet, String motivo, Double monDet, String desDet) throws SQLException{
        
        int result = 0;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO DETALLE_EXP (FECHA_DET, ID_EMP, MOTIVO, MONTOBONO, DESCRIPCION) VALUES ('"+fechaDet+"', "+numEmpDet+", '"+motivo+"', "+monDet+", '"+desDet+"');";
            result = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
    public int ejecutarInsertDetalleBonoA(String fechaDet, int numEmpDet, String motivo, Double monDet, String desDet) throws SQLException{
        
        int result = 0;
        
        try {
            java.sql.Statement st = conexion.createStatement();
            String sql;
            sql = "INSERT INTO DETALLE_EXP (FECHA_DET, ID_EMP, MOTIVO, MONTOBONO, DESCRIPCION) VALUES ('"+fechaDet+"', "+numEmpDet+", '"+motivo+"', "+monDet+", '"+desDet+"');";
            result = st.executeUpdate(sql);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return result; 
    }
    
}
