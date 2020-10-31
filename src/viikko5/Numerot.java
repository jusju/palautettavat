package viikko5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Numerot {
	// OMAT METODIT VOISI LAITTAA AINA TÄHÄN ALKUUN ENNEN MAINIA
	// METODIN MÄÄRITYS
	// CALL BY REFERENCE
	public static int pienin(List<Integer> arvot) {
		int pienin = arvot.get(0);
		for (int i = 0; i < arvot.size(); i++) {
			if(arvot.get(i) < pienin) {
				pienin = arvot.get(i);
			}
		}
		return pienin;
	}

	// METODIN MÄÄRITYS
	public static int suurin(List<Integer> arvot) {
		int suurin = arvot.get(0);
		for (int i = 0; i < arvot.size(); i++) {
			if(arvot.get(i) > suurin) {
				suurin = arvot.get(i);
			}
		}
		return suurin;
	}

	// METODIN MÄÄRITYS
	public static int summa(List<Integer> arvot) {
		int summa = 0;                                               
        for (int i = 0; i < arvot.size(); i++) { 
        	// KERRYTYSROOLINEN MUUTTUJA
            summa = summa + arvot.get(i);                            
        }                                                            
        return summa;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// MAINIIN TULEE AINA METODIN KUTSUT, JOS KUTSUJA ON

		System.out.println("## Testi 1 ##");
		ArrayList<Integer> luvut = new ArrayList<Integer>();
		luvut.add(3);
		luvut.add(42);
		luvut.add(23);
		luvut.add(98);

		System.out.println("Muodostetaan lista: " + luvut);
		// METODIN KUTSU, ETSI LISTAN PIENIN ARVO
		int pieninArvo = pienin(luvut);
		System.out.println("Listan pienin arvo on: " + pieninArvo);
		int suurinArvo = suurin(luvut);
		System.out.println("Listan suurin arvo on: " + suurinArvo);
		int summaArvo = summa(luvut);
		System.out.println("Listan arvojen summa on: " + summaArvo);
		

		System.out.println("## Testi 2 ##");
		System.out.println();
		luvut = new ArrayList<Integer>();
		luvut.add(98);
		luvut.add(42);
		luvut.add(5);
		luvut.add(1);
		luvut.add(-70);
		
		System.out.println("Muodostetaan lista: " + luvut);
		// METODIN KUTSU, ETSI LISTAN PIENIN ARVO
		pieninArvo = pienin(luvut);
		System.out.println("Listan pienin arvo on: " + pieninArvo);
		suurinArvo = suurin(luvut);
		System.out.println("Listan suurin arvo on: " + suurinArvo);
		summaArvo = summa(luvut);
		System.out.println("Listan arvojen summa on: " + summaArvo);
		
	}
}
