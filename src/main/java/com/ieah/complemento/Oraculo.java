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
public class Oraculo{
  Futuro futuro;
public Oraculo(Futuro futuro){
    this.futuro=futuro;
}  
  
  public String obtenerFuturo(String parametro){
           return futuro.leerFuturo(parametro);
  }
    
}
