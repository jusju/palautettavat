package viikko10;

import java.util.Scanner;

public class ShoppingListProgram {

	public void lisaaTuote(String tuoteNimi) {

	}

	public void listaaTuotteet() {
		ShoppingListDatabase db = new ShoppingListDatabase();
		System.out.println("-- START DB OUTPUT --");
		db.listShoppings();
		System.out.println("-- END DB OUTPUT --");
		System.out.println();
		
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ShoppingListProgram program = new ShoppingListProgram();
		while (true) {
			String komento = "";
			System.out.println("Welcome to the shopping list app!");
			System.out.println("Available commands:");
			System.out.println("list");
			System.out.println("add [product name]");
			System.out.println("remove [product name]");
			System.out.println("quit");
			System.out.println("");
			System.out.print("> ");
			komento = input.nextLine();
			String[] solut = komento.split(" ");
			if (solut[0].equals("list")) {
				program.listaaTuotteet();
			} else if (solut[0].equals("add")) {

			} else if (solut[0].equals("remove")) {

			} else if (solut[0].equals("quit")) {

			} else {
				System.out.println("Ohjelma on lopetettu, koska annoit " + "komennon quit tai virheellisen komennon.");
				System.exit(0);
			}
		}

	}

}
