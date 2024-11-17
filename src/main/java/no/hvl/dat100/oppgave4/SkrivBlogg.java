package no.hvl.dat100.oppgave4;

import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.io.*;

import no.hvl.dat100.common.TODO;
import no.hvl.dat100.oppgave3.*;

public class SkrivBlogg {

	public static boolean skriv(Blogg samling, String mappe, String filnavn) {
		try {
		
		PrintWriter utskrift = new PrintWriter(new FileWriter(mappe + "/" + filnavn));
		
		utskrift.print(samling.toString());		
		
		utskrift.close();							
		return true;
		}
		catch (IOException feilmelding){
			System.out.println("Det oppstod en feil under skriving til filen: " + feilmelding.getMessage());
			return false;
		}
	}
}

