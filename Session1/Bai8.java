package week1.java;
import java.util.Scanner;
public class Bai8 {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		String S1= keyboard.nextLine();	
		for (int x = 0; x < S1.length();x++){
            if (Character.isDigit(S1.charAt(x))){
                System.out.println("YES");
                return;
            }
        }
        System.out.println("NO");
		keyboard.close();
	}
}
