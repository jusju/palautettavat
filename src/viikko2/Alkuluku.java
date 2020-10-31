package viikko2;

import java.util.Scanner;

public class Alkuluku {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Syötä jokin positiivinen kokonaisluku: ");
		int kokonaisluku = input.nextInt();
		// LIPPUROOLINEN MUUTTUJA
		boolean onAlkuluku = true;
		
		for (int i = 2; i <= (kokonaisluku/2) ; i++) {
			if(kokonaisluku % i == 0) {
				onAlkuluku = false;
			}
		}
		if(onAlkuluku == true) {
			System.out.println("Luku " + kokonaisluku + " on alkuluku.");
		} else {
			System.out.println("Luku " + kokonaisluku + " ei ole alkuluku. ");
		}
		
	}
}