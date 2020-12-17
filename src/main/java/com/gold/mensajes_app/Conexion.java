/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gold.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Gold
 */
public class Conexion {
    
    public Connection get_connection(){
        
        Connection connection = null;
        
        try{
            
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app", "root", ""); //1er param: URL Database - 2do: Usuario DB - 3ro: Password
            
            if(connection != null){
                System.out.println("La conexión ha sido exitosa\n");
            }
            
        }catch(SQLException excepcion){
            
            System.out.println(excepcion);
            
        }
        
        return connection;
        
    }
    
}
