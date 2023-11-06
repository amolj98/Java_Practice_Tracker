package com.in28minutes.ifstatements.examples;

public class IfStatementRunner {

	public static void main(String[] args) {
		puzzle2();
		puzzle5();
//		int i = 23;
//		// i is 25
//		// i is 24
//		// i is neither 25 or 24
//		if (i == 25) {
//			System.out.println("i = 25");
//		} else if (i == 24) {
//			System.out.println("i = 24");
//		} else if (i == 23) {
//			System.out.println("i = 23");
//		} else {
//			System.out.println("i != 25 and i != 24 and i != 23 ");
//		}
//	}
	}

	private static void puzzle2() {
		int number = 0;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle5() {
		long l = 15;
//		switch() {
//		
//		}
	}

}
