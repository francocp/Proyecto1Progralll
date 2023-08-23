/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1progra3.CapaDatos;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import proyecto1progra3.CapaLógica.Estudiante;
import proyecto1progra3.CapaLógica.Profesores;

/**
 *
 * @author Franco
 */
public class ProfesorDA {
    
    Connection cn = new ConexionBD().getConn();

    public boolean Agregar(Profesores obj) {
         boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{AGREGAR_PROFESORES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setString(2, obj.getNombre());
            cs.setInt(1, obj.getCedula());
            cs.setString(3, obj.getApellido());
            cs.setString(4, obj.getApellido2()); 
            cs.setInt(5, obj.getEdad());
            cs.setString(6, obj.getProfesion());
            cs.setString(7, obj.getUniDeEgresion());
            cs.setString(8, obj.getClasesimpartidas());
            cs.setInt(9, obj.getAnnosexperiencia());
            cs.setString(10, obj.getIdiomas());
            cs.setInt(11, obj.getNumero());
            cs.setString(12, obj.getCorreo());
            cs.setString(13, obj.getUsername());
            
            if (cs.executeUpdate()>0){
                band = true;
            }
            
              
              
        } catch (Exception e) {
            System.out.println("Error al insertar profesor");
        }
            
      
    return band;
    }

    public boolean Actualizar(Profesores obj) {
        boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{ACTUALIZAR_PROFESORES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
            cs.setInt(1, obj.getCedula());
            cs.setString(2, obj.getNombre());
            cs.setString(3, obj.getApellido());
            cs.setString(4, obj.getApellido2()); 
            cs.setInt(5, obj.getEdad());
            cs.setString(6, obj.getProfesion());
            cs.setString(7, obj.getUniDeEgresion());
            cs.setString(8, obj.getClasesimpartidas());
            cs.setInt(9, obj.getAnnosexperiencia());
            cs.setString(10, obj.getIdiomas());
            cs.setInt(11, obj.getNumero());
            cs.setString(12, obj.getCorreo());
            cs.setString(13, obj.getUsername());
            
            if (cs.executeUpdate()>0){
                band = true;
            }
            
              
              
        } catch (Exception e) {
            System.out.println("Error al insertar profesor");
        }
            
      
    return band;
    }

    public boolean Eliminar(String codigo) {
       boolean band = false;
        try {
           
            CallableStatement cs = cn.prepareCall("{ELIMINAR_PROFESORES(?)}");
            cs.setString(1, codigo);
            
            
            if (cs.executeUpdate()>0){
                band = true;
            }
              
        } catch (Exception e) {
            System.out.println("Error al eliminar profesor");
        }
            
      
    return band;
    }

    public DefaultTableModel Lista() {
    DefaultTableModel mdl= new DefaultTableModel();
    mdl.addColumn("Cedula ");
    mdl.addColumn("Nombre ");
    mdl.addColumn("Primer Apellido ");
    mdl.addColumn("Segundo Apellido ");
    mdl.addColumn("Edad ");
    mdl.addColumn("Profesion ");
    mdl.addColumn("Universidad de egresion ");
    mdl.addColumn("Clases impartidas ");
    mdl.addColumn("Años de experiencia ");
    mdl.addColumn("Idiomas ");
    mdl.addColumn("Numero ");
    mdl.addColumn("Correo ");
    mdl.addColumn("Username ");
        try {
            CallableStatement cs = cn.prepareCall("{LISTAR_PROFESORES ()}");
            ResultSet rst =cs.executeQuery();
            
            while (rst.next()) {
                Object data[] = { 
                    rst.getString(1),
                    rst.getString(2),
                    rst.getString(3),
                    rst.getString(4),
                    rst.getInt(5),
                    rst.getString(6),
                    rst.getString(7),
                    rst.getString(8),
                    rst.getInt(9),
                    rst.getString(10),
                    rst.getString(11),
                    rst.getString(12),
                    rst.getString(13),
                };
                
                mdl.addRow(data);
                
            }
        } catch (Exception e) {
            System.out.println("Error al traer la lista de profesores");
        }

    return mdl;
    }
    
    
    
    
}
