package coding_assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class CodingAssignment {

	public static void main(String[] args) {
		problem1();
		problem2();
		problem3();
		problem4();
		problem5_6();
		problem7();
		problem8();
		problem9();
		problem10();
		problem11();
		problem12();
		problem13();
	}

	// Problem 1
	public static void problem1() {
		System.out.println("Problem 1:");
		int[] ages = new int[] { 3, 9, 23, 64, 2, 8, 28, 93 };
		System.out.println(ages[ages.length - 1] - ages[0]);

		int[] newAges = new int[] { 3, 9, 23, 64, 2, 8, 28, 93, 37 };
		System.out.println(newAges[newAges.length - 1] - newAges[0]);

		double sum = 0.0;
		double average = 0.0;
		for (int age : ages) {
			sum += age;
		}
		average = sum / ages.length;
		System.out.println("Average age is " + average + "\n");
	}

	// Problem 2
	public static void problem2() {
		System.out.println("Problem 2:");
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int sum = 0;
		for (String name : names) {
			sum += name.length();
		}
		System.out.println("Average name length is " + sum / names.length);

		String concat = "";
		for (String name : names) {
			concat = concat + name + " ";
		}
		System.out.println(concat + "\n");
	}

	// Problem 3
	public static void problem3() {
		System.out.println("Problem 3:");
		System.out.println("To access the last element of an array, you use the index of the array length minus 1.\nexample: array[array.length - 1]");
	}

	// Problem 4
	public static void problem4() {
		System.out.println("Problem 4:");
		System.out.println("To access the first element of an array, you use the index of 0, since the first element is always at index 0.\nexample: array[0]");
	}

	// Problem 5 and 6
	public static void problem5_6() {
		System.out.println("Problem 5-6:");
		String[] names = { "Sam", "Tommy", "Tim", "Sally", "Buck", "Bob" };
		int[] nameLengths = new int[names.length];

		for (int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}

		int sum = 0;
		for (int num : nameLengths) {
			sum += num;
		}
		System.out.println("Sum is " + sum + "\n");
	}

	// Problem 7
	public static void problem7() {
		System.out.println("Problem 7:");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = sc.nextLine();
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println(concat(word, num) + "\n");
		sc.nextLine();
	}

	public static String concat(String word, int n) {
		String s = "";
		for (int i = 0; i < n; i++) {
			s += word;
		}
		return s;
	}

	// Problem 8
	public static void problem8() {
		System.out.println("Problem 8:");
		String first = "Thomas";
		String last = "Clifton";
		System.out.println(fullName(first, last) + "\n");
	}

	public static String fullName(String firstName, String lastName) {
		return firstName + " " + lastName;
	}

	// Problem 9
	public static void problem9() {
		System.out.println("Problem 9:");
		int[] arr1 = { 2, 43, 12, 32, 56, 37, 32 };
		int[] arr2 = { 6, 9, 1, 3, 12, 8, 3, 21 };
		if (sumGreaterThan100(arr1)) {
			System.out.println("The sum of arr1 is greater than 100");
		} else {
			System.out.println("The sum of arr1 is not greater than 100");
		}
		if (sumGreaterThan100(arr2)) {
			System.out.println("The sum of arr2 is greater than 100");
		} else {
			System.out.println("The sum of arr2 is not greater than 100");
		}
		System.out.println("");
	}

	public static boolean sumGreaterThan100(int[] array) {
		int sum = 0;
		for (int num : array) {
			sum += num;
		}
		return (sum > 100);
	}

	// Problem 10
	public static void problem10() {
		System.out.println("Problem 10:");
		double[] arr = { 3.2, 6.3, 1.89, 9.4, 12.1 };
		System.out.println("The average is " + average(arr) + "\n");
	}

	public static double average(double[] array) {
		double sum = 0.0;
		for (double num : array) {
			sum += num;
		}
		double avg = sum / array.length;
		return avg;
	}

	// Problem 11
	public static void problem11() {
		System.out.println("Problem 11:");
		double[] arr1 = { 6.5, 3.2, 4.1, 8.9, 7.5, 14.2, 6.8 };   //avg 7.31
		double[] arr2 = { 2.6, 5.1, 4.0, 7.1 };					  //avg 4.7
		if (avg1GreaterThan2(arr1, arr2)) {
			System.out.println(average(arr1) + " " + average(arr2) + "The average of array 1 is greater than the average of array 2\n");
		} else {
			System.out.println("The average of array 1 is less than the average of array 2\n");
		}
	}

	public static boolean avg1GreaterThan2(double[] arr1, double[] arr2) {
		return (average(arr1) > average(arr2));
	}

	// Problem 12
	public static void problem12() {
		System.out.println("Problem 12:");
		boolean isHot = true;
		double wallet = 10.0;
		if (willBuyDrink(isHot, wallet)) {
			System.out.println("I will buy a drink\n");
		} else {
			System.out.println("I won\'t buy a drink\n");
		}
	}

	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		return (isHotOutside && moneyInPocket > 10.50);
	}

	// Problem 13
	// This problem contains a method to modify a list of strings containing 
	// a full name in the form "FirstName LastName"
	// When it receives a name that contains a comma: "LastName, FirstName" it will convert 
	// to the opposite format. It will do the opposite if a string with only a space is passed in.
	//
	// Requirements: string parameter is formatted as "FirstName LastName" or
	// "LastName, FirstName"
	//
	// I chose this a problem because both are common forms of writing names and can
	// have an effect on how the string is sorted or stored in a collection.

	public static void problem13() {
		System.out.println("Problem 13:");
		List<String> names = new ArrayList<String>(
				Arrays.asList("Thomas Clifton", "Jones, John", "Mike Smith", "James, Marc", "Patel, Raj"));
		Scanner scan = new Scanner(System.in);
		
		System.out.print("How would you like to format the list?\n1 for lastname, firstname   2 for firstname lastname: ");
		int answer = scan.nextInt();
		if (answer == 1 || answer == 2) {
			swapFormat(names, answer);
			System.out.println(names);
		} else {
			System.out.println("Please choose a valid number");
		}
		scan.close();
	}

	public static void swapFormat(List<String> names, int answer) {
		for (String name : names) {
			String newName = "";
			//last, first -> first last
			if (answer == 2 && name.contains(",")) {
				String lastName = name.substring(0, name.indexOf(","));
				String firstName = name.substring(name.indexOf(",") + 2);
				newName = newName + firstName + " " + lastName;
				names.set(names.indexOf(name), newName);
			}
			//first last -> last, first
			else if (answer == 1 && !name.contains(",")) {
				String firstName = name.substring(0, name.indexOf(" "));
				String lastName = name.substring(name.indexOf(" ") + 1);
				newName = newName + lastName + ", " + firstName;
				names.set(names.indexOf(name), newName);
			}
		}
	}
}
