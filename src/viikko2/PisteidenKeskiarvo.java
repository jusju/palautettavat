package viikko2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class PisteidenKeskiarvo {

	public static void main(String[] args) {
		int summa = 0; // SUMMALLA ON KERRYTYSROOLI
		int pisteet;
		int lkm = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Anna koepisteet: ");
		pisteet = input.nextInt();
		
		while(pisteet >= 0) {
			summa = summa + pisteet;
			lkm = lkm + 1; // lkm++;
			System.out.print("Anna koepisteet: ");
			pisteet = input.nextInt();
		}
		double keskiarvo = (double) summa / lkm;
		DecimalFormat desi = new DecimalFormat("0.00");
		System.out.println("Keskiarvo on " + desi.format(keskiarvo));
	}
}
