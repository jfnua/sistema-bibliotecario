/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author fresh-fresh
 */
public class StmtSQL {
    
    Connection conn;
   
    public StmtSQL(){
        Conexion cxn = new Conexion();
        conn = cxn.conectar();
    }
    
    public ResultSet consultaLibros(String c) throws SQLException{;
        ResultSet rs;
        String sql = "SELECT * FROM libros WHERE fecha_baja IS NULL AND (titulo LIKE ? or autor LIKE ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, c);
        stmt.setString(2, c);
        rs = stmt.executeQuery();
        return rs;
    }
    
    public void modificarLibro(String[] libro) throws SQLException{
        int rs;
        String sql = "UPDATE libros SET titulo = ?, autor = ?, editorial = ?, paginas = ?, pais = ?, ano_publicacion = ?, isbn = ?, existencia = ?, disponibilidad = ? WHERE idlibro = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, libro[1]);
        stmt.setString(2, libro[2]);
        stmt.setString(3, libro[3]);
        stmt.setInt(4, Integer.parseInt(libro[4]));
        stmt.setString(5, libro[5]);
        stmt.setString(6, libro[6]);
        stmt.setString(7, libro[7]);
        stmt.setInt(8, Integer.parseInt(libro[8]));
        stmt.setInt(9, Integer.parseInt(libro[9]));
        stmt.setString(10, libro[0]);
        rs = stmt.executeUpdate();
    }
    
    public void registrarLibro(String[] libro) throws SQLException{
        int rs;
        String sql = "INSERT INTO libros (titulo,autor,editorial,paginas,pais,ano_publicacion,isbn,existencia,disponibilidad,fecha_registro) VALUES (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, libro[1]);
        stmt.setString(2, libro[2]);
        stmt.setString(3, libro[3]);
        stmt.setInt(4, Integer.parseInt(libro[4]));
        stmt.setString(5, libro[5]);
        stmt.setString(6, libro[6]);
        stmt.setString(7, libro[7]);
        stmt.setInt(8, Integer.parseInt(libro[8]));
        stmt.setInt(9, Integer.parseInt(libro[8]));
        stmt.setString(10, libro[10]);
        rs = stmt.executeUpdate();
    }
    
    public void eliminarLibro(int idLibro, String fecha_baja) throws SQLException{
        int rs;
        String sql = "UPDATE libros SET fecha_baja = ?, existencia = 0, disponibilidad = 0 WHERE idlibro = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, fecha_baja);
        stmt.setInt(2, idLibro);
        rs = stmt.executeUpdate();
    }
    
    public ResultSet consultarMiembros(String c) throws SQLException{
        ResultSet rs;
        String sql = "SELECT * FROM miembros WHERE fecha_baja IS NULL AND (clave LIKE ? or nombre LIKE ?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, c);
        stmt.setString(2, c);
        rs = stmt.executeQuery();
        return rs;
    }
    
    public void registrarMiembro(String[] miembro) throws SQLException{
        int rs;
        String sql = "INSERT INTO miembros (clave,nombre,fecha_nacimiento,domicilio,telefono,correo,fecha_inscripcion) values (?,?,?,?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, miembro[1]);
        stmt.setString(2, miembro[2]);
        stmt.setString(3, miembro[3]);
        stmt.setString(4, miembro[4]);
        stmt.setString(5, miembro[5]);
        stmt.setString(6, miembro[6]);
        stmt.setString(7, miembro[7]);
        rs = stmt.executeUpdate();
    }
    
    public void modificarMiembro(String[] miembro) throws SQLException{
        int rs;
        String sql = "UPDATE miembros SET nombre = ?, fecha_nacimiento = ?, domicilio = ?, telefono = ?, correo = ? WHERE idmiembro = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, miembro[2]);
        stmt.setString(2, miembro[3]);
        stmt.setString(3, miembro[4]);
        stmt.setString(4, miembro[5]);
        stmt.setString(5, miembro[6]);
        stmt.setString(6, miembro[0]);
        rs = stmt.executeUpdate();
    }
    
    public void eliminarMiembro(int idLibro, String fecha_baja) throws SQLException{
        int rs;
        String sql = "UPDATE miembros SET fecha_baja = ? WHERE idmiembro = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, fecha_baja);
        stmt.setInt(2, idLibro);
        rs = stmt.executeUpdate();
    }
    
    public ResultSet consultarPrestamos(String c) throws SQLException{
        ResultSet rs;
        String sql = "SELECT pre.idprestamo, pre.idlibro, pre.idmiembro,li.titulo,mi.nombre, pre.fecha_prestamo, pre.fecha_entrega FROM prestamos pre inner join libros li on li.idlibro = pre.idlibro inner join miembros mi on mi.nombre LIKE ? and mi.idmiembro = pre.idmiembro";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, c);
        rs = stmt.executeQuery();
        return rs;
    }
    
    public void registrarPrestamo(String[] prestamo) throws SQLException{
        int rs;
        String sql = "INSERT INTO prestamos (idlibro,idmiembro,fecha_prestamo,fecha_entrega) VALUES (?,?,?,?)";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, prestamo[0]);
        stmt.setString(2, prestamo[1]);
        stmt.setString(3, prestamo[2]);
        stmt.setString(4, prestamo[3]);
        rs = stmt.executeUpdate();
    }
    
    public void modificarPrestamo(String[] prestamo) throws SQLException{
        String sql = "UPDATE prestamos SET idlibro = ?, idmiembro = ?, fecha_prestamo = ?, fecha_entrega = ? WHERE idprestamo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, prestamo[1]);
        stmt.setString(2, prestamo[2]);
        stmt.setString(3, prestamo[3]);
        stmt.setString(4, prestamo[4]);
        stmt.setString(5, prestamo[0]);
        stmt.executeUpdate();
    }
    
    public void eliminarPrestamo(String idprestamo) throws SQLException{
        String sql = "DELETE FROM prestamos WHERE idprestamo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, idprestamo);
        stmt.executeUpdate();
    }
    
    public float consultarMulta(String idprestamo) throws SQLException{
        float multa = 0f;
        ResultSet rs;
        String sql = "SELECT DATEDIFF(NOW(),fecha_entrega) * 5.99 FROM prestamos WHERE idprestamo = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, idprestamo);
        rs = stmt.executeQuery();
        rs.next();
        multa = rs.getFloat(1);
        return multa; 
    }
    
    public ResultSet consultarDevoluciones(String c) throws SQLException{
        ResultSet rs;
        String sql = "SELECT dev.iddevolucion, dev.idlibro, dev.idmiembro,li.titulo,mi.nombre, dev.fecha_prestamo, dev.fecha_devolucion, dev.dias_retraso, dev.multa FROM devoluciones dev inner join libros li on li.idlibro = dev.idlibro inner join miembros mi on mi.nombre LIKE ? and mi.idmiembro = dev.idmiembro";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, c);
        rs = stmt.executeQuery();
        return rs;
    }
    
    public int contarLibrosPrestados(String idlibro) throws SQLException{
        ResultSet rs;
        String sql = "SELECT COUNT(idlibro) FROM prestamos WHERE idlibro = ?";
        PreparedStatement stmt = conn.prepareStatement(sql);
        stmt.setString(1, idlibro);
        rs = stmt.executeQuery();
        rs.next();
        int count = rs.getInt(1);
        return count;
    }
    
    public void cerrarConexion() throws SQLException{
        conn.close();
    }
    
    
}
