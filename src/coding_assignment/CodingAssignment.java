package coding_assignment;

import java.util.Scanner;

public class CodingAssignment {

	public static void main(String[] args) {
		problem1();
		problem2();
		problem5_6();
		problem7();
	}

	//Problem 1
	public static void problem1() {
		int[] ages = new int[] {3,9,23,64,2,8,28,93};
		System.out.println("1.a: " + (ages[ages.length-1] - ages[0]));
		
		int[] newAges = new int[] {3,9,23,64,2,8,28,93,37};
		System.out.println("1.b: " + (newAges[newAges.length-1] - newAges[0]));
		
		double sum = 0.0;
		double average = 0.0;
		for(int age: ages) {
			sum += age;
		}
		average = sum / ages.length;
		System.out.println("1.c: Avcerage age is " + average + "\n");
	}
	
	//Problem 2
	public static void problem2() {
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int sum = 0;
		for(String name: names) {
			sum += name.length();
		}
		System.out.println("2.a: Average name length is " + sum / names.length);
		
		String concat = "";
		for(String name: names) {
			concat = concat + name + " ";
		}
		System.out.println("2.b: " + concat + "\n");
	}
	
	// Problem 3
	// To access the last element of an array, you use the index of the array length minus 1.
	// example: array[array.length - 1]
	
	// Problem 4
	// To access the first element of an array, you use the index of 0, since the first element is
	//always at index 0.
	// example: array[0]
	
	//Problem 5 and 6
	public static void problem5_6() {
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int[] nameLengths = new int[names.length];
		
		for(int i = 0; i < names.length; i++) {
			nameLengths[i] = names[i].length();
		}
		
		int sum = 0;
		for(int num: nameLengths) {
			sum += num;
		}
		System.out.println("5-6: Sum is " + sum + "\n");
	}
	
	//Problem 7
	public static void problem7() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Word: ");
		String word = sc.nextLine();
		System.out.println("Enter Number: ");
		int num = sc.nextInt();
		System.out.println(concat(word,num) + "\n");
		sc.close();
	}
	
	public static String concat(String word, int n) {
		String s = "";
		for(int i = 0; i < n; i++) {
			s += word;
		}
		return s;
	}
	
	//Problem 8
	
}
