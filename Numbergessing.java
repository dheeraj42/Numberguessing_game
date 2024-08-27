package games;

import java.util.Random;
import java.util.Scanner;

public class Numbergessing {

	public static void main(String[] args) {
		/// Number guessing game
		
		Random random = new Random();
		int generatedNumber = random.nextInt(1,100); // smallest number is 1 and largest number is 100;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number between 1 to 100: ");
		
		while(true) {
			int enteredNum = sc.nextInt();
			if(enteredNum>generatedNumber) {
				System.out.println("Decrease the guess..");
			}else if(enteredNum < generatedNumber) {
				System.out.println("Increase the guess..");
			}else {
				System.out.println("Congratulations!!!");
				break;
			}
		}
		sc.close();

	}

}
