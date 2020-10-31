package viikko11;

import java.util.Scanner;

public class AddressBookApp {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean running = true;
		
		while (running) {
			System.out.println("This is an address book application. Available commands: ");
			System.out.println(" list");
			System.out.println(" help");
			System.out.println(" add <name>, <email>, <phone>");
			System.out.println(" search <name>");
			System.out.println(" exit");
		    System.out.print("> ");
		    String command = input.next();
		    String theRest = input.nextLine().trim();

		    // ... toimintalogiikka
		    switch (command) {
		    case "help":
				System.out.println("This is an address book application. Available commands: ");
				System.out.println(" list");
				System.out.println(" help");
				System.out.println(" add <name>, <email>, <phone>");
				System.out.println(" search <name>");
				System.out.println(" exit");
		    	
		        break;
		    case "list":
		        // tulosta osoitekirjan koko sisältö
		    	
		        break;
		    case "add":
		        // käytä annettua nimeä, emailia ja puhelinnumeroa luodaksesi uuden yhteystiedon
		    	
		        break;
		    case "search":
		        // etsi yhteystietoa ja tulosta se
		    	
		        break;
		    case "exit":
		        // poistu ohjelmasta
		    	
		        break;
		    default:
		        // tunnistamaton komento:
		        System.out.println("Unknown command");
		        break;
		    }
		}	
	}	
}