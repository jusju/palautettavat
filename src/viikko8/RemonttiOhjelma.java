package viikko8;

import java.util.Scanner;

public class RemonttiOhjelma {

	public static void main(String[] args) {
		Remontti remontti = new Remontti();
		Scanner input = new Scanner (System.in);
		
		System.out.println("Anna vuosi: ");
		int vuosi = input.nextInt();
		input.nextLine();
		if(remontti.setVuosi(vuosi) == true) {
			System.out.println("Anna kuvaus: ");
			String kuvaus = input.nextLine();
			
			remontti.setVuosi(vuosi);
			remontti.setKuvaus(kuvaus);
			System.out.println("Vuonna " + vuosi + " tehtiin remontti " + remontti.getKuvaus());
		} else {
			System.out.println("Vuosi ei voi olla tulevaisuudessa");
		}
		
	}
}