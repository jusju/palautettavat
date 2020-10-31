package viikko3;

import java.util.Scanner;

public class RekisterinumeroTarkastin {

	public static void main(String[] args) {
		
		String rekisterinumero = "";
		Scanner input = new Scanner(System.in);
		// KYSYTÄÄN KUNNES REKISTERINUMERO ON q
		while(rekisterinumero.equals("q") == false) {
			System.out.println("Syötä rekisterinumero (q-kirjain lopettaa): ");
			rekisterinumero = input.nextLine();
			if(rekisterinumero.equals("q")) {
				break;
			}
			if(rekisterinumero.matches("^[a-zöäåA-ZÖÄÅ]{2,3}\\-\\d{1,3}$")) {
				System.out.println(rekisterinumero + " on kelvollinen rekisterinumero.");
			} else {
				System.out.println(rekisterinumero + " ei ole kelvollinen rekisterinumero.");
			}
		}
	}

}
