package viikko7;

import java.text.DecimalFormat;
import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {

		Asunto asunto = new Asunto();

		Scanner input = new Scanner(System.in);

		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = input.nextLine();

		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();

		System.out.print("Anna pinta-ala: ");
		double ala = input.nextDouble();
		// TÄSSÄ KOHTAA JÄÄ PUSKURIIN ENTERI
		// SYÖTEPUSKURI, JOHON NÄPPÄIMISTÖN SYÖTE LUETAAN PITÄISI TYHJENTÄÄ
		input.nextLine();
		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		// TÄSSÄ KOHTAA JÄÄ PUSKURIIN ENTERI
		// SYÖTEPUSKURI, JOHON NÄPPÄIMISTÖN SYÖTE LUETAAN PITÄISI TYHJENTÄÄ
		input.nextLine();
		System.out.print("Anna kuvaus: ");
		String kuvaus = input.nextLine();
		
		

		asunto.setTyyppi(tyyppi);
		asunto.setOsoite(osoite);
		asunto.setAla(ala);
		asunto.setHinta(hinta);
		asunto.setKuvaus(kuvaus);

		System.out.println();

		DecimalFormat des = new DecimalFormat("0.00"); 

		System.out.println("Tyyppi: " + tyyppi);
		System.out.println("Osoite: " + osoite);
		System.out.println("Pinta-ala: " + des.format(ala));
		System.out.println("Hinta: " + des.format(hinta) + " euroa");
		System.out.println("Kuvaus: " + kuvaus);
	}

}
