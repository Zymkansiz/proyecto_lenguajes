/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ieah.complemento;

/**
 *
 * @author Ivan
 */
public class Numeromag{
Suerte suerte;
public Numeromag(Suerte suerte){
    this.suerte=suerte;
}  
  
  public String obtenerSuerte(String parametro){
           return suerte.leerSuerte(parametro);
  }
    
}
