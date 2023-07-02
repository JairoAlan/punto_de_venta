/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Login;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class APIClient {
    public APIClient() {
        try{
            URL url = new URL("http://localhost/API/conexion.php");
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            System.out.println(connection.getResponseMessage());
        }catch(Exception e){
            
        }
    }     
}

