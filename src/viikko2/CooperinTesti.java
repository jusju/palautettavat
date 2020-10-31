package viikko2;

import java.util.Scanner;
public class CooperinTesti {
	// TEHDAAN IF, ELSE-IF, ELSE RAKENNETTA HAHMOTTAVA TEHTAVA
	// JOS COOPER TULOS ON ALLE 2000M KUNTO ON HUONO
	// JOS TULOS ON 2000-2200 KUNTO ON VÄLTTÄVÄ
	// JOS TULOS ON 2201-2400 KUNTO ON TYYDYTTÄVÄ
	// JOS TULOS ON 2401-2600 KUNTO ON HYVÄ
	// JOS TULOS ON SUUREMPI KUIN 2600 KUN ON ERINOMAINEN
	public static void main(String[] args) {
		// EDELLEEN OHJELMAT MENEE TAHAN KOHTAAN ELI MAININ SISAAN
		int cooperTulos = 0;
		Scanner input = new Scanner(System.in);
		System.out.println("Mikä oli Cooper tuloksesi (m): ");
		cooperTulos = input.nextInt();
		if(cooperTulos < 2000) {
			System.out.println("Kuntosi on huono.");
		} else if(cooperTulos <= 2200) {
			System.out.println("Kuntosi on välttävä.");
		} else if(cooperTulos <= 2400) {
			System.out.println("Kuntosi on tyydyttävä.");
		} else if(cooperTulos <= 2600) {
			System.out.println("Kuntosi on hyvä");
		} else {
			System.out.println("Kuntosi on erinomainen");
		}
	}
}
