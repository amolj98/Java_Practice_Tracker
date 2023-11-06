package com.in28minutes.ifstatements.examples;

public class WeekDay {

	public static void main(String[] args) {
		isWeekDay();
		determineNumberOfDay();
	}

	public static void isWeekDay() {
		int dayNumber = 5;
		switch (dayNumber) {
		case 1:
			System.out.println("Sunday");
			break;
		case 2:
			System.out.println("Monday");
			break;
		case 3:
			System.out.println("Tuesday");
			break;
		case 4:
			System.out.println("Wednesday");
			break;
		case 5:
			System.out.println("Thursday");
			break;
		case 6:
			System.out.println("Friday");
			break;
		case 7:
			System.out.println("Saturday");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	public static void determineNumberOfDay() {
		int dayNumber = 5;
		switch (dayNumber) {
		case 1:
			System.out.println("Weekend");
			break;
		case 2:
			System.out.println("Weekday");
			break;
		case 3:
			System.out.println("Weekday");
			break;
		case 4:
			System.out.println("Weekday");
			break;
		case 5:
			System.out.println("Weekday");
			break;
		case 6:
			System.out.println("Weekday");
			break;
		case 7:
			System.out.println("Weekend");
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

}
