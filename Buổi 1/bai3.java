package week1.java;
import java.util.Scanner;
public class bai3 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		int sol = (n/2)*(n/2 + 1);
		System.out.println(sol);
		
		keyboard.close();
	}
}
