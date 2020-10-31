package viikko3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Kotitalousvahennys {

	public static void main(String[] args) {

		double korvaus;
		double summa = 0;
		double vahennys = 0;
		int omavastuu = 100;

		Scanner input = new Scanner(System.in);
		System.out.print("Anna tyˆkorvauksen m‰‰r‰ (0 lopettaa): ");
		korvaus = input.nextDouble();

		while (korvaus > 0) {
			summa = summa + korvaus;
			System.out.print("Anna tyˆkorvauksen m‰‰r‰ (0 lopettaa): ");
			korvaus = input.nextDouble();
		}

		vahennys = summa * 50 / 100.0 - omavastuu;

		if (vahennys < 0) {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 0,00 euroa");
		} else if (vahennys >= 2400) {
			System.out.println("Kotitalousv‰hennyksen m‰‰r‰ on 2400,00 euroa");
		} else {
			DecimalFormat desi = new DecimalFormat("0.00");
			System.out.print("Kotitalousv‰hennyksen m‰‰r‰ on " + desi.format(vahennys) + " euroa");
		}
	}
}