package calculator;

import java.util.Scanner;

public class main {
	
	static Calc calc;
	
	public static void mainmenu() {
		Scanner input = new Scanner(System.in);
		System.out.println("Do you want to do an operation(o), quit(q), read memory(m) or round a number(r): ");
		String menu = input.next();
		
		switch(menu) {
		case "o":
			mainop();
			break;
		case "q":
			System.out.println("Avslutar");
			System.exit(0);
			break;
		case "m":
			System.out.println(calc.resultat);
			break;
		case "r":
			System.out.println("Enter a number: ");
			double op3 = input.nextDouble();
			calc.absolut(op3);
			System.out.println("Result: "+calc.resultat.get(calc.resultat.size()-1));
			System.out.println("=====================================================================");
			break;
		}
		
	}
	
	public static void mainop() {
		Scanner input = new Scanner(System.in);
		System.out.println("Choose an operation(+,-,*,/): ");
		String operation = input.next();
		System.out.println("Enter an integer: ");
		int op1 = input.nextInt();
		System.out.println("Enter another integer: ");
		int op2 = input.nextInt();
		
		switch (operation) {
		case "+":
			calc.add(op1, op2);
			System.out.println("Result: "+calc.resultat.get(calc.resultat.size()-1));
			System.out.println("=====================================================================");
			break;
		
		case "-": 
			calc.minus(op1, op2);
			System.out.println("Result: "+calc.resultat.get(calc.resultat.size()-1));
			System.out.println("=====================================================================");
			break;
			
		case "*": 
			calc.multiply(op1, op2);
			System.out.println("Result: "+calc.resultat.get(calc.resultat.size()-1));
			System.out.println("=====================================================================");
			break;
		case "/":
			calc.divide(op1, op2);
			System.out.println("Result: "+calc.resultat.get(calc.resultat.size()-1));
			System.out.println("=====================================================================");
			break;
		
		}
	}



	public static void main(String[] args) {
		calc = new Calc();
		while(true) {
			mainmenu();
		}
	}	
}	

