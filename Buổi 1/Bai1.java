package week1.java;
import java.util.Scanner;
public class Bai1 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();

		if(n > 0) {
			System.out.println("Đây là số nguyên dương");
		}
		else if(n == 0) {
			System.out.println("Đây là số 0");
		}
		else {
			System.out.println("Đây là số nguyên âm");
		}
		
		keyboard.close();
		
	}
}