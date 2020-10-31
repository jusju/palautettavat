package viikko2;
import java.util.Scanner;
public class Ylinopeus {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Kerro nopeus: ");
		int nopeus = input.nextInt();
		if(nopeus > 120) {
			System.out.println("Ylinopeussakko!");
		}

	}

}
