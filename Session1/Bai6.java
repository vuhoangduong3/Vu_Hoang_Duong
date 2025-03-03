package week1.java;
import java.util.Scanner;
public class Bai6 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int a[] = new int[n];
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < n; i++) {
			a[i] = keyboard.nextInt();
			if(max < a[i]) max = a[i];
		}
		
		System.out.println(max);
		keyboard.close();
	}
}
