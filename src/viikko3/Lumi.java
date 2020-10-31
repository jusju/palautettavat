package viikko3;

import java.util.Scanner;

public class Lumi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int lumiNimienMaara = 0;
		int lukumaara = 0;
		String nimi = "";
	
		while(nimi.equals("LOPPU") == false) {
			System.out.print("Anna nimi: ");
			nimi = input.nextLine();
			if(nimi.equals("LOPPU")) {
				break;
			}
			lukumaara = lukumaara + 1;
			if(nimi.equalsIgnoreCase("Lumi")) {
				lumiNimienMaara++;
			}
		}
		System.out.println("Nimiä oli " + lukumaara + " kappaletta.");
		System.out.println("Nimi Lumi esiintyi " + lumiNimienMaara + " kertaa.");		
	}
}
