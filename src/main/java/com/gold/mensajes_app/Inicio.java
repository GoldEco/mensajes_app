/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gold.mensajes_app;

import java.sql.Connection;

/**
 *
 * @author Gold
 */
public class Inicio {

    public static void main(String[] args) {
        
        Conexion conectarse = new Conexion();
        
        try(Connection cnx = conectarse.get_connection()){
            
            
        }catch(Exception e){
            
            System.out.println(e);
            
        }

    }

}
