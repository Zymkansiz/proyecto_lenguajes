/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ieah.complemento;

import java.util.ArrayList;

/**
 *
 * @author Ivan
 */
public class Porvenir implements Futuro1 {
    private ArrayList<Fut>futs;
     public Porvenir(){
        futs=new ArrayList<Fut>();
        Fut aries=new Fut("aries","Tu futuro esta lleno de amor y dinero.");
        Fut tauro=new Fut("tauro","Lamentablemente tu futuro esta viendose mermado por las envidias.");
        Fut geminis=new Fut("geminis","Debes tener en cuenta que el futuro lo creas tu y tus energías.");
	Fut cancer=new Fut("tauro","El futuro de tu familia depende enteramente de ti.");      	
	Fut leo=new Fut("leo","Pronto recibiras una gran sorpresa.");
	Fut virgo=new Fut("virgo","Son solo unos cuantos días mas para que algo increible te suceda.");
	Fut libra=new Fut("libra","Ten mucho cuidado, pues los problemas esta a la vuelta de la esquina.");
	Fut escorpion=new Fut("tauro","El amor te pintara muy bien, pero en los negocios...");
	Fut sagitario=new Fut("sagitario","Se avecinan tiempos de opulencia.");
	Fut capricornio=new Fut("capricornio","Tu porvenir es excelente.");
	Fut acuario=new Fut("acuario","Debes qtener en cuenta varios factores antes de tomar decisiones futuras.");
	Fut piscis=new Fut("piscis","Tu futuro pinta fabuloso.");

        futs.add(aries);
        futs.add(tauro);
        futs.add(geminis);
	futs.add(cancer);
        futs.add(leo);
        futs.add(virgo);
	futs.add(libra);
        futs.add(escorpion);
        futs.add(sagitario);
	futs.add(capricornio);
        futs.add(acuario);
        futs.add(piscis);
 
     }
     public String leerFuturo1(String parametro) {
      String tuFuturo1="Disculpa las inconveniencias, futuro de este signo no disponible.";
      for(Fut f:futs){
      if(parametro.equalsIgnoreCase(f.getNombre())){
          tuFuturo1=f.getPrediccion();
                }
          
          }
        return tuFuturo1;
    }
   
}
