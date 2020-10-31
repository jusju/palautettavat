package viikko2;

public class Lahtolaskenta {

	public static void main(String[] args) {
		
		// KIKKA HELPOTTAMAAN FOR-LAUSEEN TEKOA ON KIRJOITTAA
		// FOR JA PAINAA CTRL+SPACE, VALITSE EKA VAIHTOEHTO
		for (int i = 100; i >= 0; i = i - 1) {
			if(i % 3 != 0) {
				System.out.println(i);
			}
		}
	}
}
