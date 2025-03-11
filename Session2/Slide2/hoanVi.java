package bai2;
import java.util.Scanner;
import java.util.Random;
public class hoanVi {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		
		Random random = new Random();
		int i = random.nextInt(n);
		int j = random.nextInt(n);
		
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
		
		for(int k = 0; k < n; k++) {
			System.out.printf("%d ", a[k]);
		}
		sc.close();
	}
}
