/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import javax.swing.JTextField;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
/**
 *
 * @author jairo
 */
public class AgregarUsuario {
    
    int id;
    String nombre;
    HttpClient cliente = HttpClient.newBuilder().version(HttpClient.Version.HTTP_2).build();
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarUsuario(int paramid,JTextField paramNombres){
        
        
        setId(paramid);
        setNombre(paramNombres.getText());
        ConexionBD objetoConexion = new ConexionBD();
        
        String consulta = ("");
    }
    
}
