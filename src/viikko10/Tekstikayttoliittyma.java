package viikko10;

import java.util.Scanner;

public class Tekstikayttoliittyma {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String komento = "";
		System.out.println("Komennot:");
		System.out.println("lisaa - lisää sanaparin sanakirjaan");
		System.out.println("kaanna - kysyy sanan ja tulostaa sen käännöksen");
		System.out.println("lopeta - poistuu käyttöliittymästä");
		Sanakirja sanakirja = new Sanakirja();
		
		while (!komento.equals("lopeta")) {
			System.out.println("Komento: ");
			komento = input.nextLine();
			if(komento.equals("lopeta")) {
				System.out.println("Hei hei!");
				break;
			} else if(komento.equals("lisaa")) {
				System.out.print("Suomeksi: ");
				String suomeksi = input.nextLine();
				System.out.print("Anna käännös: ");
				String kaannos = input.nextLine();
				sanakirja.lisaa(suomeksi, kaannos);
				System.out.println();
			} else if(komento.equals("kaanna")) {
				System.out.print("Anna sana: ");
				String suomeksi = input.nextLine();
				String kaannos = sanakirja.kaanna(suomeksi);
				System.out.print("Käännös: " + kaannos);
				System.out.println();
			}
		}
	}
}
