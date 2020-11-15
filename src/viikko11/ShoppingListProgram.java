package viikko11;

import java.util.Scanner;

public class ShoppingListProgram {


	public void listaaTuotteet() {
		ShoppingListDatabase db = new ShoppingListDatabase();
		System.out.println("Shopping list contents:");
		db.listShoppings();
		System.out.println();
		
	}

	public void lisaaTuote(String tuote) {
		ShoppingListDatabase db = new ShoppingListDatabase();
		db.addShopping(tuote);
		System.out.println("Successfully added " + tuote);
		System.out.println();
	}

	public void poistaTuote(String tuote) {
		ShoppingListDatabase db = new ShoppingListDatabase();
		db.deleteShopping(tuote);
		System.out.println("Successfully deleted " + tuote);
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
				program.lisaaTuote(solut[1]);
			} else if (solut[0].equals("remove")) {
				program.poistaTuote(solut[1]);
			} else if (solut[0].equals("quit")) {
				break;
			} else {
				System.out.println("Ohjelma on lopetettu, koska annoit " + "komennon quit tai virheellisen komennon.");
				System.exit(0);
			}
		}

	}

}
