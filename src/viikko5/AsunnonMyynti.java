package viikko5;

import java.util.Scanner;

public class AsunnonMyynti {

	public static void kysyMyyntihinta() {
		System.out.println("Anna asunnon myyntihinta: ");
	}
	
	public static double laskePalkkio(double myyntihinta) {
		double palkkio = 0.0496 * myyntihinta;
		return palkkio;
	}
	
	public static void main(String[] args) {
		double myyntihinta, palkkio;
		Scanner input = new Scanner(System.in);
		kysyMyyntihinta();
		myyntihinta = input.nextDouble();
		palkkio = laskePalkkio(myyntihinta);
		System.out.println(palkkio);
	}
}
