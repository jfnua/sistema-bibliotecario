/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author fresh-fresh
 */
public class CambiarDatosAdmin {
    Connection conn;
    public CambiarDatosAdmin(){
        Conexion cxn = new Conexion();
        conn = cxn.conectar();
    }
    public void actualizarAdmin(String user, String nUser, String password) throws SQLException{
        String sql = "UPDATE administradores SET usuario = ?, password = ? WHERE usuario = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, nUser);
        stmt.setString(2, password);
        stmt.setString(3, user);
        stmt.executeUpdate();
        cerrarConexion();
    }
    
    private void cerrarConexion() throws SQLException{
        conn.close();
    }
    
}
