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
public class Zodiaco implements Futuro{
private ArrayList<Signo>signos;
     public Zodiaco(){
        signos=new ArrayList<Signo>();
        Signo aries=new Signo("aries","No siempre resulta f�cil combinar lo que puedes hacer y lo que quieres hacer con el dinero Aunque habr� ahora cierto desequilibrio, las cosas se arreglar�n para el mes que viene.");
        Signo tauro=new Signo("tauro","Con deseos, esperanzas y sue�os no basta para alcanzar lo que quieres Hace falta la acci�n concreta.");
        Signo geminis=new Signo("geminis","Hay grandes cambios en puerta para t� en todos los aspectos en los pr�ximos meses est�s fuertemente avisado para que lo tomes con calma y te prepares para tiempos dif�ciles.");
	Signo cancer=new Signo("tauro","Otros har�n que las cosas se vean a su manera No vas a empecinarte pero s� a mantener tus posiciones. Hay un familiar que puede ayudarte.");      	
	Signo leo=new Signo("leo","Hace falta paciencia. Es posible que la inspiraci�n te choque cuando menos lo esperes.");
	Signo virgo=new Signo("virgo","Planta y establece claramente que no est�s dispuesto a aguantarlo. Hay ansiedades innecesarias provocadas por incertidumbres financieras.");
	Signo libra=new Signo("libra","Trata de saber lo que vale la pena y lucha por ello. Abandona los viejos h�bitos y �brete a nuevas sugerencias.");
	Signo escorpion=new Signo("tauro","Puede ser un d�a raro en el que se te hace dif�cil llegar a una decisi�n para ver claramente lo que est� pasando.");
	Signo sagitario=new Signo("sagitario","Busca una nueva distracci�n que te permita conocer gente diferente.");
	Signo capricornio=new Signo("capricornio","No tienes que demostrarle nada a nadie no dejes que te arrinconen.");
	Signo acuario=new Signo("acuario","Hoy te muestras tan ambicioso que no te detendr�s para lograr lo que quieres.");
	Signo piscis=new Signo("piscis","Cualquier tipo de cr�tica o de opini�n que no est� en consonancia contigo va a sentarte fatal. Te sentir�s en plena forma, con ganas de m�s y m�s.");

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
     public String leerFuturo(String parametro) {
      String tuFuturo="Disculpa las inconveniencias, signo no disponible.";
      for(Signo s:signos){
      if(parametro.equalsIgnoreCase(s.getNombre())){
          tuFuturo=s.getPrediccion();
                }
          
          }
        return tuFuturo;
    }
   
}
