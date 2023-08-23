/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1progra3.CapaDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Franco
 */
public class ConexionBD {
    Connection con = null;
    
    private static String driver = "com.mysql.cj.jdbc.Driver";
    private static String usuario = "root";
    private static String password = "franco1099@";
    private static String url = "jdbc:mysql://localhost:3306/bduniversidad?zeroDateTimeBehavior=CONVERT_TO_NULL";
    
    static
    {
        try {
            Class.forName(driver);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.toString(), "Project", 0);
        }
    
    }
    
    public Connection getConn()
    {
        try {
            con =  DriverManager.getConnection(url,usuario,password);
        } catch (Exception e) {
            System.out.println("Error al conectarnos a la base de datos");
            con = null;
        }
    return con;
    }
    
}
