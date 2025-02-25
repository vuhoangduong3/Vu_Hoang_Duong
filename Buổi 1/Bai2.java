package week1.java;
import java.util.Scanner;
public class Bai2 {
	public static void main(String[] args) {	
		Scanner keyboard = new Scanner(System.in);
	
		double a = keyboard.nextDouble();
		double b = keyboard.nextDouble();
		double c = keyboard.nextDouble();
	
		if(a*a + b*b == c*c || a*a + c*c == b*b ||b*b + c*c == a*a) {
			System.out.println("Yes");
		}
		else {
			System.out.println("No");
		}
		keyboard.close();
	}
}
