package bai1;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Nhập số lượng sinh viên: ");
        int n = scanner.nextInt();
        scanner.nextLine(); 

      
        Student[] students = new Student[n];

      
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin sinh viên thứ " + (i + 1) + ":");
            System.out.print("Tên: ");
            String name = scanner.nextLine();
            System.out.print("Năm sinh: ");
            int year = scanner.nextInt();
            scanner.nextLine(); 

            students[i] = new Student(name, year);
        }

      
        System.out.println("\nDanh sách sinh viên:");
        int totalAge = 0;
        for (Student student : students) {
            System.out.println("- " + student.getName());
            totalAge += student.getAge();
        }

        System.out.println("Tổng số tuổi của các sinh viên: " + totalAge);

        scanner.close();
    }
}