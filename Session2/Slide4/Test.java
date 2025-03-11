package bai4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        Student[] stt = new Student[N];  

        for (int i = 0; i < N; i++) {  
            String name = scanner.next();
            int year = scanner.nextInt();
            stt[i] = new Student(year, name);  
        }

        int total = 0;
        System.out.println("Danh sach lop: ");
        for (int i = 0; i < N; i++) {
            total += 2025 - stt[i].getYear();
            System.out.println(stt[i].getName());
        }

        System.out.println("Tong so tuoi: " + total);
        scanner.close();
    }
}
