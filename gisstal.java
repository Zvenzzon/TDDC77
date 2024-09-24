package lab2.talgiss;
import java.util.Scanner;

public class gisstal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Spelare ett, Mata in ett heltal mellan 0 och 100:");
		int talet = input.nextInt();
		rensa();
		
		int gissning;
		int antalgissning = 0;
		do {
			System.out.print("Spelare två, chansa på ett heltal mellan 0 och 100: ");
			gissning = input.nextInt();
			
			if(gissning > talet) {
				System.out.println("För Stort!");
				antalgissning++;
			}else if(gissning < talet) {
				System.out.println("För Litet!");
				antalgissning++;
			}else {
				System.out.println("RÄTT!");
				antalgissning++;
				System.out.println("Du behövde "+ antalgissning + " gissningar");
			}
			
		}while(gissning != talet);	
		
	}
	

	public static void rensa() {
		for(int i = 0; i < 85; i++) {
			System.out.println();
		}
	}

}
