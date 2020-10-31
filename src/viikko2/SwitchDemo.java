package viikko2;
import java.util.Scanner;

public class SwitchDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		// ALUSTETAAN ARVO
		String nimi = "";
		System.out.println("Anna nimesi:");
		nimi = input.nextLine();
		
		switch(nimi) {
			case("Essi"):
				System.out.println("Olet tuttuja!");
				break;
			case("Samuel"):
				System.out.println("Olet tuttuja!");
				break;
			case("Lauri"):
				System.out.println("Olet tuttuja!");
				break;
			case("Anastasia"):
				System.out.println("Olet tuttuja!");
				break;
			case("Miika"):
				System.out.println("Olet tuttuja!");
				break;
			case("Niklas"):
				System.out.println("Olet tuttuja!");
				break;
			case("Eeli"):
				System.out.println("Olet tuttuja!");
				break;
			case("Henry"):
				System.out.println("Olet tuttuja!");
				break;
			case("Jesse"):
				System.out.println("Olet tuttuja!");
				break;
			default:
				System.out.println("En tunne sinua.");
		}
	}
}
