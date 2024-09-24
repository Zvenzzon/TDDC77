package calculator;

import java.lang.Math;
import java.util.ArrayList;

public class Calc {
	
	static ArrayList<Integer> resultat = new ArrayList<Integer>();
	String opperation;
	int result;
	
	public Calc(){
		
	}	
	
	public void add(int op1, int op2) {
		int result;
		result = op1 + op2;
		addToMemory(result);
	}
	
	public void minus(int op1, int op2) {
		int result;
		result = op1 - op2;
		addToMemory(result);
		}
	public void multiply(int op1, int op2) {
		int result;
		result = op1 * op2;
		addToMemory(result);
	}
	public void divide(int op1, int op2) {
		int result;
		result = op1/op2;
		addToMemory(result);
	}
	public void absolut(double op3) {
		int result;
		double resultatet;
		resultatet = Math.floor(op3);
		result = (int)resultatet;
		addToMemory(result);
	}
	
	public void addToMemory(int result) {
		resultat.add(result);
	}
	
	public void getMemory() {
		int i = 0;
		while(i < resultat.size()) {
			resultat.get(i);
			i++;
		}
	}	
}


