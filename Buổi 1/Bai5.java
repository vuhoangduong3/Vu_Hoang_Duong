package week1.java;
import java.util.Scanner;
public class Bai5 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int a[] = new int[n];
		
		int sum = 0;
		for(int i = 0; i < n; i++) {
			a[i] = keyboard.nextInt();
			sum += a[i];
		}
		
		System.out.println(sum/n);
		keyboard.close();
	}
}
