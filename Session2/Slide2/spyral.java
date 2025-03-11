package bai2;
import java.util.Scanner;
public class spyral {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n < 3 || n > 8) {
			System.out.println("Invalid");
			sc.close();
			return;
		}
		int a[][] = new int[n][n];
		int num = 1,top = 0, ri = n - 1, bot = n - 1, lf = 0;
		while(num <= n*n) {
			for(int i = lf; i <= ri; i++) {
				a[top][i] = num;
				num++;	
			}
			top++;
			
			for(int i = top; i <= bot; i++) {
				a[i][ri] = num;
				num++;
			}
			ri--;
			
			for(int i = ri; i >= lf; i-- ) {
				a[bot][i] = num;
				num++;
			}
			bot--;
			
			for(int i = bot; i >= top; i--) {
				a[i][lf] = num;
				num++;
			}	
			lf++;
			
		}
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%-4d",a[i][j]);
			}
			System.out.println();
		}
		
		sc.close();
	}
}
