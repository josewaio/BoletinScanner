package boletinScanner;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String name, secondName, adress, answer;
		int years;
		double height;
		boolean student;
		
		System.out.println("Enter your name:");
		name= keyboard.nextLine();
		System.out.println("Enter your last names:");
		secondName = keyboard.nextLine();
		System.out.println("Enter your age:");
		years = keyboard.nextInt();
		keyboard.nextLine();
		System.out.println("Enter your adress: ");
		adress = keyboard.nextLine();
		System.out.println("Enter your height:");
		height = keyboard.nextDouble();
		System.out.println(height);
		
		do {
		System.out.println("Are you student? y/n:");
		answer = keyboard.next().toLowerCase();
		}while(!answer.equals("y") && !answer.equals("n"));
		keyboard.close();
	}

}
