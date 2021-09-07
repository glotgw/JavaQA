package utility;

import java.util.Scanner;

public class UtilityScanner {

//	public enum actions {
//		MULTIPLY, DIVIDE, ADD, SUBTRACT
//	}

	static Scanner scan = new Scanner(System.in);

	public static String getActionInput() {

		return scan.next();
	}

	public static Double getInputDouble() {

		while (!scan.hasNextDouble()) {
			System.out.println("Please try again (input must be of type double)");
			scan.next();
		}
		return scan.nextDouble();
	}

}
