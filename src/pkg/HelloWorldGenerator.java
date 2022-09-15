package pkg;

import java.util.Scanner;

public class HelloWorldGenerator {
	public static void main(String[] args) {
		System.out.println("Enter the number of times you woul like 'Hello World!' printed");
		Scanner s = new Scanner(System.in);
		int i = s.nextInt();
		
		for(int j = 0; j < i; j++) {
			System.out.println("Hello World!");
		}
	}
}
