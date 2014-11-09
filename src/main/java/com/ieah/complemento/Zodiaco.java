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
        Signo aries=new Signo("aries","No siempre resulta fácil combinar lo que puedes hacer y lo que quieres hacer con el dinero Aunque habrá ahora cierto desequilibrio, las cosas se arreglarán para el mes que viene.");
        Signo tauro=new Signo("tauro","Con deseos, esperanzas y sueños no basta para alcanzar lo que quieres Hace falta la acción concreta.");
        Signo geminis=new Signo("geminis","Hay grandes cambios en puerta para tí en todos los aspectos en los próximos meses estás fuertemente avisado para que lo tomes con calma y te prepares para tiempos difíciles.");
	Signo cancer=new Signo("tauro","Otros harán que las cosas se vean a su manera No vas a empecinarte pero sí a mantener tus posiciones. Hay un familiar que puede ayudarte.");      	
	Signo leo=new Signo("leo","Hace falta paciencia. Es posible que la inspiración te choque cuando menos lo esperes.");
	Signo virgo=new Signo("virgo","Planta y establece claramente que no estás dispuesto a aguantarlo. Hay ansiedades innecesarias provocadas por incertidumbres financieras.");
	Signo libra=new Signo("libra","Trata de saber lo que vale la pena y lucha por ello. Abandona los viejos hábitos y ábrete a nuevas sugerencias.");
	Signo escorpion=new Signo("tauro","Puede ser un día raro en el que se te hace difícil llegar a una decisión para ver claramente lo que está pasando.");
	Signo sagitario=new Signo("sagitario","Busca una nueva distracción que te permita conocer gente diferente.");
	Signo capricornio=new Signo("capricornio","No tienes que demostrarle nada a nadie no dejes que te arrinconen.");
	Signo acuario=new Signo("acuario","Hoy te muestras tan ambicioso que no te detendrás para lograr lo que quieres.");
	Signo piscis=new Signo("piscis","Cualquier tipo de crítica o de opinión que no esté en consonancia contigo va a sentarte fatal. Te sentirás en plena forma, con ganas de más y más.");

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
