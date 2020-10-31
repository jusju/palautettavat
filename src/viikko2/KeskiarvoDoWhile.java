package viikko2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class KeskiarvoDoWhile {
	public static void main(String[] args) {
		// ALUSTETAAN MUUTTUJAT
		int lkm = 0;
		int summa = 0;
		int pisteet = 0;
		Scanner input = new Scanner(System.in);
		do {
			System.out.println("Anna koepisteet: ");
			pisteet = input.nextInt();
			if(pisteet < 0) {
				break;
			}
			summa = summa + pisteet;
			lkm = lkm + 1;	
		} while(pisteet >=0);
		double keskiarvo = (double) summa / lkm;
		DecimalFormat desi = new DecimalFormat("0.00");
		System.out.println("Keskiarvo on: " + desi.format(keskiarvo));
	}
}
