package com.edutecno.promedio;

public class Promedio {
	
	int sumavariables;
	int promedio;
	
	public int promedio(String[] promediototal) {
		int i,n = promediototal.length;
		 for(i=0;i<n;i++) {		 
			 sumavariables=sumavariables+Integer.parseInt(promediototal[i]);
		 }		 
		promedio=sumavariables/n;
		return(promedio);
		
	}
	

}
