package viikko3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Opintopisteet {
	public static void main(String[] args) {
		Scanner n1 = new Scanner(System.in);
		System.out.print("Anna lukukausien m‰‰r‰: ");
		int lukukausienMaara = n1.nextInt();
		int summa = 0;
		int pisteet;
		int lkm = 0;
		Scanner input = new Scanner(System.in);
		int lukukausi = 1;

		while (lkm < lukukausienMaara) {
			System.out.print("Anna " + lukukausi + ". lukukauden opintopisteesi: ");
			pisteet = input.nextInt();
			lukukausi++;
			summa = summa + pisteet;
			lkm = lkm + 1;
			// tai lkm ++;		
		}
		lukukausi--;
		int tavoitePistemaara = lukukausi * 30;
		
		System.out.println("Sinulla pit‰isi olla t‰h‰n menness‰ " + 
				tavoitePistemaara + " opintopistett‰.");
		System.out.println("Sinulla on " + summa + " opintopistett‰.");
		if(summa > tavoitePistemaara) {
			System.out.println("Olet edell‰ tavoitteesta.");
		} else {
			System.out.println("Olet j‰ljess‰ tavoitteesta.");
		}
		int jaljella = 210 - summa;
		System.out.println("Tutkinnosta puuttuu viel‰ " + jaljella + " opintopistett‰.");
	}
}
