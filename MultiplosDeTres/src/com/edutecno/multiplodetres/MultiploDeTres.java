package com.edutecno.multiplodetres;

public class MultiploDeTres {
	int sumavariables;
	int cantvarsumadas=0;
	
	
	public int filtro(String[] sumamultiplos3) {
		int i,n = sumamultiplos3.length;
		int variablesfiltradas[];
		variablesfiltradas = new int[n];
		 for(i=0;i<n;i++) {	
				
			 if(Integer.parseInt(sumamultiplos3[i])%3==0) {
				 variablesfiltradas[cantvarsumadas]=Integer.parseInt(sumamultiplos3[i]);
				 cantvarsumadas++;
			 }
		 }		 
		return(suma(variablesfiltradas));	
	}
	
	public int suma(int[] variablesfiltradas2) {
		int sumavariables = 0;
		int i;
		 for(i=0;i<cantvarsumadas;i++) {
			 sumavariables=sumavariables+variablesfiltradas2[i];
			 
		 }
		
		return(sumavariables);
	}

}
