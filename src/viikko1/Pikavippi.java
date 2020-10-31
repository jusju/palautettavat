package viikko1;

import java.util.Scanner;

public class Pikavippi {

	public static void main(String[] args) {
		// SCANNERIN LUONTI
		Scanner input = new Scanner(System.in);
		
		System.out.println("Anna pikavipin m‰‰r‰ euroissa: ");
		double vippi = input.nextDouble();
		System.out.println("Moneksiko vuodeksi raha halutaan (1 tai 2): ");
		double vuodet = input.nextDouble();
		System.out.println("Lainakorko kahdesta yleisest‰ (41% tai 37%): ");
		double korko = input.nextDouble();
		double korkoDesimaaleina = korko/100.0;
		System.out.println("Lainatut rahat maksavat eli korko ");
		double rahanHinta = (vippi * korkoDesimaaleina) * vuodet;
		System.out.println(rahanHinta);
	}

}
