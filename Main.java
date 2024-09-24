package lab4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		int rows;
		int columns;
		
		Scanner input = new Scanner(System.in);
		System.out.print("Skriv in antal rader: ");
		rows = input.nextInt();
		System.out.print("Skriv in antal kolumner: ");
		columns = input.nextInt();
		
		//MultiTable t = new MultiTable(rows, columns);
		
		MultiplicationTable multitable = new MultiplicationTable(rows, columns);
		
		multitable.print();
		
		//multitable.print(rows, columns);

	}

}
