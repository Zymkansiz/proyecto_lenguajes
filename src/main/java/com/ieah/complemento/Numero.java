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
public class Numero implements Suerte{
private ArrayList<Signo>signos;
     public Numero(){
        signos=new ArrayList<Signo>();
        Signo aries=new Signo("aries","14");
        Signo tauro=new Signo("tauro","23");
        Signo geminis=new Signo("geminis","84");
	Signo cancer=new Signo("tauro","13");      	
	Signo leo=new Signo("leo","24");
	Signo virgo=new Signo("virgo","16");
	Signo libra=new Signo("libra","46");
	Signo escorpion=new Signo("tauro","35");
	Signo sagitario=new Signo("sagitario","6");
	Signo capricornio=new Signo("capricornio","98");
	Signo acuario=new Signo("acuario","74");
	Signo piscis=new Signo("piscis","2");

        signos.add(aries);
        signos.add(tauro);
        signos.add(geminis);
	signos.add(cancer);
        signos.add(leo);
        signos.add(virgo);
	signos.add(libra);
        signos.add(escorpion);
        signos.add(sagitario);
	signos.add(capricornio);
        signos.add(acuario);
        signos.add(piscis);
 
     }
     public String leerSuerte(String parametro) {
      String tuSuerte="Disculpa las inconveniencias, signo no disponible.";
      for(Signo su:signos){
      if(parametro.equalsIgnoreCase(su.getNombre())){
          tuSuerte=su.getPrediccion();
                }
          
          }
        return tuSuerte;
    }
   
}
