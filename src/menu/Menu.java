package menu;

import calc.Calculator;
import utility.UtilityScanner;

public class Menu {

	private Double num1;
	private Double num2;

	public void run() {
		String action = promptUserToEnterAction();
		promptUserToEnterNumbers();
		Double result = performCalculation(action);
		displayResult(action, result);
	}

	public String promptUserToEnterAction() {
		String menuMsg = "==================================================\n" + "Calculator System:\n"
				+ "==================================================\n" + "\t- Add - add two parameters together"
				+ "\n" + "\t- Subtract - subtract an input from the second" + "\n"
				+ "\t- Multiply - multiply parameters together" + "\n" + "\t- Divide - divide a parameter by the other"
				+ "==================================================\n";
		System.out.println(menuMsg + "What calculation do you want to perform?");
		return UtilityScanner.getActionInput();
	}

	public void promptUserToEnterNumbers() {

		System.out.println("Please enter the first number");
		num1 = UtilityScanner.getInputDouble();

		System.out.println("Please enter the second number");
		num2 = UtilityScanner.getInputDouble();
	}

	public Double performCalculation(String action) {
		
		switch (action) {
		case "add":
			return Calculator.addition(num1, num2);
		case "subtract":
			return Calculator.subtraction(num1, num2);
		case "divide":
			return Calculator.divide(num1, num2);
		case "multiply":
			return Calculator.multiply(num1, num2);
		default:
			return -1.0;
		}
	}
	
	public void displayResult(String action, Double result) {
		System.out.println(num1 + " " + action + " " + num2 + " = " + result );	
	}

	static void print(String msg) {
		System.out.println(msg);
	}

}
