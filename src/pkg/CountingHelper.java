package pkg;

import java.util.Scanner;

public class CountingHelper {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("What number would you like to count to?");
		
		int target = s.nextInt();
		for(int i = 1; i <= target; i++) {
			System.out.println(i);
		}
	}
}
