/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author fresh-fresh
 */
public class Conexion {
    
    private Connection conexion;
    
    public Connection conectar(){
        try{
            String url = "jdbc:mysql://localhost:3306/bdbiblioteca?user=root&password=admin&serverTimezone=UTC";
            conexion = DriverManager.getConnection(url);
        }catch(SQLException e){
            e.printStackTrace(System.out);
        }
        
        return conexion;
    }
}

