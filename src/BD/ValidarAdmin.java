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
public class ValidarAdmin {
    
    private Connection conn;
    
    public int validar(String user, String hashPass) throws SQLException{
        int valido = 0;
        Conexion cxn = new Conexion();
        conn = cxn.conectar();
        try{
            java.sql.ResultSet rs;
            String sql = "SELECT password FROM administradores WHERE usuario = ?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, user);
            rs = stmt.executeQuery();
            rs.next();
            String vPass = rs.getString(1);
            if(vPass.equals(hashPass))
                valido = 1;
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            conn.close();
        }
        return valido;
    }
    
}
