package viikko5;

import java.util.Arrays;
import java.util.Scanner;

public class MarsinLampotilat {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int[] lampotilat = new int[10];
		for (int i = 0; i < 10; i++) {
			System.out.println("Syötä mittaus " + (i + 1) + "/10:");
			int lampotila = input.nextInt();
			if (lampotila < -140 || lampotila > 20) {
				System.out.println("Anna lämpötila väliltä -140 - +20!");
				i = i - 1;
			} else {
				lampotilat[i] = lampotila;
			}
		}
		// KÄYDÄÄN LÄMPÖTILAT TAULUKKO LÄPI FOR LAUSEELLA
		// HYVÄ MUISTAA, ETTÄ TAULUKKOJEN KANSSA TAULUKON PITUUS
		// ON TOISIN KUIN LISTOILLA - SE SAADAAN KOMENNOLLA
		// TAULUKONNIMI.LENGTH
		double summa = 0;

		Arrays.sort(lampotilat);
		int pienin = lampotilat[0];
		int suurin = lampotilat[lampotilat.length-1];
		
		for (int i = 0; i < lampotilat.length; i++) {
			summa = summa + lampotilat[i];
		}
		double keskiarvo = 0;
		keskiarvo = summa / 10;
		System.out.println("Mittausten keskiarvo: " + keskiarvo);
		// PÖTKÖTETÄÄN ELI KONKATENOIDAAN TULOKSET
		System.out.println("Pienin mittaustulos: " + pienin);
		System.out.println("Suurin mittaustulos: " + suurin);
		
	}
}









