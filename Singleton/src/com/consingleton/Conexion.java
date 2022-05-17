/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.consingleton;

/**
 *
 * @author sroa
 */
public class Conexion {
     private String nombre;
    static int contador;
   private static Conexion conexion;//privado
    
     private Conexion (String nombre ){
        this.nombre = nombre;
        contador++;
    }
     
     //singleton
     //si conexion apunta null, crea una nueva conexion sino apunta
     //regresa la conexion.
     public static Conexion getInstance (){
         if(conexion==null){
         conexion = new Conexion ("Mysql");
         return conexion;
         }else{
            return conexion; 
         }
         
     }
    
}
