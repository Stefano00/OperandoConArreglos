package com.edutecno.promediopasos;

public class PromedioPasos {
	int promedio;
	int sumavariables;
	int cantvarsumadas;
	
	public int crearSteps(String[] promediototal) {
		int i,n = promediototal.length;
		 for(i=0;i<n;i++) {	
			 if(Integer.parseInt(promediototal[i])>199 && Integer.parseInt(promediototal[i]) <100001){
				 sumavariables=sumavariables+Integer.parseInt(promediototal[i]);		
				 cantvarsumadas++;
			 }
			 
		 }		 
		promedio=sumavariables/cantvarsumadas;
		return(promedio);	
				
	}
	

}
