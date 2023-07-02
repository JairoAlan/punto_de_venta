/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author jairo
 */
public class ConexionBD {
    Connection conectar = null;
    
    String usuario = "root";
    String contra = "";
    String bd = "punto_de_venta";
    String ip = "localhost";
    String puerto = "3307";
    
    String cadena = "jdbc:mysql://"+ip+":"+puerto+"/"+bd;
    
    public Connection estableceConexion(){
        
        try{
            
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena,usuario,contra);
            JOptionPane.showMessageDialog(null,"La conexion se ha realizado con exito");
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Error al conectarse a la base de datos, error: "+ e.toString());
        }
        return conectar;
    }
    
}
