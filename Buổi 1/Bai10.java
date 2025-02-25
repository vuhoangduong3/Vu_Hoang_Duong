package week1.java;
import java.util.Arrays;
import java.util.Scanner;
public class Bai10 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		int a[] = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = keyboard.nextInt();
		}
		Arrays.sort(a);
		for(int i = 0; i < n; i++) {
			System.out.println(a[i]);
		}
		
		keyboard.close();
		
	}
}
