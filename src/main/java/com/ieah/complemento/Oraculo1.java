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
public class Oraculo1{
  Futuro1 futuro1;
public Oraculo1(Futuro1 futuro1){
    this.futuro1=futuro1;
}  
  
  public String obtenerFuturo(String parametro){
           return futuro1.leerFuturo1(parametro);
  }
    
}
