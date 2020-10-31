package viikko8;

import java.util.Scanner;

public class PoikkeusDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Anna ikäsi: ");
		while (true) {
			try {
				int ika = input.nextInt();
				System.out.println("Ikäsi on: " + ika);
				break;
			} catch (Exception e) {
				System.out.println("Annoit virheellisen iän.");
				input.nextLine();
				System.out.println("Anna ikäsi: ");
			}
		}

	}

}
