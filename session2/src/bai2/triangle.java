package bai2;
import java.util.Scanner;
public class triangle {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int h = sc.nextInt();
		
		for(int i = 1; i <= h; i++) {
			for(int j = 2; j <= i + 1; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int i = 1; i <= h; i++) {
			for(int j = i; j <= h - 1; j++) {
				System.out.print(" ");
			}
			
			for(int k = 1; k <= 2*i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		sc.close();
		
	}
}
