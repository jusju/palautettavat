package viikko8;

import java.util.Scanner;

public class AsuntoOhjelma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Anna asunnon tyyppi: ");
		String tyyppi = input.nextLine();
		
		System.out.print("Anna osoite: ");
		String osoite = input.nextLine();
		
		System.out.print("Anna pinta-ala: ");
		double pintaAla = input.nextDouble();
		// POISTETAAN PUSKURISTA TURHA ENTER
		input.nextLine();
		System.out.print("Anna hinta: ");
		double hinta = input.nextDouble();
		// POISTETAAN PUSKURISTA TURHA ENTER
		input.nextLine();
		System.out.print("Anna kuvaus: ");
		String kuvaus = input.nextLine();
		
		// TAPA 1 PARAMETRILLISELLÄ KONSTRUKTORILLA
		Asunto asunto1 = new Asunto(tyyppi, osoite, pintaAla, hinta, kuvaus);
		
		// TAPA 2 PARAMETRITTÖMÄLLÄ KONSTRUKTORILLA
		//Asunto asunto2 = new Asunto();
		//asunto2.setHinta(hinta);
		//asunto2.setKuvaus(kuvaus);
		//asunto2.setOsoite(osoite);
		//asunto2.setPintaAla(pintaAla);
		//asunto2.setTyyppi(tyyppi);
		
		System.out.println(asunto1);
		//System.out.println(asunto2);
		
	}

}
