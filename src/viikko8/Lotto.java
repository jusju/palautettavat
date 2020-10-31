package viikko8;

import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

public class Lotto {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		List<Integer> numero = new ArrayList<Integer>();
		List<Integer> numero2 = new ArrayList<Integer>();
		List<Integer> kopio = new ArrayList<Integer>();
		// TODO Auto-generated method stub
		System.out.print("Anna oikea rivi(7 numeroa + lisänumero): ");
		String lottorivi = reader.nextLine();
		String lotto[] = lottorivi.split(" ");
		System.out.print("Anna tarkastettava rivi (7 numeroa): ");
		String tarkastusrivi = reader.nextLine();
		String oikearivi[] = tarkastusrivi.split(" ");
		int i = 0;
		while (i < lotto.length) {
			if(i == 7) {
				numero.add(Integer.parseInt(lotto[i]));
			} else {
				numero.add(Integer.parseInt(lotto[i]));
				numero2.add(Integer.parseInt(oikearivi[i]));
			}
			i++;
		}

		kopio = Leikkaus.laskeLeikkaus(numero, numero2);
		boolean oikein = kopio.contains(numero.get(7));

		if (oikein) {
			System.out.println((kopio.size() - 1) + " oikein ja lisänumero.");
		} else {
			System.out.println("\n" + kopio.size() + " oikein.");
		}

	}

}
