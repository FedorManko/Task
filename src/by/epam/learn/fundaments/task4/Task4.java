package by.epam.learn.fundaments.task4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        System.out.println("Enter your numbers a, b ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        System.out.println("Summa = " + (a +  b));
        System.out.println("Increase = " + (a * b));
    }
}
