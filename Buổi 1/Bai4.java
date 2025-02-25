package week1.java;
import java.util.Scanner;
public class Bai4 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		int n = keyboard.nextInt();
		
		for(int i = 0; i <= n; i++) {
			if(i % 2 == 0) System.out.printf("%d ",i);
		}
		
		keyboard.close();
	}
}
