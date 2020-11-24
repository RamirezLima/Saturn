/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connection;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author rodrigo
 */
public class ConexaoDB {
    public static String host = "127.0.0.1";
    public static String porta = "3306";
    public static String db = "saturn";
    public static String usuario = "root";
    public static String senha = "LEid9.vida";
    
    
    public static Connection obterConexao () throws Exception{
        String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host,
                porta,
                db+"?useTimezone=true&serverTimezone=UTC"
            );
        return DriverManager.getConnection(url, usuario, senha);
        /*try{
            String url = String.format(
                "jdbc:mysql://%s:%s/%s",
                host,
                porta,
                db
            );
            return DriverManager.getConnection(url, usuario, senha);
        }
        catch (Exception e){
            e.printStackTrace();
            return null;
        }*/
        
    }
    
}
