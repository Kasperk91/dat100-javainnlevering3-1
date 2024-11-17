package no.hvl.dat100.oppgave3;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave1.*;

public class Blogg {

	private Innlegg[] innleggtabell;
	private int nesteledig;

	public Blogg() {
		this.innleggtabell = new Innlegg[20];
		this.nesteledig = 0;
		
	}

	public Blogg(int lengde) {
		this.innleggtabell = new Innlegg[lengde];
		this.nesteledig = 0;
	}

	public int getAntall() {
		return nesteledig;
	}
	
	public Innlegg[] getSamling() {
		return innleggtabell;

	}
	
	public int finnInnlegg(Innlegg innlegg) {
		for (int i=0; i<nesteledig; i++) {
			if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
			return i;
			}
		}	return -1;
	}

	public boolean finnes(Innlegg innlegg) {
	    for (int i = 0; i < nesteledig; i++) {
	        if (innleggtabell[i] != null && innleggtabell[i].erLik(innlegg)) {
	            return true;
	        }
	    }
	    return false;
	}


	public boolean ledigPlass() {
		return nesteledig < innleggtabell.length;
	}
	
	public boolean leggTil(Innlegg innlegg) {
		if (finnes(innlegg)) {
			return false;
	}	if (ledigPlass()) {
		innleggtabell[nesteledig] = innlegg;
		nesteledig ++;
		return true;
	}	return false;
	}
	
	public String toString() {
	    String result = nesteledig + "\n";
	    
	   
	    for (int i = 0; i < nesteledig; i++) {
	        result += innleggtabell[i].toString(); 
	    }
	    
	    return result;
	}


	// valgfrie oppgaver nedenfor
	
	public void utvid() {
		
		Innlegg[] dobbel = new Innlegg[innleggtabell.length * 2];
		for (int i=0; i<nesteledig; i++) {
			dobbel[i] = innleggtabell[i];
			
		} innleggtabell = dobbel;
		
	}
	
	public boolean leggTilUtvid(Innlegg innlegg) {

		throw new UnsupportedOperationException(TODO.method());
		
	}
	
	public boolean slett(Innlegg innlegg) {
		
		boolean slettet = false;
		
		for (int i=0; i<nesteledig; i++) {
			if (innleggtabell[i].getId() == innlegg.getId()) {
				
				for (int j = i; j < nesteledig - 1; j++) {
	                innleggtabell[j] = innleggtabell[j + 1];
	            }
				innleggtabell[nesteledig - 1] = null; 
	            nesteledig--;
	            slettet = true;
	            break;
			}
		}		return slettet;
	}
		
	
	public int[] search(String keyword) {
		
		throw new UnsupportedOperationException(TODO.method());

	}
}