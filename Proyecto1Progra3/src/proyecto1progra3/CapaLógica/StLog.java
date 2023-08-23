/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto1progra3.CapaLógica;

import javax.swing.table.DefaultTableModel;
import proyecto1progra3.CapaDatos.*;

/**
 *
 * @author emanu
 */
public class StLog {
    EstudianteDA AlD = new EstudianteDA();
    
    public void Agregar(String fecha,String Clases,String MPasadas, int  carnetEstudiante, int cedula, String nombre, String apellido1, String apellido2, int edad, String correo, int P, String D, int N)
    {
        if (AlD.Agregar(new Estudiante(D,N,  P, correo,fecha, Clases, MPasadas,cedula, carnetEstudiante, nombre,edad,apellido1,apellido2)))
        {
            System.out.println("Dato Agregado");
        }
    
    }
    
    public void Actualizar(String fecha,String Clases,String MPasadas, int carnetEstudiante, int cedula, String nombre, String apellido1, String apellido2, int edad, String nacionalidad, String correo, String direccion, float P, String D, int N)
    {
        if (AlD.Agregar(new Estudiante(D,N, (int) P, correo,fecha, Clases, MPasadas,cedula, carnetEstudiante, nombre,edad,apellido1,apellido2)))
        {
            System.out.println("Dato Actualizado");
        }
    
    }
    
    public void Eliminar(String cedula)
    {
        if (AlD.Eliminar(cedula)) 
        {
            System.out.println("Dato Eliminado");
        }
    
    }
    
    public DefaultTableModel Lista()
    {
       return AlD.Lista();
    }
    
}
