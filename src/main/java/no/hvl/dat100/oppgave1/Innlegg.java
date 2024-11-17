package no.hvl.dat100.oppgave1;

import no.hvl.dat100.common.TODO;

public abstract class Innlegg {
	
	protected int id;
	protected String bruker;
	protected String dato;
	protected int likes;
	 
	public Innlegg() {
		
	}
	
	public Innlegg(int id, String bruker, String dato) {							// uten likes

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = 0;
	}
	
	public Innlegg(int id, String bruker, String dato, int likes) {					// med likes

		this.id = id;
		this.bruker = bruker;
		this.dato = dato;
		this.likes = likes;
	}

	
	public String getBruker() {
		
		return bruker;

	}

	public void setBruker(String bruker) {
		this.bruker = bruker;
	}

	public String getDato() {
		return dato;
		
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public int getId() {
		return id;

	}

	public int getLikes() {
		return likes;

	}
	
	public void doLike () {
		likes += 1;
	}
	
	public boolean erLik(Innlegg innlegg) {
		return this.id == innlegg.id;
	}
	
	@Override
	public String toString() { 										// "1\nOle Olsen\n23-10\n7\n"
		
		return "" + id + "\n" + bruker + "\n" + dato + "\n" + likes+ "\n" + "";
		
		
	}
	
	// Metoden nedenfor er kun for valgfri oppgave 6
	public String toHTML() {
		
		throw new UnsupportedOperationException(TODO.method());
				
	}
}
