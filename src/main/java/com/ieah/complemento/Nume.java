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
public class Nume {
  
    private String nombre;
    private String prediccion;

    public Nume() {
    }

    public Nume(String nombre, String prediccion) {
        this.nombre = nombre;
        this.prediccion = prediccion;
    }

    public String getPrediccion() {
        return prediccion;
    }

    public void setPrediccion(String prediccion) {
        this.prediccion = prediccion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}


