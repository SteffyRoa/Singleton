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
public class Principal {
      public static void main (String [] args){
   Conexion con1 =Conexion.getInstance();
   Conexion con2 = Conexion.getInstance();
   Conexion con3 = Conexion.getInstance();
          System.out.println("conexion"+Conexion.contador);
   
      }
    
}
