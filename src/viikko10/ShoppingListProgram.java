package viikko10;

import java.util.Scanner;

public class ShoppingListProgram {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		while(true) {
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
		}

	}

}
